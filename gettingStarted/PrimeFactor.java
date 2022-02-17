package gettingStarted;

import java.util.Scanner;

public class PrimeFactor {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for(int i=2;i<=n&&n>1;){
            if(n%i==0){
                System.out.print(i+" ");
                n/=i;
            }else i++;
        }
    }
}
