package Week3;

import static java.lang.System.in;
import static java.lang.System.out;

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(in);

    public static void main(String[] args) {
        question3();
    }

    public static void question3() {
        boolean loop = true;
        do {
            out.print("Enter the Score: ");
            double Score = Double.parseDouble(input.next());

            // between 0 (inclusive) and 50 (exclusive)
            if (Score >= 0 && Score < 50) {
                out.println("Score " + Score + " will recieve grade D");
                loop = false;
            }
            // between 50 (inclusive) and 70 (exclusive)
            else if (Score >= 50 && Score < 70) {
                out.println("Score " + Score + " will recieve grade C");
                loop = false;
            }
            // between 70 (inclusive) and 80 (exclusive)
            else if (Score >= 70 && Score < 80) {
                out.println("Score " + Score + " will recieve grade B");
                loop = false;
            }
            // between 80(inclusive) and 100 (inclusive)
            else if (Score >= 80 && Score <= 100) {
                out.println("Score " + Score + " will recieve grade A");
                loop = false;
            } else
                out.println("That Score is out of range");
        }
        while (loop == true);
        out.print("End");
    }
}
