package dynamicProgramming;

import java.util.Scanner;

public class StairClimbingWVariableJumps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++)
            a[i] = sc.nextInt();
        sc.close();

        int[] dp = new int[n + 1];
        dp[n] = 1;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 1; j <= a[i] && i + j < dp.length; j++) {
                dp[i] += dp[i + j];
            }
        }
        System.out.println(dp[0]);
    }
}
