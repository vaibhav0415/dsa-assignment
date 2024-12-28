import java.util.*;
class Node{
	int  val;
	Node next;
	Node(int val){
		this.val=val;
	}
}
public class Main {
	static Scanner sc=new Scanner(System.in);
    public static void main (String args[]) {
            
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			Node head1=print(a);
			Node head2=print(b);
			Node head3=print(c);
			Node t2=head2;
			Node t3=head3;
			int k=sc.nextInt();
			while(head1!=null){
				head2=t2;
				while(head2!=null){
                     head3=t3;
					while(head3!=null){
						if(head1.val+head2.val+head3.val==k){
						System.out.print(head1.val+" "+head2.val+" "+head3.val);
						 return;
						}
						head3=head3.next;
					}
				     head2=head2.next;
				}
				head1=head1.next;
			}

    }
	public static Node print(int a){
		Node head=new Node(0);
		Node t=head;
		while(a-- >0){
            int val=sc.nextInt();
			t.next=new Node(val);
			t=t.next;
		}
		return head.next;

	}
}