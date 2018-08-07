package mainuicontroller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import model.StudentMark;

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
    private Pane pnMarkManage;

    @FXML
    private TableView<StudentMark> MarkManager_tblView;

    @FXML
    private TableColumn<StudentMark, String> StudentMark_clmName;

    @FXML
    private TextField MM_txtfID;

    @FXML
    private TextField MM_txtfFullname;

    @FXML
    private TextField MM_txtfSJava;

    @FXML
    private TextField MM_txtfSGolang;

    @FXML
    private Button MM_btnClear;

    @FXML
    private TextField MM_txtfSJavaS;

    @FXML
    private Button MM_btnUpdate;

    @FXML
    private Button MM_btnDelete;

    @FXML
    private Label MM_lblAvgS;

    @FXML
    private Label MM_lblEGolang;

    @FXML
    private Label MM_lblESJava;

    @FXML
    private Label MM_lblEJavaS;

    @FXML
    private Label MM_lblEFullname;

    @FXML
    private Label MM_lblEID;

    @FXML
    private Pane pnAccountInfo;

    @FXML
    private TextField AI_txtfEmail;

    @FXML
    private TextField AI_txtfPhone;

    @FXML
    private TextField AI_txtfPermission;

    @FXML
    private TextField AI_txtfFullname;

    @FXML
    private TextField AI_txtfID;

    @FXML
    private Button AI_btnUpdate;

    @FXML
    private TextArea AI_txtaAddress;

    @FXML
    private TextField AI_txtfOldPass;

    @FXML
    private TextField AI_txtfReNewPass;

    @FXML
    private TextField AI_txtfNewPass;

    @FXML
    private Button AI_btnAcceptNewPass;

    @FXML
    private Label AC_lblEID;

    @FXML
    private Label AC_lblEFullname;

    @FXML
    private Label AC_lblEAddress;

    @FXML
    private Label AC_lblEPhone;

    @FXML
    private Label AC_lblEEmail;

    @FXML
    private Label AC_lblEOldPass;

    @FXML
    private Label AC_lblENewPass;

    @FXML
    private Pane pnSInfoManage;

    @FXML
    private TextField SM_txtfID;

    @FXML
    private TextField SM_txtfFullname;

    @FXML
    private TextField SM_txtfEmail;

    @FXML
    private TextField SM_txtfPhone;

    @FXML
    private TextField SM_txtfClass;

    @FXML
    private TextArea SM_txtaAddress;

    @FXML
    private Button SM_btnUpdate;

    @FXML
    private Button SM_btnClear;

    @FXML
    private Button SM_btnAdd;

    @FXML
    private Button SM_btnDelete;

    @FXML
    private RadioButton SM_rdbtnFemale;

    @FXML
    private ToggleGroup SM_tggr;

    @FXML
    private RadioButton SM_rdbtnMale;

    @FXML
    private Label SM_lblEID;

    @FXML
    private Label SM_lblFullname;

    @FXML
    private Label SM_lblEClass;

    @FXML
    private Label SM_lblEEmail;

    @FXML
    private Label SM_lblEPhone;

    @FXML
    private Label SM_lblEAddress;

    @FXML
    private Pane pnAccountManage;

    @FXML
    private TextField AM_txtfEmail;

    @FXML
    private TextField AM_txtfPhone;

    @FXML
    private TextField AM_txtfClass;

    @FXML
    private TextField AM_txtfPermission;

    @FXML
    private TextField AM_txtfFullname;

    @FXML
    private TextField AM_txtfID;

    @FXML
    private Button AM_btnUpdate;

    @FXML
    private TextArea AM_txtaAddress;

    @FXML
    private Button AM_btnClear;

    @FXML
    private Button AM_btnAdd;

    @FXML
    private RadioButton AM_rdbtnFemale;

    @FXML
    private ToggleGroup AM_tggr;

    @FXML
    private RadioButton AM_rdbtnMale;

    @FXML
    private Button AM_btnDelete;

    @FXML
    private Label AM_lblEID;

    @FXML
    private Label AM_lblEFullname;

    @FXML
    private Label AM_lblEPermission;

    @FXML
    private Label AM_lblEClass;

    @FXML
    private Label AM_lblEPhone;

    @FXML
    private Label AM_lblEEmail;

    @FXML
    private Label AM_lblEAddress;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		StudentMark st1 = new StudentMark("1sdfsdf");
		StudentMark st2 = new StudentMark("sdfsdf1");
		StudentMark st3 = new StudentMark("1sdfsdf");
		StudentMark st4 = new StudentMark("sdfsdf1");
		StudentMark st5 = new StudentMark("1sdfsdg");

		ObservableList<StudentMark> olist = FXCollections.observableArrayList(st1,st2,st3,st4,st5);
		StudentMark_clmName.setCellValueFactory(new PropertyValueFactory<>("name"));
		
		MarkManager_tblView.setItems(olist);
		
		
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
			pnAccountInfo.setDisable(false);
			pnAccountInfo.setVisible(true);
		});
		
		Mmenu_SInfoManage.setOnAction(e -> {
			DisableAllPane();
			pnSInfoManage.setDisable(false);
			pnSInfoManage.setVisible(true);
		});
		
		Mmenu_MarkManage.setOnAction(e -> {
			DisableAllPane();
			pnMarkManage.setDisable(false);
			pnMarkManage.setVisible(true);
		});
		
		Mmenu_UserManage.setOnAction(e -> {
			DisableAllPane();
			pnAccountManage.setDisable(false);
			pnAccountManage.setVisible(true);
		});
	}
	
	public void DisableAllPane() {
		pnAccountInfo.setDisable(true);
		pnAccountInfo.setVisible(false);
		pnSInfoManage.setDisable(true);
		pnSInfoManage.setVisible(false);
		pnMarkManage.setDisable(true);
		pnMarkManage.setVisible(false);
		pnAccountManage.setDisable(true);
		pnAccountManage.setVisible(false);
	}
	
	public void resetBtnMmenuToDefault() {
		Mmenu_btnAccountInfo.setStyle(null);
		Mmenu_MarkManage.setStyle(null);
		Mmenu_SInfoManage.setStyle(null);
		Mmenu_UserManage.setStyle(null);
	}

}
