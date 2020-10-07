import java.util.*;
class TR_DP11_StockMaxProfit_Ktransaction{
static int dp(int[] arr,int k){
	int[][] table=new int[k+1][arr.length];
	for(int i=0;i<arr.length;i++){
		table[0][i]=0;		
			}
	for(int i=0;i<=k;i++){
		table[i][0]=0;	
	}
	for(int i=1;i<=k;i++){
		for(int j=1;j<arr.length;j++){
				int max=Integer.MIN_VALUE;
				for(int m=0;m<j;m++){
					int daymj=arr[j]-arr[m]+table[i-1][m];
					if(daymj>max){
						max=daymj;							
						}
				}
			table[i][j]=Math.max(table[i][j-1],max);		
			}			
		}
for(int i=0;i<=k;i++){
for(int j=0;j<arr.length;j++){
	System.out.print(table[i][j]+" ");
}
System.out.println();
}
return table[k][arr.length-1];
}
public static void main(String args[]){
	int[] arr={2,5,7,1,4,3,1,3};
	int k=3;
	System.out.println(dp(arr,k));

}
}
