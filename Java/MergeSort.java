import java.util.*;
class MergeSort{
static void merge(int[] a,int low,int mid,int high){
	int n1=mid-low+1;
	int n2=high-mid;
	int[] l=new int[n1];
	int[] r=new int[n2];
	for(int i=0;i<n1;i++){
		l[i]=a[low+i];				
		}
	for(int i=0;i<n2;i++){
		r[i]=a[mid+i+1];			
		}
	int i=0,j=0,k=low;
	while(i<n1 && j<n2){
		if(l[i]<=r[j]){	
			a[k]=l[i];
			i++;
			k++;						
			}
		else{
			a[k]=r[j];
			j++;
			k++;				
			}		
		}
	while(i<n1){
		a[k]=l[i];
		i++;
		k++;			
		}
	while(j<n2){
		a[k]=r[j];
		k++;
		j++;			
		}	
	}
static void mergesort(int[] a,int l,int h){
	if(l<h){
		//System.out.println(l+" "+h);
		int m=(l+h)/2;
		mergesort(a,l,m);
		mergesort(a,m+1,h);
		merge(a,l,m,h);			
	}
}
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();	
	int[] a=new int[n];
	for(int i=0;i<n;i++){
		a[i]=s.nextInt();			
		}
	System.out.println("etered");
	mergesort(a,0,n-1);
	for(int i=0;i<n;i++)
		System.out.print(a[i]+" ");	
	}
}
