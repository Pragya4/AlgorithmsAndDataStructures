import java.util.*;
class IB47_LongestPalindrominSubstring{
 static String longestPalindrome(String A) {
	int n=A.length();
	boolean[][] table=new boolean[n][n];
	int strlen=1;
	int start=0;
	for(int i=0;i<n;i++){
		table[i][i]=true;			
		}  
	for(int i=0;i<n-1;i++){
		if(A.charAt(i)==A.charAt(i+1));
			table[i][i+1]=true;
		strlen=2;			
		}
	for(int k=3;k<n-1;k++){
		for(int i=0;i<n-k+1;i++){
			int j=i+k-1;
			if(table[i+1][j-1] && A.charAt(i)==A.charAt(j)){
				table[i][j]=true;
				if(k>strlen){
					strlen=k;
					start=i;				
					}				
				}			
			}
		
		}
return A.substring(start,start+strlen);      
    }
public static void main(String args[]){
	String str="tycvddvcjk";
	System.out.println(longestPalindrome(str));
}
}
