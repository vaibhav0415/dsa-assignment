import java.util.*;
class Node {
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val=val;
    }
}
class Pair{
    int hd;
    Node node;
    Pair(int hd,Node node){
        this.hd=hd;
        this.node=node;
    }
}
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> ar=new ArrayList<>();
        while(sc.hasNextInt()){
            int a=sc.nextInt();
            ar.add(a);
        }
        Node root=construct(ar);
        Queue<Pair> q=new ArrayDeque<>();
        Map<Integer,Integer> map=new TreeMap<>();
        q.add(new Pair(0,root));
        while(q.size()>0){
            Pair curr=q.poll();
            if(!map.containsKey(curr.hd)){
                map.put(curr.hd,curr.node.val);
            }
            if(curr.node.left!=null){
                q.add(new Pair(curr.hd-1,curr.node.left));
            }
            if(curr.node.right!=null){
                q.add(new Pair(curr.hd+1,curr.node.right));
            }
        }
        for(int num:map.keySet()){
            System.out.print(map.get(num)+" ");
        }
    }
    static int i=1;
    public static Node construct(ArrayList<Integer> ar){
        Queue<Node> q=new LinkedList<>();
        Node root=new Node(ar.get(0));
        q.add(root);
        while(q.size()>0){
            Node curr=q.poll();
            if(i<ar.size() && ar.get(i)!=-1 ){
                curr.left=new Node(ar.get(i));
                q.add(curr.left);
            }
            i++;
            if(i<ar.size() && ar.get(i)!=-1){
                curr.right=new Node(ar.get(i));
                q.add(curr.right);
            }
            i++;
        }
        return root;
    }
}