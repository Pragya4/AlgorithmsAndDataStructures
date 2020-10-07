import java.util.Queue;
import java.util.LinkedList;
class GP23_DiagonalTreeTraversal{
static class Node{
	Node left;
	Node right;
	int data;
	Node(int data){
		this.data=data;		
		}
}
static void Diagonalprint(Node root){
	if(root==null)
		return;
	Queue<Node> queue=new LinkedList<>();
	queue.add(root);
	queue.add(null);
	while(!queue.isEmpty()){ 
		Node temp=queue.peek();
		queue.remove();
		if(temp!=null){
			while(temp!=null){
			System.out.print(temp.data+" ");
			if(temp.left!=null){
			//	System.out.println(temp.left.data+" added to queue");
				queue.add(temp.left);
				}

			temp=temp.right;
			
			}
			}
		else{	
			if(queue.isEmpty())
				return;
			System.out.println();
			queue.add(null);			
			}
		

}
}
public static void main(String args[]){
Node root=new Node(1);
root.left=new Node(2);
root.right=new Node(3);
root.left.left=new Node(4);
root.left.right=new Node(5);
root.right.left=new Node(6);
root.right.right=new Node(7);
root.left.left.left=new Node(8);
Diagonalprint(root);
}


}
