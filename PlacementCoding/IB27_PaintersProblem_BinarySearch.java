import java.util.Scanner;
class IB27_PaintersProblem_BinarySearch{
static int max(int[] a,int n){
	int retval=Integer.MIN_VALUE;
	for(int i=0;i<n;i++){
		if(a[i]>retval)
			retval=a[i];
	}
return retval;
}
static int sum(int[] a,int n){
	int total=0;
	for(int i=0;i<n;i++){
		total+=a[i];		
		}
return total;
}
static int MinimumPaintersReq(int[] a,int n,int max_mean){
	int total=0;
	int num_of_painters=1;
	for(int i=0;i<n;i++){
		total+=a[i];
		if(total>max_mean){
			num_of_painters++;
			total=a[i];			
			}
	}
System.out.println("required"+num_of_painters);
return num_of_painters;
}
static int numberOfPainters(int arr[],int n,int k){
	//grabularity is of one block so even if we have infinite painters so min time required will be of the one block with highest length.
	int lo=max(arr,n);
	//if theres only one worker who paintes all
	int high=sum(arr,n);
	while(lo<high){
	int mid=lo+((high-lo)/2);
	int required_painters=MinimumPaintersReq(arr,n,mid);
	//if required painters are less than what we actually have so some are left spare! we can optimize further, as number of painters incrases ,time or blocks covered by each painters become low, that is determined by mid in our case, so we lower the mid so that more workers can be put to use
	if(required_painters<=k){
		high=mid;
		//to lower mean value		
		}
	if(required_painters>k){
		lo=mid+1;
		//we need to increase mid so needed workers are lowered.		
		}
}
return high;
}
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int k=s.nextInt();
	int[] a=new int[n];
	for(int i=0;i<n;i++){
		a[i]=s.nextInt();
	}
	
	System.out.println(numberOfPainters(a,a.length,k));

}
}
