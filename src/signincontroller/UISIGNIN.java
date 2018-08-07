package signincontroller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.ScaleTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.ImageCursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;
import view.UI1M;

public class UISIGNIN implements Initializable{
	private ScaleTransition scaleTransition;
	
	private double xOffset = 0;
	private double yOffset = 0;
	
    @FXML
    private Button btnExit;

    @FXML
    private Button btnSignin;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		scaleTransition = new ScaleTransition(Duration.millis(50),btnSignin);
		
		
		
		btnExit.setOnAction(e -> {
			System.exit(0);
		});
		btnExit.setOnMouseEntered(e -> {
			Image img = new Image("signincontroller\\uhm.png");
			UI1M.getScene().setCursor(new ImageCursor(img));
		});
		btnExit.setOnMouseExited(e -> {
			UI1M.getScene().setCursor(Cursor.DEFAULT);
		});
		btnSignin.setOnMouseEntered(e ->{
			UI1M.getScene().setCursor(Cursor.HAND);
			scaleTransition.setToX(1.05);
			scaleTransition.setToY(1.05);
			scaleTransition.play();
		});
		btnSignin.setOnMouseExited(e -> {
			UI1M.getScene().setCursor(Cursor.DEFAULT);
			scaleTransition.setToX(1);
			scaleTransition.setToY(1);
			scaleTransition.play();
		});
		
		btnSignin.setOnAction( ez-> {
			
			try {
				Parent root = FXMLLoader.load(getClass().getResource("/view/TCFXML.fxml"));
				
				Scene scene = new Scene(root);
				Stage stage = new Stage();
				root.setOnMousePressed(e -> {
					yOffset = e.getSceneY();
					xOffset = e.getSceneX();
				});
				
				root.setOnMouseDragged(e -> {
					stage.setX(e.getScreenX() - xOffset);
					stage.setY(e.getScreenY() - yOffset);
				});
				stage.initStyle(StageStyle.UNDECORATED);
				stage.setScene(scene);
				stage.show();
				UI1M.getStage().close();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		});
	}

}