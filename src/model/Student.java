package model;

public class Student {

    private String id;
    private String name;
    private boolean sex;
    private String classId;
    private String email;
    private String phoneNumber;
    private String address;
    private String image;
    private float java;
    private float javascript;
    private float golang;

    public Student() {
    }

//	tạo đối tượng không cần điểm
    public Student(String id, String name, boolean sex, String classId, String email, String phoneNumber, String address, String image) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.classId = classId;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.image = image;
    }

    public Student(String id, String name, boolean sex, String classId, String email, String phoneNumber, String address, String image, float java, float js, float go) {
        this(id, name, sex, classId, email, phoneNumber, address, image);
        this.java = java;
        this.javascript = js;
        this.golang = go;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public float getJava() {
        return java;
    }

    public void setJava(float java) {
        this.java = java;
    }

    public float getJavascript() {
        return javascript;
    }

    public void setJavascript(float javascript) {
        this.javascript = javascript;
    }

    public float getGolang() {
        return golang;
    }

    public void setGolang(float golang) {
        this.golang = golang;
    }

    
    
    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", sex=" + sex + ", classId=" + classId + ", email=" + email + ", phoneNumber=" + phoneNumber + ", address=" + address + ", java=" + java + ", javascript=" + javascript + ", golang=" + golang + '}';
    }
}
