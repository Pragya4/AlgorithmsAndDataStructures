import java.util.Scanner;
class LongestCommonSubsequence{
int max(int a,int b){
	if(a>b)
		return a;
	else 
		return b;	
	}
public static void main(String args[]){
	String s1;
	String s2;
	LongestCommonSubsequence obj=new LongestCommonSubsequence();
	Scanner s=new Scanner(System.in);
	s1=s.next();
	s2=s.next();
	int n1=s1.length();
	int n2=s2.length();
	int[][] table=new int[n2+1][n1+1];
	for(int i=0;i<=n2;i++){
		table[i][0]=0;		
		}
	for(int j=0;j<=n1;j++){
		table[0][j]=0;		
		}
	
	for(int i=1;i<=n2;i++){
		for(int j=1;j<=n1;j++){
			if(s1.charAt(i-1)==s2.charAt(j-1)){
				table[i][j]=1+table[i-1][j-1];			
			}
			else{
				table[i][j]=obj.max(table[i-1][j],table[i][j-1]);					
				}	

			}
		}
	int k=1;
	/*for(int j=0;j<n1;j++)
		System.out.print(s1.charAt(j)+" ");*/
	for(int i=0;i<=n2;i++){
		System.out.println();
		//k++;
		for(int j=0;j<=n1;j++){
			System.out.print(table[i][j]+" ");			
			}			
		}
		
System.out.println("Backtracking");
StringBuilder str=new StringBuilder("");

int i=n2;
int j=n1;

	//int turn=0;
	while(i>0 && j>0){
		if(s1.charAt(i-1)==s2.charAt(j-1) ){
			System.out.println("equal"+i+" , " +j);
			str.append(s1.charAt(i-1));
			i--;		
			j--;	
			}
		else if(s1.charAt(i-1)!=s2.charAt(j-1)){
			
			if(table[i-1][j]>table[i][j-1]){
				i--;					
				}
			else{
				j--;			
				}			
			}
		
	}


System.out.println("Longest Common Subsequence:"+str.reverse());
	}

}
