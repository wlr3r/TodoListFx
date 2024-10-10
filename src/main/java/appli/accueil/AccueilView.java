package appli.accueil;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class AccueilView {

    @FXML
    private Label accueilLabel;

    @FXML
    private Button retourButton;

    @FXML
    private void handleRetour() {
        System.out.println("Retour à l'accueil");
    }
}