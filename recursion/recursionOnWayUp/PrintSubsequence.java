package recursion.recursionOnWayUp;

import java.util.Scanner;

public class PrintSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        printSubsequence(s,"");
    }
    public static void printSubsequence(String s, String ans){
        if(s.length()==0){
            System.out.println(ans);
            return;
        }
        String s0=s.substring(0,1);
        String s1=s.substring(1);

        printSubsequence(s1, ans+s0);
        printSubsequence(s1, ans+"");
        
    }
}
