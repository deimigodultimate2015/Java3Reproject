package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserModel {

    protected static Connection conn = null;
    protected static PreparedStatement stmt = null;
    protected static ResultSet rs = null;

    private static String sqlSelectAll = "SELECT * FROM account WHERE permission LIKE ?";
    private static String sqlInsert = "INSERT INTO account VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private static String sqlUpdate = "UPDATE account SET password = ?, name = ?, sex = ?, email = ?, phone_number = ?, address = ?, permission = ?, image = ? WHERE id= ?";
    private static String sqlUpdateRSP = "UPDATE account SET password = ?  WHERE id= ?";
    private static String sqlDelete = "DELETE FROM account WHERE id = ?";

    static {
        conn = DBUtils.getConnection();
    } 
    
    public static String createPassword() {
		int pw = 0;
		for (int i = 0; i < 6; i++) {
			int rd = (int) (Math.random()*10);
			pw += rd * Math.pow(10, i);
		}
		return "" + pw;
	}

    public static void updateAvatar(String ID, String avatar) {
    	Connection conn = DBUtils.getConnection();
    	try {
    		PreparedStatement ps = conn.prepareStatement("Update account set image = ? where id = ?");
    		ps.setString(1, avatar);
    		ps.setString(2, ID);
    		ps.executeUpdate();
    		conn.close();
    		System.out.println("Update complete "+ID+" "+avatar);
    	} catch (Exception ex) {
    		ex.printStackTrace();
    	}
    }
    
    public static List<? extends User> getAll() {
        List data = new ArrayList();
        try {
            stmt = conn.prepareStatement(sqlSelectAll);
            stmt.setString(1, "%%");
            rs = stmt.executeQuery();
            while (rs.next()) {
                String id = rs.getString(1);
                String password = rs.getString(2);
                String name = rs.getString(3);
                boolean sex = rs.getBoolean(4);
                String email = rs.getString(5);
                String phoneNumber = rs.getString(6);
                String address = rs.getString(7);
                String permission = rs.getString(8);
                String image = rs.getString(9);

                User user = new User(id, password, name, sex, email, phoneNumber, address, permission, image);
                data.add(user);
            }
            return data;
        } catch (SQLException ex) {
            Logger.getLogger(UserModel.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    public static List<? extends User> getAll(String permission) {
        List data = new ArrayList();
        if (permission.equals("")) {
            return getAll();
        }

        try {
            stmt = conn.prepareStatement(sqlSelectAll);
            stmt.setString(1, "%" + permission + "%");
            rs = stmt.executeQuery();
            while (rs.next()) {
                String id = rs.getString(1);
                String password = rs.getString(2);
                String name = rs.getString(3);
                boolean sex = rs.getBoolean(4);
                String email = rs.getString(5);
                String phoneNumber = rs.getString(6);
                String address = rs.getString(7);
                String image = rs.getString(8);

                User user = new User(id, password, name, sex, email, phoneNumber, address, permission, image);
                data.add(user);
            }
            return data;
        } catch (SQLException ex) {
            Logger.getLogger(UserModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static boolean insert(User user) {
        try {
            stmt = conn.prepareStatement(sqlInsert);

            stmt.setString(1, user.getId());
            stmt.setString(2, user.getPassword());
            stmt.setString(3, user.getName());
            stmt.setBoolean(4, user.getSex());
            stmt.setString(5, user.getEmail());
            stmt.setString(6, user.getPhoneNumber());
            stmt.setString(7, user.getAddress());
            stmt.setString(8, user.getPermission());
            stmt.setString(9, user.getImage());

            stmt.execute();

            return true;
        } catch (SQLException ex) {
            Logger.getLogger(UserModel.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public static boolean update(User user) {
        try {
            stmt = conn.prepareStatement(sqlUpdate);
            stmt.setString(1, user.getPassword());
            stmt.setString(2, user.getName());
            stmt.setBoolean(3, user.getSex());
            stmt.setString(4, user.getEmail());
            stmt.setString(5, user.getPhoneNumber());
            stmt.setString(6, user.getAddress());
            stmt.setString(7, user.getPermission());
            stmt.setString(8, user.getImage());
            stmt.setString(9, user.getId());

            stmt.executeUpdate();

            return true;
        } catch (SQLException ex) {
            Logger.getLogger(UserModel.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public static boolean resetPassword(String ID) {
    	 try {
             stmt = conn.prepareStatement(sqlUpdateRSP);
             stmt.setString(1, UserModel.createPassword());
             stmt.setString(2, ID);
             stmt.executeUpdate();
             
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

            stmt.executeUpdate();

            return true;
        } catch (SQLException ex) {
            Logger.getLogger(UserModel.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}