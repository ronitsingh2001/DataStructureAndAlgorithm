package recursion;
import java.util.*;
public class towerOfHanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        toh(n,"A","B","C");
    }
    public static void toh(int n , String a1, String a2, String a3){
        if(n==0)
            return;
        toh(n-1, a1, a3, a2);
        System.out.println(n+"["+a1+" -> "+a2+"]");
        toh(n-1, a3, a2, a1);
        
    }

}
