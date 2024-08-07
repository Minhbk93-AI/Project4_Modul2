package exercise04;

public class Fan {
    public  final int SLOW=1;
    public  final int MEDIUM=2;
    public  final int FAST=3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius=5;
    private String color= "blue";

    //Khởi tạo đối tượng không tham số

    public Fan() {
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    //Geter, Setter
    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }



    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //

    @Override
    public String toString() {
        if (on) {
            return "[Fan is on[speed=" + this.speed + ", color=" + this.color + ", radius=" + this.radius + "]]";
        }else {
            return "[Fan is off[ color=" + this.color + ", radius=" + this.radius + "]]";
        }
    }
}
