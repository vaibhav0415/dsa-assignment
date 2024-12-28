import java.util.*;
class Node {
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}
public class Main {
    public static void main (String args[]) {
                Scanner sc=new Scanner(System.in);
                int s=sc.nextInt();
                Node temp=new Node(0);
                Node t=temp;
                while(s-- >0){
                      int val=sc.nextInt();
                      t.next=new Node(val);
                      t=t.next;
                }
                Node odd=temp.next;
                Node even=temp.next.next;
                Node evenhead=even;
                while(odd.next!=null && odd.next.next!=null){
                    odd.next=odd.next.next;
                    odd=odd.next;
                    even.next=even.next.next;
                    even=even.next;
                }
                odd.next=evenhead;
                temp=temp.next;
                while(temp!=null){
                    System.out.print(temp.val+" ");
                    temp=temp.next;
                }
    }
}