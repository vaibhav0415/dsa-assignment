import java.util.*;
class Node {
 
    int data;
    Node left, right;
 
    Node(int d)
    {
        data = d;
        left = right = null;
    }
}
 
class Main{
 
    static Node root;
 
   
    Node sortedArrayToBST(int arr[], int start, int end)
    {
 
       
        if (start > end) {
            return null;
        }
 
        
        int mid = (start + end) / 2;
        Node node = new Node(arr[mid]);
 
       
        node.left = sortedArrayToBST(arr, start, mid - 1);
 
        node.right = sortedArrayToBST(arr, mid + 1, end);
 
        return node;
    }
    void preorder(Node node)
    {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }
    int sum = 0;
    void reverseInorder(Node root) {
        if (root == null) return;
        reverseInorder(root.right);
        root.data += sum;
        sum = root.data;
        reverseInorder(root.left);
    }
   
    public static void main(String[] args)
    {   Scanner sc=new Scanner(System.in);
        Main tree = new Main();
        int len=sc.nextInt();
        int arr[]=new int[len];
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        root = tree.sortedArrayToBST(arr, 0, len- 1);
        tree.reverseInorder(root);
        tree.preorder(root);
    }
}