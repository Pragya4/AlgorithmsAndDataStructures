import java.util.*;
class Samsung_Cows_MaximizeMinDist{
	static int min=Integer.MAX_VALUE;
	static boolean isFeasible(int[] a,int mid,int n,int k){
		System.out.println();
		//int mid=(low+high)/2;
		int uniformgap=mid;
		int count=1;
		int lastpos=a[0];
		System.out.print("at "+lastpos);
		//int min=Integer.MAX_VALUE;
		for(int i=0;i<n;i++){
			int gap=a[i]-lastpos;
			if(gap>=uniformgap){
				if(gap<min)	
					min=gap;
				lastpos=a[i];
				System.out.print(" "+lastpos);
				count++;
										
				}
		if(count==k)
			return true;			
		}
			
		return false;		
	}
	static int position(int[] a,int n,int low,int high,int k){
		int res=-1;
		while(low<high){
		int mid=(low+high)/2;
		if(isFeasible(a,mid,n,k)){
			res= Math.max(mid,min);
			low=mid+1;
			}	
		else{
			high=mid;
							
			} 	
		}
		return res;	
		}
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();			
			}
		int k=s.nextInt();
		int retval=position(a,n,a[0],a[n-1],k);
		System.out.println("ans "+retval);			
		}
}
