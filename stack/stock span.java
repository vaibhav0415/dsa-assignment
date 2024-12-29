import java.util.*;
public class Main {

	public static void main(String args[])  {
		// Your Code Here
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int[] arr=new int[a];
		for(int i=0;i<a;i++){
			arr[i]=sc.nextInt();
		}
		int ans[]=new int[a];
	  // 100  80 60 70 60 75 85
	  //   1   1  1  2  1  4  6
	  // previous greater element
	  Stack<Integer> st=new Stack<>();
	  ans[0]=1;
	  st.push(0);
	  for(int i=1;i<a;i++){
               while(st.size()>0 && arr[st.peek()]<arr[i]){
				   st.pop();
			   }
               if(st.size()>0) ans[i]=i-st.peek();
			   else ans[i]=i-(-1);
			   st.push(i);
	  }
              for(int i=0;i<a;i++){
				  System.out.print(ans[i]+" ");
			  }
			  System.out.print("END");
	}

}

