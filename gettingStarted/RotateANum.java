package gettingStarted;

import java.util.Scanner;

public class RotateANum {

  public static void main(String[] agrs) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int rot = sc.nextInt();
    sc.close();
    int temp = n, nod = 0, res = n;
    while (temp > 0) {
      nod++;
      temp /= 10;
    }
    rot = rot % nod;
    if (rot < 0) rot += nod;

    int p1 = (int) (n % Math.pow(10, rot));
    n = (int) (n / Math.pow(10, rot));
    res = (int) (p1 * Math.pow(10, nod - rot)) + n;
    System.out.println(res);
  }
}
