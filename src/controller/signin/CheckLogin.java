package controller.signin;

import java.util.ArrayList;

import model.User;
import model.UserModel;

public class CheckLogin {
	public static User isThisAccountExist(String username, String password) {
		ArrayList<User> arrUser =  (ArrayList<User>) UserModel.getAll();
		for(User user : arrUser) {
			if(user.getId().equals(username) && user.getPassword().equals(password)) {
				return user;
			}
		}
		return null;
	}
	
}
