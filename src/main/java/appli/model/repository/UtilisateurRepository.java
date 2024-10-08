package appli.model.repository;
import appli.database.Database;
import appli.model.Utilisateur;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UtilisateurRepository {

    private BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public boolean inscription(Utilisateur utilisateur) {
        // Check if the email already exists
        if (getUtilisateurByEmail(utilisateur.getEmail()) != null) {
            System.out.println("Email déjà existant !");
            return false;
        }

        String query = "INSERT INTO Utilisateur (nom, prenom, email, mdp) VALUES (?, ?, ?, ?)";
        try (Connection connection = new Database().getConnexion();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, utilisateur.getNom());
            preparedStatement.setString(2, utilisateur.getPrenom());
            preparedStatement.setString(3, utilisateur.getEmail());
            preparedStatement.setString(4, passwordEncoder.encode(utilisateur.getMdp()));
            int result = preparedStatement.executeUpdate();
            return result > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public Utilisateur getUtilisateurByEmail(String email) {
        Utilisateur utilisateur = null;
        String query = "SELECT * FROM Utilisateur WHERE email = ?";

        try (Connection connection = new Database().getConnexion();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, email);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                utilisateur = new Utilisateur();
                utilisateur.setId(resultSet.getInt("id_utilisateur"));
                utilisateur.setNom(resultSet.getString("nom"));
                utilisateur.setPrenom(resultSet.getString("prenom"));
                utilisateur.setEmail(resultSet.getString("email"));
                utilisateur.setMdp(resultSet.getString("mdp"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return utilisateur;
    }

    public boolean connexion(String email, String mdp) {
        String query = "SELECT * FROM Utilisateur WHERE email = ?";

        try (Connection connection = new Database().getConnexion();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, email);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                String hashedPassword = resultSet.getString("mdp");
                if (passwordEncoder.matches(mdp, hashedPassword)) {
                    return true;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}