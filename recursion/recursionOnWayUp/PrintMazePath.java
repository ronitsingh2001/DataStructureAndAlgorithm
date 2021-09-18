package recursion.recursionOnWayUp;

import java.util.Scanner;

public class PrintMazePath {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        getMazePath(0, 0, r - 1, c - 1, "");
    }

    public static void getMazePath(int sr, int sc, int dr, int dc, String ans) {
        if (sr == dr && sc == dc) {
            System.out.println(ans);
            return;
        }
        if (sc < dc) {
            getMazePath(sr, sc + 1, dr, dc, ans + "h");
        }
        if (sr < dr) {
            getMazePath(sr + 1, sc, dr, dc, ans + "v");

        }
        
    }
}
