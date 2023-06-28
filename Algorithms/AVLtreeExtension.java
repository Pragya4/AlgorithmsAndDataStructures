import java.util.Scanner;

class Node{
	int data,height,num,sum;
	Node left,right;
	int mini,maxi,mingapval;
	Node(int key){
		data=key;
		height=1;
		num=1;
		sum=data;
		mini=data;
		maxi=data;
	}
}
public class AVLtreeExtension{
	Node root;
	Node rootsrh;
	Node rootsr;
	AVLtreeExtension(){
	
		root=null;
	}
	int height(Node n){
		if(n==null)
			return 0;
		return n.height;
	
	}
	int noofnodes(Node n){
		if(n==null)
			return 0;
		return n.num;
	}
	int min(int a,int b){
		if(a>b)
			return b;
		else 
			return a;
			}
	int max (int a ,int b ){
		return a>b?a:b;
	}
	Node LeftRotate(Node root){
		Node newroot = root.right;
		Node t = newroot.left;
		
		newroot.left = root;
		root.right = t;
		
		root.height= 1+max(height(root.left),height(root.right));
		newroot.height = 1+max(height(newroot.left),height(newroot.right));
		
		root.num=1+noofnodes(root.left)+noofnodes(root.right);
		newroot.num=1+noofnodes(newroot.left)+noofnodes(newroot.right);
		
		root.sum=root.data+sum(root.left)+sum(root.right);
		newroot.sum=root.data+sum(newroot.left)+sum(newroot.right);
		System.out.println(newroot.sum);
			
		root.maxi=max(root.right.maxi,root.data);
		root.mini=min((root.left).mini,root.data);
		newroot.maxi=max((newroot.right).maxi,newroot.data);
		newroot.mini=min((newroot.left).mini,newroot.data);
		root.mingapval=mingap(root);
		newroot.mingapval=mingap(newroot);
		
		 
		
	return newroot;
	}
	
