package exercise01;

import java.util.Scanner;

public class Circle {
    private double radius;
    private  String color;

    //Các Contructor
    public Circle() {

    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    //Các phương thức trả về
    public double perimeter(double radius){
        return  2*Math.PI*radius;
    }
    public  double area(double radius){
        return Math.PI*(Math.pow(radius,2));
    }
    //
    public void inputData(Scanner sc) {
//        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập bán kính: ");
        this.radius = Double.parseDouble(sc.nextLine());
        sc.nextLine();
        System.out.print("Nhập màu sắc: ");
        this.color = sc.nextLine();
    }

    public void displayData() {
        System.out.println("Thông tin hình tròn:");
        System.out.println("Bán kính: " + this.radius);
        System.out.println("Màu sắc: " + this.color);
        System.out.printf("Chu vi: " + perimeter(radius));
        System.out.println("Diện tích: " + area(radius));
    }



    // Các Phương thức get, set


    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
