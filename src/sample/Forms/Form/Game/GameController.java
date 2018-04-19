package sample.Forms.Form.Game;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class GameController
{
    @FXML
    public AnchorPane RootPane;
    @FXML
    public Label lblUserName;
    @FXML
    public Label lblGame;
    @FXML
    public Label lblUsers;
    @FXML
    public Label lblSettings;
    @FXML
    public Label lblDebug;
    @FXML
    public Label lblAbout;
    @FXML
    public JFXButton btnLogOut;
    @FXML
    public Label lblHome;
    @FXML
    public ImageView imageExit;
    @FXML
    public Label lblLoggedInUser;
    @FXML
    public Label lblSecondUser;
    @FXML
    public Label lblScore;
    @FXML
    public TableView tvLeft;
    @FXML
    public TableColumn tvcLeft1;
    @FXML
    public TableColumn tvcLeft2;
    @FXML
    public TableColumn tvcLeft3;
    @FXML
    public TableColumn tvcLeft4;
    @FXML
    public TableColumn tvcLeft5;
    @FXML
    public JFXButton btnRollLeft;
    @FXML
    public JFXButton btnPassLeft;
    @FXML
    public JFXButton btnRollRight;
    @FXML
    public JFXButton btnPassRight;
    @FXML
    public TableView tvRight;
    @FXML
    public TableColumn tvcRight1;
    @FXML
    public TableColumn tvcRight2;
    @FXML
    public TableColumn tvcRight3;
    @FXML
    public TableColumn tvcRight4;
    @FXML
    public TableColumn tvcRight5;

    public GameController()
    {
    }

    public void mouseClickGame(MouseEvent mouseEvent)
    {

    }

    public void mouseHoverEnter(MouseEvent mouseEvent) {
        Scene scene = imageExit.getScene();
        scene.setCursor(Cursor.HAND);
    }

    public void mouseClickUsers(MouseEvent mouseEvent) {
    }

    public void mouseClickSettings(MouseEvent mouseEvent) {
    }

    public void mouseHoverLeft(MouseEvent mouseEvent)
    {
        Scene scene = imageExit.getScene();
        scene.setCursor(Cursor.DEFAULT);
    }

    public void mouseClickDebug(MouseEvent mouseEvent) {
    }

    public void mouseClickAbout(MouseEvent mouseEvent) {
    }

    public void mouseClickHome(MouseEvent mouseEvent) {
    }

    public void btnLogOutClick(ActionEvent actionEvent)
    {

    }

    public void mouseClickExit(MouseEvent mouseEvent)
    {
        Stage stage = (Stage) imageExit.getScene().getWindow();
        stage.close();
    }
}
