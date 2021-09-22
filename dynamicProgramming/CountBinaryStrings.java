package dynamicProgramming;

import java.util.Scanner;

public class CountBinaryStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        ;
        int[][] dp = new int[2][n + 1];
        dp[0][1] = 1;
        dp[1][1] = 1;
        for (int j = 2; j < dp[0].length; j++) {
            dp[0][j] = dp[1][j - 1];
            dp[1][j] = dp[0][j-1] + dp[0][j ];
        }
        System.out.println(dp[1][n] + dp[0][n]);
    }
}
