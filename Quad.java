package module8;

public class Quad extends Shape {
    private double side = 5;
    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public String getShapeName() {
        return "Quad";
    }
}
