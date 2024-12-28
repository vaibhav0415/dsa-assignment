import java.util.*;
 class Node{
	int val;
	Node next;
	Node(int val){
		this.val=val;
	}
}
public class Main {
    public static void main (String args[]) {
              Scanner sc=new Scanner(System.in);
			  int a=sc.nextInt();
			  Node temp=new Node(0);
			  Node t=temp;
			  while(a-- > 0){
				  int b=sc.nextInt();
                  t.next=new Node(b);
				  t=t.next;
			  }
			  temp=temp.next;
			  Node even=new Node(0);
			  Node odd=new Node(0);
			  Node e=even;
			  Node o=odd;
			  while(temp!=null){
				  if(temp.val%2==0){
					  e.next=temp;
					  e=temp;
				  }
				  else{
					  o.next=temp;
					  o=temp;
				  }
				  temp=temp.next;
			  }
			  o.next=even.next;
			  e.next=null;
			  odd=odd.next;
			  while(odd!=null){
				  System.out.print(odd.val+" ");
				  odd=odd.next;
			  }
    }
}