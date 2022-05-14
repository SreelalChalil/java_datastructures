package algorithms.strings;

public class Palindrome {
    public static void main(String[] args){
        String s = "Malayalam", s_reverse="";
        for(int i=0;i<s.length();i++)
            s_reverse += s.charAt(s.length()-i-1);
        if(s.toLowerCase().equals(s_reverse.toLowerCase()))
            System.out.println("The String is a Palindrome");
        else System.out.println("The String is not a Palindrome");
    }
}
