import java.util.*;
class GP57_RotateByBlock{
static class Node{
	Node next;
	int data;
	Node(int data){
		this.data=data;		
		}	
	}
static Node rotatebyblock(Node head,int k,int r){
	Node cur=head;
	int count=0;
	int rot=0;
	Node ref=head;
	while(count<k && ref!=null && rot<r){
		count++;
		ref=ref.next;
		rot++;		
		}
	while(count<k && ref!=null && ref.next!=null){
		head=head.next;
		ref=ref.next;
		count++;			
		}
	if(ref!=null && ref.next!=null){
		head.next=rotatebyblock(ref.next,k,r);		
		ref.next=cur;
		}
	return head;
}
public static void main(String args[]){
Node head=new Node(10);
Node a=head;
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
a.next=new Node(90);
a=a.next;
head=rotatebyblock(head,3,1);
while(head!=null){
	System.out.print(head.data+" ");
	head=head.next;	
	}
}

}
