import java.util.*;
class Node{
	Node next;
	int data;
	Node(int data){
		this.data=data;		
	}
}
	
class IB422_PalindromeLinkedList{
static Node head;
static Node left;
static void reverse(Node middle,Node prevmiddle){
	Node cur=middle;
	Node prev=prevmiddle;
	Node nextn;
	while(cur!=null){
		nextn=cur.next;
		cur.next=prev;
		prev=cur;
		cur=nextn;
		}
for(Node i=cur;i!=prevmiddle;i=i.next){
	System.out.print(i.data+" ");		
	}
}
static boolean palindrome(Node head){
	Node slowptr=head;
	Node fastptr=head;
	Node beforeslowptr=head;
	while(slowptr.next!=null && fastptr!=null && fastptr.next!=null){
		beforeslowptr=slowptr;
		slowptr=slowptr.next;
		fastptr=fastptr.next.next;		
		}
	reverse(slowptr,beforeslowptr);	 
	return true; 
}
public static void main(String args[]){
	IB422_PalindromeLinkedList node=new IB422_PalindromeLinkedList();
	head=new Node(10);
	Node ptr=head;
	ptr.next=new Node(20);
	ptr=ptr.next;
	ptr.next=new Node(10);
	//ptr=ptr.next;
	/*ptr.next=new Node(40);
	ptr=ptr.next;
	ptr.next=new Node(30);
	ptr=ptr.next;
	ptr.next=new Node(90);
	ptr=ptr.next;
	ptr.next=new Node(10);*/
	System.out.println(palindrome(head));

}

}