	Node RightRotate(Node root){
		Node newnode = root.left;
		Node t = newnode.right;
		
		newnode.right=root;
		root.left=t;
		
		root.height = 1+max(height(root.left),height(root.right));
		newnode.height=1+max(height(newnode.left),height(newnode.right));
		
		root.num=1+noofnodes(root.left)+noofnodes(root.right);
		newnode.num=1+noofnodes(newnode.left)+noofnodes(newnode.right);
		
		root.sum=root.data+sum(root.left)+sum(root.right);
		newnode.sum=newnode.data+sum(newnode.left)+sum(newnode.right);

		root.maxi=max((root.right).maxi,root.data);
		root.mini=min((root.left).mini,root.data);
		newnode.maxi=max((newnode.right).maxi,newnode.data);
		newnode.mini=min((newnode.left).mini,newnode.data);
		root.mingapval=mingap(root);
		newnode.mingapval=mingap(newnode);
		
		
		return newnode;
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
	Node insert(Node root,int key){
		if(root ==null)
			return new Node(key);
		if(key<=root.data)
			root.left = insert(root.left,key);
		else if(key>root.data)
			root.right = insert(root.right,key);
		else 
			return root;	
		int maxgapval=maxgap(root);
		int mingapval=mingap(root);
		System.out.println("in main maxhgap mingap"+maxgapval+" "+mingapval);
		//root.maxi=findmaxkey(root);
		//root.mingapval=0;
		root.height=1+max(height(root.left),height(root.right));
		//System.out.println(root.height);
		root.num = 1+noofnodes(root.left)+noofnodes(root.right);
		//System.out.println(root.num);
		root.sum= root.data+sum(root.left)+sum(root.right);
		//System.out.println(root.sum);
				
		
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
		int mxg=maxgap(root);
		int mng=mingap(root);
		System.out.println("maxg "+mxg+" mng "+mng);
		return root;
	
		
	}
	int maxgap(Node node){
		if(node == null)
			return Integer.MIN_VALUE;
		if(root.right!=null && root.left!=null){
		root.maxi=max(root.data,(root.right).maxi);
		root.mini=min(root.data,(root.left).mini);
		}
		else{	if(root.left==null && root.right==null){
				System.out.println("here");
				root.maxi=root.data;
				root.mini=root.data;					
				}
			else if(root.left==null){
				root.maxi=(root.right).maxi;
				root.mini=root.data;					
					}
			else if(root.right==null){
				root.maxi=root.data;
				root.mini=(root.left).maxi;					
					}
						
			
			}
		System.out.println("Maxgap "+root.mini+","+root.maxi);
		return (root.maxi-root.mini);			
		}
	int mingaputil(Node node){
		if(node==null)
			return Integer.MAX_VALUE;
		return node.mingapval;
					
		}
	int mingap(Node node){
		int val=0;
		if(node!=null){
			 val = min(mingaputil(root.left),mingaputil(root.right));
		if(root.left!=null)
			val = min(val,root.data-(root.left).maxi);
		if(root.right!=null)
			val = min(val,(root.right).mini-root.data);
		}
		return val;		
	}
	 Node minValueNode(Node node)
    	{
        	Node current = node;
        	while (current.left != null)
           		current = current.left;
 
        return current;
    }
    int getBalance(Node root){
    	if(root==null)
    		return 0;
    	return height(root.left)-height(root.right);
    }
	
	Node DeleteNode(Node root,int key){
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
		int balance = height(root.left)-height(root.right);
		
		if(balance > 1 && getBalance(root.left)>=0)
			return RightRotate(root);
		if(balance >1 && getBalance(root.left)<0){
			root.left = LeftRotate(root.left);
			return RightRotate(root);
		}
		if(balance<-1 && getBalance(root.right)>=0)
			return LeftRotate(root);
		if(balance<-1 && getBalance(root.right)<0)
		{
			root.right = RightRotate(root.right);		
			return LeftRotate(root);
		}return root;
	}
	int Rank(Node root,int x){
		int rank =1;
		while(root!=null){
			if(root.data<=x)
				root=root.right;
			else{
				rank = rank+1+noofnodes(root.right);
				root=root.left;
			}
		}return rank;
	
	}
	int FindRank(Node root,int k){
		if(k>root.num){
			System.out.println("No such rank exits !");
			return 0;
		}
		int r=0;
		while(root!=null){
			 r =noofnodes(root.right);
			 //System.out.print(r);
			
			 if(r+1==k)
				return root.data;
			else if(r+1<k){
				k=k-(r+1);
				root=root.left;
			}
			else{
				root=root.right;
				
			}
			
		}return root.data;
	
	}
	Node Search(Node root,int key){
		while(root!=null){
		if(root.data==key)
			return root;
		else if(key<root.data)
			root = Search(root.left,key);
		else
			root = Search(root.right,key);
		}
		return root;
	}
	/*int num(Node root){
		if(root==null)
			return 0;
		else{
			return 1+num(root.left)+num(root.right); //It is called logn*logn times therefore increasing the time complexity
								//So wrong.	
		}
	}*/
	
	int Numberbetween(Node root,int x,int y){
		int nums = Rank(root,x)-Rank(root,y);
		Node node = Search(root,x);
		if(node!=null)
			nums=nums+1;
		
		return nums;
		
	}
	int sum(Node root){
		int sumnode=0;
		if(root==null)
			return 0;
		return root.sum;
	}
	int PrefixSum(Node root,int var){
		int presum =0;
		while(root!=null){
			if(root.data==var){
				presum=presum+root.data+sum(root.left);
				return presum;
				}
			else if(root.data<var){
				presum=presum+root.data+sum(root.left);
				//System.out.println(sum);
				root=root.right;
			}
			else{
				root=root.left;
			}	
		}return presum;
	}
	
	int SumBetween(Node root,int x,int y){
		int sum = PrefixSum(root,y)-PrefixSum(root,x-1);
		return sum;
	}
	public static void main(String[] args){
		AVLtreeExtension tree = new AVLtreeExtension();
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Insert");
		System.out.println("2.Delete");
		System.out.println("3.Preorder");
		System.out.println("4.Rank of an element");
		System.out.println("5.FindRank(given a rank find element)");
		System.out.println("6.Number between x and y");
		System.out.println("7.Mingap");
		System.out.println("8.Maxgap");
		System.out.println("9.Sum between x and y");
		System.out.println("10.Search");
		System.out.println();
		while(true){
		System.out.print("Enter Choice : ");
		int ch = sc.nextInt();
		
		switch(ch){
		case 1: int a = sc.nextInt();
			tree.root = tree.insert(tree.root,a);
			break;
		case 2: int del = sc.nextInt();
			tree.root=tree.DeleteNode(tree.root,del);
			break;
		case 3 :
			tree.Preorder(tree.root);
			System.out.println();
			break;
			
		case 4: int ele = sc.nextInt();
			int r = tree.Rank(tree.root,ele);
			System.out.println(r);
			break;
		case 5: int element = sc.nextInt();
			int rank = tree.FindRank(tree.root,element);
			System.out.println(rank);
			break;
			
		case 6: int x =sc.nextInt();
			int y =sc.nextInt();
			int z = tree.Numberbetween(tree.root,x,y);
			System.out.println("Number between "+x+" and "+y+" is : "+z);
			break;

		case 7: int sh=sc.nextInt();
			Node rootsr=tree.Search(tree.root,sh);
			int res=tree.mingap(tree.rootsr);
			System.out.println("mingap"+res);
			break;

		case 8:int srch=sc.nextInt();
			Node rootsrh=tree.Search(tree.rootsrh,srch);
			res=tree.maxgap(tree.rootsrh);
			System.out.println("maxgap"+res);
 			break;

		case 9: int x1 =sc.nextInt();
			int y1 =sc.nextInt();
			int z1 = tree.SumBetween(tree.root,x1,y1);
			System.out.println("Sum between "+x1+" and "+y1+" is : "+z1);
			break;
		case 10: int searchelement=sc.nextInt();
			Node root=tree.Search(tree.root,searchelement);
				if(root == null)
					System.out.println("Not Present");
				else
				System.out.println("Present");
				break;
		case 11:System.exit(0);
			break;
		/*tree.root = tree.insert(tree.root, 50);
        	tree.root = tree.insert(tree.root, 25);
        	tree.root = tree.insert(tree.root, 70);
        	tree.root = tree.insert(tree.root, 80);
        	tree.root = tree.insert(tree.root, 10);
        	tree.root = tree.insert(tree.root, 35);
        	tree.root = tree.insert(tree.root, 30);
        	
		System.out.println("Preorder traversal :");
		tree.Preorder(tree.root);
		System.out.println();
		System.out.println("Inorder traversal :");
		tree.Inorder(tree.root);
		System.out.println();
		int x = tree.num(tree.root.left.right);
		System.out.println(x);
		int rank = tree.Rank(tree.root,30);
		System.out.println("Rank of 30 : "+rank);
		int y = tree.FindRank(tree.root,5);
		System.out.println("Element with rank 5 is :"+y);
		Node root=tree.Search(tree.root,32);
		if(root == null)
			System.out.println("Not Present");
		else
			System.out.println("Present");
		int z = tree.Numberbetween(tree.root,0,100);
		System.out.println(z);
		int sum = tree.sum(tree.root);
		System.out.println(sum);
		int sum1 = tree.PrefixSum(tree.root,70);
		System.out.println(sum1);
		int sum2 = tree.SumBetween(tree.root,30,70);
		System.out.println(sum2);*/
		}
	}
}
}
