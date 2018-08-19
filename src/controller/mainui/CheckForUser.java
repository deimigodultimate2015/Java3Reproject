package controller.mainui;

import java.util.ArrayList;

import model.User;
import model.UserModel;

public class CheckForUser {
	public static boolean isThisIDexist(String ID) {
		ArrayList<User> arrUser =  (ArrayList<User>) UserModel.getAll();
		for(User user : arrUser) {
			if(user.getId().equals(ID)) {
				return true;
			}
		}
		return false;
	}
}
