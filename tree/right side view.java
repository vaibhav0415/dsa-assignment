import java.util.LinkedList;  
import java.util.Queue;  
import java.util.Scanner;  

class TreeNode {  
    int val;  
    TreeNode left;  
    TreeNode right;  
    TreeNode(int x) { val = x; }  
}  

public class Main{  
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);  
        String input = sc.nextLine();  
        String[] values = input.split(" ");  
        TreeNode root = buildTree(values);  
        print(root);  
    }  

    private static TreeNode buildTree(String[] values) {  
        if (values.length == 0 || values[0].equals("-1")) return null;  
        TreeNode root = new TreeNode(Integer.parseInt(values[0]));  
        Queue<TreeNode> queue = new LinkedList<>();  
        queue.add(root);  

        int i = 1;  
        while (!queue.isEmpty() && i < values.length) {  
            TreeNode current = queue.poll();  
            if (!values[i].equals("-1")) {  
                current.left = new TreeNode(Integer.parseInt(values[i]));  
                queue.add(current.left);  
            }  
            i++;  
            if (i >= values.length) break;  
            if (!values[i].equals("-1")) {  
                current.right = new TreeNode(Integer.parseInt(values[i]));  
                queue.add(current.right);  
            }  
            i++;  
        }  
        return root;  
    }  

    private static void print(TreeNode root) {  
        if (root == null) return;  

        Queue<TreeNode> q = new LinkedList<>();  
        q.add(root);  
        StringBuilder rightView = new StringBuilder();  

        while (q.size()>0) {  
            int l = q.size();  
            for (int i = 0; i < l; i++) {  
                TreeNode curr = q.poll();  
                if (i == l - 1) { 
                    rightView.append(curr.val).append(" ");  
                }  
                if (curr.left != null) q.add(curr.left);  
                if (curr.right != null) q.add(curr.right);  
            }  
        }  
        System.out.println(rightView.toString());  
    }  
}