package exercise01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Circle circle= new Circle();
        Circle circle1=new Circle(6.5,"blue");
        System.out.println("circle");
        circle.inputData(sc);
        circle.displayData();

        System.out.println();
        System.out.println("circle2");
        double perimeter= circle1.perimeter(6.5);
        double area = circle1.area(6.5);
        System.out.println("Chu vi hình tròn là:"+perimeter);
        System.out.println("Diện tích hình tròn là:" +area);

    }
}
