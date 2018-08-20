package controller.signin;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import model.DBUtils;

public class UIDBCF implements Initializable {

    @FXML
    private Button btnAccept;

    @FXML
    private TextField txtfLogin;

    @FXML
    private PasswordField txtfPassword;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		btnAccept.setOnAction(e -> {
			DBUtils.rememberThis(txtfLogin.getText(), txtfPassword.getText());
			UISIGNIN.getScene1().getWindow().hide();
		});
	}

}
