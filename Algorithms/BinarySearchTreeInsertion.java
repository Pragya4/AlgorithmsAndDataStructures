import java.util.*;
class BinarySearchTreeInsertion{
	class Node{
		int value;
		Node left,right;
		Node(int value){
			this.value=value;			
			}		
					
		}
	Node root;
	public BinarySearchTreeInsertion(){
		root=null;		
		}
	Node insert(Node root,int data){
			if(root==null){
				Node node=new Node(data);
				node.left=null;
				node.right=null;
				root=node;	
				System.out.println("inserted: "+data);			
				}
			else if(root.value>=data){
				System.out.print(" left ");
				root.left=insert(root.left,data);				
				}
			else if(root.value<data){
				System.out.print(" right ");
				root.right=insert(root.right,data);				
				}	
		return root;
			}
	void display(Node ptr){
		if(ptr!=null){
			display(ptr.left);
			System.out.println(ptr.value);
			display(ptr.right);		
			}		
				
			}
Node ptr;
public static void main(String args[]){
	BinarySearchTreeInsertion tree=new BinarySearchTreeInsertion();
	tree.ptr=tree.insert(tree.root,50);
	tree.ptr=tree.insert(tree.ptr,20);
	tree.ptr=tree.insert(tree.ptr,60);
	tree.ptr=tree.insert(tree.ptr,10);
	tree.ptr=tree.insert(tree.ptr,15);
	tree.ptr=tree.insert(tree.ptr,25);
	System.out.println("The inorder traversal of binary search tree is sorted,Inorder Traversal of Binary Search Tree is:");
	tree.display(tree.ptr);
	//USER INPUT
	int nodevalue;
	Scanner s=new Scanner(System.in);
	do{
		nodevalue=s.nextInt();
		tree.ptr=tree.insert(tree.ptr,nodevalue);		
	}while(nodevalue!=-1);
	


}



}
