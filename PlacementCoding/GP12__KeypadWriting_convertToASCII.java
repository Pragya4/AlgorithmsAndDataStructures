/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GP12__KeypadWriting_convertToASCII {
	public static void main (String[] args) {
		//code
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t!=0){
		    t--;
		    String str=s.next();
		    int[] res=new int[str.length()];
		    int[] assign={2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,7,8,8,8,9,9,9,9};
		    for(int i=0;i<str.length();i++){
		        res[i]=assign[(((int)str.charAt(i))%97)];
		    }
		    for(int i=0;i<str.length();i++){
		        System.out.print(res[i]);
		    }
		    System.out.println();
		}
	}
}
