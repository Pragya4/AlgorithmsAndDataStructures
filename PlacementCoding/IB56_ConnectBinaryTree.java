import java.util.*;
class IB56_ConnectBinaryTree{
static class Node{
Node right;
Node left;
Node next;
int data;
Node(int data){
this.data=data;
}
}
static void connect(Node root){
	Queue<Node> queue=new LinkedList<Node>();
	if(root==null)	
		return;
	queue.add(root);
	while(!queue.isEmpty()){
		int count=queue.size();
		queue.add(null);
		while(count>0){
			Node temp=queue.poll();	
			temp.next=queue.peek();
			if(temp.left!=null){
				System.out.print(temp.left.data+" ");
				queue.add(temp.left);					
				}				
			if(temp.right!=null){
				System.out.print(temp.right.data+" ");
				queue.add(temp.right);
			}
			
		count--;	
		}
		queue.poll();
		System.out.println();
	}
}
public static void main(String args[]){
Node tree=new Node(10);
Node root=tree;
tree.left=new Node(20);
tree.right=new Node(30);
tree.left.left=new Node(40);
tree.left.right=new Node(50);
tree.right.left=new Node(60);
tree.right.right=new Node(70);
tree.left.left.left=new Node(80);
tree.right.right.right=new Node(100);
connect(root);
System.out.println("Following are populated nextRight pointers in \n" +
      "the tree (-1 is printed if there is no nextRight)");
        System.out.println("nextRight of "+ root.data +" is "+
        ((root.next != null) ? root.next.data : -1));
        System.out.println("nextRight of "+ root.left.data+" is "+
        ((root.left.next != null) ? root.left.next.data : -1));
        System.out.println("nextRight of "+ root.right.data+" is "+
        ((root.right.next != null) ? root.right.next.data : -1));
        System.out.println("nextRight of "+  root.left.left.data+" is "+
        ((root.left.left.next != null) ? root.left.left.next.data : -1));
        System.out.println("nextRight of "+  root.right.right.data+" is "+
        ((root.right.right.next != null) ? root.right.right.next.data : -1));
}
}
