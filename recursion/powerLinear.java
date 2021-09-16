package recursion;

import java.util.*;

public class PowerLinear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        sc.close();

        System.out.println(powerLinear(n, p));
    }

    public static int powerLinear(int n, int p) {
        if (p == 0)
            return 1;
        int npm1 = powerLinear(n, p - 1);
        int np = n * npm1;
        return np;
    }
}
