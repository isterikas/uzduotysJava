import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Circle circle2 = new Circle(3, "blue", true);
        Rectangle rectangle = new Rectangle(6, 4);
        Square square = new Square(3);
        Triangle triangle = new Triangle(3, 4, 5);
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(circle);
        shapes.add(circle2);
        shapes.add(rectangle);
        shapes.add(square);
        shapes.add(triangle);
        double totalArea = 0;
        double largestPerimeter = 0;
        String largestShape = "";
        for (Shape shape : shapes) {
            System.out.println(shape);
            totalArea += shape.getArea();
            largestPerimeter = Math.max(largestPerimeter, shape.getPerimeter());
            largestShape = largestPerimeter > shape.getPerimeter() ? shape.toString() : "";


        }
        System.out.println("Largest area:" + totalArea);
        System.out.println("Largest perimeter:" + largestPerimeter + " which is " + largestShape.toLowerCase());
    }

}