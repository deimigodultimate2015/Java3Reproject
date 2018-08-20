package controller.mainui;

import java.net.URL;
import java.util.ResourceBundle;

import controller.signin.UISIGNIN;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.ImageCursor;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import model.Student;
import model.StudentModel;
import model.StudyClass;
import model.StudyClassModel;
import model.User;
import model.UserModel;

public class UICONTROLLER implements Initializable{

	@FXML
    private Circle Mmenu_avt;

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
    private TableView<Student> TTSV_tbl;

    @FXML
    private TableColumn<Student, String> TTSV_clmID;

    @FXML
    private TableColumn<Student, String> TTSV_clmName;

    @FXML
    private TableColumn<Student, String> TTSV_clmClass;
    
    @FXML
    private Button TTSV_btnFirst;

    @FXML
    private Button TTSV_btnPrev;

    @FXML
    private Button TTSV_btnNext;

    @FXML
    private Button TTSV_btnLast;

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
    private ComboBox<String> TTSV_cboxClass;

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
    private TableView<Student> DSV_tbl;

    @FXML
    private TableColumn<Student, String> DSV_clmID;

    @FXML
    private TableColumn<Student, String> DSV_clmName;
    
    @FXML
    private Button DSV_btnFirst;

    @FXML
    private Button DSV_btnLast;

    @FXML
    private Button DSV_btnNext;

    @FXML
    private Button DSV_btnPrev;

    @FXML
    private Label DSV_lblNameE;

    @FXML
    private Label DSV_lblJSE;

    @FXML
    private Label DSV_lblJavaE;

    @FXML
    private Label DSV_lblGolangE;

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
    private TableView<User> TTND_tbl;

    @FXML
    private TableColumn<User, String> TTND_clmID;

    @FXML
    private TableColumn<User, String> TTND_clmName;

    @FXML
    private TableColumn<User, String> TTND_clmEmail;
    
    @FXML
    private Button TTND_btnFIrst;

    @FXML
    private Button TTND_btnPrev;

    @FXML
    private Button TTND_btnNext;

    @FXML
    private Button TTND_btnLast;
    
    @FXML
    private TextField TTSV_txtfFilter;
   
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
    private ComboBox<String> TTND_cboxRole;

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
    private PasswordField TTTK_txtfOldPass;

    @FXML
    private PasswordField TTTK_txtfNewPass;

    @FXML
    private PasswordField TTTK_txtfReNewPass;

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
    private ComboBox<String> TTTK_cboxRole;
    
    @FXML
    private TextField TTND_txtfFilter;
    
    @FXML
    private TextField DSV_txtfFilter;
    
    @FXML
    private TableColumn<Student, String> DSV_clmTB;
    
    private User useing ;
    
	public User getUseing() {
		return useing;
	}

	public void setUseing(User useing) {
		this.useing = useing;
	}
	
	ObservableList<Student> olistTTSV = FXCollections.observableArrayList(StudentModel.getAll());
	ObservableList<User> olistTTND = FXCollections.observableArrayList(UserModel.getAll());
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		useing = UISIGNIN.getUseing();
		
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
		//--------------------Below is TTSV button part----------------------------//
		ObservableList<String> olistClass = FXCollections.observableArrayList();
		for(StudyClass sclass : StudyClassModel.getAll()) {
			olistClass.add(sclass.getId());
		}
		
	    
	    MenuItem TTSV_ite1 = new MenuItem("Delete this student");
	    ContextMenu TTSV_cmenu = new ContextMenu();
	     TTSV_cmenu.getItems().add(TTSV_ite1);
		
		TTSV_tbl.setContextMenu(TTSV_cmenu);
		TTSV_ite1.setOnAction(e -> {
			StudentModel.delete(TTSV_tbl.getSelectionModel().getSelectedItem().getId());
			TTSV_tbl.setItems(FXCollections.observableArrayList(StudentModel.getAll()));
			TTSV_tbl.refresh();
			
		});
		TTSV_cboxClass.setItems(olistClass);
		TTSV_btnChangeAva.setOnMouseEntered(e -> {
			Image img = new Image(getClass().getResourceAsStream("tenor.png"));
			UISIGNIN.getScene().setCursor(new ImageCursor(img,100,100));
		});
		
