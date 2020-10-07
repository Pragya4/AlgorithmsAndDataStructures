import java.util.*;
class TR_DP4_MatrixChainMultiplication{
static int MatrixMultiplication(int[] a){
	int[][] table=new int[a.length][a.length];
	for(int i=1;i<a.length;i++){
		table[i][i]=0;		
		}
	for(int i=2;i<a.length;i++){
		for(int j=1;j<a.length-i+1;j++){
			int k=j+i-1;	
			if(k==a.length) continue;
			table[i][j]=Integer.MAX_VALUE;
			for(int l=j;l<=k-1;l++){
				int cost=table[j][l]+table[l+1][k]+a[j-1]*a[l]*a[k];
				System.out.println(cost+" "+j+","+l);	
				if(cost<table[i][j])
					table[i][j]=cost;			
				}		
			}		
		}
for(int i=0;i<a.length;i++){
for(int j=0;j<a.length;j++){
	System.out.print(table[i][j]+" ");
}
System.out.println();
}
return table[1][a.length-1];
}
public static void main(String args[]){
	int[] arr={1,2,3,4};
	System.out.println(MatrixMultiplication(arr));
}

}	
