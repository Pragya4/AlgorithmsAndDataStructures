/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GP40_MinimumCostRope {
	public static void main (String[] args) {
		//code
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t!=0){
			t--;
		    int res=0;
		    PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		    int n=s.nextInt();
		    for(int i=0;i<n;i++){
		        int x=s.nextInt();
		        pq.add(x);
		    }
		    while(pq.size()>1){
		        int a=pq.poll();
		        int b=pq.poll();
			System.out.println(a+" "+b);
		        pq.add(a+b);
		        res+=(a+b);
		    }
		    System.out.println(res);
		}
	}
}
