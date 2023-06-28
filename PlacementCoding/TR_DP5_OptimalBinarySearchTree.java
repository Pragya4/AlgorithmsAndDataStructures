import java.util.*;
class TR_DP5_OptimalBinarySearchTree{
static int sum(int[] freq,int s,int e){
	int total=0;
	for(int i=s;i<=e;i++){
		if(i>=freq.length) continue;
		total+=freq[i];
	}
return total;
}	
static int OptimalCost(int[] freq){
	int n=freq.length;
	int[][] table=new int[n+1][n+1];
	for(int i=0;i<n;i++){
		table[i][i]=freq[i];		
		}
	//for(int keys_at_atime=2;keys_at_a)
	for(int L=2;L<=n;L++){
		for(int r=0;r<=n-L+1;r++){
			int c=r+L-1;
			table[r][c]=Integer.MAX_VALUE;
			int cost=0;
			for(int k=r;k<=c;k++){
				/*if(k>r){	
					cost+=table[r][k-1];						
					}
				if(k<c){
					cost+=table[k+1][c];					
					}
				cost+=sum(freq,r,c);
				if(cost<table[r][c])
					table[r][c]=cost;*/
				cost = ((k > r) ? table[r][k - 1] : 0)
                            + ((k < c) ? table[k + 1][c] : 0) + sum(freq, r, c);
                    if (cost < table[r][c])
                        table[r][c] = cost;
				}
							
			 }			
			
	}
return table[0][n-1];
}
public static void main(String args[]){
	int[] keys={10,12,16,21};
	int[] freq={4,2,6,3};
	System.out.println("Final "+OptimalCost(freq));
	}
}
