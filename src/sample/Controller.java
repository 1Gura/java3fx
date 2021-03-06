package sample;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Orientation;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label label1;

    @FXML
    private Button btn1;

    @FXML
    private ComboBox<String> listEquipment;

    @FXML
    private TextField typeSport;

    @FXML
    private TextArea textArea;

    @FXML
    void initialize() {
        InventoryManagement inventoryManagement = new InventoryManagement();
        listEquipment.getItems().addAll("Волейбольный мяч", "Теннисный мяч", "Ракетка", "Штанга", "Гиря", "Метательное копье");
        listEquipment.setOnAction(actionEvent -> {
            try {
                HBox flowPane = inventoryManagement.setTypeEquipment(listEquipment.getValue());
                Stage stage2 = new Stage();
                Scene scene = new Scene(flowPane, 400,400);
                stage2.setScene(scene);
                stage2.setTitle(listEquipment.getValue());
                stage2.initModality(Modality.NONE);
                stage2.show();

            } catch (Exception e) {

            }
        });
        btn1.setOnAction(actionEvent -> {
            textArea.setText(inventoryManagement.outEquipmentAll());
        });
    }
}
