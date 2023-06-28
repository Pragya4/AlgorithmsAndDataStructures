import java.util.Scanner;
class MinHeapArray1{
void BottomupHeapify(int[] a,int i){
	int p=(i-1)/2;
	while(i>0 && a[p]>a[i]){
		int tracki=i;
		System.out.println("Swapping "+a[i]+" "+a[p]);
		int temp=a[i];
		a[i]=a[p];
		a[p]=temp;
		i=p;
		p=(i-1)/2;		
		}		
		
}
public static void main(String args[]){
	MinHeapArray1 obj=new MinHeapArray1();
	Scanner s=new Scanner(System.in);
	int n;
	n=s.nextInt();
	int[] a=new int[n];
	for(int i=0;i<n;i++){
		a[i]=s.nextInt();
		}
	for(int i=0;i<n;i++){
		obj.BottomupHeapify(a,i);	
		}
	System.out.println("OUTPUT");
	for(int i=0;i<n;i++){
		System.out.print(a[i]+" ");		
		}		
			
	}
}
