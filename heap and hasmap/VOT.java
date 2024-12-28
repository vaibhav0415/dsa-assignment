import java.util.*;
class Node{
    int data;
    Node  left;
    Node right;
    Node(int data){
        this.data=data;
    }
}

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> ar=new ArrayList<>();
        while(sc.hasNextInt()){
            ar.add(sc.nextInt());
        }
        ar.remove(0);
          if (ar.size() == 0 || ar.get(0) == -1) {

            return;
        }
        Node root=construct(ar);
        
        Map<Integer,ArrayList<Integer>> map=new TreeMap<>();
        print(root,map,0);

               for(ArrayList<Integer> temp:map.values()){
                   for(int val:temp ){
                       System.out.print(val+" ");
                   }
                   System.out.println();
               }
           
       }

    
    static int i=1;
    public  static Node construct(ArrayList<Integer> ar){
        Queue<Node> q=new LinkedList<>();
        Node root=new Node(ar.get(0));
        q.add(root);
        while(q.size()>0){
            Node curr=q.poll();
            if(i<ar.size() && ar.get(i)!=-1){
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
     static void print(Node root, Map<Integer, ArrayList<Integer>> m, int d) {
        if (root == null) 
            return;
        
        if (!m.containsKey(d)) 
            m.put(d, new ArrayList<>());
        m.get(d).add(root.data);

        print(root.left, m, d - 1);
        print(root.right, m, d + 1);
    }

}