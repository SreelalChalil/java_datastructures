package arrays;

public class CountSubSequence {
    public static int countSubsequences(int[] A, int P) {
        int n = A.length;
        int[][] dp = new int[P + 1][n + 1];

        for (int i = 0; i <= P; i++) {
            for (int j = 1; j <= n; j++) {
                dp[i][j] = dp[i][j-1];
                if (A[j-1] <= i && A[j-1] > 0) {
                    dp[i][j] += dp[i/A[j-1]] [j-1] + 1;
                }
            }
        }

        for(int i=0; i<=P; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println("");
        }
        return dp[P][n];
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4};
        int P = 10;
        int[] K = new int[5];

        // Count the number of subsequences of A with product not more than P.
        int count = countSubsequences(A, P);

        // Print the answer.
        System.out.println(count);
    }
}