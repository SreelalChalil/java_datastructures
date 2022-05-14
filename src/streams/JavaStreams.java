package streams;

import java.util.*;
import java.util.stream.Collectors;

public class JavaStreams {

    public static void main(String[] args){
        List<String> list = Arrays.asList("A", "B", "C", "D", "A", "B", "C");
        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,1,3,7,4));
        // Get list without duplicates
        Map<Integer, String> mMop = new HashMap<>();
        mMap.put(1, "Sreelal")
                
        List<String> distinctItems = list.stream()
                    .distinct()
                    .collect(Collectors.toList());
        System.out.println(distinctItems);

    }
}
