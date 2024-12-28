import java.util.*;
public class Main {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Main m = new Main();
		int[] pre = takeInput();
		int[] in = takeInput();
		BinaryTree bt = m.new BinaryTree(pre, in);
		bt.display();
	}

	public static int[] takeInput() {
		int n = scn.nextInt();

		int[] rv = new int[n];
		for (int i = 0; i < rv.length; i++) {
			rv[i] = scn.nextInt();
		}

		return rv;
	}

	private class BinaryTree {
		private class Node {
			int data;
			Node left;
			Node right;
			public Node(int data){
                 this.data=data;
			}
		}

		private Node root;
		private int size;

		public BinaryTree(int[] pre, int[] in) {
			Map<Integer,Integer> map=new HashMap<>();
			for(int i=0;i<in.length;i++){
				map.put(in[i],i);
			}
			this.root = this.construct(pre, 0, pre.length - 1, in, 0, in.length - 1,map);
		}
       
		private Node construct(int[] pre, int plo, int phi, int[] in, int ilo, int ihi,Map<Integer,Integer> map) {

			// write your code here
			if(ilo>ihi || plo>phi) return null;
			Node root=new Node(pre[plo]);
			int i=map.get(root.data);
			int left=i-ilo;
			root.left=construct(pre,plo+1,plo+left,in,ilo,i-1,map);
			root.right=construct(pre,plo+left+1,phi,in,i+1,ihi,map);
			return root;
		}

		public void display() {
			this.display(this.root);
		}

		private void display(Node node) {
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

	}

}
