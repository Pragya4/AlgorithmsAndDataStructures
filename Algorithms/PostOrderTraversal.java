import java.util.*;
class PostOrderTraversal{
class Node{
	Node left,right;
	int data;
	Node(int data){
		this.data=data;			
		}		
	}
Node root;
PostOrderTraversal(){
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
		RecursiveTraversal(root.left);	
		RecursiveTraversal(root.right);
		System.out.println(root.data);	
	}
}
//InOrderRecursiveTree nodetype;
void IterativeTraversal(Node root){
	
	Stack<Node> stack=new Stack<Node>();
	ArrayList<Integer> arr=new ArrayList<Integer>();
	Node tmp=root;
	boolean done=false;
	
	while(!done){
		
		if(tmp!=null){
			stack.push(tmp);
			tmp=tmp.left;		
				
		}
		else{
			if(stack.isEmpty())
				done=true;
			else{
				tmp=stack.pop();
				arr.add(tmp.data);
				tmp=tmp.right;				
				}			
					
			}
	}
	for(int item:arr){
		System.out.println(item);		
		}
}
public static void main(String args[]){
PostOrderTraversal tree=new PostOrderTraversal();

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
