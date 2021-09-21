package dynamicProgramming;

import java.util.Scanner;

public class MinCostInTraversalMaze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] a = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++)
                a[i][j] = sc.nextInt();
        }
        sc.close();
        int[][] dp = new int[r][c];

        for (int i = r - 1; i >= 0; i--) {
            for (int j = c - 1; j >= 0; j--) {
                if (i == dp.length - 1 && j!=dp[0].length-1) {
                    dp[i][j] += dp[i][j + 1] + a[i][j];
                }
                 else if (j == dp[0].length - 1 && i != dp.length - 1 ) {
                    dp[i][j] += dp[i + 1][j] + a[i][j];
                } 
                else if (i < dp.length - 1 && j < dp[0].length - 1) {
                    if (dp[i][j + 1] > dp[i + 1][j]) {
                        dp[i][j] += dp[i + 1][j] + a[i][j];
                    }
                     else {
                        dp[i][j] += dp[i][j + 1] + a[i][j];
                    }
                }
                else{
                    dp[i][j]=a[i][j];
                }
            }
        }
        System.out.println(dp[0][0]);
       
    }
}
