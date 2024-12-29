import java.util.*;
public class Main {
    public static void main (String args[]) {
           Scanner sc=new Scanner(System.in);
		   int a=sc.nextInt();
		   int[] arr=new int[a];
		   for(int i=0;i<a;i++){
			   arr[i]=sc.nextInt();
		   }
		   int ans[]=new  int[a];
		   Stack<Integer> st=new Stack<>();
		   for(int i=(2*a)-1;i>=0;i--){
			   int idx=i%a;
			   while(!st.isEmpty() && arr[idx]>=arr[st.peek()%a]){
                           st.pop();
			   }
			   if(st.size()>0) ans[idx]=arr[st.peek()%a];
			   else ans[idx]=-1;
			   st.push(i);
		   }
		   for(int i=0;i<a;i++){
                     System.out.print(ans[i]+" ");
		   }
    }
}