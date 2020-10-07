import java.util.*;
class GP64_SumTree{
static class Node{
	Node left;
	Node right;
	int data;
	Node(int data){
		this.data=data;		
		}	
	}
static int sumtree(Node root){
		if(root==null)	
			return 0;
		else{
			root.data+=sumtree(root.left)+sumtree(root.right);	
			}
	return root.data;		
	}
static void print(Node root){
	if(root==null)
		return;
	System.out.println(root.data);
	print(root.left);
	print(root.right);
}
public static void main(String args[]){
	Node tree=new Node(5);
	Node root=tree;
	tree.left=new Node(-10);
	tree.right=new Node(3);
	tree.left.left=new Node(9);
	tree.left.right=new Node(8);
	tree.right.left=new Node(-4);
	tree.right.right=new Node(7);
	sumtree(root);
	print(root);
	}
}
