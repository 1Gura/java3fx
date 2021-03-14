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
//                Label label1 = new Label("Выберите вид спорта:");
//                Label label2 = new Label("Вес мяча (г)");
//                Label label3 = new Label("Диаметр мяча");
//                Label label4 = new Label("Внутренне давление мяча");
//                TextField textField1 = new TextField();
//                TextField textField2 = new TextField();
//                TextField textField3 = new TextField();
//                TextField textField4 = new TextField();
//                Button button = new Button();
//                button.setOnAction(actionEvent1 -> {
//                    inventoryManagement.addItem(textField1,textField2,textField3,textField4);
//                });
//                HBox hBox =  new HBox(new FlowPane(Orientation.VERTICAL, 20, 20,
//                        label1,
//                        textField1,
//                        label2,
//                        textField2,
//                        label3,
//                        textField3,
//                        label4,
//                        textField4,
//                        button
//                ));
                Stage stage2 = new Stage();
                //Parent root = FXMLLoader.load(getClass().getResource("sample2.fxml"));
                Scene scene = new Scene(flowPane, 400,400);
                stage2.setScene(scene);
                stage2.setTitle(listEquipment.getValue());
                stage2.initModality(Modality.NONE);
                stage2.show();

            } catch (Exception e) {

            }
        });
    }
}
