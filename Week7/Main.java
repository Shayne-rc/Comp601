package Week7;

import java.util.*;
import static java.lang.System.*;
public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new LinkedList<>();
        shapes.add(new Shape("white"));
        shapes.add(new Rectangle("red", 10, 6));
        shapes.add(new Rectangle("black", 20, 9));
        shapes.add(new Shape("orange"));
        showShapeNames(shapes);
        Rectangle[] rectangleArray1 = {
                new Rectangle("white", 4, 3),
                new Rectangle("red", 9, 5),
                new Rectangle("purple", 3, 6),
                new Rectangle("orange", 15, 10),
                new Rectangle("black", 4, 14),
        };
        Rectangle[] rectangleArray2 = {
                new Rectangle("pink", 3, 4),
                new Rectangle("red", 10, 2),
                new Rectangle("white", 8, 5),
                new Rectangle("blue", 14, 4),
                new Rectangle("bindle", 10, 15),
        };


        countOverlapRectangles(rectangleArray1, rectangleArray2);
    }

    public static void showShapeNames(List<Shape> shapes) {
        // Complete method to produce sample run output part 1
        // Hint: iterate list “shapes”, invoke getShapeType() on each instance
        String shapeType = ""; // innitializing variable.
        for (int i = 0; i < shapes.size(); i++) {
            shapeType = shapes.get(i).getShapeType();
            out.println(shapeType);
        }
    }

    public static void countOverlapRectangles(Rectangle[] group1, Rectangle[] group2) {
        // Complete method to produce sample run output part 2
        // Note: you can assume that the colours/perimeters in each group are unique,
        // i.e., there are no duplicate colours/perimeters within each group.
        LinkedList<String> colours = new LinkedList<>();
        for (int i = 0; i < group1.length; i++) {
            for (int j = 0; j < group2.length; j++) {
                if (group1[i].getColour() == group2[j].getColour()) { 
                    colours.add(group1[i].getColour());
                }
            }
        }
        LinkedList<Double> perimeter = new LinkedList<>(); // compares arrays and adds duplicates (from array a to array b) to the list
        for (int i = 0; i < group1.length; i++) {
            for (int j = 0; j < group2.length; j++) {
                if (group1[i].getPerimeter() == group2[j].getPerimeter()) { 
                    perimeter.add(group1[i].getPerimeter());
                }
            }
        }
        out.printf("%s %d %s\n", "There are", colours.size(), "Rectangle objects with overlapping colours between the arrays");
        out.printf("%s %d %s\n", "There are", perimeter.size(), "Rectangle objects with overlapping colours between the arrays");
    }
}