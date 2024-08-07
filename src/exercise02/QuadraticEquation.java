package exercise02;

public class QuadraticEquation {

    private double a, b, c;

        // Constructor
        public QuadraticEquation(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

    //
    public double getDelta() {
        return b * b - 4 * a * c;
    }

    //
    public double getRoot1() {
        double delta = getDelta();
        if (delta < 0) {
            return 0; // No real roots
        } else {
            return (-b + Math.sqrt(delta)) / (2 * a);
        }
    }

    public double getRoot2() {
        double delta = getDelta();
        if (delta < 0) {
            return 0; // No real roots
        } else {
            return (-b - Math.sqrt(delta)) / (2 * a);
        }
    }

        // Getters
        public double getA() {
            return a;
        }

        public double getB() {
            return b;
        }

        public double getC() {
            return c;
        }


    }


