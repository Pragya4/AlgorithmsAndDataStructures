import java.util.*;
class GP29_DeleteAlternateNode{
static class Node{
	Node next;
	int data;
	Node(int data){
		this.data=data;		
	}
}
static Node DeleteAlt(Node head){
	if(head==null)
		return null;
	if(head.next==null)
		return head;
	Node ptr=head;
	while(ptr!=null && ptr.next!=null){
		ptr.next=ptr.next.next;
		ptr=ptr.next;
	}
return head;
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
	A.next=add(A,50);
	A=A.next;
	/*A.next=add(A,60);
	A=A.next;
	A.next=add(A,70);
	A=A.next;
	A.next=add(A,80);
	A=A.next;*/
	while(headA!=null){
		System.out.print(headA.data+" -> ");
		headA=headA.next;		
		}
	System.out.println("result");
	Node response=DeleteAlt(headB);
	while(response!=null){
		System.out.print(response.data+" -> ");	
		response=response.next;	
		}
	System.out.println();

}

}
