package thirtyDaysOfCode;

import java.util.Scanner;

public class ReviewBinaryTrees {
	
	public static void printAtGivenLevel(Node node, int level){
		if( node == null) return;
		else if(level == 1) System.out.print(node.data+" ");
		else if(level > 1){
			printAtGivenLevel(node.left, level-1);
			printAtGivenLevel(node.right, level-1);
		}
	}
	
	public static void levelOrder(Node root) {
		for(int d = 0; d <= getHeight(root); d++){
			printAtGivenLevel(root, d);
		}
	}

	public static int getHeight(Node root){
		if(root == null) return 0;
		else return 1 + Math.max(getHeight(root.left), getHeight(root.right));
	}

	public static Node insert(Node root, int data) {
		if (root == null) {
			return new Node(data);
		} else {
			Node cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		Node root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		levelOrder(root);
		
		sc.close();
	}
}