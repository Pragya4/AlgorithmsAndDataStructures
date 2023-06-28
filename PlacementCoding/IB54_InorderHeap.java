import java.util.*;
class IB54_InorderHeap{
static int flag=0;

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
static Node root;
static int findmax(ArrayList<Integer> arr,int start,int end){
	int max=Integer.MIN_VALUE;
	int tracki=start;		
	for(int i=start;i<=end;i++){
		if(arr.get(i)>max){
			max=arr.get(i);
			tracki=i;
			}		
		}
return tracki;
}
static Node build(ArrayList<Integer> a,int s,int e){
Node newnode;

if(s<=e){	
	int index=findmax(a,s,e);
	System.out.println(index);
	newnode=new Node(a.get(index));
	if(flag==0){
		root=newnode;
		flag=1;		
		}
	
	if(index>0)
		newnode.left=build(a,s,index-1);
	else if(index==0)
		newnode.left=null;
	if(index<a.size()-1)
		newnode.right=build(a,index+1,e);
	else if(index>=a.size()-1)
		newnode.right=null;
}
else
	return null;
return newnode;
}
static void display(Node node){
	if(node==null)
		return;
	if(node!=null){
		System.out.print(node.data+" ");			
		}
	display(node.left);
	display(node.right);
	}
static ArrayList<Integer> buildTree(ArrayList<Integer> arr){
	 build(arr,0,arr.size()-1);
		display(root);
	
return new ArrayList<Integer>();
}
public static void main(String args[]){
	ArrayList<Integer> arr=new ArrayList<Integer>();
	arr.add(4);
	arr.add(5);
	arr.add(6);
	arr.add(1);
	arr.add(2);
	arr.add(0);
	buildTree(arr);
}
}
