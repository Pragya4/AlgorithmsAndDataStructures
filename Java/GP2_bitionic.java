/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GP2_bitionic {
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
		       int max=a[0];
		       for(int i=0;i<n;i++){
		           if(a[i]>max)
		           max=a[i];
		       }
		       System.out.println(max);
		   }
	}
}
