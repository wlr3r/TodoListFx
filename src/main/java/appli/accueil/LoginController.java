package appli.accueil;

import appli.StartApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class LoginController {
    @FXML
    private Button connexion;

    @FXML
    private void OnActionConnexion() {
        System.out.println("Connexion");
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