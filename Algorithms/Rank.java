import java.util.*;
class Rank{
int kthsmallest(int[] a,int l,int r,int k){
	int pos=0;
	if(k>0 && k<=r-l+1){
		pos=partition(a,l,r);
		if(pos-l==k-1)
			return a[pos];			
		}
		if(pos-l>k-1){
			kthsmallest(a,l,pos-1,k);			
			}
		 return kthsmallest(a, pos+1, r, k-pos+l-1);
		    }
		


void swap(int a,int b){
	int temp=a;
	a=b;
	b=temp;
}
int partition(int[] a,int l,int r){

int x=a[r],i=l;
for(int j=l;j<=r-1;j++){
if(a[j]<=x)
	{
	swap(a[i],a[j]);
	i++;
	
	}

}
swap(a[l],a[r]);
return i;
}


public static void main(String args[])
{
    int[] arr = {12, 3, 5, 7, 4, 19, 26};
    int n = 7, k = 3;
	Rank obj=new Rank();
	System.out.println("Kth smllest"+obj.kthsmallest(arr,0,n-1,k));    
	System.out.println("OUTPUT"+obj.kthsmallest(arr, 0, n-1, k));
 //   return 0;
}
}
