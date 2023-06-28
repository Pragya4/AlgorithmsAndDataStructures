import java.util.*;
class Leet_DP_MinimumNumberofSquaresforN{
static int count(int n){
int[] dp=new int[n+1];
dp[0]=0;
if(n>0)
dp[1]=1;
if(n>2)
dp[2]=2;
if(n>3)
dp[3]=3;
for(int i=4;i<=n;i++){
dp[i]=i;
for(int k=1;k<i;k++){
	int temp=k*k;
	if(temp>i)
		break;
	else{
		dp[i]=Math.min(dp[i],1+dp[i-temp]);
	}	
}

}
return dp[n];
}
public static void main(String args[]){
	System.out.println(count(9));
}

}
