package gettingStarted;

import java.util.Scanner;

public class PythagorasTriplet {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    sc.close();
    if (
      a * a + b * b == c * c || b * b + c * c == a * a || a * a + c * c == b * b
    ) System.out.println(true); else System.out.println(false);
  }
}
