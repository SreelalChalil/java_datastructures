package algorithms.numbers;

/*

Given an integer N, the task is to find the Nth even palindromic number of even length and only comprising of the digits X and Y where X, Y > 0.
Examples:


Input: N = 9, X = 4, Y = 5
Output: 454454
Explanation:
Even length palindromic numbers using 4 & 5 are
44, 55, 4444, 4554, 5445, 5555, 444444, 445544, 454454, …
9th term of the above series = 454454
Input: N = 6, X = 1, Y = 2
Output: 2222
Explanation:
Even length palindromic numbers using 1 & 2 are
11, 22, 1111, 1221, 2112, 2222, 111111, 112211, 121121, …
6th term of the above series = 2222


Even length palindromic numbers using X & Y are

XX, YY, XXXX, XYYX, YXXY, YYYY, XXXXXX, XXYYXX, ...
The above sequence can be observed as:

XX,       -> Length (L) = 2
YY,       -> Length (L) = 2

XXXX,     -> Length (L) = 4
XYYX,     -> Length (L) = 4
YXXY,     -> Length (L) = 4
YYYY,     -> Length (L) = 4

XXXXXX,   -> Length (L) = 6
XXYYXX,   -> Length (L) = 6
XYXXYX,   -> Length (L) = 6
XYYYYX,   -> Length (L) = 6
YXXXXY,   -> Length (L) = 6
YXYYXY,   -> Length (L) = 6
YYXXYY,   -> Length (L) = 6
YYYYYY,   -> Length (L) = 6

XXXXXXXX, -> Length (L) = 8
...
If we divide any term into 2 halves, the second half is just the reverse of the first half
Example:

Taking the term XXYYXX

Dividing this into 2 halves
XXYYXX = XXY | YXX

So YXX is just the reverse of XXY
Taking the left half only of the terms and putting X = 0 and Y = 1 to get the Binary String, the numbers of length L
can be seen forming a integer sequence from 0 to (2L/2 – 1), taken as Rank (R). Therefore 0 &leq; R &leq; 2L/2 – 1
Therefore the sequence can be observed as follows:

L -> Left Half -> Binary String -> Rank (in Decimal)

2 -> X    -> 0             -> 0
2 -> Y    -> 1             -> 1

4 -> XX   -> 00            -> 0
4 -> XY   -> 01            -> 1
4 -> YX   -> 10            -> 2
4 -> YY   -> 11            -> 3

6 -> XXX  -> 000           -> 0
6 -> XXY  -> 001           -> 1
6 -> XYX  -> 010           -> 2
6 -> XYY  -> 011           -> 3
6 -> YXX  -> 100           -> 4
6 -> YXY  -> 101           -> 5
6 -> YYX  -> 110           -> 6
6 -> YYY  -> 111           -> 7

8 -> XXXX -> 0000          -> 0
...
Therefore, For the required term N:
The length (L) of the required Nth term:

L=2(\left\lceil log_{2}(N + 2)\right\rceil-1)
Rank (R) of the required Nth term:

R = N - 2^{(\frac{L}{2})} + 1
First Half of the required Nth term = Binary representation of R in L/2 bits by replacing 0 as X and 1 as Y
Second Half of the required Nth term = Reverse of the First Half
Below is the implementation of the above approach:
 */
public class NthMagicNumber {
    // Utility function to compute
    // n'th palindrome number
    static String solve(int n, char x, char y)
    {
        // Calculate the length from above
        // formula as discussed above
        int length = (int)Math.ceil(Math.log(n + 2) / Math.log(2)) - 1;

        // Calculate rank for length L
        int rank = n - (1 << length) + 1;

        String left = "", right = "";

        for (int i = length -1 ; i >= 0; i--)
        {

            // Mask to check if i't bit
            // is set or not
            int mask = (1 << i);

            // If bit is set append '5' else append '4'
            int bit = mask & rank;

            if (bit > 0)
            {
                left += y;
                right += y;
            }
            else
            {
                left += x;
                right += x;
            }
        }

        StringBuilder sb = new StringBuilder(right);
        sb.reverse();

        right = sb.toString();

        String res = left + right;
        return res;
    }

    // Driver Code
    public static void main (String[] args)
    {
        int n = 23;
        char x = '4', y = '5';
        String ans = solve(n, x, y);
        System.out.println(ans);
    }

}
