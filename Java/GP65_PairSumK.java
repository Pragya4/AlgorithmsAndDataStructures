import java.util.Scanner;
class GP65_PairSumK{
public static void main(String args[]){
int[] a={2,4,5,7,7,10,12,13};
int i=0;
int j=7;
while(i<j ){
	if(a[i]+a[j]<14){
		i++;		
		}	
	else if(a[i]+a[j]>14){
		j--;			
		}
	else{
		System.out.println(a[i]+" "+a[j]);	
		i++;
		j--;	
		}
}
}
}
