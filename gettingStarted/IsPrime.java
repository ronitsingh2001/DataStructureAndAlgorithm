package gettingStarted;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] sttgvf){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int num = sc.nextInt();

            int count=0;
            for(int div=2;div<=num;div++){
                if(num%div==0){
                    count++;
                }
            }
            if(count>1){
                System.out.println("Not a prime");
            }else{
                System.out.println("Prime");
            }
        }
        sc.close();
    }
}
