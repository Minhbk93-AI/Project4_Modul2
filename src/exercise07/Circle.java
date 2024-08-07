package exercise07;

public class Circle {
    private double radius =1.0;
    private String color="red";


    //Khởi tạo Contructor

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }
    //Phương thức có kiểu trả về
    public static double area(double radius){
        return Math.PI*radius*radius;

    }

    // Phương thức Get

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return Circle.area(radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", area=" + Circle.area(radius) +
                '}';
    }
}
