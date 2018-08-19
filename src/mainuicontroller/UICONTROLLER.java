package mainuicontroller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.ImageCursor;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import signincontroller.UISIGNIN;
import view.UI1M;

public class UICONTROLLER implements Initializable{

	@FXML
    private Button Mmenu_btnAccountInfo;

    @FXML
    private Button Mmenu_SInfoManage;

    @FXML
    private Button Mmenu_UserManage;

    @FXML
    private Button Mmenu_MarkManage;

    @FXML
    private Button Mmenu_setting;

    @FXML
    private Button Mmenu_btnChangeAvt;

    @FXML
    private Button btnExit;

    @FXML
    private Pane TTSV_pane;

    @FXML
    private TextField TTSV_txtfID;

    @FXML
    private TextField TTSV_txtfName;

    @FXML
    private TextField TTSV_txtfEmail;

    @FXML
    private TextField TTSV_txtfPhone;

    @FXML
    private Button TTSV_btnAdd;

    @FXML
    private Button TTSV_btnUpdate;

    @FXML
    private TableView<?> TTSV_tbl;

    @FXML
    private TableColumn<?, ?> TTSV_clmID;

    @FXML
    private TableColumn<?, ?> TTSV_clmName;

    @FXML
    private TableColumn<?, ?> TTSV_clmClass;

    @FXML
    private Button TTSV_btnFirst;

    @FXML
    private Button TTSV_btnPrev;

    @FXML
    private Button TTSV_btnLast;

    @FXML
    private Button TTSV_btnNext;

    @FXML
    private TextField TTSV_txtfFilter;

    @FXML
    private ComboBox<?> TTSV_txtfCboxFilter;

    @FXML
    private Circle TTSV_ava;

    @FXML
    private Button TTSV_btnChangeAva;

    @FXML
    private Label TTSV_lblIDE;

    @FXML
    private Label TTSV_lblNameE;

    @FXML
    private Label TTSV_lblEmailE;

    @FXML
    private Label txtf_lblPhoneE;

    @FXML
    private TextArea TTSV_txtaAddress;

    @FXML
    private RadioButton TTSV_rdbtnFemale;

    @FXML
    private ToggleGroup TTSV_tgroup;

    @FXML
    private RadioButton TTSV_rdbtnMale;

    @FXML
    private Label TTSV_lblClassE;

    @FXML
    private ComboBox<?> TTSV_cboxClass;

    @FXML
    private Pane DSV_pane;

    @FXML
    private TextField DSV_txtfID;

    @FXML
    private TextField DSV_txtfName;

    @FXML
    private TextField DSV_txtfJS;

    @FXML
    private TextField DSV_txtfJava;

    @FXML
    private TextField DSV_txtfGo;

    @FXML
    private Button DSV_btnUpdate;

    @FXML
    private Button DSV_btnRefresh;

    @FXML
    private TableView<?> DSV_tbl;

    @FXML
    private TableColumn<?, ?> DSV_clmID;

    @FXML
    private TableColumn<?, ?> DSV_clmName;

    @FXML
    private TableColumn<?, ?> DSV_clmAve;

    @FXML
    private Button DSV_btnFirst;

    @FXML
    private Button DSV_btnPrev;

    @FXML
    private Button DSV_btnLast;

    @FXML
    private Button DSV_btnNext;

    @FXML
    private TextField DSV_txtfFilter;

    @FXML
    private ComboBox<?> DSV_cboxFilter;

    @FXML
    private Label DSV_lblAve;

    @FXML
    private Pane TTND_Pane;

    @FXML
    private TextField TTND_txtfName;

    @FXML
    private TextField TTND_txtfEmail;

    @FXML
    private TextField TTND_txtfPhone;

    @FXML
    private Button TTND_btnRefresh;

    @FXML
    private Button TTND_btnUpdate;

    @FXML
    private TableView<?> TTND_tbl;

    @FXML
    private TableColumn<?, ?> TTND_clmID;

    @FXML
    private TableColumn<?, ?> TTND_clmName;

    @FXML
    private TableColumn<?, ?> TTND_clmEmail;

    @FXML
    private Button TTND_btnFIrst;

    @FXML
    private Button TTND_btnPrev;

    @FXML
    private Button TTND_btnLast;

    @FXML
    private Button TTND_btnNext;

    @FXML
    private TextField TTND_txtfFilter;

    @FXML
    private ComboBox<?> TTND_cboxFilter;

    @FXML
    private Label TTND_lblRoleE;

    @FXML
    private Label TTND_lblPhoneE;

    @FXML
    private TextArea TTND_txtaAddress;

