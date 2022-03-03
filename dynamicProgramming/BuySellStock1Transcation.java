package dynamicProgramming;

import java.util.Scanner;

public class BuySellStock1Transcation {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] price = new int[n];
    for (int i = 0; i < n; i++) price[i] = sc.nextInt();
    sc.close();
    int lsf = Integer.MAX_VALUE, op = 0, pist = 0;
    for (int i = 0; i < n; i++) {
      if (price[i] < lsf) {
        lsf = price[i];
      }
      pist = price[i] - lsf;
      if (op < pist) {
        op = pist;
      }
    }
    System.out.println(op);
  }
}
