package gettingStarted;

import java.util.Scanner;

public class InverseOfNum {
    public static void main(String[] srgs){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int op=1,invRes=0;
        while(n>0){
            int od=n%10;
            n/=10;
            int id=op;
            int ip=od;
            invRes+=id*Math.pow(10, ip-1);
            op++;
        }
        System.out.println(invRes);
    }
}
