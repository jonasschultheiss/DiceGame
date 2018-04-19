package sample.Forms.Form.Home;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;

public class HomeController
{
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


    public HomeController()
    {

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
    public void mouseClickGame(MouseEvent mouseEvent) {
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
