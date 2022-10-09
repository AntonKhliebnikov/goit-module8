package module8;

public class Circle extends Shape {
    private static final double Pi = 3.1415926536;
    private double radius = 15;

    @Override
    public double getPerimeter() {
        return 2 * Pi * radius;
    }

    @Override
    public String getShapeName() {
        return "Circle";
    }
}
