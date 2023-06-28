import java.util.*;
class GP37_LowestCommonAncestor2{
static class Node{
	Node left;
	Node right;
	int data;
	Node(int data){
		this.data=data;		
		}
}
static Node GetLCA(Node root,int n1,int n2){

	if(root==null)
		return null;
	System.out.println("root currently "+root.data);
	 if(root.data==n1||root.data==n2){
		System.out.println("matched");
		return root;			
		}
	
	Node leftLCA=GetLCA(root.left,n1,n2);
	Node rightLCA=GetLCA(root.right,n1,n2);		
	if(leftLCA!=null && rightLCA!=null){
		System.out.println("printing root "+root.data);
		return root;			
		}
	else if(rightLCA==null && leftLCA!=null){	
		System.out.println("right null left not null "+leftLCA.data);
		return leftLCA;
		}
	else if(leftLCA==null && rightLCA!=null){
		System.out.println("right null left not null "+rightLCA.data);
		return rightLCA;	
		}
return null;
}
public static void main(String args[]){
Node tree=new Node(3);
Node root=tree;
tree.left=new Node(8);
tree.right=new Node(9);
tree.left.left=new Node(7);
tree.left.right=new Node(6);
tree.left.right.right=new Node(2);
tree.right.left=new Node(1);
tree.right.right=new Node(4);
System.out.println("result "+GetLCA(root,9,4).data);
}
}
