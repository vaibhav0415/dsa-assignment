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
            int k=sc.nextInt();
            Node dummy=new Node(0);
            Node t=dummy;
            while(a-- >0){
                int val=sc.nextInt();
                t.next=new Node(val);
                t=t.next;
            }
            
           Node lo=new  Node(1);
           Node hi=new  Node(1);
           Node tl=lo;
           Node th=hi;
           Node temp=dummy.next;
         while(temp!=null){
             if(temp.val<k){
                tl.next=temp;
                tl=temp; 
                temp=temp.next;
             }
              else{
                th.next=temp;
                th=temp; 
                temp=temp.next;
              }
         }
         tl.next=hi.next;
         th.next=null;
         lo=lo.next;
         while(lo!=null){
             System.out.print(lo.val+" ");
             lo=lo.next;
         }


    }
}