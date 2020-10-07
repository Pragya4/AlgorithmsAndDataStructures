import java.util.*;
class Node{
	Node next;
	int data;
	Node(int data){
		this.data=data;		
	}
}
	
class IB422_PalindromeLinkedList{
static Node head;
static Node left;
static Node i;
static Node reverse(Node middle){
	Node cur=middle;
	Node prev=null;
	Node nextn;
	while(cur!=null){
		nextn=cur.next;
		cur.next=prev;
		prev=cur;
		cur=nextn;
		}
System.out.println("reverse second list");
for(i=prev;i!=null;i=i.next){
	System.out.print(i.data+" ");		
	}
return prev;
}
static boolean palindrome(Node head){
	Node slowptr=head;
	Node fastptr=head;
	Node beforeslowptr=head;
	Node i=head;
	int count=0;
	while(i!=null){
		count++;
		i=i.next;			
		}
	while(slowptr.next!=null && fastptr!=null && fastptr.next!=null){
		beforeslowptr=slowptr;
		slowptr=slowptr.next;
		fastptr=fastptr.next.next;		
		}
	System.out.println("count"+count);
	Node head_of_secondlist=null;
	if(count%2==0){
		head_of_secondlist=slowptr;
		beforeslowptr.next=null;		
		}
	else if (count%2==1){
		Node newnode=new Node(slowptr.data);
		newnode.next=slowptr.next;
		head_of_secondlist=newnode;
		slowptr.next=null;
	 }
	System.out.println("first list");
	for(Node k=head;k!=null;k=k.next){
		System.out.print(k.data+" ");		
		}
	System.out.println();
	System.out.println("second list");
	for(Node k=head_of_secondlist;k!=null;k=k.next){
		System.out.print(k.data+" ");		
		}
	System.out.println();
	Node secondhalf=reverse(head_of_secondlist);
	System.out.println();
	Node firsthalf=head;
	while(firsthalf!=null && secondhalf!=null) {
		System.out.println("fisrtlist "+firsthalf.data+" second half "+secondhalf.data);
		if(firsthalf.data!=secondhalf.data){
			System.out.println("unequal "+firsthalf.data);
			return false;			
		}
		firsthalf=firsthalf.next;
		secondhalf=secondhalf.next;			
		}
	System.out.println("slow "+slowptr.data+" prev ofslow "+beforeslowptr.data);
	
return true;
}
public static void main(String args[]){
	IB422_PalindromeLinkedList node=new IB422_PalindromeLinkedList();
	head=new Node(10);
	Node ptr=head;
//	ptr.next=new Node(10);
//	ptr=ptr.next;
	//ptr.next=new Node(30);
	//ptr=ptr.next;
	//ptr.next=new Node(30);
//	ptr=ptr.next;
//	ptr.next=new Node(20);
//	ptr=ptr.next;
	//ptr.next=new Node(10);
	//ptr=ptr.next;
	/*ptr.next=new Node(90);
	ptr=ptr.next;
	ptr.next=new Node(10);*/
	System.out.println(palindrome(head));

}

}
