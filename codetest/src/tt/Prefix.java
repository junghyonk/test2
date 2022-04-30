package tt;

import java.util.Scanner;


public class Prefix {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		String [] arr= {"A","B","C","D","E","F","G","H"};
		Node root = null;
		root=Insert(arr,root,0);
		dfs(root);

	}

	private static void dfs(Node root) {
	
	}

	private static Node Insert(String[] arr, Node root, int i) {
		if(i<arr.length) {
			root=new Node(arr[i]);
			root.lt=Insert(arr,root.lt,i*2+1);
			root.rt=Insert(arr,root.rt,i*2+2);
		}
		
		return root;
		
	}

}