    @FXML
    private RadioButton TTND_rdbtnFemale;

    @FXML
    private ToggleGroup TTND_tgroup;

    @FXML
    private RadioButton TTND_rdbtnMale;

    @FXML
    private TextField TTND_txtfID;

    @FXML
    private Label TTND_lblNameE;

    @FXML
    private Label TTND_lblIDE;

    @FXML
    private Label TTND_lblEmailE;

    @FXML
    private ComboBox<?> TTND_cboxRole;

    @FXML
    private ComboBox<?> TTND_cboxClass;

    @FXML
    private Pane TTTK_pane;

    @FXML
    private TextField TTTK_txtfID;

    @FXML
    private TextField TTTK_txtfName;

    @FXML
    private TextField TTTK_txtfEmail;

    @FXML
    private TextField TTTK_txtfPhone;

    @FXML
    private Button TTTK_btnUpdate;

    @FXML
    private Button TTTK_btnRefresh;

    @FXML
    private Label TTTK_lblNameE;

    @FXML
    private Label TTTK_lblIDE;

    @FXML
    private Label TTTK_lblEmailE;

    @FXML
    private Label TTTK_lblPhoneE;

    @FXML
    private TextArea TTTK_txtaAddress;

    @FXML
    private RadioButton TTTK_rdbtnFemale;

    @FXML
    private ToggleGroup TTTK_tgroup;

    @FXML
    private RadioButton TTTK_rdbtnMale;

    @FXML
    private Label TTTK_lblRoleE;

    @FXML
    private TextField TTTK_txtfOldPass;

    @FXML
    private TextField TTTK_txtfNewPass;

    @FXML
    private TextField TTTK_txtfReNewPass;

    @FXML
    private Button TTTK_btnUpdatePass;

    @FXML
    private Button TTTK_btnNewPass;

    @FXML
    private Label TTTK_lblNewPassE;

    @FXML
    private Label TTTK_lblIDE12;

    @FXML
    private Label TTTK_lblOldPassE;

    @FXML
    private Label TTTK_lblRePassE;

    @FXML
    private ComboBox<?> TTTK_cboxRole;
    
    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
		//------------------------------Below is UI part----------------------------------//
		btnExit.setOnAction(e -> {System.exit(0);});
		btnExit.setOnMouseEntered(e -> {
			btnExit.setText("Do you really want to exit ?");
			Image img = new Image(getClass().getResourceAsStream("uhm.png"));
			UISIGNIN.getScene().setCursor(new ImageCursor(img));
		});
		btnExit.setOnMouseExited(e -> {
			btnExit.setText("X");
			UISIGNIN.getScene().setCursor(Cursor.DEFAULT);
		});
		Mmenu_btnAccountInfo.setOnMousePressed(e -> {
			Mmenu_btnAccountInfo.setStyle("-fx-background-color: #98869E");
			Mmenu_MarkManage.setStyle(null);
			Mmenu_SInfoManage.setStyle(null);
			Mmenu_UserManage.setStyle(null);
		});
		
		Mmenu_SInfoManage.setOnMousePressed(e -> {
			Mmenu_SInfoManage.setStyle("-fx-background-color: #98869E");
			Mmenu_btnAccountInfo.setStyle(null);
			Mmenu_MarkManage.setStyle(null);
			Mmenu_UserManage.setStyle(null);
		});
		
		Mmenu_MarkManage.setOnMousePressed(e -> {
			Mmenu_MarkManage.setStyle("-fx-background-color: #98869E");
			Mmenu_btnAccountInfo.setStyle(null);
			Mmenu_SInfoManage.setStyle(null);
			Mmenu_UserManage.setStyle(null);
		});
		
		Mmenu_UserManage.setOnMousePressed(e -> {
			Mmenu_UserManage.setStyle("-fx-background-color: #98869E");
			Mmenu_btnAccountInfo.setStyle(null);
			Mmenu_MarkManage.setStyle(null);
			Mmenu_SInfoManage.setStyle(null);
		});
		
		Mmenu_btnAccountInfo.setOnAction(e -> {
			DisableAllPane();
			TTTK_pane.setDisable(false);
			TTTK_pane.setVisible(true);
		});
		
		Mmenu_SInfoManage.setOnAction(e -> {
			DisableAllPane();
			TTSV_pane.setDisable(false);
			TTSV_pane.setVisible(true);
		});
		
		Mmenu_MarkManage.setOnAction(e -> {
			DisableAllPane();
			DSV_pane.setDisable(false);
			DSV_pane.setVisible(true);
		});
		
		Mmenu_UserManage.setOnAction(e -> {
			DisableAllPane();
			TTND_Pane.setDisable(false);
			TTND_Pane.setVisible(true);
		});
		
