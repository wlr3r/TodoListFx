package appli.accueil;

import appli.StartApplication;
import appli.model.repository.UtilisateurRepository;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class LoginController {
    @FXML
    private Button connexion;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtMdp;

    private UtilisateurRepository utilisateurRepository = new UtilisateurRepository();

    @FXML
    private void OnActionConnexion() {
        String email = txtEmail.getText();
        String mdp = txtMdp.getText();

        if (utilisateurRepository.connexion(email, mdp)) {
            StartApplication.changeScene("accueil/welcomeView", "Bienvenue");
        } else {
            System.out.println("Identifiants invalides");
        }
    }

    @FXML
    private void OnActionMdpOublie() {
        System.out.println("Mot de passe oublié");
    }

    @FXML
    private void OnActionInscription() {
        StartApplication.changeScene("accueil/inscriptionView", "Inscription");
    }
}