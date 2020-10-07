import java.util.*;
class GP38_HEAP_KLargestElements{
static void swap(int[] a,int i,int j){
int temp=a[i];
a[i]=a[j];
a[j]=temp;

}
static int[] deletion(int[] k){
	int n=k.length;
	while(n>0){
	swap(k,0,--n);
	//System.out.println(k[n]);
	TopDownHeapify(k,n);
	}
return k;
}
static void TopDownHeapify(int[] k,int n){
		int i=0;
		if(n==2){
			if(k[0]>k[1]){
				swap(k,0,1);					
				}			
			}
		while((2*i+2)<n){
			int left=2*i+1;
			int right=2*i+2;
			int smaller=(k[left]<k[right])?left:right;
			if(k[i]>k[smaller]){
				swap(k,i,smaller);				
			}
			else{
				break;				
			}
				i=smaller;					
			}		
}
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	int t=s.nextInt();
	while(t!=0){
		t--;
		int n=s.nextInt();
		int k=s.nextInt();
		int[] a=new int[n];
		int[] klargest=new int[k];
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();		
			}
		for(int i=0;i<a.length;i++){
			if(i<k){
				klargest[i]=a[i];
				}
			if(i==k-1)
				TopDownHeapify(klargest,k);						
			if(i>=k){
				if(a[i]>klargest[0]){
					klargest[0]=a[i];
					TopDownHeapify(klargest,k);		
					}							
				}			
			}
		int[] res=deletion(klargest);
		for(int i=0;i<res.length;i++){
			System.out.print(res[i]+" ");				
		}		
		}

}
}
