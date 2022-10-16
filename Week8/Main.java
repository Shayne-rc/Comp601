package Week8;
import java.util.*;
import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
    List<Bag> bags = new LinkedList<>();

    bags.add(new Bag("orange", 10.29));
    bags.add(new Bag("blue", 3.33));
    bags.add(new Bag("red", 6.19));
    bags.add(new Bag("orange", 4.35));
    bags.add(new Bag("black", 10.52));
    
    BagApp bgapp = new BagApp();
    double totalCapacity = bgapp.calcTotalCapacity(bags, 0);
    out.printf("Total capacity: %.2f\n", totalCapacity);
    out.printf("Total number of bags: %d\n", bags.size());
    }
 }
