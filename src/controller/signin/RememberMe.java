package controller.signin;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class RememberMe {
	public static void rememberThis(String username, String Password) {
		try {
			File file = new File(System.getProperty("user.home")+"\\Documents\\rememberMe.txt");
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
			File file = new File(System.getProperty("user.home")+"\\Documents\\rememberMe.txt");
			DataInputStream dis = new DataInputStream(new FileInputStream(file));
			returns[0] = dis.readUTF();
			returns[1] = dis.readUTF();
		} catch (Exception ex) {
			
		}
		
		return returns;
	}
	
	public static boolean isItEmpty() {
		File file = new File(System.getProperty("user.home")+"\\Documents\\rememberMe.txt");
		return file.length() == 0;
	}
	
	public static void dontRememberThis() {
		File file = new File(System.getProperty("user.home")+"\\Documents\\rememberMe.txt");
		if(file.exists()) {
			file.delete();
			System.out.println("remember what ?");
		} else {
			System.out.println("nothing to delete");
		}
	}
	
	public static void main(String[]args) {
		try {
//			rememberThis("hanazuki2010","hanazu2010");
//			System.out.println("remembered");
//			System.out.println(whatInYourMind()[1]);
//			System.out.println(isItEmpty());
			dontRememberThis();
		} catch (Exception ex) {
			
		}
	}
}
