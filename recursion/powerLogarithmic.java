package recursion;

import java.util.Scanner;

public class PowerLogarithmic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        sc.close();

        System.out.println(powerLog(n, p));
    }

    public static int powerLog(int n, int p) {
        if (p == 0)
            return 1;
        int npb2 = powerLog(n, p / 2);
        int np = npb2 * npb2;
        if (p % 2 == 1) {
            np *= n;
        }
        return np;
    }
}
