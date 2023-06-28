import java.util.*;
class GP37_LowestCommonAncestor1{
static class Node{
	Node left;
	Node right;
	int data;
	Node(int data){
		this.data=data;
		left=null;
		right=null;		
	}
}
Node tree;
static ArrayList<Integer> pathn1=new ArrayList<Integer>();
static ArrayList<Integer> pathn2=new ArrayList<Integer>();

static int LCA(Node root,int n1,int n2){
	int res=0;
	if(root==null)	
		return 0;
	if(!findpath(root,n1,pathn1) || !findpath(root,n2,pathn2)){
		return -1;
		}
	int len=pathn1.size();
	if(pathn2.size()<pathn1.size())
		len=pathn2.size();
	int i=0;
	for(i=0;i<len;i++){
		if(!pathn1.get(i).equals(pathn2.get(i))){
			//res=pathn1.get(i-1);
			break;
			}			
		}
return pathn1.get(i-1);
}
static boolean findpath(Node root,int n,ArrayList<Integer> path){	
	System.out.println(root.data);
	if(root==null)
		return false; 
path.add(root.data);	
	if(root.data==n){
		System.out.println("found");
		return true;		
		}
	if(root.left!=null && findpath(root.left,n,path))
		return true;
	if(root.right!=null && findpath(root.right,n,path))
		return true;
	path.remove(path.size()-1);
	for(int i=0;i<path.size();i++){
		System.out.print(path.get(i)+" ");			
		}
 return false;	
}
public static void main(String[] args){
	Node tree=new Node(3);
	Node root=tree;
	tree.left=new Node(6);
	tree.right=new Node(8);
	tree.left.left=new Node(1);
	tree.left.right=new Node(9);
	tree.right.left=new Node(4);
	tree.right.right=new Node(7);
	tree.right.left.right=new Node(2);
	System.out.println(LCA(root,2,4));
}
}
