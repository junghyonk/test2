package codetest;

import java.util.Scanner;


class Nodet{
	Object data;
	Nodet rt,lt;

	Nodet(Object data){
		this.data=data;
		lt=rt=null;
	}
}



public class tt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		String [] arr= {"A","B","C","D","E","F","G","H"};
		Nodet root = null;
		root=Insert(arr,root,0);
		dfs(root);




	}
	public static  Nodet Insert(String [] arr,Nodet root,int i) {
		if(i<arr.length) {
			root=new Nodet(arr[i]);
			root.lt=Insert(arr,root.lt,2*i+1);
			root.rt=Insert(arr,root.rt,2*i+2);
		}
		return root;
		
	}
	public static void dfs(Nodet root) {
		if(root==null) {
			return;

		}
		else {
			System.out.print(root.data+" ");
			dfs(root.lt);
			dfs(root.rt);


		}
	}
}
