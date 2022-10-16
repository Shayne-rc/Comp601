package Week8;

import java.util.*;

public class BagApp {
    public double calcTotalCapacity(List<Bag> bagList, double sum) {
        if (bagList != null && bagList.size() > 0) {
            List<Bag> subList = bagList.subList(1, bagList.size());
            return calcTotalCapacity(subList, sum + bagList.get(0).getCapacity());
        } else {
            return sum;
        }

    }
}