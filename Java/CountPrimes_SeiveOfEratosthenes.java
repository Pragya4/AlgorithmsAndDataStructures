import java.util.*;
class CountPrimes_SeiveOfEratosthenes{
static int eratosthenes(int n){
	boolean[] seive=new boolean[n];
	Arrays.fill(seive,true);
	for(int i=2;i*i<n;i++){
		if(seive[i]==true){
		for(int j=i*2;j<n;j=j+i){
			seive[j]=false;			
				}		
			}
		}
	int count=0;
	for(int i=2;i<n;i++){
		if(seive[i]==true){
			System.out.print(i+" ");
			count++;
			}			
		}
return count;
		
}
	public static void main(String args[]){
		System.out.println(eratosthenes(30));			
		}
}
