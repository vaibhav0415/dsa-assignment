import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int arr[]=new int[a];
        for(int i=0;i<a;i++){
			arr[i]=sc.nextInt();
		}
		int[] ans=new int[a];
		Stack<Integer> st=new Stack<>();
		Arrays.fill(ans,-1);
		for(int i=0;i<2*a;i++){
			int idx=i%a;
                     while(!st.isEmpty() && arr[idx]>arr[st.peek()]){
						 ans[st.pop()]=arr[idx];
					 }

                 st.push(idx);
		}
		for(int i=0;i<a;i++){
			System.out.print(ans[i]+" ");
		}
	 }
}
