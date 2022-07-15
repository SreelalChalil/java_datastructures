package collectionf;

import java.lang.reflect.Array;
import java.util.*;

public class CollectionEg {

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(5);
        intList.add(7);
        intList.add(9);

        System.out.println(intList);
        intList.remove(0);
        System.out.println(intList);
        intList.removeAll(intList);
        System.out.println(intList);
        // intList.get(8);

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "Arun");
        map1.put(2, "Rahul");
        map1.put(3, "Nithya");

        System.out.println(map1);
        System.out.println(map1.get(6));


    }
}
