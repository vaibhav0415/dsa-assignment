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
          int no=sc.nextInt();
          int len=sc.nextInt();
          ArrayList<Node> ar=new ArrayList<>();
          for(int i=0;i<no;i++){
              Node head=new Node(sc.nextInt());
              Node curr=head;
              for(int j=1;j<len;j++){
                curr.next=new Node(sc.nextInt());
                curr=curr.next;
              }
             ar.add(head);
          }
         Node dummy=new Node(100);
         Node temp=dummy;
        PriorityQueue<Node> pq=new PriorityQueue<>(new Comparator<Node>(){
            public int compare(Node o1,Node o2){
                return o1.val-o2.val;
            }
          });
           for(Node ls:ar){
             if(ls!=null) pq.add(ls);
          }
          while(pq.size()>0){
              Node curr=pq.poll();
              temp.next=curr;
              temp=temp.next;
              if(curr.next!=null){
                pq.add(curr.next);
              }
          } 
        dummy=dummy.next;
        while(dummy!=null){
            System.out.print(dummy.val+" ");
            dummy=dummy.next;
        }

    }
}