		TTSV_btnChangeAva.setOnMouseExited(e -> {
			UISIGNIN.getScene().setCursor(Cursor.DEFAULT);
		});
		
		TTSV_btnChangeAva.setOnAction(e -> {
			try {
				TTSV_ava.setFill(new ImagePattern(SetImgForCircle.setThisAvar(UISIGNIN.getStage(), TTSV_txtfID.getText())));
			} catch(Exception ex) {
				ex.printStackTrace();
				TTSV_ava.setFill(new ImagePattern(new Image(getClass().getResourceAsStream("notfound.png"))));
			}
			TTSV_tbl.setItems(FXCollections.observableArrayList(StudentModel.getAll()));
			TTSV_tbl.refresh();
		});
		
	
		
		
		TTSV_clmID.setCellValueFactory(new PropertyValueFactory<Student, String>("id"));
		TTSV_clmName.setCellValueFactory(new PropertyValueFactory<Student, String>("name"));
		TTSV_clmClass.setCellValueFactory(new PropertyValueFactory<Student, String>("classId"));
		TTSV_tbl.setItems(FXCollections.observableArrayList(olistTTSV));
		
		letFilter(TTSV_tbl, TTSV_txtfFilter);
		TTSV_tbl.getSelectionModel().select(0);
		TTSV_selectByNow();
		
		TTSV_btnAdd.setOnAction(e -> {
			TTSV_lblNameE.setText("");
			TTSV_lblIDE.setText("");
			TTSV_lblEmailE.setText("");
			if(CheckForUser.isThisStudentIDexist(TTSV_txtfID.getText())) {
				TTSV_lblIDE.setText("ID này đã tại");
				return;
			} else if (TTSV_txtfName.getText().isEmpty()) {
				TTSV_lblNameE.setText("Tên không được để trống");
				return;
			} else if(TTSV_txtfEmail.getText().isEmpty()) {
				TTSV_lblEmailE.setText("Email không được để trống");
				return;
			} else if(!TTSV_txtfEmail.getText().matches("\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b")) {
				TTSV_lblEmailE.setText("Email không đúng định dạng");
				return;
			} 
			StudentModel.insertInfo(TTSV_txtfID.getText(), TTSV_txtfName.getText(), TTSV_rdbtnFemale.isSelected()?false:true, TTSV_cboxClass.getSelectionModel().getSelectedItem(), TTSV_txtfEmail.getText(), TTSV_txtfPhone.getText(), TTSV_txtaAddress.getText(), "");
			SetImgForCircle.setThisAvar(UISIGNIN.getStage(), TTSV_txtfID.getText());
			olistTTSV = FXCollections.observableArrayList(StudentModel.getAll());
			TTSV_tbl.setItems(olistTTSV);
			TTSV_tbl.refresh();
			letFilter(TTSV_tbl, DSV_txtfFilter);
			TTSV_tbl.getSelectionModel().select(0);
			TTSV_selectByNow();
		});
		
		TTSV_btnUpdate.setOnAction(e -> {
			TTSV_lblNameE.setText("");
			TTSV_lblIDE.setText("");
			TTSV_lblEmailE.setText("");
			if(CheckForUser.isThisStudentIDexist(TTSV_txtfID.getText()) == false) {
				TTSV_lblIDE.setText("ID này không tồn tại");
				return;
			} else if (TTSV_txtfName.getText().isEmpty()) {
				TTSV_lblNameE.setText("Tên không được để trống");
				return;
			} else if(TTSV_txtfEmail.getText().isEmpty()) {
				TTSV_lblEmailE.setText("Email không được để trống");
				return;
			} else if(!TTSV_txtfEmail.getText().matches("\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b")) {
				TTSV_lblEmailE.setText("Email không đúng định dạng");
				return;
			} 
			StudentModel.updateÌnfo(TTSV_txtfName.getText(), TTSV_rdbtnFemale.isSelected()?true:false, TTSV_cboxClass.getSelectionModel().getSelectedItem(), TTSV_txtfEmail.getText(), TTSV_txtfPhone.getText(), TTSV_txtaAddress.getText() , TTSV_txtfID.getText());
			olistTTSV = FXCollections.observableArrayList(StudentModel.getAll());
			TTSV_tbl.setItems(olistTTSV);
			TTSV_tbl.refresh();
			letFilter(TTSV_tbl, DSV_txtfFilter);
			TTSV_tbl.getSelectionModel().select(0);
			TTSV_selectByNow();
		});
		
