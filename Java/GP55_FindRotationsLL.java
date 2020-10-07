import java.util.*;
class GP55_FindRotationsLL{
static class Node{
	Node next;
	int data;
	Node(int data){
		this.data=data;		
		}	
	}
static int noOfRotation(Node head){
	Node prev=head;
	Node ptr=head;
	int count=0;
	while(ptr.data<ptr.next.data){
		ptr=ptr.next;
		count++;		
		}
	return count+1;	
	}
public static void main(String args[]){
	Node head=new Node(12);
	Node a=head;
	a.next=new Node(15);
	a=a.next;
	a.next=new Node(18);
	a=a.next;
	a.next=new Node(5);
	a=a.next;
	a.next=new Node(8);
	a=a.next;
	a.next=new Node(11);
	a=a.next;
	System.out.println( noOfRotation(head));


}
}
