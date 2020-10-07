import java.util.*;
class GP54_MiddleNodeAsHead_LL{
static class Node{
	Node next;
	int data;
	Node(int data){
		this.data=data;		
		}		
	}
	static Node findmidandreplace(Node head){
		Node slow=head;
		Node fast=head;
		Node prev=slow;
		while(fast.next!=null && fast.next.next!=null){
			fast=fast.next.next;
			prev=slow;
			slow=slow.next;			
			}
		if(fast.next!=null){
			prev=slow;
			slow=slow.next;	
			}
		prev.next=prev.next.next;
		slow.next=head;
		head=slow;
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
		head=findmidandreplace(head);	
		//head=makehead(head,mid);
		while(head!=null){
			System.out.print(head.data+" ");
			head=head.next;			
		}


		}
	}
