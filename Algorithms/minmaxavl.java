import java.util.Scanner;

class Node{
	int data,height,max,min,mingap;
	Node left,right,parent;
	Node(int key){
		data=key;
		height=1;
		max=data;
		min=data;
		mingap=Integer.MAX_VALUE;
		left=right=parent=null;
	}
}

public class minmaxavl{
	Node root;
	minmaxavl(){
		root=null;
	}
	
	int height(Node n){
		if(n==null)
			return 0;
		return n.height;
	
	}
	int maximum(Node n){
		if(n==null)
			return Integer.MIN_VALUE;
		return n.max;
	}
	int minimum(Node n){
		if(n==null)
			return Integer.MAX_VALUE;
		return n.min;
	}
	int max (int a ,int b ){
		return a>b?a:b;
	}
	int min(int a,int b){
		return a<b?a:b;
	}
	
	Node LeftRotate(Node root){
		Node newroot = root.right;
		Node t = newroot.left;
		
		newroot.left = root;
		root.right = t;
		
		root.height= 1+max(height(root.left),height(root.right));
		newroot.height = 1+max(height(newroot.left),height(newroot.right)); 
		root.max=max(maximum(root.right),root.data);
		root.min=min(minimum(root.left),root.data);
		newroot.max=max(maximum(newroot.right),newroot.data);
		newroot.min=min(minimum(newroot.left),newroot.data);
		root.mingap=calculateMingap(root);
		newroot.mingap=calculateMingap(newroot);
		
	return newroot;
	}
	
	Node RightRotate(Node root){
		Node newnode = root.left;
		Node t = newnode.right;
		
		newnode.right=root;
		root.left=t;
		
		root.height = 1+max(height(root.left),height(root.right));
		newnode.height=1+max(height(newnode.left),height(newnode.right));
		
		root.max=max(maximum(root.right),root.data);
		root.min=min(minimum(root.left),root.data);
		newnode.max=max(maximum(newnode.right),newnode.data);
		newnode.min=min(minimum(newnode.left),newnode.data);
		root.mingap=calculateMingap(root);
		newnode.mingap=calculateMingap(newnode);
		
		return newnode;
	}
	int maxgap(Node root){
		System.out.println("Maximum is :"+root.max+" Minimum is : "+root.min);
		return root.max-root.min;
	}
	int minimumgap(Node root){
		if(root==null)
			return Integer.MAX_VALUE;
		return root.mingap;
		
	}
	
	int calculateMingap(Node root){
		int val=0;
		if(root!=null){
			 val = min(minimumgap(root.left),minimumgap(root.right));
		if(root.left!=null)
			val = min(val,root.data-maximum(root.left));
		if(root.right!=null)
			val = min(val,minimum(root.right)-root.data);
		}
		return val;
	
	}
	Node insert(Node root,int key){
		if(root ==null){
			System.out.println("inserted");
			return new Node(key);
			
		}
		if(key<=root.data){
			System.out.println("left");
			Node temp = insert(root.left,key);
			root.left = temp;
			temp.parent = root;
			}
		else if(key>root.data){
			System.out.println("right");
			Node temp = insert(root.right,key);
			root.right = temp;
			temp.parent = root;
		}
		else 
			return root;	
			
		root.height=1+max(height(root.left),height(root.right));
		root.max=max(maximum(root.right),root.data);
		root.min=min(minimum(root.left),root.data);
		root.mingap=calculateMingap(root);
		//System.out.println(root.mingap);
		
		//System.out.println(root.max+" and "+root.min);
		
		int balance = height(root.left)-height(root.right);
		if(balance>1){
			if(height(root.left.left)>height(root.left.right))
				return RightRotate(root);
			else{
				root.left = LeftRotate(root.left);
				return RightRotate(root);
			}
		}
		
		else if(balance<-1){
			if(height(root.right.right)>height(root.right.left))
				return LeftRotate(root);
			else {
				root.right= RightRotate(root.right);
				return LeftRotate(root);
			}
		}
		
		
		return root;
	
		
	}
	
	void Preorder(Node root){
		if(root!=null){
			System.out.print(root.data+" ");
			Preorder(root.left);
			Preorder(root.right);
		}
	}
	void Inorder(Node root){
		if(root!=null){
			
			Inorder(root.left);
			System.out.print(root.data+" ");
			Inorder(root.right);
		}
	}
	 Node minValueNode(Node node)
    	{
        	Node current = node;
        	while (current.left != null)
           		current = current.left;
 
        return current;
    }
     Node maxValueNode(Node node)
    	{
        	while(node.right!=null){
        		node = node.right;
        	}return node;
    }
    int getBalance(Node root){
    	if(root==null)
    		return 0;
    	return height(root.left)-height(root.right);
    }
    Node inordersuccessor(Node n){
    	if(n.right!=null)
    		return minValueNode(n.right);
    	
    		Node p = n.parent;
    		while(p!=null && n==p.right){
    			n=p;
    			p=p.parent;
    		}
    	return p;
    }
    
    
    
