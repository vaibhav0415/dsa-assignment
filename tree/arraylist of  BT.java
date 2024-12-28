import java.util.*;
 class Main{

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Main m = new Main();
		BinaryTree bt1 = m.new BinaryTree();
		System.out.println(bt1.levelArrayList());
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

		public ArrayList<ArrayList<Integer>> levelArrayList() {
			ArrayList<ArrayList<Integer>> res = new ArrayList<>();  
			if (root == null) return res;  

			Queue<Node> q= new LinkedList<>();  
			q.add(root);  

			while (!q.isEmpty()) {  
				int l = q.size();  
				ArrayList<Integer> ans = new ArrayList<>();  

				for (int i = 0; i < l; i++) {  
					Node temp = q.poll();  
					ans.add(temp.data);  

					if (temp.left != null) 	q.add(temp.left);  
					if (temp.right != null) q.add(temp.right); 
					 
				}
				res.add(ans);
				  
			}  
			return res;
		}
	}

}
