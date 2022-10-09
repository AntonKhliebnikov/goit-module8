package module8;

public class Trapezoid extends Shape {
    private double sideA = 5;
    private double sideB = 8;
    private double sideC = 10;
    private double sideD = 7;

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC + sideD;
    }

    @Override
    public String getShapeName() {
        return "Trapezoid";
    }
}
