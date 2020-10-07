import java.util.*;
class GP27_LinkedListLoops{
static class Node{
	Node next;
	int data;
	Node(int data){
		this.data=data;	
		next=null;	
	}
}
Node head;
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
static Node isLoop(Node head){
	Node slowptr=head;
	Node fastptr=head.next;
	while(fastptr!=null && fastptr.next!=null && slowptr!=fastptr){
		slowptr=slowptr.next;
		fastptr=fastptr.next.next;		
		}
if(fastptr==null||fastptr.next==null)
	return null;
return slowptr;
}
static int sizeOfLoop(Node head){
	Node loopcheck=isLoop(head);
		int count=0;
	if(loopcheck==null)
		return 0;	
	else{ 
		Node nextslow=loopcheck.next;

		while(nextslow!=loopcheck){
			count++;
			nextslow=nextslow.next;		
		}
}
return count+1;
}
static int StartOfLoop(Node head){
	//size of loop is say,K
	/*Step1: Proceed in the usual way, you will use to find the loop, i.e. Have two pointers, increment one in single step and other in two steps, If they both meet in sometime, there is a loop.

Step2: Freeze one pointer where it was and increment the other pointer in one step counting the steps you make and when they both meet again, the count will give you the length of the loop (this is same as counting the number of elements in a circular link list).

Step3: Reset both pointers to the start of the link list, increment one pointer to the length of loop times and then start the second pointer. increment both pointers in one step and when they meet again, it will be the start of the loop (this is same as finding the nth element from the end of the link list).*/
int k=sizeOfLoop(head);
Node loopsize=head;
if(k==0)
	return -1;
else{
	int count=0;
	while(count<k){
		loopsize=loopsize.next;
		count++;		
	}
while(loopsize!=head){
	head=head.next;
	loopsize=loopsize.next;
}

}
return loopsize.data;
}
static int search(Node head){
	Scanner s=new Scanner(System.in);
	int k=StartOfLoop(head);
	Node temp=head;
	int onepass=0;
	while(temp.data!=k){
		onepass++;
		temp=temp.next;		
		}
	onepass+=sizeOfLoop(head);
	int count=onepass;
	System.out.println("seach element>> ");
	int x=s.nextInt();
	while(count!=0){
		count--;
		if(head.data==x)
			return (onepass-count);
		head=head.next;		
		}
return -1;
}
public static void main(String args[]){
	GP27_LinkedListLoops node=new GP27_LinkedListLoops();
	Node A=new Node(10);
	Node headA=A;
	Node headB=A;
	A.next=add(A,20);
	A=A.next;
	A.next=add(A,30);
	A=A.next;
	A.next=add(A,40);
	A=A.next;
	A.next=add(A,50);
	Node ptr=A.next;
	A=A.next;
	A.next=add(A,60);
	A=A.next;
	A.next=add(A,70);
	A=A.next;
	A.next=add(A,80);
	A=A.next;
	A.next=ptr;
	int count=8;
	while(count>=0){
	count--;
	System.out.print(headA.data+"-->");	
	headA=headA.next;	
	}
	System.out.println();
	Node temp=isLoop(headB);
	System.out.println("do we have a loop?(yes until -1) "+temp.data);
	System.out.println("start  of loop "+StartOfLoop(headB));
	System.out.println("size of loop "+sizeOfLoop(headB));
	System.out.println("Element available at "+search(headB));

}

}
