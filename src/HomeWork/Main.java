import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/**
 * Created by user on 27.07.2017.
 */
public class Main {

    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();

        Shape circle1 = new Circle(5, "GREEN");
        Shape circle2 = new Circle(8, "RED");
        Shape circle3 = new Circle(10, "BLUE");
        Shape squrae1 = new Squre(5, 7, "GREEN");
        Shape squrae2 = new Squre(5, 49, "RED");
        Shape squrae3 = new Squre(5, 12, "BLUE");

        shapes.add(circle1);
        shapes.add(circle2);
        shapes.add(circle3);
        shapes.add(squrae1);
        shapes.add(squrae2);
        shapes.add(squrae3);


        System.out.println(colculateCost(shapes,EnumColours.RED));
    }

    private static double colculateCost(List<Shape> shapes, EnumColours filterColor) {

        double cost = 0;

        for (Shape shape : shapes) {
            if (shape.colour() == filterColor) {
                cost += shape.size() * shape.colour().coast;
            }
        }
        return cost;
    }
}
