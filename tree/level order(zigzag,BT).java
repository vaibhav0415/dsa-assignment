import java.util.*;

public class Main {

    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        Main m = new Main();
        BinaryTree bt = m.new BinaryTree();

        bt.levelOrderZZ();
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

            // left
            boolean hlc = scn.nextBoolean();

            if (hlc) {
                child.left = this.takeInput(child, true);
            }

            // right
            boolean hrc = scn.nextBoolean();

            if (hrc) {
                child.right = this.takeInput(child, false);
            }

            // return
            return child;
        }

        public void levelOrderZZ() {
            if (root == null) return;

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            boolean ltoR = true;

            while (!q.isEmpty()) {
                int l = q.size();
                ArrayList<Integer> ans = new ArrayList<>();

                for (int i = 0; i < l; i++) {
                    Node curr = q.poll();
                    if (ltoR) {
                        ans.add(curr.data);
                    } else {
                        ans.add(0, curr.data);
                    }

                    if (curr.left != null) q.add(curr.left);
                    if (curr.right != null) q.add(curr.right);
                }

                for (int val : ans) {
                    System.out.print(val + " ");
                }
            

                ltoR=!ltoR;
            }
        }
    }
}
