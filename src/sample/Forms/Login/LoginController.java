package sample.Forms.Login;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import sample.Model.Serializer;
import sample.Model.Settings;
import sample.Model.User;
import sample.Model.UserDBO;

import java.awt.event.ActionEvent;
import java.io.IOException;

public class LoginController
{
    @FXML
    ImageView imageLogo = null;
    @FXML
    JFXTextField textfUsername = null;
    @FXML
    JFXPasswordField textfPassword = null;
    @FXML
    JFXButton btnLogin = null;
    @FXML
    JFXButton btnCreate = null;
    @FXML
    JFXButton btnDevLogin = null;
    @FXML
    ImageView imageExit = null;
    @FXML
    private AnchorPane rootPane;

    private Serializer se;

    public LoginController()
    {
        se = new Serializer();
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
    private void devLoginPressed() throws IOException
    {
        Settings settings = se.deserializeSettings();
        UserDBO userDBO = se.deserializeUserDBO();
        settings.LoginMainUser(userDBO.GetUser("Developer"), userDBO.GetUser("Developer"));
    }

    public void createClick(javafx.event.ActionEvent actionEvent)
    {
        UserDBO userDBO = se.deserializeUserDBO();
        if (userDBO.DoesUserExist(this.textfUsername.getText()))
        {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("User already exists");
            alert.setContentText("The username you entered is already in use by another user.");
            alert.showAndWait().ifPresent(rs -> {
                if (rs == ButtonType.OK) {
                    System.out.println("Pressed OK.");
                }
            });
        }
        else
        {
            userDBO.UserList.add(new User(this.textfUsername.getText(), this.textfPassword.getText()));
            se.serializeUserDBO(userDBO);
        }
    }

    public void loginClick(javafx.event.ActionEvent actionEvent)
    {
        Settings settings = se.deserializeSettings();
        UserDBO userDBO = se.deserializeUserDBO();
        if (userDBO.DoesPasswordMatch(this.textfUsername.getText(), this.textfPassword.getText()))
        {
            settings.LoginMainUser(userDBO.GetUser(this.textfUsername.getText()), userDBO.GetUser("Developer"));
        }
        se.serializeUserDBO(userDBO);
        se.serializeSettings(settings);
    }

    public void LaunchApp() throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("../Form/Home/Home.fxml"));
        Stage stage = (Stage) rootPane.getScene().getWindow();
        stage.setWidth(1024.0);
        stage.setHeight(576.0);
        rootPane.getChildren().setAll(pane);
    }
}
