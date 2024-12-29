import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc= new  Scanner(System.in);
        int n=sc.nextInt();
        odd(n);
        even(n,2);
    }
    public static void odd(int n){
        if(n<=0){
            return;
        }
        if(n%2!=0){
            System.out.println(n);
        }
        odd(n-1);
    }
    public static void even(int m,int x){
        if(x>m){
            return;
        }
        if(x%2==0){
            System.out.println(x);
        }
        even(m,x+2);
    }
}
