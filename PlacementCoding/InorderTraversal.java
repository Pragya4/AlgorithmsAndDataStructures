import java.util.Scanner;
class InorderTraversal{
class Node{
	Node left;
	Node right;
	int data;
	Node(int data){
		this.data=data;		
		}
}
Node root;
InorderTraversal(){
root=null;
}
Node insert(Node root,int data){
	if(root==null){
		Node new_node=new Node(data);
		new_node.left=null;
		new_node.right=null;
		root=new_node;
		System.out.println("inserted"+data);		
		}
	else if(root.left==null){
		root.left=insert(root.left,data);		
		}
	else if(root.right==null){
		root.right=insert(root.right,data);
		root=root.left;		
		}
return root;
}
void Traversal(Node root){
	if(root!=null){
	System.out.println("TRAV");
	Traversal(root.left);
	System.out.println(root.data);
	Traversal(root.right);		
	}
	}
public static void main(String args[]){
	InorderTraversal tree=new InorderTraversal();
	tree.root=tree.insert(tree.root,10);
	System.out.println("done");
	Node RootNode=tree.root;
	System.out.println("after ass"+RootNode.data);
	tree.root=tree.insert(tree.root,20);
	tree.root=tree.insert(tree.root,30);
	tree.root=tree.insert(tree.root,40);
	tree.root=tree.insert(tree.root,50);
	System.out.println("rootnode data"+RootNode.data);
	tree.Traversal(RootNode);
}
}
