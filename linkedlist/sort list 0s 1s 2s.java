import java.util.*;
class Node{
	int val;
	Node  next;
	 Node(int val){
		this.val=val;
	}
}
public class Main {
    public static void main (String args[]) {
          Scanner sc=new Scanner(System.in);
		  int a=sc.nextInt();
		  Node temp=new Node(0);
		  Node t1=temp;
		  while(a-- > 0){
			  int val=sc.nextInt();
			  t1.next=new Node(val);
			  t1=t1.next;
		  }
		  temp=temp.next;
		  Node zero=new Node(100);
		  Node one=new Node(101);
		  Node two=new Node(102);
		  Node z=zero;
		  Node o=one;
		  Node t=two;
		  while(temp!=null){
			  if(temp.val==0){
				  z.next=temp;
				  z=temp;
			  }
			  else if(temp.val==1){
				  o.next=temp;
				  o=temp;
			  }
			  else{
				  t.next=temp;
				  t=temp;
			  }
			  temp=temp.next;
		  }
		  z.next=one.next;
		  o.next=two.next;
		  t.next=null;
		  zero=zero.next;
		  while(zero!=null){
               System.out.print(zero.val+" ");
			   zero=zero.next;
		  }
    }
}