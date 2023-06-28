import java.util.*;
class Node{
int data;
Node left,right;
Node(int data){
this.data=data;
left=null;
right=null;

}
}
class LevelOrderTraversal{
Node root;
Queue<Node> queue=new LinkedList<Node>();
	int traverse(Node root){
		System.out.println("here");
		if(root==null)
			return 0;
		else{	queue.add(root);
			while(!queue.isEmpty()){
				
				Node temp=queue.poll();
				System.out.println(temp.data+" ");
				if(temp.left!=null)
					queue.add(temp.left);
					
				if(temp.right!=null)
					queue.add(temp.right);
					}
			}
	return 0;			
		}
public static void main(String args[]){
	LevelOrderTraversal obj=new LevelOrderTraversal();	
	System.out.println("hello,world");
	Node root=new Node(1);
	root.left=new Node(2);
	root.right=new Node(3);
	(root.left).left=new Node(4);
	(root.left).right=new Node(5);
	(root.right).left=new Node(6);
	(root.right).right=new Node(7);
	obj.traverse(root);
	


}


}
