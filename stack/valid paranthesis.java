import java.util.*;
public class Main {
    public static void main (String args[]) {
              Scanner sc=new Scanner(System.in);
			  String s=sc.next();
			  boolean flag=Balanced(s);
	          System.out.print(flag);
	}
	public static boolean Balanced(String str) {
		Stack<Character> stack=new Stack<>();
            for(int i=0;i<str.length();i++){
				char ch=str.charAt(i);
				if(ch=='(' || ch=='[' || ch=='{'){
					    stack.push(ch);
				}
				else if(ch==')'){
					if(stack.isEmpty() || stack.peek()!='(') return false;
					else stack.pop();
				}
				else if(ch==']'){
					if(stack.isEmpty() || stack.peek()!='[') return false;
					else stack.pop();
				}
				else if(ch=='}'){
					if(stack.isEmpty() || stack.peek()!='{') return false;
					else stack.pop();
				}

			}
			if(stack.size()>0) return false;
			else return true;
		
	}
}