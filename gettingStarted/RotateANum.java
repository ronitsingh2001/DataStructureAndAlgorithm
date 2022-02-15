package gettingStarted;

import java.util.Scanner;

public class RotateANum {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rot=sc.nextInt();
        sc.close();
        int temp = (int)(n % Math.pow(10, rot));
        System.out.print(temp);
        System.out.print((int)(n / Math.pow(10, rot)));
    }
}
