import java.util.Scanner;
class PreorderTraversal{
class Node{
	Node left;
	Node right;
	int data;
	Node(int data){
		this.data=data;				
		}
}
Node root;
PreorderTraversal(){
	root=null;	
	}
Node insert(Node root,int data){
	if(root==null){
		Node new_node=new Node(data);
		new_node.left=null;
		new_node.right=null;
		root=new_node;
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
	System.out.println(root.data);
	Traversal(root.left);
	Traversal(root.right);
}
}
public static void main(String args[]){
	PreorderTraversal test_node=new PreorderTraversal();
	test_node.root=test_node.insert(test_node.root,0);
	Node Root_node=test_node.root;
	test_node.root=test_node.insert(test_node.root,10);
	test_node.root=test_node.insert(test_node.root,20);
	test_node.root=test_node.insert(test_node.root,30);
	test_node.root=test_node.insert(test_node.root,40);
	test_node.Traversal(Root_node);
}
}
