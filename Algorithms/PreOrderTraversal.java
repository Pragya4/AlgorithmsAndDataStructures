import java.util.*;
class PreOrderTraversal{
class Node{
	Node left,right;
	int data;
	Node(int data){
		this.data=data;			
		}		
	}
Node root;
PreOrderTraversal(){
	root=null;
}
Node insert(int data,Node root){
	if(root==null){
		Node nroot=new Node(data);
		nroot.right=null;
		nroot.left=null;
		root=nroot;	
		System.out.println("inserted"+data);	
		}
	else if(root.left==null){
			root.left=insert(data,root.left);
			System.out.println("left");
									
			}
	else if(root.right==null){
			root.right=insert(data,root.right);
			System.out.println("right");
			root=root.left;
			
						
			}	
return root;	
}
void RecursiveTraversal(Node root){
	if(root!=null){
		System.out.println(root.data);
		RecursiveTraversal(root.left);
		RecursiveTraversal(root.right);
	}
}
//PreOrderRecursiveTree nodetype;
void IterativeTraversal(Node root){
	
	Stack<Node> stack=new Stack<Node>();
	ArrayList<Integer> arr=new ArrayList<Integer>();
	stack.push(root);
	while(!stack.isEmpty()){
		Node tmp=stack.pop();
		arr.add(tmp.data);
		if(tmp.right!=null){
			stack.push(tmp.right);			
			}
		if(tmp.left!=null){
			stack.push(tmp.left);
			}
	}
	for(int item:arr){
		System.out.println(item);		
		}
}
public static void main(String args[]){
PreOrderTraversal tree=new PreOrderTraversal();

tree.root=tree.insert(10,tree.root);
Node orgroot=tree.root;
tree.root=tree.insert(20,tree.root);
tree.root=tree.insert(30,tree.root);
tree.root=tree.insert(40,tree.root);
tree.root=tree.insert(50,tree.root);
System.out.println("tree traversal");
tree.RecursiveTraversal(orgroot);
System.out.println("iterative Traversal");
tree.IterativeTraversal(orgroot);
}
	


}
