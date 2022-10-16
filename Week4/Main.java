package Week4;

import static java.lang.System.in;
import static java.lang.System.out;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(in);

    public static void main(String[] args) {
        question4();
    }

    public static void question4() {
        out.print("Enter first line of colours ");
        String input1 = input.next();
        String[] firstColours = input1.split(",");

        out.print("Enter second line of colours ");
        String input2 = input.next();
        String[] secondColours = input2.split(",");
        
        out.println("You entered " + firstColours.length + " colours in the first list");
        out.println("You entered " + secondColours.length + " colours in the second list");
        LinkedList<String> duplicates = new LinkedList<>();

        for (int i = 0; i < firstColours.length; i++) {
            for (int j = 0; j < secondColours.length; j++) {
                if (firstColours[i].equals(secondColours[j])) {
                duplicates.add(firstColours[i]);
                }
            }
        }
        out.println("Number of overlapping colours " + duplicates.size());
        out.println("Overlapping colours are as follows");
        for (String e: duplicates){
            out.println(e);
        }
    }
}

