package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StudentModel {
    protected static Connection conn = null;
    protected static PreparedStatement stmt = null;
    protected static ResultSet rs = null;
    
    private static String sqlSelectAll = "SELECT * FROM student JOIN marks ON student_id = id";
    private static String sqlInsertInfo = "INSERT INTO student VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
    private static String sqlInsertMarks = "INSERT INTO marks VALUES(?, null, null, null)";
    private static String sqlUpdateMarks = "UPDATE marks SET java = ?, javascript = ?, golang = ? WHERE student_id = ?";
    private static String sqlUpdateInfo = "UPDATE student SET name = ?, sex = ?, class_id = ?, email = ?, phone_number = ?, address = ?, image = ? WHERE id = ?";
    private static String sqlUpdateNullMarks = "UPDATE marks SET java = null, javascript = null, golang = null WHERE student_id = ?";
    private static String sqlDeleteMarks = "DELETE FROM marks WHERE student_id = ?";
    private static String sqlDeleteInfo = "DELETE FROM student WHERE id = ?";

    static{
        conn = model.DBUtils.getConnection();
    }
    
    public static List<Student> getAll(){
        List data = new ArrayList<Student>();
        try {
            stmt = conn.prepareStatement(sqlSelectAll);
            rs = stmt.executeQuery();
            while (rs.next()) {
                String id = rs.getString(1);
                String name = rs.getString(2);
                boolean sex = rs.getBoolean(3);
                String classId = rs.getString(4);
                String email = rs.getString(5);
                String phoneNumber = rs.getString(6);
                String address = rs.getString(7);
                String image = rs.getString(8);
                float java = rs.getFloat(10);
                float javascript = rs.getFloat(11);
                float golang = rs.getFloat(12);
                
                Student student = new Student(id, name, sex, classId, email, phoneNumber, address, image, java, javascript, golang);
                data.add(student);
            }
            
            return data;
        } catch (SQLException ex) {
            Logger.getLogger(StudentModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }

//	cập nhật điểm sinh viên
    public static boolean updateMarks(String id, float java, float js, float go){
        try {
            stmt = conn.prepareStatement(sqlUpdateMarks);
            stmt.setFloat(1, java);
            stmt.setFloat(2, js);
            stmt.setFloat(3, go);
            stmt.setString(4,id);

            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(StudentModel.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

//	xóa điểm của sinh viên
    public static boolean deleteMarks(String id){
        try {
            stmt = conn.prepareStatement(sqlUpdateNullMarks);
            stmt.setString(1, id);
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(StudentModel.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

//	cập nhật thông tin sinh viên
    public static boolean updateÌnfo(String name, boolean sex, String classID, String email, String phone , String address, String img, String id){
        try {
            stmt = conn.prepareStatement(sqlUpdateInfo);
            stmt.setString(1, name);
            stmt.setBoolean(2, sex);
            stmt.setString(3, classID);
            stmt.setString(4, email);
            stmt.setString(5, phone);
            stmt.setString(6, address);
            stmt.setString(7, img);

            stmt.setString(8, id);
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(StudentModel.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

//	thêm sinh viên mới
    public static boolean insertInfo(String id, String name, boolean sex, String classID, String email, String phone, String address, String image){
        try {
            stmt = conn.prepareStatement(sqlInsertInfo);
            stmt.setString(1, id);
            stmt.setString(2, name);
            stmt.setBoolean(3, sex);
            stmt.setString(4, classID);
            stmt.setString(5, email);
            stmt.setString(6, address);
            stmt.setString(7, phone);
            stmt.setString(8, address);
            
            stmt.execute();
            model.StudentModel.insertMarks(id);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(StudentModel.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public static boolean insertMarks(String id){
        try {
            stmt = conn.prepareStatement(sqlInsertMarks);
            stmt.setString(1, id); 
            stmt.execute();
            
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(StudentModel.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public static boolean delete(String id){
        try {
            stmt = conn.prepareStatement(sqlDeleteMarks);
            stmt.setString(1, id);
            stmt.executeUpdate();
            
            stmt = conn.prepareStatement(sqlDeleteInfo);
            stmt.setString(1, id);
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(StudentModel.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
