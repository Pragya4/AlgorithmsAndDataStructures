import java.util.*;
class GP22_LowestCommonAncestor{
static class Node{
	Node left;
	Node right;
	int data;
	Node(int data){
		this.data=data;		
		}
}
static Node LCA(Node root,int n1,int n2){
	if(root== null){
		return null;	
		}	
	if(root.data==n1 || root.data==n2){
		return root;	
			}
	Node left=LCA(root.left,n1,n2);
	Node right=LCA(root.right,n1,n2);
	if(left!=null && right!=null){
		return root;		
			}
	else if(left==null && right==null){
		return null;		
		}
	else if(left!=null)
		return left;
	else if(right!=null)
		return right; 
return null;
	}
public static void main(String args[]){
Node root =new Node(3);
root.left=new Node(6);
root.right=new Node(8);
root.left.left=new Node(2);
root.left.right=new Node(11);
root.left.right.left=new Node(9);
root.left.right.right=new Node(5);
root.right.right=new Node(13);
root.right.right.left=new Node(7);
Node res=LCA(root,2,5);
System.out.println(res.data);
}

}
