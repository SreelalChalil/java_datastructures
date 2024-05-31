package algorithms.strings;

import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class MostRepeatedCharInString {

    public static void main(String args[]){
        String input = "apple";
        System.out.println("Most Repeating Character in the String is " + findMostRepeaterChar(input));
    }

    public static char findMostRepeaterChar(String input){
        char output;
        int length = input.length();
        HashMap<Character, Integer> countMap = new HashMap<>();
        for(int i=0; i< length; i++){
            countMap.put(input.charAt(i), countMap.getOrDefault(input.charAt(i),0)+1);
        }
        Optional<Map.Entry<Character, Integer>> max = countMap.entrySet().stream().max(
                (e1, e2) -> e1.getValue().compareTo(e2.getValue())
        );
        return max.get().getKey();
    }
}
