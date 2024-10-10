package appli.accueil;

import appli.StartApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class WelcomeController {

    @FXML
    private Label welcomeMessage;

    @FXML
    private Label currentTime;

    @FXML
    private Button tableauButton;

    @FXML
    public void initialize() {
        welcomeMessage.setText("Bienvenue, User!");
        currentTime.setText("Il est " + LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")));
    }

    @FXML
    private void onActionTableau() {
        StartApplication.changeScene("accueil/accueilView", "Accueil");
    }
}