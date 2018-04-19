package sample.Forms.Form.Home;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;
import sample.Model.Serializer;
import sample.Model.Settings;

import java.io.IOException;

public class HomeController
{
    @FXML
    public AnchorPane RootPane;
    @FXML
    Label lblHome = null;
    @FXML
    Label lblGame = null;
    @FXML
    Label lblUsers = null;
    @FXML
    Label lblSettings = null;
    @FXML
    Label lblDebug = null;
    @FXML
    Label lblAbout = null;
    @FXML
    JFXButton btnLogOut = null;
    @FXML
    Label lblMatchesPlayed = null;
    @FXML
    Label lblMatchesWon = null;
    @FXML
    Label lblMatchesLost = null;
    @FXML
    Label lblWinrate = null;
    @FXML
    Label lblRecentMatch1 = null;
    @FXML
    Label lblRecentMatch2 = null;
    @FXML
    Label lblRecentMatch3 = null;
    @FXML
    Label lblRecentMatch4 = null;
    @FXML
    Label lblRecentMatch5 = null;
    @FXML
    Label lblUserName = null;
    @FXML
    ImageView imageExit = null;
    Serializer se;

    public HomeController()
    {
        se = new Serializer();
        Settings settings = se.deserializeSettings();
        this.lblUserName.setText(settings.LoggedInUser.Name);
    }

    @FXML
    public void mouseClickExit()
    {
        Stage stage = (Stage) imageExit.getScene().getWindow();
        stage.close();

    }

    @FXML
    public void mouseClickHome(MouseEvent mouseEvent) {
    }

    @FXML
    public void mouseClickGame(MouseEvent mouseEvent) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("../Game/Game.fxml"));
        Stage stage = (Stage) RootPane.getScene().getWindow();
        stage.setWidth(1024.0);
        stage.setHeight(576.0);
        RootPane.getChildren().setAll(pane);
    }

    @FXML
    public void mouseClickUsers(MouseEvent mouseEvent) {
    }

    @FXML
    public void mouseClickSettings(MouseEvent mouseEvent) {
    }

    @FXML
    public void mouseClickDebug(MouseEvent mouseEvent) {
    }

    @FXML
    public void mouseClickAbout(MouseEvent mouseEvent) {
    }

    @FXML
    public void btnLogOutClick(ActionEvent actionEvent) {
    }

    @FXML
    public void mouseHoverEnter(MouseEvent mouseEvent)
    {
        Scene scene = imageExit.getScene();
        scene.setCursor(Cursor.HAND);
    }

    @FXML
    public void mouseHoverLeft(MouseEvent mouseEvent)
    {
        Scene scene = imageExit.getScene();
        scene.setCursor(Cursor.DEFAULT);
    }
}
