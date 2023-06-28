/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;
/*class customcomp implements Comparator<Integer>{
    public int compare(Integer x,Integer y){
        if(x<y)
            return -1;
        else if(x>y)
            return 1;
        return 0;
    }
}*/
class GP59_KthSmallest_PQ {
    
    static int minheap(int[] a,int k){
        PriorityQueue<Integer> pq=new PriorityQueue<>(k,Collections.reverseOrder());
        for(int i=0;i<a.length;i++){
            System.out.println("at "+a[i]+" : "+pq.size());
            if(pq.isEmpty()){
                System.out.println("empty pq ");
                pq.add(a[i]);
            }
            else{
                if(pq.size()==k && pq.peek()>a[i]){
                    System.out.println(" removing "+pq.peek());
                    pq.poll();
                    System.out.println(" adding "+a[i]);
                    pq.add(a[i]);
                }
		else if(pq.size()<k){
			pq.add(a[i]);			
			}
            }
        }
        return pq.peek();
    }
		public static void main (String[] args) {
		//code
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t!=0){
		    t--;
		    int n=s.nextInt();
		    
		    int[] a=new int[n];
		    for(int i=0;i<n;i++){
		        a[i]=s.nextInt();
		    }
		    int k=s.nextInt();
		    int kthmin=minheap(a,k);
		    System.out.println(kthmin);
		}
	}
}
