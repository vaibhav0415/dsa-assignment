import java.util.*;
public class Main {
    
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=count(a,b,0,0,"");
        System.out.println();
        System.out.print(c);
    }
    public static int count(int n,int b,int curr,int c,String ans){
        if(curr==n){
            System.out.print(ans+" ");
            return c+1;
        }
        for(int i=1;i<=b && i+curr<=n;i++){
            c=count(n,b,curr+i,c,ans+i);
        }
         return c;
    }
   
}
