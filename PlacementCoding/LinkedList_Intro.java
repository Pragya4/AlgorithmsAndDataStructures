import java.util.*;
class LinkedList_Intro{
class Node{
	Node next;
	int data;
	Node(int data){
		this.data=data;	
		next=null;	
	}
}
Node head;
void add(int pos,int x){
	int count=0;
	if(pos==0){
		Node ptr1=new Node(x);
		ptr1.next=head;
		head=ptr1;		
	}
	else if(pos==1){
		Node ptr1=new Node(x);
		if(head.next!=null)
			ptr1.next=head.next;
		if(head.next==null){
			ptr1.next=null;
		}
		head.next=ptr1;		
		}
	else{	
		Node ptr=head;
		while(count<=pos-2 && ptr.next!=null){	
			System.out.println("here "+count);	
			ptr=ptr.next;
			count++;		
		}
	if(ptr.next!=null){
	Node newnode=new Node(x);
	newnode.next=ptr.next;
	ptr.next=newnode;
	}
	else{
	Node newnode=new Node(x);
	newnode.next=null;
	ptr.next=newnode;		
	}
	}
}
void print(){
	Node ptr=head;
	while(ptr!=null){
		System.out.println(ptr.data);
		ptr=ptr.next;		
		}
}
void delete(int num){
	Node prev=null;
	Node ptr=head;
	while(ptr!=null && ptr.data!=num){
		prev=ptr;
		ptr=ptr.next;		
		}
	if(ptr==null){
		System.out.println("element not present");		
		}
	else{	
		if(head.data==num){	
			head=head.next;			
		}		
		else if(ptr.next==null){
			prev.next=null;
			ptr=null;
			}
		else{
			prev.next=ptr.next;
			ptr=ptr.next;
			}
	}
	
}
void deleteatpos(int pos){
Node prev=null;
Node ptr=head;
int count=1;
if(pos==0){
	head=head.next;
	}
else{
	while(ptr!=null && count!=pos){
		count++;
		prev=ptr;
		ptr=ptr.next;
	}
}
if(ptr==null){
	System.out.println("not found");		
	}
else{
	prev.next=ptr.next;
	ptr=ptr.next;	
	
}
}
public static void main(String args[]){
	LinkedList_Intro node=new LinkedList_Intro();
	node.add(0,10);
	node.add(1,30);
	node.add(1,20);
	node.add(3,40);
	node.add(4,50);
	node.print();
	System.out.println("delete 10");
	node.delete(10);
	node.print();
	System.out.println("delete pos 2");
	node.deleteatpos(2);
	node.print();
	System.out.println("delete 40");
	node.delete(40);
	node.print();
	System.out.println("delete 50");
	node.delete(50);
	node.print();
}

}
