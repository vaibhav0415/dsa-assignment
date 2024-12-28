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
                  for(int i=0;i<a;i++){
                      int v=sc.nextInt();
                      t.next=new Node(v);
                      t=t.next;

                  }
                  Node dummy=new Node(0);
                  Node temp1=dummy;
                  Node curr=temp.next;
                  Node nex=null;
                  while(curr!=null){
                      nex=curr.next;
                      temp1=dummy;
                      while(temp1.next!=null && temp1.next.val<curr.val){
                          temp1=temp1.next;
                      }
                      curr.next=temp1.next;
                      temp1.next=curr;
                      curr=nex;
                  }
                  dummy =dummy.next;
                  while(dummy!=null){
                      System.out.print(dummy.val+" ");
                      dummy=dummy.next;
                  }


                  
    }
}