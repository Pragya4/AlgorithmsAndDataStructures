import java.util.*;
class GP28_SwapNodes{
static class Node{
Node next;
int data;
Node(int data){
	this.data=data;		
	}
}
static void swap(Node head,Node a,Node b){
	if(a==b)
		return;
	if(a==null || b==null)	
		return;
	Node preva=null;
	Node curra=head;
	while(curra!=null && curra.data!=a.data){
		preva=curra;		
		curra=curra.next;				
		}
	Node currb=head;
	Node prevb=null;
	while(currb!=null && currb.data!=b.data){
		prevb=currb;
		currb=currb.next;		
		}
	if(curra==null || currb==null)
		return;
	if(preva!=null){
		preva.next=currb;			
		}
	else{
		head=currb;		
		}
	if(prevb!=null){
		prevb.next=curra;			
		}	
	else{	
		head=curra;		
		}
	Node temp=curra.next;
	curra.next=currb.next;
	currb.next=temp;
	}
	
static Node add(Node head,int x){
	Node ptr=new Node(x);
	if(head==null)
		head=new Node(x);
	else{
		head.next=ptr;
		head=head.next;		
		}
	return head;
}
public static void main(String args[]){
	GP27_LinkedListLoops node=new GP27_LinkedListLoops();
	Node A=new Node(10);
	Node headA=A;
	Node headB=A;
	A.next=add(A,20);
	A=A.next;
	A.next=add(A,30);
	A=A.next;
	A.next=add(A,40);
	A=A.next;
	Node swap1=A;
	A.next=add(A,50);
	A=A.next;
	Node swap2=A;
	A.next=add(A,60);
	A=A.next;
	A.next=add(A,70);
	A=A.next;
	
	A.next=add(A,80);
	A=A.next;
	//A.next=ptr;
	int count=8;
	while(count>0){
	count--;
	System.out.print(headA.data+"-->");	
	headA=headA.next;	
	}
	System.out.println("swap "+swap1.data+" "+swap2.data);
	swap(headB,swap1,swap2);
	System.out.println("after swap ");
	count=8;
	while(count>0){
	count--;
	System.out.print(headB.data+"-->");	
	headB=headB.next;	
	}

}

}
