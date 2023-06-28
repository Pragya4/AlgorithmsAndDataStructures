import java.util.*;
class GP19_LevelOrderLineByLine{
static class Node{
	Node left;
	Node right;
	int data;
	Node(int data){
		this.data=data;		
		}
}
Node root;
GP19_LevelOrderLineByLine(){
	root=null;
}
static void LevelOrder(Node root){
	Queue<Node> queue1=new LinkedList<Node>();
	Queue<Node> queue2=new LinkedList<Node>();
	if(root==null){
		return;
		}	
	queue1.add(root);
	while(!queue1.isEmpty() || !queue2.isEmpty()){
		while(!queue1.isEmpty()){
			Node temp=queue1.poll();
			System.out.println(temp.data);
			if(temp.left!=null)
				queue2.add(temp.left);
			if(temp.right!=null)
				queue2.add(temp.right);		
			}
		System.out.println();
		while(!queue2.isEmpty()){
			Node temp=queue2.poll();
			System.out.println(temp.data);
			if(temp.left!=null)
				queue1.add(temp.left);
			if(temp.right!=null)
				queue1.add(temp.right);		
							
				}
		System.out.println();			
		}
}
public static void main(String args[]){
	
	Node root=new Node(10);
	root.left=new Node(20);
	root.right=new Node(30);
	root.left.left=new Node(40);
	root.left.right=new Node(50);
	root.right.left=new Node(60);
	LevelOrder(root);

}
}
