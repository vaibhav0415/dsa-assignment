import java.util.*;
public class Main {
    public static void main (String args[]) {
                  Scanner sc=new Scanner(System.in);
                  int s=sc.nextInt();
                  int[] arr=new int[s];
                  for(int i=0;i<s;i++){
                      arr[i]=sc.nextInt();
                  }
               Stack<Integer> st=new Stack<>();
               for(int i=0;i<s;i++){
                  // collsion ho raha hai 
                  while(st.size()>0 && arr[i]<0 && st.peek()>0){
                      int sum=arr[i]+st.peek();
                      if(sum<0){
                          st.pop();
                      }
                      else if(sum>0){
                           arr[i]=0;
                          break;
                      }
                      else{//sum==0
                          st.pop();
                          arr[i]=0;
                          break;
                      }
                  }
                  if(arr[i]!=0) st.push(arr[i]);
               }
               int ans[]=new int[st.size()];
               for(int i=ans.length-1;i>=0;i--){
                 
                  ans[i]=st.pop();
               }
               for(int i=0;i<ans.length;i++)
               System.out.print(ans[i]+" ");
               
    }
}