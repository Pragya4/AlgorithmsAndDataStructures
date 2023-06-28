import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
class Tree_height_LevelOrderin2ways{
class Node{
	Node left;
	Node right;
	int data;
	Node(int data){
		this.data=data;		
		}
}
Node root;
Tree_height_LevelOrderin2ways(){
	root=null;
}
Node insert(Node root,int data){
	if(root==null){
		Node nnode=new Node(data);
		nnode.right=null;
		nnode.left=null;
		root=nnode;
		System.out.println("inserted");
		}
	else if(root.left==null){
		root.left=insert(root.left,data);
		System.out.println("left");
		}
	else if(root.right==null){
		root.right=insert(root.right,data);
		root=root.left;
		System.out.println("right");
		}
return root;

}
int height(Node node){
	if(node==null)
		return 0;
	else{
		int lDepth=height(node.left);
		int rDepth=height(node.right);
		if(lDepth>rDepth)
			return (lDepth+1);
		else
			return (rDepth+1);		
		}
}
void printLevelOrder(Node root){
	int h=height(root);
	for(int i=1;i<=h;i++){
		printGivenLevel(root,i);		
		}
}
void printGivenLevel(Node root,int level){
	if(root==null){
		return;		
		}
	if(level==1){
		System.out.println(root.data);		
		}
	else if(level>1){
		printGivenLevel(root.left,level-1);
		printGivenLevel(root.right,level-1);			
			}
}
void LevelOrderQ(Node root){
	Queue<Node> queue=new LinkedList<Node>();
	queue.add(root);
	while(!queue.isEmpty()){
		Node temp=queue.poll();
		System.out.println(temp.data);
		if(temp.left!=null)
			queue.add(temp.left);
		if(temp.right!=null)
			queue.add(temp.right);		
		}	
	}
public static void main(String args[]){
	Tree_height_LevelOrderin2ways tree=new Tree_height_LevelOrderin2ways();
	tree.root=tree.insert(tree.root,10);
	Node orig=tree.root;
	tree.root=tree.insert(tree.root,20);
	tree.root=tree.insert(tree.root,30);
	tree.root=tree.insert(tree.root,40);
	System.out.println(tree.height(orig));
	tree.printLevelOrder(orig);
	System.out.println("Queue");
	tree.LevelOrderQ(orig);
}

}
