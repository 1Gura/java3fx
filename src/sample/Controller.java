package sample;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

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
    private TextField text1;

    @FXML
    void initialize() {
        btn1.setOnAction(actionEvent -> {
            label1.setText(text1.getText());
        });

    }
}
