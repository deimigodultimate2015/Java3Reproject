package controller.mainui;

import java.io.File;
import java.io.FileInputStream;

import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import model.StudentModel;
import model.UserModel;

public class SetImgForCircle {
	public static Image setThisAvar(Stage stage, String ID) {
		Image image = null;
		FileChooser fchooser  = new FileChooser();
		fchooser.setTitle("choose image for "+ID);
		File file = fchooser.showOpenDialog(stage);
		FileChooser.ExtensionFilter exFilter1 = new FileChooser.ExtensionFilter("PNG files (*.txt)", "*.png");
		FileChooser.ExtensionFilter exFilter2 = new FileChooser.ExtensionFilter("JPG files (*.jpg)", "*.jpg");
		FileChooser.ExtensionFilter exFilter3 = new FileChooser.ExtensionFilter("JPEG files (*.jpeg)", "*.jpeg");
		fchooser.setSelectedExtensionFilter(exFilter1); fchooser.setSelectedExtensionFilter(exFilter2); fchooser.setSelectedExtensionFilter(exFilter3);
		if(file != null) {
			try {
				image = new Image(new FileInputStream(file.getAbsolutePath()));
				StudentModel.updateAvatar(ID, file.getAbsolutePath());
			} catch (Exception ex) {
				System.out.println(ex);
			} 
			
		} 
		
		return image;
	}
	
	public static Image setThisAvarUser(Stage stage, String ID) {
		Image image = null;
		FileChooser fchooser  = new FileChooser();
		fchooser.setTitle("choose image for "+ID);
		File file = fchooser.showOpenDialog(stage);
		FileChooser.ExtensionFilter exFilter1 = new FileChooser.ExtensionFilter("PNG files (*.txt)", "*.png");
		FileChooser.ExtensionFilter exFilter2 = new FileChooser.ExtensionFilter("JPG files (*.jpg)", "*.jpg");
		FileChooser.ExtensionFilter exFilter3 = new FileChooser.ExtensionFilter("JPEG files (*.jpeg)", "*.jpeg");
		fchooser.setSelectedExtensionFilter(exFilter1); fchooser.setSelectedExtensionFilter(exFilter2); fchooser.setSelectedExtensionFilter(exFilter3);
		if(file != null) {
			try {
				image = new Image(new FileInputStream(file.getAbsolutePath()));
				UserModel.updateAvatar(ID, file.getAbsolutePath());
			} catch (Exception ex) {
				System.out.println(ex);
			} 
			
		} 
		
		return image;
	}
	
	public static Image getImageWithPath(String path) {
		System.out.println("From set imge from click: "+path);
		Image image = null;
		try {
			image = new Image(new FileInputStream(path));
		} catch (Exception ex) {
			System.out.println(ex);
		} 
		return image;
	}
	
}
