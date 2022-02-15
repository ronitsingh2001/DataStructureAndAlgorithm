package gettingStarted;

import java.util.Scanner;

public class PrintFibonacci {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();
    int a = 0, b = 1, c;
    System.out.println(a + "\n" + b);
    if (n > 1) {
      for (int i = 2; i < n; i++) {
        c = a + b;
        System.out.println(c);
        a = b;
        b = c;
      }
    }
  }
}
