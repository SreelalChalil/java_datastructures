package algorithms.numbers;
/*
Given a number n as a string, find the nth even-length positive palindrome number .

Examples:

Input : n = "1"
Output : 11
1st even-length palindrome is 11 .

Input : n = "10"
Output : 1001
The first 10 even-length palindrome numbers are 11, 22,
33, 44, 55, 66, 77, 88, 99 and 1001.

As, it is a even-length palindrome so its first half should be equal to reverse of second half and length
will be 2, 4, 6, 8 …. To evaluate nth palindrome let’s just see 1st 10 even-length palindrome numbers
11, 22, 33, 44, 55, 66, 77, 88, 99 and 1001 . Here, nth palindrome is nn’ where n’ is reverse of n .
Thus we just have to write n and n’ in a consecutive manner where n’ is reverse of n.
 */
public class NthPalindromeNumber {
// Function to find nth even length Palindrome
    static String evenlength(String n)
    {
        // string r to store resultant
        // palindrome. Initialize same as s
        String res = n;

        // In this loop string r stores
        // reverse of string s after the
        // string s in consecutive manner
        for (int j = n.length() - 1; j >= 0; --j)
            res += n.charAt(j);

        return res;
    }

    // Driver code
    public static void main(String[] args)
    {
        String n = "10";

        // Function call
        System.out.println(evenlength(n));
    }
}
