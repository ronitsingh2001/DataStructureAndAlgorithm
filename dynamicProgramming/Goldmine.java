package dynamicProgramming;

import java.util.Scanner;

public class Goldmine {
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
        for (int j = c-1; j >=0; j--) {
            for (int i = r - 1; i >= 0; i--) {
                if (j == c - 1) {
                    dp[i][j] = a[i][j];
                } else if (i == 0 && j != c - 1) {
                    if (dp[i][j + 1] > dp[i + 1][j + 1]) {
                        dp[i][j] += dp[i][j + 1] + a[i][j];
                    } else {
                        dp[i][j] += dp[i + 1][j + 1] + a[i][j];
                    }
                } else if (i == r - 1 && j != c - 1) {
                    if (dp[i][j + 1] > dp[i - 1][j + 1]) {
                        dp[i][j] += dp[i][j + 1] + a[i][j];
                    } else {
                        dp[i][j] += dp[i - 1][j + 1] + a[i][j];
                    }
                } else if(i!=r-1&&r!=0&&j!=c-1) {
                    int max = dp[i-1][j+1];
                    if(max<dp[i][j+1]){
                        max=dp[i][j+1];
                    }
                    if(max<dp[i+1][j+1]){
                        max=dp[i+1][j+1];
                    }
                    dp[i][j] += max + a[i][j];
                }
            }
        }
        int max=dp[0][0];
        for (int i = 1; i < r; i++) {
            if(dp[i][0]>max)
                max=dp[i][0];
        }
        System.out.println(max);
    }
}
