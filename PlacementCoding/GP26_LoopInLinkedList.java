import java.util.*;
class GP26_LoopInLinkedList{
static class Node{
	Node next;
	int data;
	Node(int data){
		this.data=data;		
	}
}
Node head;
static boolean findingLoop(Node ptr){
	Node fast_ptr=ptr;
	Node slow_ptr=ptr;
	
	while(fast_ptr!=null && slow_ptr!=null){
		System.out.println(fast_ptr.data);
		fast_ptr=fast_ptr.next.next;
		System.out.println(slow_ptr.data);
		slow_ptr=slow_ptr.next;	
		if(fast_ptr==slow_ptr){	
			return true;			
			}	
		}
	if(fast_ptr==slow_ptr)
		return true;
return false;
}
public static void main(String args[]){
	GP26_LoopInLinkedList node=new GP26_LoopInLinkedList();
	Node head=new Node(10);
	Node ptr=head;
	ptr.next=new Node(20);
	ptr=ptr.next;
	ptr.next=new Node(30);
	ptr=ptr.next;
	ptr.next=new Node(40);
	ptr=ptr.next;
	Node here=ptr;
	ptr.next=new Node(50);
	ptr=ptr.next;
	ptr.next=new Node(60);
	ptr=ptr.next;
	ptr.next=new Node(70);
	ptr=ptr.next;
	ptr.next=new Node(80);
	ptr=ptr.next;
	ptr.next=here;
	System.out.println(findingLoop(head));
}

}
