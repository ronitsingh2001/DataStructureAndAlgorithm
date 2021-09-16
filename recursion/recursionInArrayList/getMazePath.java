package recursion.recursionInArrayList;

import java.util.*;

public class getMazePath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        ArrayList<String> res = getMazePath(0, 0, r - 1, c - 1);
        System.out.print(res);
    }

    public static ArrayList<String> getMazePath(int sr, int sc, int dr, int dc) {
        if (sr == dr && sc == dc) {
            ArrayList<String> bs = new ArrayList<>();
            bs.add("");
            return bs;
        }
        ArrayList<String> resH = new ArrayList<>();
        ArrayList<String> resV = new ArrayList<>();
        if (sc < dc) {
            resH = getMazePath(sr, sc + 1, dr, dc);
        }
        if (sr < dr) {
            resV = getMazePath(sr + 1, sc, dr, dc);
        }
        ArrayList<String> myRes = new ArrayList<>();
        for (String val : resH)
            myRes.add("h" + val);
        for (String val : resV)
            myRes.add("v" + val);
        return myRes;
    }
}
