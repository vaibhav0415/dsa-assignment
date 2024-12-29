import java.util.*;
public class Main {
    public static void main (String args[]) {
                 Scanner sc=new Scanner(System.in);
                 int a=sc.nextInt();
                 int[] arr=new int[a];
                 for(int i=0;i<a;i++){
                     arr[i]=sc.nextInt();
                 }
                 Stack<Integer> st=new Stack<>();
                 int [] ans=new int[a];
                 ans[a-1]=0;
                 st.push(a-1);
                 for(int i=a-2;i>=0;i--){
                     while(st.size()>0 && arr[st.peek()]<=arr[i]){
                                   st.pop();
                     } 
                     if(st.size()>0) ans[i]=st.peek()-i;
                     st.push(i);
                 }
                 for(int i=0;i<a;i++){
                     System.out.print(ans[i]+" ");
                 }
                    
                    
                    
                    } 
}