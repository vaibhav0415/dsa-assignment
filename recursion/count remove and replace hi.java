import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        String given =sc.next();
        solve(given,"","",0);

    }
    public static void solve(String given,String remove,String replace,int count){
        if(given.length()==0){
            System.out.println(count);
            System.out.println(remove);
            System.out.println(replace);
            return;
        }
        if(given.length()>=2 && given.charAt(0)=='h' && given.charAt(1)=='i'){
            solve(given.substring(2),remove,replace+"bye",count+1);
        }
        else{
            solve(given.substring(1),remove+given.charAt(0),replace+given.charAt(0),count);
        }
    }
}
