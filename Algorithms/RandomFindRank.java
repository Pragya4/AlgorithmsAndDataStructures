import java.util.*;
class RandomFindRank{

static int FindRank(int[] A,int l,int r,int rank){
	int k=0;
	int n=r;
	if(l<r){   
		System.out.println("flag0"+l+r);
		int pvt=RandomPivot(A,l,r);
		System.out.println("element: "+A[pvt]+" index "+pvt);
		k=Partition(A,l,r,pvt);
		System.out.println("K: "+k);
		if(rank==r-k+1){
			System.out.println("yaaaaaaaaasssssss");
			System.out.println("thi is it"+A[k]);
			return A[k];			
			}
		else if(rank>(r-k+1)){
			System.out.println("rank greater"+(rank-(r-k+1)));
			FindRank(A,l,k-1,rank-(r-k+1));
		}
		else {System.out.println("rank smaller");
			FindRank(A,k+1,r,rank);			
			}

		}
	else{
		System.out.println("inside if");
		System.out.println("K in else"+k+"A"+A[k]);
	}
return 0;
}
static int RandomPivot(int[] A,int low,int high){
	System.out.println("in random");
	Random r=new Random();
	int rp=r.nextInt(high-1)+low;
	System.out.println("Random pivot: "+rp);
	int temp;
	temp=A[low];
	A[low]=A[rp];
	A[rp]=temp;
	return low;
}
static int Partition(int[] A,int l,int r,int p){
	int low=l+1;
	int high=r;
	while(low<=high){
	while(A[low]<A[p] && low<=high){
		low++;
		}
	while(A[high]>A[p] && low<=high){
		high--;
		}
	if(low<high){
		int temp;
		temp=A[low];
		A[low]=A[high];
		A[high]=temp;
		low++;
		high--;
		}
}
int temp;
temp=A[p];
A[p]=A[low-1];
A[low-1]=temp;
for(int i=l;i<=r;i++){
System.out.println(A[i]);
}
return (low-1);
}
public static void main(String args[]){
	int[] A={4,5,3,2,9,1};
	int[] B={4,5,3,2,9,1};
	int n=5;
	int r=6;
	System.out.println("Lets begin");
	int f=FindRank(A,0,n,r);
	System.out.println("final main"+f);
}
}
