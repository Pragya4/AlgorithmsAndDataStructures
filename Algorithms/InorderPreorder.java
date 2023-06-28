import java.util.*;
class Node{
	Node left,right;
	int data;
	Node(int data){
		left=null;
		right=null;
		this.data=data;
	}

}
class InorderPreorder{

Node root;


static int preindex=0;
int search(int[] inorder,int x,int start,int end){
	System.out.println("Searching for"+x);
	for(int i=0;i<inorder.length;i++){
		if(inorder[i]==x){
			System.out.println("in inorder at "+i);
			return i;}
	}
return -1;
}
Node BuildTree(int[] pre,int[] in,int start,int end){
	if(start>end){
		return null;			
		}
	Node node=new Node(pre[preindex++]);
	//insert(root,pre[preindex]);
	if(start==end)
		return node;
	int k=search(in,node.data,start,end);
	//preindex++;
	if(k!=-1){
		node.left=BuildTree(pre,in,start,k-1);
		node.right=BuildTree(pre,in,k+1,end);
	}
return node;
}
void display(Node node){
	
        if (node == null)
            return;
        display(node.left);
  	display(node.right);
        
        System.out.print(node.data + " ");
  
        /* now recur on right child */
        
    
}
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	InorderPreorder obj=new InorderPreorder();
	int n=s.nextInt();
	int[] pre=new int[n];
	int[] in=new int[n];
	int start=0;
	int end=n;
	for(int i=0;i<n;i++){
		pre[i]=s.nextInt();
		}
	for(int i=0;i<n;i++){
		in[i]=s.nextInt();
		}
	Node root=obj.BuildTree(pre,in,0,n-1);	
	System.out.println("postorder traversal of tree");
	obj.display(root);
}

}

