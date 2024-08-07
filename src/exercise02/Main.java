package exercise02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //
        System.out.print("Nhập giá trị a: ");
        double a =Double.parseDouble(sc.nextLine());
        System.out.print("Nhập giá trị b: ");
        double b = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập giá trị c: ");
        double c = Double.parseDouble(sc.nextLine());

        // Tạo đối tượng QuadraticEquation
        QuadraticEquation equation = new QuadraticEquation(a, b, c);

        // Tính toán và hiển thị kết quả
        double delta = equation.getDelta();
        if (delta > 0) {
            double root1 = equation.getRoot1();
            double root2 = equation.getRoot2();
            System.out.println("Phương trình có 2 nghiệm:");
            System.out.println("Nghiệm 1 = " + root1);
            System.out.println("Nghiệm 2 = " + root2);
        } else if (delta == 0) {
            double root = equation.getRoot1();
            System.out.println("Phương trình có nghiệm kép:");
            System.out.println("Nghiệm kép = " + root);
        } else {
            System.out.println("Phương trình vô nghiệm.");
        }

        sc.close();
    }
}
