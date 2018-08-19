package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import static model.UserModel.conn;
import static model.UserModel.stmt;

public class StudyClassModel {
    protected static Connection conn = null;
    protected static PreparedStatement stmt = null;
    protected static ResultSet rs = null;

    private static String sqlSelectAll = "SELECT * FROM class";
    private static String sqlInsert = "INSERT INTO class VALUES(?, ?, ?)";
    private static String sqlUpdate = "UPDATE class SET teacher_id = ?, name = ? WHERE id= ?";
    private static String sqlDelete = "DELETE FROM class WHERE id = ?";    
    
    static {
        conn = DBUtils.getConnection();
    } 
    
    public static List<? extends StudyClass> getAll() {
        List data = new ArrayList();
        try {
            stmt = conn.prepareStatement(sqlSelectAll);
            rs = stmt.executeQuery();
            while (rs.next()) {
                String id = rs.getString(1);
                String teacher = rs.getString(2);
                String name = rs.getString(3);

                StudyClass studyClass = new StudyClass(id, teacher, name);
                data.add(studyClass);
            }
            return data;
        } catch (SQLException ex) {
            Logger.getLogger(UserModel.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }
    
    public static boolean insert(StudyClass studyClass) {
        try {
            stmt = conn.prepareStatement(sqlInsert);

            stmt.setString(1, studyClass.getId());
            stmt.setString(2, studyClass.getTeacher());
            stmt.setString(3, studyClass.getName());
           
            stmt.execute();

            return true;
        } catch (SQLException ex) {
            Logger.getLogger(UserModel.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public static boolean update(StudyClass studyClass) {
        try {
            stmt = conn.prepareStatement(sqlUpdate);

            stmt.setString(1, studyClass.getTeacher());
            stmt.setString(2, studyClass.getName());
            stmt.setString(3, studyClass.getId());
           
            stmt.execute();

            return true;
        } catch (SQLException ex) {
            Logger.getLogger(UserModel.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public static boolean delete(String id) {
        try {
            stmt = conn.prepareStatement(sqlDelete);

            stmt.setString(1, id);
           
            stmt.execute();

            return true;
        } catch (SQLException ex) {
            Logger.getLogger(UserModel.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}