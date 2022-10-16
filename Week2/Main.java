package Week2;
import static java.lang.Math.PI;
import static java.lang.System.in;
import static java.lang.System.out;

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(in);
    public static void main(String[] args) {
        question2();
    }
    public static void question2() {

        out.print("Enter Circle Radius: ");
        double radius = input.nextDouble(); // takes user input
        double area = PI*radius*radius; // area is radius^2*PI
        double diameter = radius*2; // diameter is double the radius
        double perimeter = diameter*PI; 
        
        // Print Output
        String fmt1 = "%-15s %-15s %-15s\n"; // formats the first printf statement
        String fmtNum = "%-15.2f %-15.2f %-15.2f"; //formats the variables to 2 decimals when printed.
        out.printf(fmt1, "Radius", "Perimeter", "Area");
        out.println("-".repeat(40));
        out.printf(fmtNum, radius, perimeter, area);
    }
}