     Node inorderpredecessor(Node n){
    	if(n.left!=null)
    		return maxValueNode(n.left);
    	
    		Node p = n.parent;
    		while(p!=null && n==p.left){
    			n=p;
    			p=p.parent;
    	}return p;
    }
    
	Node DeleteNode(Node root,int key){
		
		//System.out.println(root.data);
		if(root==null)
			return root;
		if(key<root.data)
			root.left = DeleteNode(root.left,key);
		else if(key>root.data)
			root.right = DeleteNode(root.right,key);
		else{
			if(root.left==null)
				return root.right;
			else if(root.right ==null)
				return root.left;
			else{
				Node temp= minValueNode(root.right);
				//System.out.println(temp.data);
				root.data=temp.data;
				root.right = DeleteNode(root.right,temp.data);
			}
				
		}
		root.height = 1+max(height(root.left),height(root.right));
		
		root.min=min(minimum(root.left),root.data);
		root.max=max(maximum(root.right),root.data);
		root.mingap=calculateMingap(root);
		System.out.println(root.max+" after delete "+root.min);
		//System.out.println(a+" after delete "+b);
		
		int balance = height(root.left)-height(root.right);
		
		if(balance > 1 && getBalance(root.left)>=0)
			return RightRotate(root);
		if(balance >1 && getBalance(root.left)<0){
			root.left = LeftRotate(root.left);
			return RightRotate(root);
		}
		if(balance<-1 && getBalance(root.right)<=0)
			return LeftRotate(root);
		if(balance<-1 && getBalance(root.right)>0)
		{
			root.right = RightRotate(root.right);		
			return LeftRotate(root);
		}return root;
	}

	int minxy(Node root,int x,int y){
		if(root.min>=x && root.max<=y){
			if(x>=y)
				return Integer.MAX_VALUE;			
			
		return root.mingap;
		}
		if(y==root.data && root.left!=null)
		{if((root.left).max <x)
			return Integer.MAX_VALUE;
		return min((y-root.left.max),minxy(root.left,x,(root.left).max));
		}
		if(x==root.data && root.right!=null){
			if(root.right.min>y)
				return Integer.MAX_VALUE;
			return min((root.right.min-x),minxy(root.right,root.right.min,y));
			}
		else if(root.left!=null && root.left.max>=y)
			return minxy(root.left,x,y);
		else if(root.right!=null && root.right.min<=x)
			return minxy(root.right,x,y);
		else{	
			return min(min((root.left!=null?minxy(root.left,x,y):Integer.MAX_VALUE),(root.right!=null?minxy(root.right,x,y):Integer.MAX_VALUE)),
		(min((root.left!=null && root.left.max>=x) ? (root.data - root.left.max) : Integer.MAX_VALUE ,(root.right!=null && root.right.min<=y )? (root.right.min - root.data) : Integer.MAX_VALUE )));			
			}			
			}
						
			
	public static void main(String[] args){
		minmaxavl tree = new minmaxavl();
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Insert");
		System.out.println("2.Delete");
		System.out.println("3.Preorder Traversal");
		System.out.println("4.Inorder Traversal");
		System.out.println("5. Maxgap ");
		System.out.println("6. Mingap ");
		System.out.println("7. minxy");
		while(true){
		System.out.print("Enter Choice :");
		int ch = sc.nextInt();
		switch(ch){
		
		case 1 : int x = sc.nextInt();
			 tree.root = tree.insert(tree.root,x);
			 break;
		case 2:
			int y =sc.nextInt();
			tree.root=tree.DeleteNode(tree.root,y);
			break;
		case 3: System.out.print("Preorder Traversal : ");
			tree.Preorder(tree.root);
			System.out.println();
			break;
		case 4: System.out.print("Inorder Traversal : ");
			tree.Inorder(tree.root);
			System.out.println();
			break;
		case 5:int gap = tree.maxgap(tree.root);
			System.out.println("Maximum Gap is :"+gap);
			break;
		case 6:	int mingap=tree.root.mingap;
			System.out.println("Minimum Gap is :"+mingap);
			break;
		case 7: int s=sc.nextInt();
			int e=sc.nextInt();
			int res=tree.minxy(tree.root,s,e);
			System.out.println("minimum gap between "+s+" & "+e+" is: "+res);
			break;	
		default:System.exit(0);
			break;
		}
		}
		
	}
}
