import java.util.*;
public class Main {

    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        Main b1 = new Main();  
        BinaryTree bt = b1.new BinaryTree(); 
        int k = scn.nextInt();
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        bt.helper(bt.root, ans, l, k);  
        for (List<Integer> res : ans) {
            for (int val : res) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    private class BinaryTree {
        private class Node {
            int data;
            Node left;
            Node right;
        }

        private Node root;
        private int size;

        public BinaryTree() {
            this.root = this.takeInput(null, false);
        }

        public Node takeInput(Node parent, boolean ilc) {

            int cdata = scn.nextInt();
            Node child = new Node();
            child.data = cdata;
            this.size++;

        
            boolean hlc = scn.nextBoolean();

            if (hlc) {
                child.left = this.takeInput(child, true);
            }

           
            boolean hrc = scn.nextBoolean();

            if (hrc) {
                child.right = this.takeInput(child, false);
            }

           
            return child;
        }

        public void helper(Node node, List<List<Integer>> ans, List<Integer> ls, int sum) {
            if (node == null) return;

            if (node.left == null && node.right == null) {
                if (sum == node.data) {
                    ls.add(node.data);
                    ans.add(new ArrayList<>(ls));
                    ls.remove(ls.size() - 1);  
                }
                return;
            }

            ls.add(node.data);
            helper(node.left, ans, ls, sum - node.data);
            helper(node.right, ans, ls, sum - node.data);
            ls.remove(ls.size() - 1);
        }
    }
}
