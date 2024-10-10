package appli.accueil;

import appli.StartApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;

public class AccueilView {

    @FXML
    private Label accueilLabel;

    @FXML
    private Button retourButton;

    @FXML
    private Button deconnexionButton;

    @FXML
    private Button ajouterListeButton;{
        System.out.println("Ajouter une liste");
    }
    @FXML
    private Button lesTypesButton;{
        System.out.println("Les types");
    }

    @FXML
    private TableView<Liste> tableauListe;{
        System.out.println("Tableau de listes");
    }

    @FXML
    private void handleRetour() {
        System.out.println("Retour à l'accueil");
    }

    @FXML
    private void handleDeconnexion() {
        StartApplication.changeScene("accueil/loginView", "Login");
    }

    @FXML
    private void handleAjouterListe() {
        // Handle adding a list
    }

    @FXML
    private void handleLesTypes() {
        // Handle showing types
    }
}