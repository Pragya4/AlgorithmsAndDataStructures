/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GP50_MaximumWindowK {
    static ArrayList<Integer> windowmax(int[] a,int n,int k){
        Deque<Integer> dq=new LinkedList<Integer>();
        ArrayList<Integer> res=new ArrayList<Integer>();
        for(int i=0;i<k;i++){
            //System.out.println(a[i]+" ");
            while(!dq.isEmpty() && a[dq.peekLast()]<a[i]){
               // System.out.println("remove "+a[dq.peekLast()]);
                dq.removeLast();
            }
            dq.add(i);
           // System.out.println("added in deque"+a[i]);
        }
        res.add(a[dq.peek()]);
        //System.out.println("result add "+res.get(0));
        for(int i=k;i<n;i++){
            //System.out.println();
            //System.out.println(a[i]+" ");

            while(!dq.isEmpty() && dq.peekFirst()<=(i-k)){
                dq.removeFirst();
            }
           // System.out.println(a[dq.peekLast()]);
            while(!dq.isEmpty() && a[dq.peekLast()]<a[i]){
                dq.removeLast();
            }
            if(dq.isEmpty())
                res.add(a[i]);
            else
                res.add(a[dq.peek()]);
           // System.out.println("added in res "+res.get(res.size()-1));
            dq.add(i);
            //System.out.println("dequeue added "+a[i]);
        }
        return res;
    }
	public static void main (String[] args) {
		//code
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t!=0){
		    t--;
		    int n=s.nextInt();
		    int k=s.nextInt();
		    int[] a=new int[n];
		    for(int i=0;i<n;i++){
		        a[i]=s.nextInt();
		    }
		    ArrayList<Integer> arr=windowmax(a,n,k);
		    for(int i=0;i<arr.size();i++){
		        System.out.print(arr.get(i)+" ");
		    }
		    System.out.println();
		}
	}
}
