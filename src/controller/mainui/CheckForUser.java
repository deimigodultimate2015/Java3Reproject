package controller.mainui;

import java.util.ArrayList;

import model.Student;
import model.StudentModel;
import model.User;
import model.UserModel;

public class CheckForUser {
	public static boolean isThisUserIDexist(String ID) {
		ArrayList<User> arrUser =  (ArrayList<User>) UserModel.getAll();
		for(User user : arrUser) {
			if(user.getId().equals(ID)) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean isThisStudentIDexist(String ID) {
		ArrayList<Student> arrUser =  (ArrayList<Student>) StudentModel.getAll();
		for(Student user : arrUser) {
			if(user.getId().equals(ID)) {
				return true;
			}
		}
		return false;
	}
}
