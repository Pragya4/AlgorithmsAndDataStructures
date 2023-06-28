import java.util.Scanner;
class Prog3Aug23{
	//complexity=O(n)
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int n;
		int flag=0;
		n=s.nextInt();
		int[] A=new int[n];
//needed in sorted order or insert merge  or quick sort of order nlogn
		for(int i=0;i<n;i++){
			A[i]=s.nextInt();
			}
		int r=n-1;
		int l=0;
		System.out.println("enter the number ");
		int X=s.nextInt();
		while(l<r){
			if(A[l]+A[r]==X){
				flag=1;
				System.out.println(l+" "+A[l]);
				System.out.println(r+" "+A[r]);
				l++;
				r--;
				
				}
			else if(A[l]+A[r]<X){
				l++;	
				}
			else if(A[l]+A[r]>X){
				r--;					
				}
		}
	if(flag==0){
		System.out.println("Not found");
		}
	
	}
}
