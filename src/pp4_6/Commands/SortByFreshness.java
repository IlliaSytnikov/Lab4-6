package pp4_6.Commands;

import java.util.ArrayList;
import pp4_6.Flowers.*;

public class SortByFreshness {
    public static void sort (ArrayList<Flower> list) {
        for (int m = 0; m < list.size() - 1; m++) {
            Flower fresher = list.get(m);
            for (int i = m + 1; i < list.size(); i++) {
                if (list.get(i).getFlower_freshness() < fresher.getFlower_freshness()) {
                    fresher = list.get(i);
                }
            }
            swap(list, m, list.indexOf(fresher));
        }
    }

    public static void swap (ArrayList<Flower> list, int index1, int index2) {
        if (index1 != index2) {
            list.add(list.get(index1));
            list.set(index1, list.get(index2));
            list.remove(index2);
        }
    }
}
