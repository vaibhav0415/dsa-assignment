import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int t = scn.nextInt();

		while (t > 0) {
			int n = scn.nextInt();
			int[] arr = new int[n];

			for (int i = 0; i < arr.length; i++)
				arr[i] = scn.nextInt();

			nextLarger(arr);

			t--;
		}

	}

	// Function to print Next Greater Element for each element of the array
	public static void nextLarger(int[] arr) {
             Stack<Integer> st=new Stack<>();
             int []ans=new int[arr.length];
             Arrays.fill(ans,-1);
             for(int i=0;i<arr.length;i++){
                 while(!st.isEmpty() && arr[i]>arr[st.peek()]){
                     ans[st.pop()]=arr[i];
                 }
                 
                 
                 
                 st.push(i);
             }
             for(int i=0;i<arr.length;i++){
                 System.out.println(arr[i]+","+ans[i]);
             }

// Write Code here

	}
}
