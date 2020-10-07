import java.util.*;
class GP28_Sort0_1_2_LinkedList{
static class Node{
	Node next;
	int data;
	Node(int data){
		this.data=data	;	
	}
}
static Node sort(Node head){
	Node ptr=head;
	int n1=0;
	int n2=0;
	int n3=0;
	while(ptr!=null){
		if(ptr.data==0)
			n1++;
		else if(ptr.data==1)
			n2++;
		else if(ptr.data==2)
			n3++;	
		ptr=ptr.next;		
		}
	System.out.println("0 "+n1+" 1 "+n2+" 2 "+n3);
	Node result=new Node(9);
	Node headdum=result;
	while(n1!=0){
		Node ptr1=new Node(0);
		result.next=ptr1;
		result=result.next;
		System.out.println("resd "+result.data);
		n1--;			
		}
	while(n2!=0){
		Node ptr1=new Node(1);
		System.out.println("n2d "+result.data);
		result.next=ptr1;
		result=result.next;
		n2--;			
		}
	while(n3!=0){
		Node ptr1=new Node(2);
		result.next=ptr1;
		result=result.next;
		n3--;			
		}

return headdum.next;
}
static Node add(Node head,int x){
	Node ptr=new Node(x);
	if(head==null)
		head=new Node(x);
	else{
		head.next=ptr;
		head=head.next;		
		}
	return head;
}
public static void main(String args[]){
	GP27_LinkedListLoops node=new GP27_LinkedListLoops();
	Node A=new Node(0);
	Node headA=A;
	Node headB=A;
	A.next=add(A,1);
	A=A.next;
	A.next=add(A,0);
	A=A.next;
	A.next=add(A,2);
	A=A.next;
	A.next=add(A,1);
	A=A.next;
	A.next=add(A,1);
	A=A.next;
	A.next=add(A,2);
	A=A.next;
	A.next=add(A,1);
	A=A.next;
	while(headA!=null){
		System.out.print(headA.data+" -> ");
		headA=headA.next;		
		}
	System.out.println("result");
	Node response=sort(headB);
	while(response!=null){
		System.out.print(response.data+" -> ");	
		response=response.next;	
		}
	System.out.println();

}

}

