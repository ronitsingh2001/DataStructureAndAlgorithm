package recursion.recursionOnWayUp;

import java.util.Scanner;

public class PrintJumpMaze {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        printMaze(0, 0, r - 1, c - 1, "");
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static void printMaze(int sr, int sc, int dr, int dc, String ans) {
        if (sr == dr && sc == dc) {
            System.out.println(ans);
            return;
        }
        if (sr > dr || sc > dc)
            return;

        for (int i = 1; i <= dc - sc; i++) {
            printMaze(sr, sc + i, dr, dc, ans + "h" + String.valueOf(i));
        }
        for (int i = 1; i <= dr - sr; i++) {
            printMaze(sr + i, sc, dr, dc, ans + "v" + String.valueOf(i));
        }
        for (int i = 1; i <= dc - sc && i <= dr - sr; i++) {
            printMaze(sr + i, sc + i, dr, dc, ans + "d" + String.valueOf(i));
        }
    }
}
