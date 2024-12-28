import java.util.Scanner;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
    }
}
public class Main{
    static TreeNode root;
    private static TreeNode insert(TreeNode node, int val) {
        if (node == null) {
            return new TreeNode(val);
        }
        if (val < node.val) {
            node.left = insert(node.left, val);
        } else {
            node.right = insert(node.right, val);
        }
        return node;
    }

    public static TreeNode findLCA(TreeNode node, int p, int q) {
        if (node == null) {
            return null;
        }
        if (node.val > p && node.val > q) {
            return findLCA(node.left, p, q);
        } else if (node.val < p && node.val < q) {
            return findLCA(node.right, p, q);
        } else {
            return node;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            root =insert(root, value);
        }
        int p = sc.nextInt();
        int q = sc.nextInt();
        TreeNode lca = findLCA(root, p, q);
        System.out.println(lca.val);
    }
}