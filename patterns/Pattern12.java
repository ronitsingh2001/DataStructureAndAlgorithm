package patterns;

import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
       
        int a=1,b=1;
        System.out.println(0);
        if(n==1)
            return;
        for(int i=1;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(a+"\t");
                int c = a+b;
                a=b;
                b=c;
            }
            System.out.println();
        }
    }
}
