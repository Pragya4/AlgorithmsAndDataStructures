/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GP60_PrintPatternrecur {
    static void recur(int n,int k,int flag){
        System.out.print(k+" ");
        if(n==k && flag==0)
            return;
        else{
            if(k-5>0 && flag==1){
                recur(n,k-5,1);
            }
            else if(k-5<=0 && flag==1)
                recur(n,k-5,0);
            else if(k+5>0 && flag==0)
                recur(n,k+5,0);
        }
    }
	public static void main (String[] args) {
		//code
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t!=0){
		    t--;
		    int n=s.nextInt();
		    System.out.print(n+" ");
		    recur(n,n-5,1);
		
		    System.out.println();
		}
		
	}
}
