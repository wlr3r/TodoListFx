package appli.accueil;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class AccueilController implements Initializable {

    @FXML
    private TableView<Liste> tableauListe;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Define the columns
        TableColumn<Liste, String> idListeColumn = new TableColumn<>("Id liste");
        idListeColumn.setCellValueFactory(new PropertyValueFactory<>("idListe"));

        TableColumn<Liste, String> nomColumn = new TableColumn<>("Nom");
        nomColumn.setCellValueFactory(new PropertyValueFactory<>("nom"));

        // Add columns to the table
        tableauListe.getColumns().add(idListeColumn);
        tableauListe.getColumns().add(nomColumn);
    }
}