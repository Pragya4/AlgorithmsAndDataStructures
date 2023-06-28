/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GP51_SegregateEvenOdd_LL {
    static class Node{
        Node next;
        int data;
        Node(int data){
            this.data=data;
        }
    }
    static Node head;
    static Node insert(Node head,int x){
        Node ptr=head;
        Node newnode=new Node(x);
        if(head==null){
            head=newnode;
		//System.out.println("inserted at head "+x);
		}
        else{
            while(ptr.next!=null){
		
                ptr=ptr.next;
            }
	    //System.out.println("now inserted "+x);
            ptr.next=newnode;
        }
        
        return head;
    }
    static Node segregate(Node head){
        Node even=new Node(0);
        Node odd=new Node(0);
        Node ptr=head;
	System.out.println("segregate: ptr "+ptr.data);
        int oddcount=0;
        Node nodee=even;
	Node nodeo=odd;
        while(ptr!=null){
	    System.out.println("ptr.data "+ptr.data);
            Node newnode=new Node(ptr.data);
            if(newnode.data%2==0){
                even.next=newnode;
		even=even.next;
		}
            else{
                odd.next=newnode;
		odd=odd.next;
                oddcount++;
            }
	ptr=ptr.next;
        }
	System.out.println("odd ct oun "+even.data);
        if(oddcount!=0)
            even.next=nodeo.next;
        return nodee.next;
    } 
	public static void main (String[] args) {
		//code
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t!=0){
		    t--;
		    int n=s.nextInt();
		    while(n>0){
			System.out.println(n);
		        int x=s.nextInt();
		        head=insert(head,x);
		        n--;
		    }
		    head=segregate(head);
		    while(head!=null){
		        System.out.println(head.data+" ");
		        head=head.next;
		    }
		}
		
	}
}
