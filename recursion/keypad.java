import java.util.*;
public class Main {
    static String arr[]={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String n=sc.next();
        ArrayList<String> ar=new ArrayList<>();
        print(n,ar,"");
        for(String str: ar){
            System.out.print(str+" ");
        }
        int size=ar.size();
        System.out.println();
        System.out.print(size);

    }
    public static void print(String n,ArrayList<String> ar,String ans){
        if(n.length()==0){
            ar.add(ans);
            return;
        }
        char h=n.charAt(0);
        String que=arr[h-'0'-1];
        for(int i=0;i<que.length();i++){
            print(n.substring(1),ar,ans+que.charAt(i));
        }

    }
}