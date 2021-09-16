package recursion.recursionInArrayList;

import java.util.*;

public class GetMazeJumpPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        ArrayList<String> res = getJumpMaze(0, 0, r - 1, c - 1);

        System.out.println(res);
    }

    public static ArrayList<String> getJumpMaze(int sr, int sc, int dr, int dc) {
        if (sr == dr && sc == dc) {
            ArrayList<String> bs = new ArrayList<>();
            bs.add("");
            return bs;
        }

        if (sr > dr || sc > dc)
            return new ArrayList<>();

        ArrayList<String> myRes = new ArrayList<>();

        for (int i = 1; i <= dc - sc; i++) {
            ArrayList<String> resH = getJumpMaze(sr, sc + i, dr, dc);
            for (String val : resH)
                myRes.add("h" + i + val);
        }
        for (int i = 1; i <= dr - sr; i++) {
            ArrayList<String> resH = getJumpMaze(sr + i, sc, dr, dc);
            for (String val : resH)
                myRes.add("v" + i + val);
        }
        for (int i = 1; i <= dc - sc && i <= dr - sr; i++) {
            ArrayList<String> resH = getJumpMaze(sr + i, sc + i, dr, dc);
            for (String val : resH)
                myRes.add("d" + i + val);
        }
        return myRes;
    }
}
