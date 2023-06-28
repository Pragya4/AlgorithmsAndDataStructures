import java.util.Random;
import java.util.Scanner;
public class QuickSortAlgo {
	
	static int Partition(int[] A,int low,int high){
		int pivot=low;
		int lptr=low+1;
		int rptr=high;
		int temp;
		while(lptr<=rptr){
			
			while(lptr<=rptr && A[lptr]<= A[pivot]){
				lptr++;
			
			}
			while( lptr<=rptr && A[rptr]>A[pivot]){
				rptr--;
			
			}
			
			if(lptr<rptr){
			temp=A[lptr];
			A[lptr]=A[rptr];
			A[rptr]=temp;
			lptr++;
			rptr--;
				}
			
		}
		
		temp=A[pivot];
		A[pivot]=A[lptr-1];
		A[lptr-1]=temp;
			
		
		for(int i=0;i<=high;i++){
			System.out.print(A[i]+" ");
		}
		
		return (lptr-1);
	}
	static void QuickSort(int[] A,int low,int high){
		//int n=high;
		
		
		if(low<high){
			
			int p=Partition(A,low,high);
			System.out.println("low and high"+low+high);
			System.out.println("low and pivot-1"+low+(p-1));
			QuickSort(A,low,(p-1));
			System.out.println("2nd QS");
			QuickSort(A,(p+1),high);
		}
		
	}
	
	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		
		int[] A=new int[n];
		int low=0;
		int high=n-1;
		for(int i=0;i<n;i++){
			A[i]=s.nextInt();}
		QuickSort(A,low,high);
		for(int i=0;i<=high;i++){
			System.out.println(A[i]);
		}
		s.close();
		
		
	}

}
