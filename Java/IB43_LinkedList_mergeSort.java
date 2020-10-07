import java.util.*;
class IB43_LinkedList_mergeSort{
static class Node{
	Node next;
	int data;
	Node(int data){
		this.data=data;		
		}
}
Node head;
static Node FindMiddle(Node A){
if(A==null)
	return null;
Node slowptr=A;
//I DONT KNOW WHY BUT THIS IS APPARENTLY VERY IMPORTAMT TO ELSE CODE DOESNT WORK
Node fastptr=A.next;
while(fastptr!=null){
		System.out.println("hello "+fastptr.data+" "+slowptr.data);
		fastptr=fastptr.next;
		if(fastptr!=null){		
		fastptr=fastptr.next;
		slowptr=slowptr.next;
	}

}
return slowptr;	
}
static Node Merge_SortedList(Node left,Node right){
	if(left==null)
		return right;
	if(right==null)
		return left;
	Node result=null;
	if(left.data>=right.data){
		result=left;
		result.next=Merge_SortedList(left.next,right);		
		}
	else if(left.data<right.data){
		result=right;
		result.next=Merge_SortedList(left,right.next);			
		}
				
return result;

	}
static Node MergeSort(Node head){
	Node result=null;
	if(head==null || head.next==null){
		return head;
	}

	Node middle=FindMiddle(head);
	System.out.println("middle "+middle.data);
	Node nextofmiddle=middle.next;
	System.out.println("middle next "+nextofmiddle.data);
	middle.next=null;
	Node left=MergeSort(head);
	Node right=MergeSort(nextofmiddle);
	result=Merge_SortedList(left,right);

return result;
}
public static void main(String args[]){
	IB43_LinkedList_mergeSort node=new IB43_LinkedList_mergeSort();
	Node head=new Node(80);
	Node ptr=head;
	ptr.next=new Node(40);
	ptr=ptr.next;
	ptr.next=new Node(30);
	ptr=ptr.next;
	ptr.next=new Node(60);
	ptr=ptr.next;
	ptr.next=new Node(10);
	ptr=ptr.next;
	ptr.next=new Node(100);
	ptr=ptr.next;
	ptr.next=new Node(70);
	Node head1=head;

	Node res=MergeSort(head);
	while(res!=null){
		System.out.print(res.data+" ");
		res=res.next;
	}
}
}
