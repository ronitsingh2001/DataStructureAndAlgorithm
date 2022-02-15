package gettingStarted;

import java.util.*;

public class InverseOfNum {

  public static void main(String[] args) {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();
    while (n != 0) {
      System.out.println(n % 10);
      n = n / 10;
    }
  }
}
