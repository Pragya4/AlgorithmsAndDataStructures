/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GP66_DecodeString {
    static int countways(String str,int n){
        if(str.charAt(0)=='0')
            return 0;
        if(n==0||n==1){
            
            return 1;
        }
        int count=0;
        
        if(str.charAt(n-1)>'0')
            count=countways(str,n-1);
        if(str.charAt(n-2)=='1' ||(str.charAt(n-2)=='2'&&str.charAt(n-1)<'7'))
            count+=countways(str,n-2);
        
    return count;
        
    }
	public static void main (String[] args) {
		//code
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t!=0){
		    t--;
		    int n=s.nextInt();
		    String str=s.next();
		    
		    System.out.println(countways(str,n));
		}
	}
}
