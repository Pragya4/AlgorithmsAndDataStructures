import java.util.*;
class Dynamic_SubsetSum{
static boolean implementation(int[] set,int n,int x){
	//boolean[][] a=new boolean[x+1][n+1];
	boolean result=subset(set,n,x);	
return result;
}
static boolean subset(int[] set,int n,int x){
	if(x==0)
		return true;
	if(n==0 && x!=0)
		return false;
	if(x<n)
		return subset(set,n-1,x);

			
return subset(set,n-1,x-set[n-1])||subset(set,n-1,x);

}

public static void main(String args[]){
	Scanner s=new Scanner(System.in);	
	System.out.println("Number to check");	
	int x=s.nextInt();
	System.out.println("enter no of elements of subset,consequently the elements ");
	int n=s.nextInt();
	int[] set=new int[n];
	for(int i=0;i<n;i++){
		set[i]=s.nextInt();			
		}
	
	System.out.println(implementation(set,n,x));
	

}

}
