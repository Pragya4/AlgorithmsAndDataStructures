import java.util.*;
class AVLTreeRank{
class Node{
	Node right,left;
	int height;
	int data;
	int num;
	Node(int data){
		this.data=data;
	}	
}
Node leftrotation(Node x){
	System.out.println("leftrotation");
	Node y=x.right;
	Node t2=y.left;
	x.right=t2;
	y.left=x;
	if(t2!=null)
	x.num=t2.num+1;
	else 
	x.num=1;
	y.num=x.num+(y.right).num+1;
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
		Node newnode=new Node(key);	
		newnode.num=1;
		System.out.println("inserted"+key+" "+newnode.num);
		return(newnode);	
			
		}
	else if(key<node.data){
		System.out.println("left");
		node.num+=1;
		node.left=insert(node.left,key);		
		}
	else if(key>node.data){
		System.out.println("right");
		node.num+=1;
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
	System.out.println(n.data+":"+n.num);	
	display(n.left);
	display(n.right);
}		
}
Node root;
AVLTreeRank(){
	root=null;	
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
System.out.println("deletion successful");
return node;
}
int Rank(Node root,int x){
	int rank=0;
	System.out.println("in Rank");
	while(root!=null){
		System.out.println("in while");
		if(root.data<x){
			System.out.println("going right of"+root.data);
			root=root.right;
			//Rank(root,x);			
			}
		else{
			
				System.out.println("rank updation");
				if(root.right==null)
					rank=rank+1;
				else						
					rank=rank+1+(root.right).num;
		
				root=root.left;
				//Rank(root,x);				
						
		}
}
return rank;
}
int FindRank(Node node,int k){
	int r=-1;	
	while(node !=null){
		if(node.right!=null)
			r=(node.right).num+1;
		else
			r=1;
		System.out.println("rank in findrank"+r);
		if(r==k)
			return node.data;
		else if(r<k){
			k=k-(r);
			node=node.left;
			if(node.right!=null && (node.right).num>r)
			{while(node.right!=null)
				node=node.right;	
			}}
		else
			node=node.right;
}
return node.data;
}
public static void main(String args[]){
	AVLTreeRank tree=new AVLTreeRank();
	Scanner s=new Scanner(System.in);
	int[] treeElem=new int[100];
	//int[] treeElem={100,70,200,65,350,150,80,75,90,190,390,195};
	int ins=0;
	int numofelem=0;
	/*tree.root=tree.insert(tree.root,50);
	tree.root=tree.insert(tree.root,25);
	tree.root=tree.insert(tree.root,70);
	tree.root=tree.insert(tree.root,80);
	tree.root=tree.insert(tree.root,10);
	tree.root=tree.insert(tree.root,35);
	tree.root=tree.insert(tree.root,30);
	*/
	while(ins!=-1){
		
		ins=s.nextInt();
		if(ins!=-1){
		treeElem[numofelem]=ins;
		tree.root=tree.insert(tree.root,ins);
		numofelem++;
		}
		}
		System.out.println("The data with their Num value");
		tree.display(tree.root);
	System.out.println("Numbers inserted"+numofelem);
	int[] rank=new int[numofelem];
	for(int i=0;i<numofelem;i++){
		rank[i]=tree.Rank(tree.root,treeElem[i]);
	}		
		for(int i=0;i<numofelem;i++)
		System.out.println("Rank of "+treeElem[i]+":"+rank[i]);
	int x=s.nextInt();	
	int fr=tree.FindRank(tree.root,x);		
	System.out.println("Element with rank"+x+" : "+fr);
	tree.deletion(tree.root,200);
	System.out.println("The data with their Num value");
	tree.display(tree.root);
       /* tree.root=tree.insert(tree.root,100);
	tree.root=tree.insert(tree.root,70);
	tree.root=tree.insert(tree.root,200);
	tree.root=tree.insert(tree.root,65);
	tree.root=tree.insert(tree.root,350);
	tree.root=tree.insert(tree.root,150);
	tree.root=tree.insert(tree.root,80);
	tree.root=tree.insert(tree.root,75);
	tree.root=tree.insert(tree.root,90);
	tree.root=tree.insert(tree.root,190);
	tree.root=tree.insert(tree.root,390);
	tree.root=tree.insert(tree.root,195);
	tree.display(tree.root);
	//System.out.println("Numbers inserted"+numofelem);
	int[] rank=new int[12];
	for(int i=0;i<12;i++){
		rank[i]=tree.Rank(tree.root,treeElem[i]);
	}		
		for(int i=0;i<12;i++)
		System.out.println("Rank of "+treeElem[i]+":"+rank[i]);
	int x=s.nextInt();	
	int fr=tree.FindRank(tree.root,x);		
	System.out.println("Element with rank"+x+" : "+fr);

*/
	

}

}
