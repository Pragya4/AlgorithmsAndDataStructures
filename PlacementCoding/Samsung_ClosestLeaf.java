import java.util.*;
class Samsung_ClosestLeaf{
static class Node{
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data=data;			
	}
}
static int mindist=Integer.MAX_VALUE;
static void leaflevel(Node root,int l){
	if(root==null)
		return;
	if(root.left==null && root.right==null){
		if(mindist>l)
			mindist=l;
				}
	leaflevel(root.left,l+1);
	leaflevel(root.right,l+1);
	}
static int closestLeafViaParent(Node root,Node x){
	if(root==null)
		return -1;
	if(root==x)
		return 0;
	int l=closestLeafViaParent(root.left,x);
	if(l!=-1){
		//if our element is in the left subtree so go down left for same subtree leaves and right for over the parent leaf
//		int samesubtree=
//		 leaflevel(root.left,0);
//		int parentandright=
		leaflevel(root.right,l+2);			
		//return Math.min(samesubtree,parentandright);
		return mindist;
		}
	int r=closestLeafViaParent(root.right,x);
	if(r!=-1){
//	int samesubtree=
//		leaflevel(root.right,r);
//	int parentandleft=
		leaflevel(root.left,r+2);
//	return Math.min(samesubtree,parentandleft);
	return mindist;
	}
	return -1;
}
public static void main(String args[]){
	Node root = new Node(1);
	Node node=root;
	
        root.left = new Node(12);
	
        root.right = new Node(13);
  	Node find=root.right; //.right.left;
        root.right.left = new Node(14);
        root.right.right = new Node(15);
        root.right.left.left = new Node(21);
        root.right.left.right = new Node(22);
        root.right.right.left = new Node(23);
	
        root.right.right.right = new Node(24);
  
        root.right.left.left.left = new Node(1);
        root.right.left.left.right = new Node(2);
        root.right.left.right.left = new Node(3);
        root.right.left.right.right = new Node(4);
        root.right.right.left.left = new Node(5);
        root.right.right.left.right = new Node(6);
        root.right.right.right.left = new Node(7);
        root.right.right.right.right = new Node(8);
	closestLeafViaParent(node,find);
	leaflevel(find,0);
	System.out.println(mindist); 
}

}
