package dynamicProgramming;

import java.util.Scanner;

public class MaxSumNonAdjacent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int [n];
        for(int  i=0;i<n;i++)
            a[i]= sc.nextInt();
        sc.close();
        int exc=0,inc=a[0];
        for(int i=1;i<n;i++){
            int newExc=exc>inc?exc:inc;
            int newInc=exc+a[i];

            exc=newExc;
            inc=newInc;
        }
        System.out.println(exc>inc?exc:inc);
    }
}
