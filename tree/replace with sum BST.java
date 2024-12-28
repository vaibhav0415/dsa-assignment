import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int d) {
        data = d;
        left = right = null;
    }
}

class Main {

    static Node root;

   
    Node insert(Node node, int data) {
        if (node == null) {
            return new Node(data);
        }

        if (data < node.data) {
            node.left = insert(node.left, data);
        } else if (data > node.data) {
            node.right = insert(node.right, data);
        }

        return node;
    }

    
    int sum = 0;

    void reverseInorder(Node root) {
        if (root == null) return;
        reverseInorder(root.right);
        
        sum += root.data;
        root.data=sum-root.data;
        reverseInorder(root.left);
    }

   
    void display(Node node) {
        if (node == null) {
            return;
        }

        String str = "";

        if (node.left != null) {
            str += node.left.data;
        } else {
            str += "END";
        }

        str += " => " + node.data + " <= ";

        if (node.right != null) {
            str += node.right.data;
        } else {
            str += "END";
        }

        System.out.println(str);

        this.display(node.left);
        this.display(node.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main tree = new Main();

       
        int len = sc.nextInt();
        
        
        for (int i = 0; i < len; i++) {
            int value = sc.nextInt();
            root = tree.insert(root, value);
        }

       
        tree.reverseInorder(root);

        
        tree.display(root);
    }
}
