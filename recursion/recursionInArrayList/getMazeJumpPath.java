package recursion.recursionInArrayList;

import java.util.*;

public class getMazeJumpPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        ArrayList<String> res = getJumpMaze(0, 0, r - 1, c - 1);
    }

    public static ArrayList<String> getJumpMaze(int sr, int sc, int dr, int dc) {
        if (sr == dr && sc == dc) {
            ArrayList<String> bs = new ArrayList<>();
            bs.add("");
            return bs;
        }
        if (sr > dr || sc > dc)
            return new ArrayList<>();
        for (int i = 0; i < dc; i++) {
            ArrayList<String> resH = getJumpMaze(sr, sc + i, dr, dc);
            for (String val : resH)
                resH.add("h" + i + val);
        }
        for (int i = 0; i < dr; i++) {
            ArrayList<String> resH = getJumpMaze(sr + i, sc, dr, dc);
            for( String val : resH)
                resH.add("r"+i+val);
        }
        for (int i = 0; i < dc && i<dr; i++) {
            ArrayList<String> resH = getJumpMaze(sr+i, sc + i, dr, dc);
            for( String val : resH)
                resH.add("d"+i+val);
        }
    }
}
