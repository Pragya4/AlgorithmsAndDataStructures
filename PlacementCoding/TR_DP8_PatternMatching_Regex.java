import java.util.*;
class TR_DP8_PatternMatching_Regex{
static boolean dp(String str,String pattern){
	boolean[][] table=new boolean[str.length()+1][pattern.length()+1];
	for(int i=0;i<=str.length();i++){
		table[i][0]=false;			
		}
	for(int i=0;i<=pattern.length();i++){
		table[0][i]=false;			
		}
	System.out.println("dimensions  "+table.length+","+table[0].length);
	table[0][0]=true;
	for(int i=1;i<str.length()+1;i++){		//j row patternptr
		for(int j=1;j<pattern.length()+1;j++){		//i column string ptr
			System.out.println((i-1)+" "+str.charAt(i-1)+" "+(j-1)+" "+pattern.charAt(j-1));
			if(str.charAt(i-1)==pattern.charAt(j-1)){
				table[i][j]=table[i-1][j-1];
				System.out.print(table[i-1][j-1]);				
				}
			else if(pattern.charAt(j-1)=='*'){
				if((j-3)>=0 && str.charAt(i-1)==pattern.charAt(j-3)){	//zero occ
					//System.out.println((i-2)+" "+pattern.charAt(i-2)+" zero occ in "+(j-1)+" "+str.charAt(j-1));
					table[i][j]=table[i][j-2];
					System.out.print("z "+table[i][j-2]);					
					}
				else if((j-2)>=0 && str.charAt(i-1)==pattern.charAt(j-2)){
					//System.out.println((i-3)+" "+pattern.charAt(i-3)+" repeated "+(j-1)+" "+str.charAt(j-1));
					table[i][j]=table[i-1][j];	
					System.out.print("m "+table[i-1][j]);				
					}
				}
			else if(pattern.charAt(j-1)=='.'){
				//System.out.println((i-1)+" "+pattern.charAt(i-1)+" dot "+(j-1)+" "+str.charAt(j-1));
				table[i][j]=table[i-1][j-1];		
				System.out.print(table[i-1][j-1]);			
				}
			else if(pattern.charAt(j-1)!=str.charAt(i-1)){
				//System.out.println((i-1)+" "+pattern.charAt(i-1)+" doesnt match "+(j-1)+" "+str.charAt(j-1));
				table[i][j]=false;		
				System.out.print("false");		
			}
		System.out.println();
			}
		}
	for(int i=0;i<=str.length();i++){
		for(int j=0;j<=pattern.length();j++){
			if(table[i][j]==true){
				System.out.print("T ");					
				}				
			else if(table[i][j]==false){
				System.out.print("F ");					
				}				

			}
	System.out.println();		
	}
return table[str.length()][pattern.length()];
}
public static void main(String args[]){
		dp("aaa","*");		
	}
}
