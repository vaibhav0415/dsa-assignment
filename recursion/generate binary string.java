import java.util.*;
public class Main {
    public static void main(String args[]) {
         Scanner sc=new Scanner(System.in);
         int a=sc.nextInt();
         for(int i=0;i<a;i++){
             String b=sc.next();
             solve(b,"");
         }

    }
    public static void solve(String no,String ans){
        if(no.length()==0){
            System.out.print(ans+" ");
            return;
        }
        if(no.charAt(0)=='?'){
            solve(no.substring(1),ans+"0");
            solve(no.substring(1),ans+"1");

        }
        else{
            solve(no.substring(1),ans+no.charAt(0));
        }
    }
}