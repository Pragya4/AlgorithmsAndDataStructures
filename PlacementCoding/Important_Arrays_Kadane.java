/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class Important_Arrays_Kadane {
	public static void main (String[] args) {
		//code
	

	Scanner s=new Scanner(System.in);
	int t=s.nextInt();
	while(t!=0){
		t--;
		int n=s.nextInt();
		int[] a=new int[n];
		int max_el=0;
		
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
			if(i==0){
			    max_el=a[i];
			}
			else if(a[i]>max_el){
			    max_el=a[i];
			
			}
			}
		
		
		int current_sum=0;
		int max_sum=max_el;
		int flag=0;
		
		for(int i=0;i<n;i++){
			current_sum+=a[i];
		    	
			if(current_sum>max_sum){
				max_sum=current_sum;
					
		
				}
			if(current_sum<0){
		        current_sum=0;
			
		    }
					
			}		
		System.out.println(max_sum);
		}

}


}
	
