package module8;

public class Rectangle extends Shape {
    private double sideA = 5;
    private double sideB = 10;
    @Override
    public double getPerimeter() {
        return 2 * (sideA + sideB);
    }

    @Override
    public String getShapeName() {
        return "Rectangle";
    }
}
