package module8;

public class GraphicsEditor {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape quad = new Quad();
        Shape triangle = new Triangle();
        Shape rectangle = new Rectangle();
        Shape trapezoid = new Trapezoid();

        // Название фигуры
        printShapeName(circle);
        printShapeName(quad);
        printShapeName(triangle);
        printShapeName(rectangle);
        printShapeName(trapezoid);

        // Периметр фигуры
        printShapePerimeter(circle);
        printShapePerimeter(quad);
        printShapePerimeter(triangle);
        printShapePerimeter(rectangle);
        printShapePerimeter(trapezoid);
    }

    public static void printShapeName(Shape shape) {
        System.out.println("This figure is " + shape.getShapeName());
    }

    public static void printShapePerimeter(Shape shape) {
        System.out.println("The perimeter of the " + shape.getShapeName() + " is " + shape.getPerimeter());
    }
}
