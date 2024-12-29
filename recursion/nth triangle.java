import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(print(n));

    }
    public static int print(int n){
            if(n==1) return 1;
            return n+print(n-1);
    }
}
