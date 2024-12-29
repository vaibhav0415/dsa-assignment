import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        int b=subseq(a,"");
        System.out.println();
        System.out.print(b);
    }
    public static int subseq(String a,String b){
        if(a.length()==0){
            System.out.print(b+" ");
            return 1;
        }
        int y=subseq(a.substring(1),b);
        int  x=subseq(a.substring(1),b+a.charAt(0));
        
        return x+y;
    }
}
