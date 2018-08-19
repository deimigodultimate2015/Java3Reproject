package controller.mainui;

import java.io.File;
import java.io.FileInputStream;

import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class SetImgForCircle {
	public static Image setThisAvar(Stage stage) {
		Image image = null;
		FileChooser fchooser  = new FileChooser();
		File file = fchooser.showOpenDialog(stage);
		FileChooser.ExtensionFilter exFilter1 = new FileChooser.ExtensionFilter("PNG files (*.txt)", "*.png");
		FileChooser.ExtensionFilter exFilter2 = new FileChooser.ExtensionFilter("JPG files (*.jpg)", "*.jpg");
		FileChooser.ExtensionFilter exFilter3 = new FileChooser.ExtensionFilter("JPEG files (*.jpeg)", "*.jpeg");
		fchooser.setSelectedExtensionFilter(exFilter1); fchooser.setSelectedExtensionFilter(exFilter2); fchooser.setSelectedExtensionFilter(exFilter3);
		if(file != null) {
			try {
				System.out.println(file.getAbsolutePath());
				image = new Image(new FileInputStream(file.getAbsolutePath()));
				System.out.println("is img null "+(image == null ? true : false));
			} catch (Exception ex) {
				ex.printStackTrace();
			} 
			
		} 
		
		return image;
	}
}
