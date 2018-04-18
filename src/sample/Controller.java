package sample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;

public class Controller
{
    @FXML
    ImageView imageLogo = null;
    @FXML
    JFXTextField textfUsername = null;
    @FXML
    JFXPasswordField textfPassword = null;
    @FXML
    JFXButton btnLoginCreateAccount = null;
    @FXML
    JFXButton btnDevLogin = null;

    @FXML
    ImageView imageExit = null;

    public Controller()
    {

    }

    @FXML
    private void closeButtonAction()
    {
        Stage stage = (Stage) imageExit.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void closeButtonEnter()
    {
        Scene scene = imageExit.getScene();
        scene.setCursor(Cursor.HAND);
    }

    @FXML
    private void closeButtonLeave()
    {
        Scene scene = imageExit.getScene();
        scene.setCursor(Cursor.DEFAULT);
    }

    @FXML
    private void devLoginPressed()
    {
        ChangeFormToGame();
    }

    private void ChangeFormToGame()
    {

    }
}
