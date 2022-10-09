package module8;

public class Triangle extends Shape {
    private double sideA = 5;
    private double sideB = 8;
    private double sideC = 10;
    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }
}
