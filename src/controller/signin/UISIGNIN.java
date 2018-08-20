package controller.signin;

import java.net.URL;
import java.util.ArrayList;
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
import javafx.scene.control.CheckBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;
import model.DBUtils;
import model.User;
import view.UI1M;

public class UISIGNIN implements Initializable{
	private ScaleTransition scaleTransition;
	
	private static Scene scene;
	private static Stage stage;
	
	private static Scene scene1;
	private static Stage stage1;
	
	public static Scene getScene1() {
		return scene1;
	}

	public static void setScene1(Scene scene1) {
		UISIGNIN.scene1 = scene1;
	}

	public static Stage getStage1() {
		return stage1;
	}

	public static void setStage1(Stage stage1) {
		UISIGNIN.stage1 = stage1;
	}

	public static Stage getStage() {
		return stage;
	}

	public static void setStage(Stage stage) {
		UISIGNIN.stage = stage;
	}

	public static Scene getScene() {
		return scene;
	}

	public static void setScene(Scene scene) {
		UISIGNIN.scene = scene;
	}

	private double xOffset = 0;
	private double yOffset = 0;
	
	@FXML
    private Button btnExit;

    @FXML
    private TextField txtfUsername;

    @FXML
    private Button btnSignin;

    @FXML
    private CheckBox chkboxRemember;

    @FXML
    private PasswordField txtfPassword;

    @FXML
    private Label lblFail;

    @FXML
    private Hyperlink lnkHelp;
    
    @FXML
    private Hyperlink lnkHelp1;

    private static User useing ; 
    
	public static User getUseing() {
		return useing;
	}

	public static void setUseing(User useing) {
		UISIGNIN.useing = useing;
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
		scaleTransition = new ScaleTransition(Duration.millis(50),btnSignin);
		lblFail.setVisible(false);
		
		if(!RememberMe.isItEmpty()) {
			txtfUsername.setText(RememberMe.whatInYourMind()[0]);
			txtfPassword.setText(RememberMe.whatInYourMind()[1]);
			chkboxRemember.setSelected(true);
		}
		
		btnExit.setOnAction(e -> {
			System.exit(0);
		});
		btnExit.setOnMouseEntered(e -> {
			Image img = new Image(getClass().getResourceAsStream("uhm.png"));
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
		
		lnkHelp1.setOnAction(e -> {
			try {
				Parent root = FXMLLoader.load(getClass().getResource("/view/DBFXML.fxml"));
				scene1 = new Scene(root);
				Stage stage = new Stage();
				root.setOnMousePressed(ex -> {
					yOffset = ex.getSceneY();
					xOffset = ex.getSceneX();
				});
				
				root.setOnMouseDragged(ez -> {
					stage.setX(ez.getScreenX() - xOffset);
					stage.setY(ez.getScreenY() - yOffset);
				});
				stage.initStyle(StageStyle.UNDECORATED);
				stage.setScene(scene1);
				stage.show();
//				UI1M.getStage().hide();
			} catch (Exception ex) {
				System.out.println(ex);
			}
		});
		
		btnSignin.setOnAction( ez-> {
			lblFail.setVisible(false);
			if(chkboxRemember.isSelected()) {
				RememberMe.rememberThis(txtfUsername.getText(), txtfPassword.getText());
			} else {
				RememberMe.dontRememberThis();
			}
			
			if(DBUtils.isItEmpty()) {
				lnkHelp1.fire();
				return;
			}
			
			if(CheckLogin.isThisAccountExist(txtfUsername.getText(),txtfPassword.getText()) != null) {
				try {
					useing = CheckLogin.isThisAccountExist(txtfUsername.getText(), txtfPassword.getText());
					Parent root = FXMLLoader.load(getClass().getResource("/view/TCFXML.fxml"));
					scene = new Scene(root);
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
					UI1M.getStage().hide();
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			} else {
				lblFail.setVisible(true);
			}
		});
	}

}