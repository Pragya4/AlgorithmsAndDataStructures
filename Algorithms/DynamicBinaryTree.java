class Node{
	int data;
	Node left,right;
	Node(int data){
		this.data=data;	
	}
}
class DynamicBinaryTree{
void insert(int value){
	Node temp=new Node(value);
	if(root==null){
		root=temp;
	}
	else if(root.left==null){
		root.left=temp;
	}
	else{
		root.right=temp;
		root=root.left;
		}
}
public static void main(String[] args){
	
	}
}
