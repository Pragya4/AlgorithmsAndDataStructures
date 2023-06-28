import java.util.*;
class AVLTreeExtra{
class Node{
	Node parent,right,left;
	int height;
	int data;
	int num;
	Node(int data){
		this.data=data;
	}	
}
Node leftrotation(Node x){
	System.out.println("leftrotation"+x.data);
	Node y=x.right;
	x.right=y.left;
	y.left=x;
	y.parent=x.parent;
	x.parent=y;	
	(x.right).parent=x;		//parent of t2 is now x
	System.out.println("Parent changed of"+x.data+" : "+(x.parent).data);
	x.height=max(height(x.right),height(x.left))+1;
	y.height=max(height(y.right),height(y.left))+1;

return y;
}
Node rightrotation(Node x){
	System.out.println("rightrotation"+x.data);
	Node y=x.left;
	
	x.left=y.right;
	y.right=x;
	
	(x.left).parent=x;		//t2 ka parent 
	y.parent=x.parent;
	x.parent=y;
	System.out.println("Parent changed"+x.data+":"+(x.parent).data);
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
		//node.right.parent=node;
		System.out.println("parent is"+node.data);
		node.left=insert(node.left,key);		
		}
	else if(key>node.data){
		System.out.println("right");
		//(node.right).parent=node;
		System.out.println("parent is"+node.data);
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
AVLTreeExtra(){
	root=null;	
	//root.parent=null;
}
Node leftrightn(Node n){
	Node cur=n;
	while(cur.right!=null){
		cur=cur.right;		
		}		
	return cur;
	
}
Node deletion(Node node,int key){
	if(node==null){
		return node;		
		}
	else if(key<node.data){
		node.left=deletion(node.left,key);		
		}
	else if(key>node.data){
		node.right=deletion(node.right,key);		
		}
	else{
		
		if(node.left==null || node.right==null){
			Node temp=null;
			
	//One child
			if(temp==node.left)	//only right child is there
				temp=node.right;
			else if(temp==node.right)	//only left child is there
				temp=node.left;
	//zero child		
			if(temp==null){
				temp=node; 
				node=null;
				}
			else{
				node=temp;				
				}		
			}			
		else{
			Node ntemp=leftrightn(node.left);
			node.data=ntemp.data;
			node.left=deletion(node.left,ntemp.data);			
			}

		}
	if(node==null){
		return node;		
		}
	node.height=max(height(node.left),height(node.right))+1;
	int balance=balance(node);
	if(balance>1 && balance(node.left)>=0){
		return rightrotation(node);		
		}
	if(balance>1 && balance(node.left)<0){
		node.left=leftrotation(node.left);
		return rightrotation(node);			
		}
	if(balance<-1 && balance(node.right)<=0){
		return leftrotation(node);		
		}
	if(balance<-1 && balance(node.right)>0){
		node.right=rightrotation(node.right);
		return leftrotation(node);				
		}


return node;
}
public static void main(String args[]){
	AVLTreeExtra tree=new AVLTreeExtra();
	
	tree.root=tree.insert(tree.root,10);
	
	tree.root=tree.insert(tree.root,20);
	tree.root=tree.insert(tree.root,30);
	tree.root=tree.insert(tree.root,40);
	tree.root=tree.insert(tree.root,50);
	tree.root=tree.insert(tree.root,60);
	tree.display(tree.root);
	tree.deletion(tree.root,20);
	System.out.println("FINAL OUTPUT");
	tree.display(tree.root);

}

}
