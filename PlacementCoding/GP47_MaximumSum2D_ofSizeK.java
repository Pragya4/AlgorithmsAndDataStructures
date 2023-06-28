import java.util.*;
class GP47_MaximumSum2D_ofSizeK{
static void calculate(int[][] mat,int k){
	int r=mat.length;
	int c=mat[0].length;
	//int[] strip=new int[c];
	int[][] mem=new int[r-1][c];
	System.out.println("mem size "+(r-k+1)+" "+c);
	for(int j=0;j<c;j++){
		int strip=0;
		for(int i=0;i<k;i++){
			strip+=mat[i][j];			
			}
		mem[0][j]=strip;		
		}
	int p=0;
	for(int j=0;j<c;j++){
		for(int i=1;i<r-k;i++){
			System.out.println(i+" "+j+" "+p );
			System.out.println("memp-1j "+mem[i][j]);
			System.out.println("matpk-1j "+mat[i+k-1][j]);
			mem[p+1][j]=mem[i][j]-mat[i][j]+mat[i+k-1][j];
			System.out.println("mempj "+mem[i][j]);				
			}
		p++;			
		}
	for(int i=0;i<r-k;i++){
		for(int j=0;j<c;j++){
			System.out.print(mem[i][j]+" ");			
			}		
		System.out.println();
		}
}
public static void main(String args[]){
	int[][] mat={{1,1,1,1,1},{2,2,2,2,2},{3,3,3,3,3},{4,4,4,4,4},{5,5,5,5,5}};
	
	calculate(mat,3);
}
}
