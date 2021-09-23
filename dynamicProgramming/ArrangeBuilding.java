package dynamicProgramming;

import java.util.Scanner;

public class ArrangeBuilding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int send=1;
        int bend =1;
        for(int i=2;i<=n;i++){
            int Nsend=bend;
            int Nbend=Nsend+send;

            send=Nsend;
            bend=Nbend;
        }
        System.out.println((send+bend)*(send+bend));
    }
}
