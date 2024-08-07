package exercise08;

import java.util.Scanner;


class Employee {

    private int employeeId;
    private String employeeName;
    private int age;
    private String gender;
    private double rate;
    private double salary;

    // Constructor
    public Employee() {
    }

    // Constructor có tham số
    public Employee(int id, String name, int age, String gender, double rate) {
        this.employeeId = id;
        this.employeeName = name;
        this.age = age;
        this.gender = gender;
        this.rate = rate;
    }

    // Phương thức nhập thông tin từ người dùng
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã nhân viên: ");
        this.employeeId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập tên nhân viên: ");
        this.employeeName = scanner.nextLine();
        System.out.print("Nhập tuổi: ");
        this.age =Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập giới tính: ");
        this.gender = scanner.nextLine();
        System.out.print("Nhập hệ số lương: ");
        this.rate =Double.parseDouble(scanner.nextLine());
    }

    // Phương thức tính lương
    public void calSalary() {
        this.salary = this.rate * 1300000;
    }

    // Phương thức hiển thị thông tin nhân viên
    public void displayData() {
        System.out.println("Thông tin nhân viên:");
        System.out.println("Mã nhân viên: " + this.employeeId);
        System.out.println("Tên nhân viên: " + this.employeeName);
        System.out.println("Tuổi: " + this.age);
        System.out.println("Giới tính: " + this.gender);
        System.out.println("Hệ số lương: " + this.rate);
        System.out.println("Lương: " + this.salary);
    }
}

