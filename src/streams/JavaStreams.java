package streams;

import java.util.*;
import java.util.stream.Collectors;

public class JavaStreams {

    public static void main(String[] args){
        List<String> list = Arrays.asList("A", "B", "C", "D", "A", "B", "C");

        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,1,3,7,4));

        Map<Integer, String> mMap = new HashMap<>();
        mMap.put(1, "Sreelal");
        mMap.put(1, "Anto");
        mMap.put(1, "Abhi");

        Iterator iter = numbers.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }

        List<String> distinctItems = list.stream()
                    .distinct()
                    .collect(Collectors.toList());
        System.out.println(distinctItems);

        List<Integer> evenList = numbers.stream().filter(i -> i%2 ==0).collect(Collectors.toList());
        System.out.println(evenList);

        List<Integer> evenToOddLis = evenList.stream().map(i -> i+1).collect(Collectors.toList());
        System.out.println(evenToOddLis);


    }

}

