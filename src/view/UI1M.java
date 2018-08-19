package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class UI1M extends Application{
	private double xOffset = 0;
	private double yOffset = 0;
	static Stage stage;
	static Scene scene;
	public static void setScene(Scene scene) {
		UI1M.scene = scene;
	}
	
	public static Scene getScene() {
		return scene;
	}
	
	public static void setStage(Stage stage) {
		UI1M.stage = stage;
	}
	
	public static Stage getStage() {
		return UI1M.stage;
	}
	
	public static void main(String[]args) {
		launch(args);
	}
	
	public void start(Stage stage) throws Exception{
		try {
			UI1M.stage = stage;
			Parent root = FXMLLoader.load(getClass().getResource("SIGNINFXML.fxml"));
			root.setOnMousePressed(e -> {
				yOffset = e.getSceneY();
				xOffset = e.getSceneX();
			});
			
			root.setOnMouseDragged(e -> {
				stage.setX(e.getScreenX() - xOffset);
				stage.setY(e.getScreenY() - yOffset);
			});	
			scene = new Scene(root);
			stage.setScene(scene);
			stage.initStyle(StageStyle.UNDECORATED);
			stage.show();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
	}
}
