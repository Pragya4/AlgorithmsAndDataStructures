import java.util.*;
class GP31_Deque_StackQueue{
static class dNode{
	dNode prev;
	dNode next;
	int data;
	dNode(int data){
		next=null;
		prev=null;
		this.data=data;		
	}
}
static dNode head;
static dNode push(dNode tail,int data){
	System.out.println("push "+data);
	dNode newnode=new dNode(data);
	newnode.next=null;
	if(tail!=null){
		newnode.prev=tail;
		tail.next=newnode;
	}
	if(tail==null){
		tail=newnode;
		head=tail;			
	}
	tail=newnode;
	//System.out.println(tail.data);
return tail;
}
static dNode pop(dNode tail){
	if(tail!=null){
	System.out.println("pop "+tail.data);
	tail=tail.prev;
	tail.next=null;
	}
	else{
		System.out.println("underflow stack");		
	}
return tail;
}
static dNode enqueue(dNode tail,int x){
	dNode newnode=new dNode(x);
	System.out.println("enqueue "+x);
	if(tail!=null){
	tail.next=newnode;
	newnode.prev=tail;
	newnode.next=null;
	}
	tail=newnode;
	return tail;		
	}
static dNode dequeue(dNode head){
	if(head!=null){
		System.out.println("dequeue "+head.data);
	head=head.next;
	head.prev=null;
	}
	else{
		System.out.println("underflow queue");
		return null;		
	}
return head;	
	}
static void print(dNode head){
	while(head!=null){
		System.out.print(head.data+" ");
		head=head.next;		
		}
}
public static void main(String args[]){
	GP31_Deque_StackQueue obj=new GP31_Deque_StackQueue();
	//dNode head=new dNode
	dNode tail=obj.head;
	tail=push(tail,1);
	tail=push(tail,2);
	tail=push(tail,3);
	tail=push(tail,4);
	tail=push(tail,5);
	print(obj.head);
	tail=pop(tail);
	System.out.println("after pop");
	print(obj.head);	
	tail=push(tail,6);
	System.out.println();
	print(obj.head);
	tail=enqueue(tail,10);
	tail=enqueue(tail,20);
	tail=enqueue(tail,30);
	System.out.println("Befre deq");
	print(head);
	head=dequeue(head);
	head=dequeue(head);
	System.out.println("afters deq");
	print(head);	
	System.out.println("after pop");
	tail=pop(tail);
	print(head);
	}
}
