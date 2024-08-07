package exercise09;

import java.util.Scanner;


class Student {

    private int studentId;
    private String studentName;
    private int age;
    private String gender;
    private String address;
    private String phoneNumber;

    // Constructor mặc định (0 tham số)
    public Student() {
    }

    // Constructor có tham số
    public Student(int id, String name, int age, String gender, String address, String phoneNumber) {
        this.studentId = id;
        this.studentName = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    //

    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    // Phương thức nhập thông tin từ người dùng
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã học sinh: ");
        this.studentId = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập tên học sinh: ");
        this.studentName = scanner.nextLine();
        System.out.println("Nhập tuổi: ");
        this.age = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập giới tính: ");
        this.gender = scanner.nextLine();
        System.out.println("Nhập địa chỉ: ");
        this.address = scanner.nextLine();
        System.out.println("Nhập số điện thoại: ");
        this.phoneNumber = scanner.nextLine();
    }

    // Phương thức hiển thị thông tin học sinh
    public void displayData() {
        System.out.println("Thông tin học sinh:");
        System.out.println("Mã học sinh: " + this.studentId);
        System.out.println("Tên học sinh: " + this.studentName);
        System.out.println("Tuổi: " + this.age);
        System.out.println("Giới tính: " + this.gender);
        System.out.println("Địa chỉ: " + this.address);
        System.out.println("Số điện thoại: " + this.phoneNumber);
    }

    // Getter cho mã học sinh

}

