package dynamicProgramming;

import java.util.Scanner;

public class PaintFence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.close();
        long sameCol=k*1, difCol=k*(k-1);
        long total=sameCol+difCol;
        for(int i=2;i<n;i++){
            sameCol=difCol*1;
            difCol=total*(k-1);
            total=sameCol+difCol;
        }
        System.out.println(total);
    }
}
