/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GP17_sort012 {
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
		    	int low=0;
			int mid=0;
			int high=n-1;
			
			while(mid<=high){
	
				if(a[mid]==0 && mid<=high){
					int temp=a[low];
					a[low]=a[mid];
					a[mid]=temp;
					++low;
					++mid;
			
					}
				else if(a[mid]==1 && mid<=high){
					++mid;
								
					}	
				
				else if(mid<=high){
					int temp=a[high];
					a[high]=a[mid];
					a[mid]=temp;				
					--high;
					
					}
						
			}
			for(int i=0;i<n;i++){
				System.out.print(a[i]+" ");				
				}
			System.out.println();
		}
	}
}
