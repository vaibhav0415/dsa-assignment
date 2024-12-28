import java.util.*;
    class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val=val;
        }
    }
public class Main{

    public static void main (String args[]) {
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            int k=sc.nextInt();
             ListNode temp=new ListNode(0);
             ListNode t=temp;
             for(int i=0;i<a;i++){
               int b=sc.nextInt();
                t.next=new ListNode(b);
                t=t.next;
             }

             ListNode slow=temp.next;
             ListNode fast=temp.next;
             if(temp.next==null || temp.next.next==null){
                 System.out.print("-1");
             }
             else{
             while(k-->0){
                 fast=fast.next;
             }
             if(fast==null) {
                 temp.next=temp.next.next;
                  }
           else{
             while(fast.next!=null){
                 slow=slow.next;
                 fast=fast.next;
             }
             slow.next=slow.next.next;
             
             }
             temp=temp.next;
             while(temp!=null){
                   System.out.print(temp.val+" ");
                   temp=temp.next;
             }}
    }
}