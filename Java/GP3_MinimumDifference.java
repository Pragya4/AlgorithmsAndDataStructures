import java.util.Scanner;
import java.util.*;
class GP3_MinimumDifference{
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	int t=s.nextInt();
	while(t!=0){
		t--;
		int n=s.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();			
			}
		
		Arrays.sort(a);
		String str=Arrays.toString(a);
		StringBuilder str1=new StringBuilder(str);
		str1.deleteCharAt(0);
		str1.deleteCharAt(str1.length()-1);
		String strarr[]=str1.toString().split(", ");
		int[] result=new int[n];
		for(int i=0;i<n;i++){
			result[i]=Integer.parseInt(strarr[i]);
			//System.out.println(result[i]);			
			}
		int min=Math.abs(a[1]-a[0]);
		for(int i=0;i<n-1;i++){
			if(Math.abs(a[i]-a[i+1])<min){
					min=Math.abs(a[i]-a[i+1]);					
					}			
			}
System.out.println(min);
}
}	
}
