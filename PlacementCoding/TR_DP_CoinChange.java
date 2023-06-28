import java.util.*;
class TR_DP_CoinChange{
static int denominations(int[] coin,int sum){
	int[] denom=new int[sum+1];
	int[] backtrack=new int[sum+1];
	Arrays.fill(denom,Integer.MAX_VALUE);
	Arrays.fill(backtrack,-1);
	System.out.println();
	for(int i=0;i<=sum;i++){
		System.out.println(denom[i]+" ");			
	}
	System.out.println();

	denom[0]=0;
	for(int j=0;j<coin.length;j++){
		for(int i=1;i<=sum;i++){
			if(i>=coin[j] && denom[i-coin[j]]!=Integer.MAX_VALUE){
				denom[i]=Math.min(denom[i],1+denom[i-coin[j]]);
				if(denom[i]==1+denom[i-coin[j]]){
					backtrack[i]=j;	
					}
				}			
			}
		System.out.print("sum ");
		for(int k=0;k<=sum;k++){
			System.out.print(denom[k]+" ");			
		}
		System.out.println();
		for(int k=0;k<=sum;k++){
			System.out.print(backtrack[k]+" ");			
		}
		System.out.println();
		System.out.println();		
		}
	ArrayList<Integer> denominations=new ArrayList<Integer>();
	int total=sum;	
	while(total>0){
		denominations.add(coin[backtrack[total]]);
		total=total-coin[backtrack[total]];			
		}
for(int i=0;i<denominations.size();i++){
	System.out.print(denominations.get(i)+",");		
	}
return denom[sum];
}
public static void main(String args[]){
	//Scanner s=new Scanner;
	int sum=13;
	int[] coin={7,2,3,6};
	System.out.println("number of coins "+denominations(coin,sum));
}
}
