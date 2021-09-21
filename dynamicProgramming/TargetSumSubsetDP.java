package dynamicProgramming;

import java.util.Scanner;

public class TargetSumSubsetDP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++)
            a[i] = sc.nextInt();

        int tar = sc.nextInt();
        sc.close();
        boolean[][] dp = new boolean[n + 1][tar + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (i == 0 && j != 0) {
                    dp[i][j] = false;
                } else if (j == 0) {
                    dp[i][j] = true;
                }else{
                    if(j<a[i-1]){
                        dp[i][j]=dp[i-1][j];
                    }else{
                        dp[i][j]=dp[i-1][j]||dp[i-1][j-a[i-1]];
                    }
                }
            }
        }
        for (int i = 0; i < dp.length; i++) {
           if(dp[i][dp[0].length-1] == true){
               System.out.println(true);
               return;
           }
        }
        System.out.println(false);
    }
}
