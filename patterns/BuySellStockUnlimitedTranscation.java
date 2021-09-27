package patterns;

import java.util.Scanner;

public class BuySellStockUnlimitedTranscation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] price = new int[n];
        for (int i = 0; i < n; i++)
            price[i] = sc.nextInt();
        sc.close();
        int bd = 0, sd = 0, profit = 0;
        for(int i=1;i<n;i++){
            if(price[i]>=price[i-1]){
                sd++;
            }else{
                profit+=price[sd]-price[bd];
                sd=bd=i;
            }
        }
            profit+=price[sd]-price[bd];
        System.out.println(profit);
    }
}
