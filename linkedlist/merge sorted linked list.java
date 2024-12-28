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
		  while(a-- >0){
			  int b=sc.nextInt();
			  Node head1=new Node(0);
			  Node  t=head1;
			  while(b-- >0){
                   int n1=sc.nextInt();
				   t.next=new Node(n1);
				   t=t.next;
			  }	
			  
			  int c=sc.nextInt();
			  Node head2=new Node(0);
			  Node  t2=head2;
			  while(c-- >0){
                   int n2=sc.nextInt();
				   t2.next=new Node(n2);
				   t2=t2.next;
			  }
			  head1=head1.next;	
			  head2=head2.next;
			  Node p1=head1;
			  Node p2=head2;
			  Node king=new Node(0);
			  Node p=king;
			  while(p1!=null && p2!=null){
                        if(p1.val<p2.val){
					
							p.next=p1;
							p=p1;
							p1=p1.next;
                       }
					   else{
						   p.next=p2;
						   p=p2;
						   p2=p2.next;
					   }
			  }
			  if(p1==null){
                   p.next=p2;
			  }
			  else {
				  p.next=p1;
			  }
			  king=king.next;
			  while(king!=null){
			  System.out.print(king.val+" ");
			  king=king.next;
			  }
			  System.out.println();
			  
			  
			  
		  }
    }
}