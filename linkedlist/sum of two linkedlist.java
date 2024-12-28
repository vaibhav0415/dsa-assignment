import java.util.*;
class Node {
	int val;
	Node next;
	Node(int val){
		this.val=val;
	}
}
public class Main {
	static Scanner sc=new Scanner(System.in);
    public static void main (String args[]) {
             
			 int size1=sc.nextInt();
			 int size2=sc.nextInt();
			 Node head1=print(size1);
			 Node head2=print(size2);
			 head1=reverse(head1);
			 head2=reverse(head2);
			 
			 int carry=0;
			 int sum=0;
		     Node result=new Node(0);
			 Node r=result;
			 while(head1!=null || head2!=null || carry>=1){
				 sum=0;
					 if(head1!=null){
                      sum+=head1.val;
					  head1=head1.next;
				 }
				 if(head2!=null){
					 sum+=head2.val;
					  head2=head2.next;
				 }
                int s=sum+carry;
				carry=s/10;
				s=s%10;
				// System.out.print(sum);
				r.next=new Node(s);
				r=r.next;
				}
				
				// if(carry!=0){
				// 	r.next=new Node(carry);
				// }
				result=result.next;
				result=reverse(result);
				while(result!=null){
					System.out.print(result.val+" ");
					result=result.next;
				}


    }
	public static Node print(int size){
		Node head=new Node(0);
		Node t=head;
		while(size-->0){
			int val=sc.nextInt();
			t.next=new Node(val);
			t=t.next;
		}
		return head.next;
	}
	public static Node reverse(Node head){
		  Node curr=head;
		  Node prev=null;
		  Node nex=null;
		  while(curr!=null){
			  nex=curr.next;
			  curr.next=prev;
			  prev=curr;
			  curr=nex;
		  }
		  return prev;
	}

}