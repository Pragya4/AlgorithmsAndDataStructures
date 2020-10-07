import java.util.*;
class IB14_CircularSortedMinElement{
static int search(int[] A,int low,int high){
	if(low<=high){
		int mid=(low+high)/2;
		if((mid-1)>=0 && (mid+1)<=A.length-1 && A[mid]<A[mid-1] && A[mid]<A[mid+1]){
				return mid;			
			}
		else if(mid-1>=0 && mid+1<=A.length-1 && A[mid]>A[mid-1] && A[mid]>A[mid+1]){
					return mid+1;				
				}
		else{
			search(A,low,mid-1);
			search(A,mid+1,high);				
			}		
		}
	return -1;
}
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int[] a=new int[n];
	for(int i=0;i<n;i++){
		a[i]=s.nextInt();			
		}
	int res=search(a,0,a.length-1);
	System.out.println(res);	
}
}