		TTSV_tbl.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Student>() {

			@Override
			public void changed(ObservableValue<? extends Student> observable, Student oldValue, Student newValue) {
				if(newValue!= null) {
					TTSV_txtfID.setText(newValue.getId());
					TTSV_txtfName.setText(newValue.getName());
					TTSV_cboxClass.getSelectionModel().select(newValue.getClassId());
					TTSV_txtfEmail.setText(newValue.getEmail());
					TTSV_txtfPhone.setText(newValue.getPhoneNumber());
					TTSV_txtaAddress.setText(newValue.getAddress());
					if(newValue.getSex()) TTSV_rdbtnMale.setSelected(true); else TTSV_rdbtnFemale.setSelected(true);
					try {
						TTSV_ava.setFill(new ImagePattern(SetImgForCircle.getImageWithPath(newValue.getImage())));
					} catch(Exception ex) {
						TTSV_ava.setFill(new ImagePattern(new Image(getClass().getResourceAsStream("notfound.png"))));
					}

				}
			}
			
		});
		
		TTSV_btnFirst.setOnAction(e->{
			TTSV_tbl.getSelectionModel().select(0);
			TTSV_selectByNow();
		});
		
		TTSV_btnLast.setOnAction(e -> {
			TTSV_tbl.getSelectionModel().select(TTSV_tbl.getItems().size()-1);
			TTSV_selectByNow();
		});
		
		TTSV_btnNext.setOnAction(e -> {
			if(TTSV_tbl.getSelectionModel().getSelectedIndex() + 1 > TTSV_tbl.getItems().size()-1) {
				TTSV_tbl.getSelectionModel().select(TTSV_tbl.getItems().size()-1);
				TTSV_selectByNow();
			} else {
				TTSV_tbl.getSelectionModel().select(TTSV_tbl.getSelectionModel().getSelectedIndex()+1);
				TTSV_selectByNow();
			}
		});
		
		TTSV_btnPrev.setOnAction(e -> {
			if(TTSV_tbl.getSelectionModel().getSelectedIndex() - 1 < 0) {
				TTSV_tbl.getSelectionModel().select(0);
				TTSV_selectByNow();
			} else {
				TTSV_tbl.getSelectionModel().select(TTSV_tbl.getSelectionModel().getSelectedIndex()-1);
				TTSV_selectByNow();
			}
		});
		
		//--------------------Below is TTTK button part----------------------------//
		TTTK_cboxRole.setEditable(false);
		TTTK_txtfID.setEditable(false);
		TTTK_txtfID.setText(useing.getId());
		TTTK_txtfName.setText(useing.getName());
		TTTK_cboxRole.getSelectionModel().select(useing.getPermission());
		TTTK_txtfEmail.setText(useing.getEmail());
		TTTK_txtfPhone.setText(useing.getPhoneNumber());
		if(useing.getSex()) TTTK_rdbtnMale.setSelected(true); else TTTK_rdbtnFemale.setSelected(true);
		TTTK_txtaAddress.setText(useing.getAddress());
		
		TTTK_btnRefresh.setOnAction(e -> {
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
			
			User user = new User(TTTK_txtfID.getText(), useing.getPassword(), TTTK_txtfName.getText(), TTTK_rdbtnFemale.isSelected()?true:false , TTTK_txtfEmail.getText(), TTTK_txtfPhone.getText(),TTTK_txtaAddress.getText(), useing.getPermission(), useing.getImage());
			useing = user;
			UserModel.update(user);
		});
		
		TTTK_btnUpdatePass.setOnAction(e -> {
			TTTK_lblOldPassE.setText("");
			TTTK_lblNewPassE.setText("");
			TTTK_lblRePassE.setText("");
			
			if(TTTK_txtfOldPass.getText().isEmpty()) {
				TTTK_lblOldPassE.setText("Password hiện tại không được để trống");
				return;
			} else if(!useing.getPassword().equals(TTTK_txtfOldPass.getText())) {
				TTTK_lblOldPassE.setText("Password không khớp với password hiện tại");
				return;
			} else if (TTTK_txtfNewPass.getText().isEmpty()) {
				TTTK_lblNewPassE.setText("Password mới không được để trống");
				return;
			} else if(TTTK_txtfReNewPass.getText().isEmpty()) {
				TTTK_lblRePassE.setText("Bắt buộc nhập lại password");
				return;
			} else if(!TTTK_txtfNewPass.getText().equals(TTTK_txtfReNewPass.getText())) {
				TTTK_lblRePassE.setText("Password không khớp với password trên");
				return;
			}
			
			User user = new User(useing.getId(), TTTK_txtfReNewPass.getText(),useing.getName(), useing.getSex(), useing.getEmail(), useing.getPhoneNumber(), useing.getAddress(), useing.getPermission(), useing.getImage());
			useing = user;
			UserModel.update(user);
		});
		
		
		//---------Below is Main Menu button----------//
		Mmenu_btnChangeAvt.setOnMouseEntered(e -> {
			Image img = new Image(getClass().getResourceAsStream("tenor.png"));
			UISIGNIN.getScene().setCursor(new ImageCursor(img,100,100));
		});
		
		Mmenu_btnChangeAvt.setOnMouseExited(e -> {
			UISIGNIN.getScene().setCursor(Cursor.DEFAULT);
		});
		
		Mmenu_btnChangeAvt.setOnAction(e -> {
			try {
				Mmenu_avt.setFill(new ImagePattern(SetImgForCircle.setThisAvarUser(UISIGNIN.getStage(), useing.getId())));
			} catch(Exception ex) {
				Mmenu_avt.setFill(new ImagePattern(new Image(getClass().getResourceAsStream("notfound.png"))));
			}
		});
		
		try {
			Mmenu_avt.setFill(new ImagePattern(SetImgForCircle.getImageWithPath(useing.getImage())));
		} catch(Exception ex) {
			Mmenu_avt.setFill(new ImagePattern(new Image(getClass().getResourceAsStream("notfound.png"))));
		}
		
		//---------Below is TTND button part----------//
		
		TTND_txtfID.setEditable(false);
		TTND_cboxRole.setEditable(false);
		TTND_tbl.setItems(olistTTND);
		TTND_clmID.setCellValueFactory(new PropertyValueFactory<User, String>("id"));
		TTND_clmName.setCellValueFactory(new PropertyValueFactory<User, String>("name"));
		TTND_clmEmail.setCellValueFactory(new PropertyValueFactory<User, String>("email"));
		TTND_tbl.getSelectionModel().select(0);
		TTND_selectByNow();
		
		letFilterUser(TTND_tbl, TTND_txtfFilter);
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
		
		TTND_tbl.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<User>() {
			@Override
			public void changed(ObservableValue<? extends User> observable, User oldValue, User newValue) {
				if(newValue != null) {
					TTND_txtfID.setText(newValue.getId());
					TTND_txtfName.setText(newValue.getName());
					TTND_cboxRole.getSelectionModel().select(newValue.getPermission());
					TTND_txtfEmail.setText(newValue.getEmail());
					TTND_txtfPhone.setText(newValue.getPhoneNumber());
					TTND_txtaAddress.setText(newValue.getAddress());
					if(newValue.getSex()) TTND_rdbtnMale.setSelected(true); else TTND_rdbtnFemale.setSelected(true);
				}
			}
			
		});
		
		TTND_btnRefresh.setOnAction(e -> {
			TTND_txtfName.setText("");
			TTND_txtfEmail.setText("");
			TTND_txtfPhone.setText("");
			TTND_txtaAddress.setText("");
		});
		
		TTND_btnUpdate.setOnAction(e -> {
			User oldVl = TTND_tbl.getSelectionModel().getSelectedItem();
			User user = new User(TTND_txtfID.getText(),oldVl.getPassword() , TTND_txtfName.getText(),  TTSV_rdbtnFemale.isSelected()?false:true , TTND_txtfEmail.getText(), TTND_txtfPhone.getText(), TTND_txtaAddress.getText(), oldVl.getPermission(), oldVl.getImage());
			UserModel.update(user);
			olistTTND = FXCollections.observableArrayList(UserModel.getAll());
			TTND_tbl.setItems(olistTTND);
			TTND_tbl.refresh();
			letFilterUser(TTND_tbl, TTND_txtfFilter);
			TTND_tbl.getSelectionModel().select(0);
			TTND_selectByNow();
		});
		
		TTND_btnFIrst.setOnAction(e->{
			TTND_tbl.getSelectionModel().select(0);
			TTND_selectByNow();
		});
		
		TTND_btnLast.setOnAction(e -> {
			TTND_tbl.getSelectionModel().select(TTND_tbl.getItems().size()-1);
			TTND_selectByNow();
		});
		
		TTND_btnNext.setOnAction(e -> {
			if(TTND_tbl.getSelectionModel().getSelectedIndex() + 1 > TTND_tbl.getItems().size()-1) {
				TTND_tbl.getSelectionModel().select(TTND_tbl.getItems().size()-1);
				TTND_selectByNow();
			} else {
				TTND_tbl.getSelectionModel().select(TTND_tbl.getSelectionModel().getSelectedIndex()+1);
				TTND_selectByNow();
			}
		});
		
		TTND_btnPrev.setOnAction(e -> {
			if(TTND_tbl.getSelectionModel().getSelectedIndex() - 1 < 0) {
				TTND_tbl.getSelectionModel().select(0);
				TTND_selectByNow();
			} else {
				TTND_tbl.getSelectionModel().select(TTND_tbl.getSelectionModel().getSelectedIndex()-1);
				TTND_selectByNow();
			}
		});
		
		//-------Below is DSV button part----------//
		DSV_txtfName.setEditable(false);
		DSV_txtfID.setEditable(false);
		DSV_clmID.setCellValueFactory(new PropertyValueFactory<Student, String>("id"));
		DSV_clmName.setCellValueFactory(new PropertyValueFactory<Student, String>("name"));
		DSV_clmTB.setCellValueFactory(new PropertyValueFactory<Student, String>("average"));
		DSV_tbl.setItems( FXCollections.observableArrayList(olistTTSV));
		DSV_tbl.getSelectionModel().select(0);
		DSV_selectByNow();
		
		letFilter(DSV_tbl, DSV_txtfFilter);
		DSV_btnUpdate.setOnAction(e -> {
			DSV_lblNameE.setText("");
			DSV_lblJSE.setText("");
			DSV_lblJavaE.setText("");
			DSV_lblGolangE.setText("");
			if(!DSV_txtfJS.getText().matches("[0-9]*\\.[0-9]*")) {
				DSV_lblJSE.setText("Điểm không đúng định dạng, vd : 00.00, 10.0");
				return;
			} else if(!DSV_txtfJava.getText().matches("[0-9]*\\.[0-9]*")) {
				DSV_lblJavaE.setText("Điểm không đúng định dạng, vd : 00.00, 10.0");
				return;
			} else if(!DSV_txtfGo.getText().matches("[0-9]*\\.+[0-9]*")) {
				DSV_lblGolangE.setText("Điểm không đúng định dạng, vd : 00.00, 10.0, 10, 9");
				return;
			} else if(Float.parseFloat(DSV_txtfJS.getText()) < 0 || Float.parseFloat(DSV_txtfJS.getText()) > 10) {
				DSV_lblJSE.setText("Điểm phải nằm trong khoảng 0 - 10");
				return;
			} else if(Float.parseFloat(DSV_txtfJava.getText()) < 0 || Float.parseFloat(DSV_txtfJava.getText()) > 10) {
				DSV_lblJavaE.setText("Điểm phải nằm trong khoảng 0 - 10");
				return;
			} else if(Float.parseFloat(DSV_txtfGo.getText()) < 0 || Float.parseFloat(DSV_txtfGo.getText()) > 10) {
				DSV_lblGolangE.setText("Điểm phải nằm trong khoảng 0 - 10");
				return;
			}
			
			StudentModel.updateMarks(DSV_txtfID.getText(), Float.parseFloat(DSV_txtfJava.getText()), Float.parseFloat(DSV_txtfJS.getText()), Float.parseFloat(DSV_txtfGo.getText()));
			DSV_lblAve.setText(String.format("%.02f", (Float.parseFloat(DSV_txtfJava.getText())+Float.parseFloat(DSV_txtfJS.getText())+Float.parseFloat(DSV_txtfGo.getText()))/3));
			olistTTSV = FXCollections.observableArrayList(StudentModel.getAll());
			DSV_tbl.setItems(olistTTSV);
			DSV_tbl.refresh();
			letFilter(DSV_tbl, DSV_txtfFilter);
			DSV_tbl.getSelectionModel().select(0);
			DSV_selectByNow();
		});	
		
		DSV_tbl.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Student>() {

			@Override
			public void changed(ObservableValue<? extends Student> arg0, Student oldValue, Student newValue) {
				if(newValue!= null) {
					DSV_txtfID.setText(newValue.getId());
					DSV_txtfName.setText(newValue.getName());
					DSV_txtfJava.setText(newValue.getJava()+"");
					DSV_txtfJS.setText(newValue.getJavascript()+"");
					DSV_txtfGo.setText(newValue.getGolang()+"");
					DSV_lblAve.setText(String.format("%.02f", (Float.parseFloat(DSV_txtfJava.getText())+Float.parseFloat(DSV_txtfJS.getText())+Float.parseFloat(DSV_txtfGo.getText()))/3));
				}
			}
			
		});
		
		DSV_btnFirst.setOnAction(e->{
			DSV_tbl.getSelectionModel().select(0);
			DSV_selectByNow();
		});
		
		DSV_btnLast.setOnAction(e -> {
			DSV_tbl.getSelectionModel().select(DSV_tbl.getItems().size()-1);
			DSV_selectByNow();
		});
		
		DSV_btnNext.setOnAction(e -> {
			if(DSV_tbl.getSelectionModel().getSelectedIndex() + 1 > DSV_tbl.getItems().size()-1) {
				DSV_tbl.getSelectionModel().select(DSV_tbl.getItems().size()-1);
				DSV_selectByNow();
			} else {
				DSV_tbl.getSelectionModel().select(DSV_tbl.getSelectionModel().getSelectedIndex()+1);
				DSV_selectByNow();
			}
		});
		
		DSV_btnPrev.setOnAction(e -> {
			if(DSV_tbl.getSelectionModel().getSelectedIndex() - 1 < 0) {
				DSV_tbl.getSelectionModel().select(0);
				DSV_selectByNow();
			} else {
				DSV_tbl.getSelectionModel().select(DSV_tbl.getSelectionModel().getSelectedIndex()-1);
				DSV_selectByNow();
			}
		});
		
		
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
	
	public void letFilter(TableView<Student> tbl, TextField txtf) {
		FilteredList<Student> ftlistTTSV = new FilteredList<>(olistTTSV, p -> true);
//		TTSV_txtfFilter.setText("haiz");
		txtf.textProperty().addListener((observable, oldValue, newValue) -> {
			ftlistTTSV.setPredicate(student -> {
				if(newValue == null || newValue.isEmpty() ) {
					return true;
				}
				String lowerCaseFilter = newValue.toLowerCase();
				
				if(student.getId().toLowerCase().contains(lowerCaseFilter)) {
					return true;
				} else if(student.getName().toLowerCase().contains(lowerCaseFilter)) {
					return true;
				} 
				return false;
			});
			
		});
		SortedList<Student> srtListTTSV =new SortedList<>(ftlistTTSV);
		srtListTTSV.comparatorProperty().bind(tbl.comparatorProperty());
		tbl.setItems(srtListTTSV);
		
	}
	
	public void letFilterUser(TableView<User> tbl, TextField txtf) {
		FilteredList<User> ftlistTTSV = new FilteredList<>(olistTTND, p -> true);
//		TTSV_txtfFilter.setText("haiz");
		txtf.textProperty().addListener((observable, oldValue, newValue) -> {
			ftlistTTSV.setPredicate(student -> {
				if(newValue == null || newValue.isEmpty() ) {
					return true;
				}
				String lowerCaseFilter = newValue.toLowerCase();
				
				if(student.getId().toLowerCase().contains(lowerCaseFilter)) {
					return true;
				} else if(student.getName().toLowerCase().contains(lowerCaseFilter)) {
					return true;
				} 
				return false;
			});
			
		});
		SortedList<User> srtListTTSV =new SortedList<>(ftlistTTSV);
		srtListTTSV.comparatorProperty().bind(tbl.comparatorProperty());
		tbl.setItems(srtListTTSV);
		
	}
	
	public void TTND_selectByNow() {
		User newValue = TTND_tbl.getSelectionModel().getSelectedItem();
		TTND_txtfID.setText(newValue.getId());
		TTND_txtfName.setText(newValue.getName());
		TTND_cboxRole.getSelectionModel().select(newValue.getPermission());
		TTND_txtfEmail.setText(newValue.getEmail());
		TTND_txtfPhone.setText(newValue.getPhoneNumber());
		TTND_txtaAddress.setText(newValue.getAddress());
		if(newValue.getSex()) TTND_rdbtnMale.setSelected(true); else TTND_rdbtnFemale.setSelected(true);
	}
	
	public void TTSV_selectByNow() {
		Student newValue = TTSV_tbl.getSelectionModel().getSelectedItem();
		TTSV_txtfID.setText(newValue.getId());
		TTSV_txtfName.setText(newValue.getName());
		TTSV_cboxClass.getSelectionModel().select(newValue.getClassId());
		TTSV_txtfEmail.setText(newValue.getEmail());
		TTSV_txtfPhone.setText(newValue.getPhoneNumber());
		TTSV_txtaAddress.setText(newValue.getAddress());
		if(newValue.getSex()) TTSV_rdbtnMale.setSelected(true); else TTSV_rdbtnFemale.setSelected(true);
		try {
			TTSV_ava.setFill(new ImagePattern(SetImgForCircle.getImageWithPath(newValue.getImage())));
		} catch(Exception ex) {
			TTSV_ava.setFill(new ImagePattern(new Image(getClass().getResourceAsStream("notfound.png"))));
		}

	}
	
	public void DSV_selectByNow() {
		Student newValue = TTSV_tbl.getSelectionModel().getSelectedItem();
		DSV_txtfID.setText(newValue.getId());
		DSV_txtfName.setText(newValue.getName());
		DSV_txtfJava.setText(newValue.getJava()+"");
		DSV_txtfJS.setText(newValue.getJavascript()+"");
		DSV_txtfGo.setText(newValue.getGolang()+"");
		DSV_lblAve.setText(String.format("%.02f", (Float.parseFloat(DSV_txtfJava.getText())+Float.parseFloat(DSV_txtfJS.getText())+Float.parseFloat(DSV_txtfGo.getText()))/3));
	}
	

}
