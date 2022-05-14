package hashtable;

import java.util.Map;
import java.util.HashMap;

class Hashmaps
{
    public static void main(String[] arg)
    {
        Map<String,String> gfg = new HashMap<String,String>();

        // enter name/url pair
        gfg.put("GFG", "geeksforgeeks.org");
        gfg.put("Practice", "practice.geeksforgeeks.org");
        gfg.put("Code", "code.geeksforgeeks.org");
        gfg.put("Quiz", "quiz.geeksforgeeks.org");

        // forEach(action) method to iterate map
        gfg.forEach((k,v) -> { System.out.println("Key = " + k + ", Value = " + v);
            System.out.println("hello");
                            });

        for (Map.Entry<String,String> entry : gfg.entrySet())
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());

    }
}