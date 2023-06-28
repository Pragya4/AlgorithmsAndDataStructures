import java.util.*;
class GP52_AlternateEvenOdd_LinkedList{
static class Node{
	Node next;
	int data;
	Node(int data){
		this.data=data;			
		}
}
static void swap(Node a,Node b){
	int temp=a.data;
	a.data=b.data;
	b.data=temp;
}
static Node func(Node head){
	Node odd=head;
	Node even=head.next;
	while(odd!=null && even!=null){
		System.out.println("even "+even.data+" odd "+odd.data);
		if((odd.data)%2==1 && odd.next!=null && odd.next.next!=null){
		while((odd.data)%2==1 && odd.next!=null && odd.next.next!=null){
			odd=odd.next.next;			
			}
		}
		if((even.data)%2==0 && even.next!=null && even.next.next!=null){
		while((even.data)%2==0 && even.next!=null && even.next.next!=null){
			even=even.next.next;			
			}
		}
		if(even!=null && odd!=null && even.data%2!=0 && odd.data%2!=1){
			swap(even,odd);	
			//if(even.next!=null && even.next.next!=null)
			//	even=even.next.next;
			//if(odd.next!=null && odd.next.next!=null)
			//	odd=odd.next.next;		
			}
		if(odd.next==null || even.next==null)
			return head;			
		}
return head;
}
public static void main(String args[]){
	System.out.println("begin");
	Node head=new Node(10);
	Node A=head;
	A.next=new Node(1);
	A=A.next;
	A.next=new Node(2);
	A=A.next;
	A.next=new Node(3);
	A=A.next;
	A.next=new Node(5);
	A=A.next;
	A.next=new Node(6);
	A=A.next;
	A.next=new Node(7);
	A=A.next;
	A.next=new Node(8);
	
	head=func(head);
	while(head!=null){
		System.out.print(" "+head.data);	
		head=head.next;	
		}
}
}
