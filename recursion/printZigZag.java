package recursion;

import java.util.*;

public class PrintZigZag {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        
        pzz(n);
    }

    public static void pzz(int n) {
        if (n == 0)
            return;
        System.out.print(n);
        pzz(n - 1);
        System.out.print(n);
        pzz(n - 1);
        System.out.print(n);
    }
}
