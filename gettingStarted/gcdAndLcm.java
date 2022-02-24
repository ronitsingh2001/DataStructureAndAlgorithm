package gettingStarted;

import java.util.Scanner;

public class gcdAndLcm {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        sc.close();
        for(int i=n1>n2?n1:n2;i>=0;i--){
            if(n1%i==0&&n2%i==0){
                System.out.println(i);
                break;
            }
        }
        for(int i=n1>n2?n1:n2;true;i++){
            if(i%n1==0&&i%n2==0){
                System.out.println(i);
                break;
            }
        }
    }
}
