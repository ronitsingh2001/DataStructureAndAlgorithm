package recursion;
import java.util.*;
public class displayArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();

        displayArr(a,n-1);
    }
    public static void displayArr(int[] a,int n){
        if(n==-1)
            return;
        displayArr(a,n-1);
        System.out.println(a[n]);
    }

}
