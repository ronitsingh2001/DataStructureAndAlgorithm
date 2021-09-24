package dynamicProgramming;

import java.util.Scanner;

public class ArrangeBuilding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        long     send = 1;
        long     bend = 1;
        for (int i = 2; i <= n; i++) {
            long Nsend = bend;
            long Nbend = bend + send;

            send = Nsend;
            bend = Nbend;
        }
        System.out.println((send + bend) * (send + bend));
    }
}
