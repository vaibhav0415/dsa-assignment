import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        convert(a,0);
    }
    public static void convert(String a,int ans){
        if(a.length()==0){
            System.out.println(ans);
            return;
        }
        convert(a.substring(1),(a.charAt(0)-'0')+(ans*10));
    }
}
