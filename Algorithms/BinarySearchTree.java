import java.util.*;
class BinarySearchTree{
	class Node{
		int value;
		Node left,right;
		Node(int value){
			this.value=value;			
			}		
					
		}
	Node root;
	public BinarySearchTree(){
		root=null;		
		}
	Node ptr;
	ArrayList<Integer> arr=new ArrayList<Integer>();
	Node insert(Node root,int data){
			if(root==null){
				Node node=new Node(data);
				node.left=null;
				node.right=null;
				root=node;	
				arr.add(data);
				System.out.println("inserted: "+data);			
				}
			else if(root.value>=data){
				System.out.print(" left ");
				root.left=insert(root.left,data);				
				}
			else if(root.value<data){
				System.out.print(" right ");
				root.right=insert(root.right,data);				
				}	
		return root;
			}
	
	void display(Node ptr){
		if(ptr!=null){
			display(ptr.left);
			System.out.println(ptr.value);
			
			display(ptr.right);		
			}
		/*System.out.println("Arraylist");
		Iterator itr=arr.iterator();
		while(itr.hasNext()){
			System.out.println("--->"+itr.next());			
				}*/
			
				
			}
	Node delete(int data,Node root){
		if(root.value>data){
			root.left=delete(data,root.left);
			}
		else if(root.value<data){
				root.right=delete(data,root.right);			
			}
		else{
			if(root.left==null){
				return root.right;				
				}
			else if(root.right==null){
				return root.left;				
				}
			else{
				root.value=leftrightn(root.left);
				root.left=delete(root.value,root.left); //jp inorder predecessor hai usko hatana hai, to left tree pass ki uske right right jaate recursion
					
					}
			}
		return root;
			
		}
		int leftrightn(Node lrn){
			int lrnval=root.value;
			while(lrn.right!=null){
				lrn=lrn.left;
				lrnval=lrn.value;
				}
			return lrnval;
		}
	int Search(int data,Node root){
		if(root!=null && root.value==data){
			System.out.println("Found");
			return 1;
					
			}
		if(root!=null && data>root.value){
			System.out.println("right");	
			Search(data,root.right);			
			}
		else if(root!=null && data<=root.value){
			System.out.println("left");
			Search(data,root.left);				
			}
		else if(root==null)
			System.out.println("");
			return 0;
		//return 9;
//theres some error which alwayshows not found wvwn after it hasfound

		}

public static void main(String args[]){
	BinarySearchTree tree=new BinarySearchTree();
	tree.ptr=tree.insert(tree.root,50);
	tree.ptr=tree.insert(tree.ptr,20);
	tree.ptr=tree.insert(tree.ptr,60);
	tree.ptr=tree.insert(tree.ptr,10);
	tree.ptr=tree.insert(tree.ptr,15);
	tree.ptr=tree.insert(tree.ptr,25);
	tree.ptr=tree.insert(tree.ptr,19);
	System.out.println("delete 10");
	tree.delete(10,tree.ptr);
	System.out.println("The inorder traversal of binary search tree is sorted,Inorder Traversal of Binary Search Tree is:");
	tree.display(tree.ptr);
	tree.delete(25,tree.ptr);
	tree.delete(15,tree.ptr);
	System.out.println("After deleting 25 and 15");
	tree.display(tree.ptr);
	//tree.arr.remove(new Integer(15));
	System.out.println("Do you want to insert anymore values?press -1 if not");
	int nodevalue;
	Scanner s=new Scanner(System.in);
	do{
		nodevalue=s.nextInt();
		if(nodevalue!=-1)
		tree.ptr=tree.insert(tree.ptr,nodevalue);		
	}while(nodevalue!=-1);
	System.out.println("root data"+(tree.ptr).value);
	System.out.println("Search for the element");
	int searchelem=s.nextInt();
	int found=tree.Search(searchelem,tree.ptr);
	if(found==1){
		System.out.println("Found");
		found=1;
					
		}
	else if(found==0){
		System.out.println("Not found");			
		}

}



}
