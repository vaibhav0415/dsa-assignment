import java.util.*;

public class Main {
    private class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    private Node root;
    private int size;

    public Main() {
        this.root = null;
        this.size = 0;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    public void add(int data) {
        this.root = this.add(data, this.root);
    }

    private Node add(int data, Node node) {
        if (node == null) {
            this.size++;
            return new Node(data);
        }

        if (data > node.data) {
            node.right = add(data, node.right);
        } else if (data < node.data) {
            node.left = add(data, node.left);
        }
        return node;
    }

    public void display() {
        this.display(this.root);
    }

    private void display(Node node) {
        if (node == null) {
            return;
        }

        if (node.left != null) {
            System.out.print(node.left.data + " => ");
        } else {
            System.out.print("END => ");
        }

        System.out.print(node.data);

        if (node.right != null) {
            System.out.print(" <= " + node.right.data);
        } else {
            System.out.print(" <= END");
        }

        System.out.println();

        display(node.left);
        display(node.right);
    }

    
    public void duplicate() {
        this.duplicate(this.root);
    }

    private void duplicate(Node node) {
        if (node == null) {
            return;
        }

       
        Node d= new Node(node.data);

     
        d.left = node.left;
        node.left = d;

       
        duplicate(d.left); 
        duplicate(node.right); 
    }

    public static void main(String[] args) {
        Main bst = new Main();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            bst.add(s.nextInt());
        }
        bst.duplicate();
        bst.display();
    }
}
