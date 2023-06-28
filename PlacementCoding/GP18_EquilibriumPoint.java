/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GP18_EquilibriumPoint {
	public static void main (String[] args) {
		//code
	Scanner s=new Scanner(System.in);
	int t=s.nextInt();
	int flag=0;
	while(t!=0){
		t--;
		int n=s.nextInt(); 
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();				
			}
		int l=0;
		int r=n-1;
		int suml=a[0];
		int sumr=a[r];
		int point=-1;
		if(n==1){
		      
		        System.out.println("1");
		        flag=1;
		       
		    }
		while(l<r){
		    
			if(suml<sumr){
					l++;
					suml+=a[l];
						
												
				}
			if(suml>sumr){
					r--;					
					sumr+=a[r];
										
					}
			if(suml==sumr && r-l !=2 && n>1){
				flag=0;	
				l=r;				
				}
			if(suml==sumr && r-l==2){
				System.out.println(l+2);
				l=r;	
				flag=1;			
				}
			
				}
			if(flag==0)
				System.out.println("-1");			
			}		
	}
}
