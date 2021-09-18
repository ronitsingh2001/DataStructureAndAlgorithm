package recursion.recursionBackTracking;
import java.util.*;
public class FloodFill {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        scn.close();
        
        floodfill(arr, 0, 0, "",new boolean[n][m]);
    }
    
    // asf -> answer so far
    public static void floodfill(int[][] a, int r, int c, String ans,boolean[][] visited) {
    
    if (r < 0 || c < 0 || r == a.length || c == a[0].length || a[r][c] == 1 || visited[r][c]==true)
            return;

        if (r == a.length - 1 && c == a[0].length - 1) {
            System.out.println(ans);
            return;
        } 
        visited[r][c]=true;
        floodfill(a, r - 1, c, ans + "t",visited);
        floodfill(a, r, c - 1, ans + "l",visited);
        floodfill(a, r + 1, c, ans + "d",visited);
        floodfill(a, r, c + 1, ans + "r",visited);
        visited[r][c]=false;
    }
}