		//--------------------Below is TTTK button part----------------------------//
		
		TTTK_btnRefresh.setOnAction(e -> {
			TTTK_txtfID.setText("");
			TTTK_txtfName.setText("");
			TTTK_txtfEmail.setText("");
			TTTK_txtfPhone.setText("");
			TTTK_txtaAddress.setText("");
			
		});
		
		TTTK_btnNewPass.setOnAction(e -> {
			TTTK_txtfOldPass.setText("");
			TTTK_txtfNewPass.setText("");
			TTTK_txtfReNewPass.setText("");
		});
		
		TTTK_btnUpdate.setOnAction( e-> {
			TTTK_lblIDE.setText("");
			TTTK_lblNameE.setText("");
			TTTK_lblEmailE.setText("");
			TTTK_lblPhoneE.setText("");
			if(TTTK_txtfName.getText().isEmpty()) {
				TTTK_lblNameE.setText("Tên không được để trống");
				return;
			} else if(TTTK_txtfEmail.getText().isEmpty()) {
				TTTK_lblEmailE.setText("Email không được để trống");
				return;
			} else if (!TTTK_txtfEmail.getText().matches("\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b")) {
				TTTK_lblEmailE.setText("Email không đúng định dạng");
				return;
			} else if(TTTK_txtfPhone.getText().isEmpty()) {
				TTTK_lblPhoneE.setText("Số điện thoại không được để trống");
				return;
			} else if (!TTTK_txtfPhone.getText().matches("[0-9]*")) {
				TTTK_lblPhoneE.setText("Số điện thoại chỉ được chứa số");
				return;
			}
			
		});
		
		TTTK_btnUpdatePass.setOnAction(e -> {
			TTTK_lblOldPassE.setText("");
			TTTK_lblNewPassE.setText("");
			TTTK_lblRePassE.setText("");
			
			if(TTTK_txtfOldPass.getText().isEmpty()) {
				TTTK_lblOldPassE.setText("Password hiện tại không được để trống");
				return;
			} else if (TTTK_txtfNewPass.getText().isEmpty()) {
				TTTK_lblNewPassE.setText("Password mới không được để trống");
				return;
			} else if(TTTK_txtfReNewPass.getText().isEmpty()) {
				TTTK_lblRePassE.setText("Bắt buộc nhập lại password");
				return;
			} else if(!TTTK_txtfNewPass.getText().equals(TTTK_txtfOldPass.getText())) {
				TTTK_lblRePassE.setText("Password không khớp với password trên");
				return;
			}
		});
		
		//---------Below is TTND button part----------//
		
		TTND_btnUpdate.setOnAction(e -> {
			TTND_lblIDE.setText("");
			TTND_lblNameE.setText("");
			TTND_lblEmailE.setText("");
			TTND_lblPhoneE.setText("");
			if(TTND_txtfName.getText().isEmpty()) {
				TTND_lblNameE.setText("Tên không được để trống");
				return;
			} else if (TTND_txtfEmail.getText().isEmpty()) {
				TTND_lblEmailE.setText("Email không được để trống");
				return;
			} else if(!TTND_txtfEmail.getText().matches("\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b")) {
				TTND_lblEmailE.setText("Email không đúng định dạng");
				return;
			} else if(!TTND_txtfPhone.getText().matches("\\d*")) {
				TTND_lblPhoneE.setText("Số điện thoại chỉ được chứa số");
			} else if(TTND_txtfPhone.getText().isEmpty()) {
				TTND_lblPhoneE.setText("Số điện thoại không được để trống");
			}
		});
		
		TTND_btnRefresh.setOnAction(e -> {
			TTND_txtfID.setText("");
			TTND_txtfName.setText("");
			TTND_txtfEmail.setText("");
			TTND_txtfPhone.setText("");
			TTND_txtaAddress.setText("");
		});
		
		//-------Below is DSV button part----------//
		
	
	}
	
	public void DisableAllPane() {
		TTTK_pane.setDisable(true);
		TTTK_pane.setVisible(false);
		TTSV_pane.setDisable(true);
		TTSV_pane.setVisible(false);
		DSV_pane.setDisable(true);
		DSV_pane.setVisible(false);
		TTND_Pane.setDisable(true);
		TTND_Pane.setVisible(false);
	}
	
	public void resetBtnMmenuToDefault() {
		Mmenu_btnAccountInfo.setStyle(null);
		Mmenu_MarkManage.setStyle(null);
		Mmenu_SInfoManage.setStyle(null);
		Mmenu_UserManage.setStyle(null);
	}
	
	

}
