package dynamicProgramming;

import java.util.Scanner;

public class CountSequenceABC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        int a = 0, ab = 0, abc = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'A') {
                a = 2 * a + 1;
            } else if (ch == 'b' || ch == 'B') {
                ab = 2 * ab + a;
            } else if (ch == 'c' || ch == 'C') {
                abc = 2 * abc + ab;
            }
        }
        System.out.println(abc);
    }
}
