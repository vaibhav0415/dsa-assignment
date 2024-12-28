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
                // Node dummy =new Node(0);
                // Node t=dummy;
                // while(sc.hasNextInt()){
                //     int val=sc.nextInt();
                //     t.next=new Node(val);
                //     t=t.next;
                //     }
                // dummy=dummy.next;
                // if(dummy==null && dummy.next==null) System.out.print(dummy.val);
                // else{
                // Node slow=dummy;
                // Node fast=dummy;
                // while(fast!=null && fast.next!=null){
                //          slow=slow.next;
                //          fast=fast.next.next;
                // }
                // System.out.print(slow.val);
                // }
                LinkedList<Integer> ls=new LinkedList<>();
               while(sc.hasNextInt()){
                        int val=sc.nextInt();
                        ls.add(val);

               }
               if( ls.size()%2!=0){
                   System.out.print((ls.size()/2)+1);
               }
               else
               System.out.print(ls.size()/2);
    }
}