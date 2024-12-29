import java.util.*;
public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0;i < n;i++)
		    arr[i] = s.nextInt();
		    
    		Main mainobj = new Main();
    		StacksUsingArrays stack = mainobj.new StacksUsingArrays(1000);
    		System.out.println(hist(arr, stack));
		}
	

	public static long hist(int[] arr, StacksUsingArrays stack) throws Exception {
       int n=arr.length;
	   int[] nse= new int[n];
	   int[] pse=new int[n];
	   //calculate nse
	   stack.push(n-1);
	   nse[n-1]=n;
	   for(int i=n-2;i>=0;i--){
		   while(stack.size()>0 && arr[stack.top()]>=arr[i]){
			   stack.pop();
		   }
		   if(stack.size()==0) nse[i]=n;
		   else  nse[i]=stack.top();
		   stack.push(i);
	   }
	   // emptying stack
	   while(stack.size()>0) stack.pop();
	   stack.push(0);
	   pse[0]=-1;
	   for(int i=1;i<n;i++){
		   while(stack.size()>0 && arr[stack.top()]>=arr[i]){
			   stack.pop();
		   }
		   if(stack.size()==0) pse[i]=-1;
		   else pse[i]=stack.top();
		   stack.push(i);
	   }
	   long max=0;
	   for(int i=0;i<n;i++){
		   long curr=arr[i];
		   long nex=nse[i]-pse[i]-1;
		   long area=curr*nex;
		   max=Math.max(max,area);
	   }
       return max;

	    //Write Your Code here
	    
	}

	private class StacksUsingArrays {
		private int[] data;
		private int tos;

		public static final int DEFAULT_CAPACITY = 10;

		public StacksUsingArrays() throws Exception {
			// TODO Auto-generated constructor stub
			this(DEFAULT_CAPACITY);
		}

		public StacksUsingArrays(int capacity) throws Exception {
			if (capacity <= 0) {
				System.out.println("Invalid Capacity");
			}
			this.data = new int[capacity];
			this.tos = -1;
		}

		public int size() {
			return this.tos + 1;
		}

		public boolean isEmpty() {
			if (this.size() == 0) {
				return true;
			} else {
				return false;
			}
		}

		public void push(int item) throws Exception {
			if (this.size() == this.data.length) {
				throw new Exception("Stack is Full");
			}
			this.tos++;
			this.data[this.tos] = item;
		}

		public int pop() throws Exception {
			if (this.size() == 0) {
				throw new Exception("Stack is Empty");
			}
			int retVal = this.data[this.tos];
			this.data[this.tos] = 0;
			this.tos--;
			return retVal;
		}

		public int top() throws Exception {
			if (this.size() == 0) {
				throw new Exception("Stack is Empty");
			}
			int retVal = this.data[this.tos];
			return retVal;
		}

		public void display() throws Exception {
			if (this.size() == 0) {
				throw new Exception("Stack is Empty");
			}
			for (int i = this.tos; i >= 0; i--) {
				System.out.println(this.data[i]);
			}

		}

	}

}

