import java.util.*;
class KLargestheap{
	void minheap(int[] a,int k){
		//int i=k-1;
		//obviously this gives us an outputof the heap formed and wont give the sorted output,to get the sorted output apply the reheapify while deleting the root elements one by one
		for(int j=0;j<k;j++){
			int p=(j-1)/2;
			//int i=j-1;
			while(j>0 && a[p]>a[j]){
				
				if(a[j]<=a[p]){
				int temp=a[j];
				a[j]=a[p];
				a[p]=temp;}
				j=p;
				p= (j-1)/2;				
			}
			}			
				
		}
void insert(int[] a,int k,int x){
	if(x>a[0]){
		a[0]=x;				
		}
	minheap(a,k);
}
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	KLargestheap obj=new KLargestheap();
	int n=s.nextInt();
	int[] a=new int[n];
	for(int i=0;i<n;i++){
		a[i]=s.nextInt();			
		}
	System.out.println("Enter k:");
	int k=s.nextInt();
	obj.minheap(a,k);
	System.out.println("bottom up heapify till k so that minheap of top k elements of array is formed");
	for(int i=0;i<k;i++){
		System.out.println(a[i]);		
		}
	for(int i=k;i<n;i++){
		obj.insert(a,k,a[i]);			
	}
	System.out.println("largest "+k+" elements are");
	for(int i=0;i<k;i++){
		System.out.println(a[i]);		
		}



}

}
