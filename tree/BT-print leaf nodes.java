import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> ar=new ArrayList<>();
        while(sc.hasNextInt()){
              ar.add(sc.nextInt());
        }
        BT bt=new BT(ar);
        bt.leaf();
    }
}
class BT{
    class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val=val;
        }
    }
    Node root;
    void leaf(){
        leaf(this.root);
    }
    private void leaf(Node root) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            System.out.print(root.val+ " ");
            return;
        }
        if (root.left != null) leaf(root.left);
        if (root.right != null) leaf(root.right);
    }
    BT(ArrayList<Integer> ar){
            Queue<Node> q=new LinkedList<>();
            this.root=construct(ar,0,q);
    }
    Node construct(ArrayList<Integer> ar,int i,Queue<Node>q){
        if(i>=ar.size() ||  ar.get(i)==-1) return null;
        Node temp=new Node(ar.get(i));
        q.add(temp);
        while(q.size()>0){
            Node curr=q.poll();
            i++;
            if(i<ar.size() && ar.get(i)!=-1){
                curr.left=new Node(ar.get(i));
                q.add(curr.left);
            
            }
            i++;
            if(i<ar.size() && ar.get(i)!=-1){
                curr.right=new Node(ar.get(i));
                q.add(curr.right);
                
            }
            
        }
        return temp;

    }

}