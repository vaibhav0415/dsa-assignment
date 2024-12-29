import java.util.*;
public class Main {
    public static void main (String args[]) {
       Scanner sc=new Scanner(System.in);
       String a=sc.next();
       rep(a,"");

       }
       public static void rep(String a,String ans){
           if(a.length()==0){
               System.out.print(ans);
               return;
           }
           char c=a.charAt(0)=='0'?'5':a.charAt(0);
           rep(a.substring(1),ans+c);

       }
}