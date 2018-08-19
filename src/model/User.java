package model;

public class User {
    private String id;
    private String password;
    private String name;
    private boolean sex;
    private String email;
    private String phoneNumber;
    private String address;
    private String permission;
    private String image;

    public User(String id, String password, String name, boolean sex, String email, String phoneNumber, String address, String permission, String image) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.sex = sex;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.permission = permission;
        this.image = image;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String id) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }
    
    public boolean getSex() {
        return sex;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPermission() {
        return permission;
    }
    
    public void setImage(String image) {
        this.image = image;
    }

    public String getImage() {
        return image;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name=" + name + ", sex=" + sex + ", email=" + email + ", phoneNumber=" + phoneNumber + ", address=" + address + ", permission=" + permission + '}';
    }

}