package dynamicProgramming;

import java.util.Scanner;

public class StairClimbing {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        sc.close();

        System.out.println(stairCount(n,new int[n+1]));
    }
    public static int stairCount(int n,int[] ar){
        int[] dp = new int[n+1];
        dp[0]=1;
        for(int i=1;i<dp.length;i++){
            dp[i]+=dp[i-1];
            if(i-2>-1)
                dp[i]+=dp[i-2];
            if(i-3>-1)
                dp[i]+=dp[i-3];
        }
        return dp[n];
    }
}
