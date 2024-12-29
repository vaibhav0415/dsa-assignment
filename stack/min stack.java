import java.util.*;
class MinStack {
          Stack<Integer> st=new Stack<>();
          Stack<Integer> min=new Stack<>();
    public MinStack() {
         // constructor
    }
    
    public void push(int val) {
        if(st.size()==0){
            st.push(val);
            min.push(val);
        }
        else{
            st.push(val);
            if(min.peek()<val){
                min.push(min.peek());
            }
            else{
                min.push(val);
            }
        }
    }
    
    public void pop() {
             min.pop();
             st.pop();   
    }
    
    public int top() {
         return st.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}
public class Main {
    public static void main (String args[]) {
           Scanner sc=new Scanner(System.in);
                  int s=sc.nextInt();
                  String[] arr=new String[s];
                  for(int i=0;i<s;i++){
                      arr[i]=sc.next();
                  }
               MinStack minStack = new MinStack();
			   StringBuilder answer=new StringBuilder();
			   for(int i=0;i<arr.length;i++){
				   if(arr[i].equals("push")){
					   minStack.push(sc.nextInt());
				   }
				   else if(arr[i].equals("pop")){
					   minStack.pop();
				   }
				   else if(arr[i].equals("top")){
					    int val=minStack.top();
						answer.append(val).append(" ");
						}
					else{
						int val= minStack.getMin();
						answer.append(val).append(" ");
					}
			   }
			   System.out.print(answer.toString());
}}
