import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        solve(s,"","",0);
        
    }
    public static void solve(String real,String remove,String replace ,int count_hi){
        if(real.length()==0){
            System.out.println(count_hi);
            System.out.println(remove);
                System.out.println(replace);
                            return ;
        }
        
        if(real.length()>=3 && real.charAt(0)=='h' && real.charAt(1)=='i'&& real.charAt(2)=='t'){
            solve(real.substring(3),remove+"hit",replace+"hit",count_hi);
        }
        else if(real.length()>=2 && real.charAt(0)=='h' && real.charAt(1)=='i' ){
            solve(real.substring(2),remove,replace+"bye",count_hi+1);
        }
        else{
            solve(real.substring(1),remove+real.charAt(0),replace+real.charAt(0),count_hi);
        }
        
    }
}
