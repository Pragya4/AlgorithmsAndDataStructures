import java.util.*;
class LongestPalindromeSubsequence{
int max(int a,int b){
	if(a>b)
		return a;
	else
		return b;

}
public static void main(String args[]){
	String str;
	LongestPalindromeSubsequence obj=new LongestPalindromeSubsequence();
	Scanner s=new Scanner(System.in);
	str=s.next();
	int n=str.length();
	int[][] table=new int[n][n];
	for(int i=0;i<n;i++){
		table[i][i]=1;}
	for(int i=0;i<n-1;i++){
		if(str.charAt(i)==str.charAt(i+1)){
			table[i][i+1]=2;			
			}
		else if(str.charAt(i)!=str.charAt(i+1)){
			table[i][i+1]=1;				
			}		
		}
	for(int l=2;l<n;l++){
		for(int i=n-3;i>=0;i--){
			int j=i+l;
			System.out.println(i+" ,"+j);
			if(i<n && j<n && str.charAt(i)==str.charAt(j)){
				table[i][j]=2+table[i+1][j-1];				
				}
			else if(i<n && j<n){
				table[i][j]=obj.max(table[i+1][j],table[i][j-1]);					
				}			
		}		
	}
for(int i=0;i<n;i++){
System.out.println();
for(int j=0;j<n;j++){
	System.out.print(table[i][j]+" ");

}
}
StringBuilder strb=new StringBuilder("");
System.out.println("Backtracking of "+ str);
int i=0;
int j=n-1;

	while(i<n && j>=0){
		if(str.charAt(i)==str.charAt(j)){
			strb.append(str.charAt(i));
			System.out.println("added");
			i++;
			j--;			
			}
		else{
			if(i<n-1 && j>0 && table[i+1][j]>table[i][j-1]){
				i++;				
				}
			else if(i<n-1 && j>0 && table[i+1][j]<table[i][j-1]){
				j--;				
				}
			else {
				if(i>=n-1)
					j--;
				else if(j<=0)
					i++;
				else
					j--;				
			}		
		
			}
	
		}		
System.out.println("Palindrome"+strb);
}

}
