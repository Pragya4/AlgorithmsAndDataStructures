import java.util.*;
class GP56_BlockRotations_LL{
static class Node{
	Node next;
	int data;
	Node(int data){
		this.data=data;		
	}
}
static Node rotate(Node head,Node end,int k)
        {
         //add code here.
         Node start=head;
         Node ptr=head;
         int count=1;
         while(count<k && ptr!=end){
             count++;
             ptr=ptr.next;
         }
        Node second=ptr;
        //Node secondstart=second;
        while(second.next!=end){
            second=second.next;
        }
        second.next=head;
        head=ptr.next;
        ptr.next=end;
        return head;
      }
static Node rotateblock(Node head,int blocksize,int rot){
	Node start=head;
	Node ptr=head;	
	while(ptr!=null){
		int count=1;
		head=ptr;
		while(count<blocksize && ptr!=null){
			count++;
			ptr=ptr.next;			
			}
		if(ptr!=null)
			head=rotate(head,ptr,rot);
				
		}
return start;
}
public static void main(String args[]){
	Node head=new Node(1);
	Node a=head;
	a.next=new Node(2);
	a=a.next;
	a.next=new Node(3);
	a=a.next;
	a.next=new Node(4);
	a=a.next;
	a.next=new Node(5);
	a=a.next;
	a.next=new Node(6);
	a=a.next;
	a.next=new Node(7);
	a=a.next;
	a.next=new Node(8);
	a=a.next;
	a.next=new Node(9);
	a=a.next;
	head=rotateblock(head,3,1);
	while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
	}
}
