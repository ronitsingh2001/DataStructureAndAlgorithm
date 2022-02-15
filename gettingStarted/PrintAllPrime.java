package gettingStarted;

import java.util.Scanner;

public class PrintAllPrime {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int low= sc.nextInt();
        int high= sc.nextInt();
        sc.close();
        for(int i=low;i<=high;i++){
            int count=0;
            for(int div=2;div*div<=i;div++){
               if(i%div==0){
                   count++;
                   break;
               }
            }
            if(count==0){
                System.out.println(i);
            }
        }
    }
}
