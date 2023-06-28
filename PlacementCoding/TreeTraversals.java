import java.util.*;
class TreeTraversals{
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
Node head;
TreeTraversals(){
	head=null;
}
static void inorder(Node root){
if(root==null)
	return ;
else{
	if(root!=null){
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);			
		}

	}
}
static void preorder(Node root){
if(root==null)
	return ;
else{
	if(root!=null){
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);	
		}

	}

}
static void postorder(Node root){
if(root==null)
	return;
else{
	if(root!=null){
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data+" ");			
		}
}
}
static void LevelOrder(Node root){
if(root==null)
	return;
Queue<Node> queue=new LinkedList<Node>();
ArrayList<Integer> result=new ArrayList<Integer>();
queue.add(root);
while(!queue.isEmpty()){
	Node temp=queue.poll();
	result.add(temp.data);
	if(temp.left!=null){
		queue.add(temp.left);		
		}
	if(temp.right!=null){
		queue.add(temp.right);			
		}
	
}
for(int i=0;i<result.size();i++){
	System.out.print(result.get(i)+" ");
}
}
/*static Node insert(Node ptr,int data){
	//Node ptr=root;
	System.out.println("root data "+data);
	if(ptr==null){
		Node newnode=new Node(data);
		newnode.left=null;
		newnode.right=null;
		ptr=newnode;	
		System.out.println("inserted "+ptr.data);		
	}
	else if(ptr.left==null){
		ptr.left=insert(ptr.left,data);
		System.out.println("left");
	}	
	else if(ptr.right==null){
		ptr.right=insert(ptr.right,data);
		//ptr=ptr.left;
		
		System.out.println("right");		
	}
//System.out.println("root data "+root.data);
return ptr;
}*/
public static void main(String args[]){
	Node root=new Node(10);
	root.left=new Node(20);
	root.right=new Node(30);
	root.left.left=new Node(40);
	root.left.right=new Node(50);	
	root.right.left=new Node(60);
	root.right.right=new Node(70);
	System.out.println("Inorder");
	inorder(root);
	System.out.println();
	System.out.println("Preorder");
	preorder(root);
	System.out.println();
	System.out.println("Postorder");
	postorder(root);
	System.out.println();
	System.out.println("LevelOrder");
	LevelOrder(root);

}
}
