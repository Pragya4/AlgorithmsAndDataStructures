import java.util.*;
class GP53_DeleteAlternate_LL{
static class Node{
	Node next;
	int data;
	Node(int data){
		this.data=data;		
	}
} 
static Node deleteAlternate (Node head){
        //Write your code here
	Node root=head;
        while(head!=null){
            if(head.next!=null ){
                    head.next=head.next.next;
                    
            }
            head=head.next;
        }
	return root;
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
	head=deleteAlternate(head);
	while(head!=null){
		System.out.println(head.data+" ");
		head=head.next;		
		}
	}
}
