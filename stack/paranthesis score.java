import java.util.*;
public class Main {
    public static void main (String args[]) {
                     Scanner sc=new Scanner(System.in);
                     String s=sc.next();
                     Stack<Integer> st=new Stack<>();
                     int score=0;
                     for(int i=0;i<s.length();i++){
                         char ch=s.charAt(i);
                         if(ch=='('){
                             st.push(score);
                             score=0;
                         }
                         else{
                             score=st.peek()+Math.max(2*score,1);
                             st.pop();                         
                             }
                     }
                     System.out.print(score);
    }
}