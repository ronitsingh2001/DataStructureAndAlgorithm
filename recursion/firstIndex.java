package recursion;
import java.util.*;
public class firstIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a= new int[n];
        for(int i=0;i<n;i++)    
            a[i]=sc.nextInt();
        int x= sc.nextInt();
        System.out.println(firstIndex(a,0,x));
    }
    public static int firstIndex(int[] a, int n , int x){
        if(n==a.length)
            return -1;
        if(a[n]==x)
            return n;
        int fi=firstIndex(a, n+1, x);
        return fi;
    }
}
