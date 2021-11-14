package patterns;

import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {

        // write ur code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int sp = n * 2 - 3;
        int st = 1;
        for (int i = 0; i < n - 1; i++) {
            int val = 0;
            for (int j = 0; j < st; j++)
                System.out.print(++val + "\t");
            for (int j = 0; j < sp; j++)
                System.out.print("\t");
           
            for (int j = 0; j < st; j++)
                System.out.print(val-- + "\t");
            System.out.println();
            sp -= 2;
            st++;
        }
        int val=0;
        for(int i=0;i<n*2-1;i++){
            if(i<n){
                System.out.print(++val+"\t");
            }else{
                System.out.print(--val +"\t");
            }
        }
    }
}
