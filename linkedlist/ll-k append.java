import java.util.*;
class Node{
	int val;
	Node next;
	Node(int val){
		this.val=val;
	}
}
public class Main {
    public static void main(String args[]) {
          Scanner sc=new Scanner(System.in);
		  int a=sc.nextInt();
		  int size=a;
		  Node temp=new Node(0);
		  Node t=temp;
		  while(a-- >0){
			  int val=sc.nextInt();
			  t.next=new Node(val);
			  t=t.next;			  
		  }
		  int app=sc.nextInt();
		  app=app%size;

		   temp=temp.next;
		  if(app==0){
                  while(temp!=null){
					  System.out.print(temp.val+" ");
					  temp=temp.next;
				  }
		  }
		 else{
		  int kitna_aage=size-app;
		  
		   t=temp;
		  while(kitna_aage-- >1){
			  t=t.next;
		  }
		  Node mam=t.next;
		  t.next=null;
		  Node temp2=mam;
		  while(temp2!=null && temp2.next!=null ){
			  temp2=temp2.next;
		  }
		//   if(temp2==null){
             
		//   }
		  
			  temp2.next=temp;
		  
		  while(mam!=null){
			  System.out.print(mam.val+" ");
			  mam=mam.next;
		  }}
    }
}