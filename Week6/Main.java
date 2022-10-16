package Week6;

import static java.lang.System.out;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<LeafyGreen> veges = new LinkedList<>();
        veges.add(new LeafyGreen(10, 3.5, "Cabbage"));
        veges.add(new LeafyGreen(5, 2.94, "Lettuce"));
        veges.add(new LeafyGreen(20, 5.45, "Broccoli"));
        veges.add(new LeafyGreen(7, 1.94, "Lettuce"));
        veges.add(new LeafyGreen(15, 2.8, "Lettuce"));
        veges.add(new LeafyGreen(30, 2.5, "Cabbage"));
        veges.add(new LeafyGreen(28, 4.4, "Broccoli"));
        veges.add(new LeafyGreen(20, 5.5, "Cabbage"));
        veges.add(new LeafyGreen(16, 3.9, "Broccoli"));
        veges.add(new LeafyGreen(26, 4.8, "Broccoli"));
        calculateStats(veges);
    }

    public static void calculateStats(List<LeafyGreen> veges) {
        String type = ""; // initialising variables
        double totalCost = 0;
        double cabbageWeight = 0;
        double broccoliWeight = 0;
        double lettuceWeight = 0;
        for (int i = 0; i < veges.size(); i++) { // for loop iterating over List of veges.
            totalCost += veges.get(i).totalPrice(); // gets price from each object and adds it to the totalCost
                                                    // variable.
            type = veges.get(i).getType(); // gets type of object for switch statement below.

            switch (type) {
                case "Cabbage":
                    cabbageWeight += veges.get(i).getWeight();
                    break;
                case "Lettuce":
                    lettuceWeight += veges.get(i).getWeight();
                    break;
                case "Broccoli":
                    broccoliWeight += veges.get(i).getWeight();
                    break;
            }
        }
        out.printf("%s%3.2f \n", "Total Vegetable cost: $", totalCost); // no space between the %s and %f format to
                                                                        // create the $num as 1 word
        out.printf("%s %3.2f %s \n", "Total Cabbage Weight:", cabbageWeight, "kg");
        out.printf("%s %3.2f %s \n", "Total Broccoli Weight:", broccoliWeight, "kg");
        out.printf("%s %3.2f %s \n", "Total Lettuce Weight:", lettuceWeight, "kg");
    }
}
