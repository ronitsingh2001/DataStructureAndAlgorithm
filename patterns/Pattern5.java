package patterns;

import java.util.Scanner;

public class Pattern5 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();

    int sp = n / 2;
    int st = 1;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < sp; j++) {
        System.out.print("\t");
      }
      for (int j = 0; j < st; j++) {
        System.out.print("*\t");
      }
      System.out.println();
      if (i < n / 2) {
        st += 2;
        sp--;
      } else {
        st -= 2;
        sp++;
      }
    }
  }
}
