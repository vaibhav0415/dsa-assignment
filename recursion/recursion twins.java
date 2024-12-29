import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        System.out.println(twink(a));
        
    }
    public static int twink(String a){
        if(a.length()<3) return 0;
        int twin=0;
        if(a.charAt(0)==a.charAt(2)) 
        twin=1;
        int nexttwin=twink(a.substring(1));
        return twin+nexttwin;


    }
    }
