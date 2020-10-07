import java.util.*;
class GP21_TreeBoundary{
static class Node{
	Node left;
	Node right;
	int data;
	Node(int data){
		this.data=data;		
	}
}
    static void printLeftBoundary(Node root){
	if(root!=null){
		
		if(root.left!=null){
			System.out.print(root.data+" ");
			printLeftBoundary(root.left);			
			}
		else if(root.right!=null ){
			System.out.print(root.data+" ");
			printLeftBoundary(root.right);			
			}
			
	
}
}
static void printLeaves(Node root){
	Node top=root;
	ArrayList<Integer> leaves=new ArrayList<Integer>();
	if(root!=null){
		if(top.left==null && top.right==null){
			System.out.print(top.data+" ");
			leaves.add(top.data);			
			}
		else{
			printLeaves(top.left);
			printLeaves(top.right);						
		}		
		}
}
static void printRightBoundary(Node root){
    if(root!=null){
	if(root.right!=null){
			printRightBoundary(root.right);
			System.out.print(root.data+" ");
	}
	else if (root.left != null) 
            {
                printRightBoundary(root.left);
                System.out.print(root.data + " ");
            }

}
}
static void printBoundary(Node node)
	{
		// Your code here
		if(node!=null){
		    System.out.print(node.data+" ");
	        printLeftBoundary(node.left);
	        printLeaves(node);
	        printRightBoundary(node.right);
		}
	}
public static void main(String args[]){
	Node root=new Node(1);
	root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.left.right = new Node(8);
        root.right.right.right = new Node(9);
	printBoundary(root);
}


}
