import java.util.*;
public class Main {
	public static boolean know(int[][] arr,int a,int b){
		return arr[a][b]==1;
		
	}
    public static void main(String args[]) {
              Scanner sc=new Scanner(System.in);
			  int n=sc.nextInt();
			  int[][] arr=new int[n][n];
			  for(int i=0;i<n;i++){
				  for(int j=0;j<n;j++){
					  arr[i][j]=sc.nextInt();
				  }
			  }
			  Stack<Integer> st=new Stack<>();
			  for(int i=0;i<n;i++){
                     st.push(i);
				  }
				  while(st.size()>1){
					  int a=st.pop();
					  int b=st.pop();
					  if(know(arr,a,b))  st.push(b);
					  else st.push(a);
					  }
				  int ans=st.peek();
                  int rcount=0;
                  for(int i=0;i<n;i++){
					  if(arr[ans][i]==0) {
						  rcount++;
					  }
				  }
				  int ccount=0;
				  for(int i=0;i<n;i++){
					  if(arr[i][ans]==1){
						  ccount++;
					  }
				  }
				  if(rcount==n && ccount==n-1){
                              System.out.print(ans);
				  }
				  else{
					  System.out.print("No Celebrity");
				  }
			  }
    }
