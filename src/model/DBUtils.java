package model;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBUtils {

    private static Connection conn;
    private static String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static String URL = "jdbc:sqlserver://localhost:1433;databaseName=school_manager";
    private static String USER = "sa";
    private static String PASS = "123";

    private static String[] getDatabaseLogin() {
    	String[] thisLogin = whatInYourMind();
    	return thisLogin;
    }
    
    public static Connection getConnection() {
    	String[] thisLogin = getDatabaseLogin();
    	try {
            java.lang.Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL, thisLogin[0], thisLogin[1]);
        } catch (SQLException ex) {
            Logger.getLogger(DBUtils.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
    
    public static void rememberThis(String username, String Password) {
		try {
			File file = new File(System.getProperty("user.home")+"\\Documents\\dbconfiguration.txt");
			DataOutputStream dos = new DataOutputStream(new FileOutputStream(file));
			dos.writeUTF(username);
			dos.writeUTF(Password);
			dos.flush();
			dos.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public static String[] whatInYourMind() {
		String []returns = new String[2];
		try {
			File file = new File(System.getProperty("user.home")+"\\Documents\\dbconfiguration.txt");
			DataInputStream dis = new DataInputStream(new FileInputStream(file));
			returns[0] = dis.readUTF();
			returns[1] = dis.readUTF();
		} catch (Exception ex) {
			
		}
		
		return returns;
	}
	
	public static boolean isItEmpty() {
		File file = new File(System.getProperty("user.home")+"\\Documents\\dbconfiguration.txt");
		return file.length() == 0;
	}
	
	public static void dontRememberThis() {
		File file = new File(System.getProperty("user.home")+"\\Documents\\dbconfiguration.txt");
		if(file.exists()) {
			file.delete();
			System.out.println("remember what ?");
		} else {
			System.out.println("nothing to delete");
		}
	}
}