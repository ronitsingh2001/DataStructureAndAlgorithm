package recursion.recursionOnWayUp;

import java.util.Scanner;

public class PrintPermutation {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        printPer(s, "");
    }

    public static void printPer(String ques, String ans) {

        if (ques.length() == 1) {
            System.out.println(ans + ques);
            return;
        }
        for (int i = 0; i < ques.length(); i++) {
            String ch = ques.substring(i, i + 1);
            String roq = ques.substring(0, i) + ques.substring(i + 1);
            printPer(roq, ans + ch);
        }
    }
}
