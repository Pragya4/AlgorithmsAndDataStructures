import java.util.*;
class GP58_ReverseByBlock{
static class Node{
	Node next;
	int data;
	Node(int data){
		this.data=data;		
		}
}
static Node reversebyblocks(Node head,int k){
		Node cur=head;
		Node prev=null;
		Node next=null;
		int count=0;		
		while(count<k && cur!=null){
			next=cur.next;
			cur.next=prev;
			prev=cur;
			cur=next;
			count++;			
			}
		if(next!=null){
			head.next=reversebyblocks(next,k);			
			}
		return prev;
		}
public static void main(String args[]){
	Node head=new Node(10);
	Node a=head;
	Node refhead=head;
	a.next=new Node(20);
	a=a.next;
	a.next=new Node(30);
	a=a.next;	
	a.next=new Node(40);
	a=a.next;
	a.next=new Node(50);
	a=a.next;
	a.next=new Node(60);
	a=a.next;
	a.next=new Node(70);
	a=a.next;
	a.next=new Node(80);
	a=a.next;
	refhead=reversebyblocks(head,3);
	while(refhead!=null){
		System.out.print(refhead.data+" ");
		refhead=refhead.next;		
		}
}
}
