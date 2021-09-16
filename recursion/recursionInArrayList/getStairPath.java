package recursion.recursionInArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class GetStairPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        ArrayList<String> res = getPath(n);
        
        System.out.println(res);
    }

    public static ArrayList<String> getPath(int n) {
        if (n < 0)
            return new ArrayList<>();
        if (n == 0) {
            ArrayList<String> bs = new ArrayList<>();
            bs.add("");
            return bs;
        }
        ArrayList<String> myRes = new ArrayList<>();
        ArrayList<String> r1 = getPath(n - 1);
        ArrayList<String> r2 = getPath(n - 2);
        ArrayList<String> r3 = getPath(n - 3);
        for (String val : r1)
            myRes.add( "1" + val );
        for (String val : r2)
            myRes.add( "2" + val );
        for (String val : r3)
            myRes.add( "3" + val );
        return myRes;
    }
}
