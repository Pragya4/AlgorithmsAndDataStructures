import java.util.*;
class Node{
	Node next;
	int data;
	Node(int data){
		this.data=data;		
	}
}
	
class IB42_PalindromeLinkedList{
static Node head;
static Node left;
static boolean palindromeUtil(Node right){
	left=head;
	if(right==null)
		return true;
	boolean fwd=palindromeUtil(right.next);
	if(fwd==false)
		return false;
	boolean cmp_withleft=false;
	if((left.data)==(right.data)){
		cmp_withleft=true;			
		}
	left=left.next;
return cmp_withleft;	

}
static boolean palindrome(Node head){
	return palindromeUtil(head); 
}
public static void main(String args[]){
	IB42_PalindromeLinkedList node=new IB42_PalindromeLinkedList();
	head=new Node(10);
	Node ptr=head;
	ptr.next=new Node(20);
	ptr=ptr.next;
	ptr.next=new Node(10);
	//ptr=ptr.next;
	/*ptr.next=new Node(40);
	ptr=ptr.next;
	ptr.next=new Node(30);
	ptr=ptr.next;
	ptr.next=new Node(90);
	ptr=ptr.next;
	ptr.next=new Node(10);*/
	System.out.println(palindrome(head));

}

}
