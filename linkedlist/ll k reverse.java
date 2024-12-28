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
				 int size=sc.nextInt();
				 int k=sc.nextInt();
				 Node temp=new Node(0);
				 Node t=temp;
				 while(size-- >0){
					 int val=sc.nextInt();
					 t.next=new Node(val);
					 t=t.next;
				 }
				 temp=temp.next;
				
				Node head=reversek(temp,k);
				 while(head!=null){
					 System.out.print(head.val+" ");
					 head=head.next;
				 }
    }
	public static Node  reversek(Node head,int k){
           int len=length(head);
		   while(len<k || head==null) return head;
		   Node dummy=new Node(0);
		   dummy.next=head;
		   Node prev=dummy;
		   Node curr=dummy;
		   Node after=dummy;
		   while(len>=k){
			   curr=prev.next;
			   after=curr.next;
			   for(int i=1;i<k;i++){
				   curr.next=after.next;
				   after.next=prev.next;
				   prev.next=after;
				   after=curr.next;
			   }
			   prev=curr;
			   len-=k;
		   }
		   return dummy.next;

	}
	public static int length(Node head1){
		int count=0;
		while(head1!=null){
			count++;
			head1=head1.next;
		}
		return count;
	}
}