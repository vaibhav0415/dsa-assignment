import java.util.*;
public class Main {
	private class Node {
		int data;
		Node left;
		Node right;

		public Node(int data, Node left, Node right) {
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
		this.add(data, this.root);
	}

	private void add(int data, Node node) {
		if (this.isEmpty()) {
			Node n = new Node(data, null, null);
			this.size++;
			this.root = n;
			return;
		} else {
			if (data > node.data && node.right == null) {
				Node n = new Node(data, null, null);
				this.size++;
				node.right = n;
			} else if (data < node.data && node.left == null) {
				Node n = new Node(data, null, null);
				this.size++;
				node.left = n;
			} else if (data > node.data) {
				add(data, node.right);
			} else if (data < node.data) {
				add(data, node.left);
			}
		}
	}

      
	
	 public void printKFar(int tar, int k) {
	        this.printKFar(this.root, tar, k);
	    }

	    private int printKFar(Node node, int tar, int k) {
            if (node == null)
            return -1;
           if (node.data == tar){
         
            printKDown(node, k);
            return 0;
        }
 
        
        int dl = printKFar(node.left, tar, k);
        if (dl != -1) 
        {
            if (dl + 1 == k) 
            {
                System.out.print(node.data);
                System.out.println("");
            }
             
           
            else
                printKDown(node.right, k - dl - 2);
 
            return 1 + dl;
        }
 
        
        int dr = printKFar(node.right, tar, k);
        if (dr != -1) 
        {
            if (dr + 1 == k) 
            {
                System.out.print(node.data);
                System.out.println("");
            } 
            else 
                printKDown(node.left, k - dr - 2);
            return 1 + dr;
        }
 
       
        return -1;        
        }

	    private void printKDown(Node node, int k) {
        if (node == null || k < 0)
            return;
 
        
        if (k == 0) 
        {
            System.out.print(node.data);
            System.out.println("");
            return;
        }
 
        
            printKDown(node.left, k - 1);
            printKDown(node.right, k - 1);
	      }
	    
	    public static void main (String[] args) {
	        Main bst=new Main();
            Scanner s=new Scanner(System.in);
	        int n=s.nextInt();
	        for(int i=0;i<n;i++){
	           bst.add(s.nextInt()); 
	        }
            int tar=s.nextInt();
            int k=s.nextInt();
	        bst.printKFar(tar,k);
	    }
}
