import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<String> list=new ArrayList<>();
        map(n+"",list);
        
    }

    private static String print(List<String>ls){
        String ans="";
        for(String s:ls){
            int n=Integer.valueOf(s);
            char ch=(char)(n+'A'-1);
            ans+=ch;
        }
        return ans;
    }

    private static void map(String s,List<String>ls){
        if(s.length()==0){
            String ans=print(ls);
            System.out.println(ans);
            return;
        }

        for(int i=1;i<=s.length();i++){
            if(Integer.valueOf(s.substring(0,i))<=26){
                ls.add(s.substring(0,i));
                map(s.substring(i),ls);
                ls.remove(ls.size()-1);
            }
        }
    }
}