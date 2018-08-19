package model;


import java.util.List;
import model.User;
import model.UserModel;


public class Test {

    public static void main(String[] args) {
        Student a = new Student("PS06636", "quang", true, "PT13301", "thanhtai@mgádf", "091234", "TG", "D://", 10, 9, 10);
        StudentModel.insertInfo(a);
//        StudentModel.insertMarks(a);
//          StudyClass a = new StudyClass("PT13302", "TE001", "haha");
//          StudyClassModel.delete("PT13302");
//        for (Object object : a) {
//            
//        }
        // Get all user
//        List data = UserModel.getAll();
//        for (Object object : data) {
//            System.out.println(object);
//        }
        
        
        // get all user by permission
//        data = UserModel.getAll("admin");
//        for (Object object : data) {
//            System.out.println(object);
//        }
        
        
//         insert new user
//        User user = new User("MA009", "12345", "Thái Xuân Thọ", true, "thotxps06680@fpt.edu.vn", "0987863123", "Ha Noi", "admin", "C://");
//        UserModel.insert(user);
        
        // update user
        
//        UserModel.update(user);
        
        // delete user
//        UserModel.delete("MA009");
        
    }
}
