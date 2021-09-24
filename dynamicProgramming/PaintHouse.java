package dynamicProgramming;

import java.util.Scanner;

public class PaintHouse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[][] a = new int[n][3];
        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++)
                a[i][j]=Integer.parseInt(sc.next());
        }
        sc.close();
       int[][] dp = new int[n][3]; 
       dp[0][0]=a[0][0];
       dp[0][1]=a[0][1];
       dp[0][2]=a[0][2];
       for(int i=1;i<dp.length;i++){
           dp[i][0]= a[i][0] + Math.min(dp[i-1][1],dp[i-1][2]);
           dp[i][1]= a[i][1] + Math.min(dp[i-1][0],dp[i-1][2]);
           dp[i][2]= a[i][2] + Math.min(dp[i-1][1],dp[i-1][0]);
       }
       System.out.println(Math.min(dp[n-1][0],Math.min(dp[n-1][1], dp[n-1][2])));
    }
}
