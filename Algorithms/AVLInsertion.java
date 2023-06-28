import java.util.*;
class AVLInsertion{
class Node{
	Node right,left;
	int height;
	int data;
	Node(int data){
		this.data=data;
	}	
}
Node leftrotation(Node x){
	System.out.println("leftrotation");
	Node y=x.right;
	x.right=y.left;
	y.left=x;
	x.height=max(height(x.right),height(x.left))+1;
	y.height=max(height(y.right),height(y.left))+1;

return y;
}
Node rightrotation(Node x){
	System.out.println("rightrotation");
	Node y=x.left;
	x.left=y.right;
	y.right=x;
	x.height=max(height(x.right),height(x.left))+1;
	y.height=max(height(y.right),height(y.left))+1;
	
	return y;
}
int height(Node node){
	if(node==null)
		return -1;
	return node.height;		
		
}
int balance(Node node){
	if(node==null){
		return 0;	
	}
	int bv=height(node.left)-height(node.right);	
	return bv;
}
int max(int a,int b){
	if(a>b)
		return a;
	else
		return b;		
}
Node insert(Node node,int key){
	if(node==null){
		System.out.println("inserted"+key);
		return(new Node(key));	
			
		}
	else if(key<node.data){
		System.out.println("left");
		node.left=insert(node.left,key);		
		}
	else if(key>node.data){
		System.out.println("right");
		node.right=insert(node.right,key);		
		}
	else{
		return node;		
		}
	node.height=1+max(height(node.left),height(node.right));
	int balance=balance(node);
	if(balance>1 && key<node.left.data){
		return rightrotation(node.left);	
		}
	else if(balance>1 && key>node.left.data){
		node.left=leftrotation(node.left);
		return rightrotation(node);		
		}
	else if(balance<-1 && key>node.right.data){
		return leftrotation(node);		
		}
	else if(balance<-1 && key<node.right.data){
		node.right=rightrotation(node.right);
		return leftrotation(node);	
		}
return node;
}
void display(Node n){
if(n!=null){
	System.out.println(n.data);	
	display(n.left);
	display(n.right);
}		
}
Node root;
AVLInsertion(){
	root=null;	
}
public static void main(String args[]){
	AVLInsertion tree=new AVLInsertion();
	
	tree.root=tree.insert(tree.root,10);
	
	tree.root=tree.insert(tree.root,20);
	tree.root=tree.insert(tree.root,30);
	tree.root=tree.insert(tree.root,40);
	tree.root=tree.insert(tree.root,50);
	tree.display(tree.root);

}

}
