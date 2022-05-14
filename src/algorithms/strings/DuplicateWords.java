package algorithms.strings;

import java.util.Locale;

public class DuplicateWords {

    public static void main(String[] args){
        String string = "I have seen have";
        string = string.toLowerCase();

        String words[] = string.split(" ");

        for(int i=0; i<words.length; i++){
            int count=1;
            for(int j =i+1; j< words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                }
            }
        }

    }
}
