package appli.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class database {

    private static Connection connection;
    public String serveur = "localhost";
    public String database = "todolist";
    public String utilisateur = "root";
    public String motDePasse = "";
    public String getUrl() {
        return "jdbc:mysql://" + serveur + "/" + database;
    }

    public static Connection getConnection() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection("jdbc:sqlite:src/main/resources/database.db");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
}
