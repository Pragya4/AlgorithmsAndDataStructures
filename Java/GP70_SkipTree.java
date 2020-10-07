/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GP70_SkipTree{
    static class Node{
        Node left;
        Node right;
        int data;
        Node(int data){
            this.data=data;
        }
    }
    Node head=null;
    static Node insert(Node head,int x){
        if(head==null){
            head=new Node(x);
            head.left=null;
            head.right=null;
            return head;
        }
        else if(x<=head.data){
            head.left=insert(head.left,x);
        }
        else{
            head.right=insert(head.right,x);
        }
        return head;
    }
    static void print(Node head,int x){
        if(head!=null && head.data==x)
            return;
        if(head!=null)
            System.out.print(head.data+" ");
        if(head!=null && head.left!=null){
            print(head.left,x);
        }
        if(head!=null && head.right!=null){
            print(head.right,x);
        }
    }
	public static void main (String[] args) {
		//code
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
	    Node head=null;
		while(t!=0){
		    t--;
		    int n=s.nextInt();
		    int q=s.nextInt();
		    for(int i=0;i<n;i++){
		        int x=s.nextInt();
		        head=insert(head,x);
		    }
			preorder(head);
		  while(q!=0){
		      q--;
		       int till=s.nextInt();
		       print(head,till);
		  }
		  head=null;
		  System.out.println();
		}
	}
}
