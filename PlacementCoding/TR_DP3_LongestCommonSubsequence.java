import java.util.*;
class TR_DP3_LongestCommonSubsequence{
static String LCS(String A,String B){
	int[][] table=new int[A.length()+1][B.length()+1];
	String res="";
	for(int i=0;i<=A.length();i++){
		table[i][0]=0;
	}
	for(int i=0;i<B.length();i++){
		table[0][i]=0;		
	}
	for(int i=1;i<=A.length();i++){
		for(int j=1;j<=B.length();j++){
				if(A.charAt(i-1)==B.charAt(j-1)){
					table[i][j]=table[i-1][j-1]+1;					
					}
				else{
					table[i][j]=Math.max(table[i-1][j],table[i][j-1]);				
					}			
								
			}			
		}
for(int i=0;i<=A.length();i++){
	for(int j=0;j<=B.length();j++){
		System.out.print(table[i][j]+" ");		
	}
	System.out.println();
}
int i=A.length();
int j=B.length();
while(i>0 && j>0){
	if(table[i][j]==table[i-1][j]){
		i--;				
		}
	else if(table[i][j]==table[i][j-1]){
		j--;			
		}
	else{
		res=res+""+A.charAt(i-1);
		i--;
		j--;		
		}
}
return res;
}
public static void main(String args[]){
	String A="abcdaf";
	String B="acbcf";
	System.out.println(LCS(A,B));
}
}
