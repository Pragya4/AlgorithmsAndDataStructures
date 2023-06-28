//A[i]+A[j]==A[k];
import java.util.Scanner;
//ai+aj=ak in O(n2)
//use hashmaps for n
class Prog5Aug23{
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int flag=0;
	int[] A=new int[n];
	 for(int i=0;i<n;i++){
		A[i]=s.nextInt();
		}
	for(int k=0;k<n;k++){
		int X=A[k];
		int l=0;
		int r=n-1;
	while(l<r){
		if(A[l]+A[r]==X){
		flag=1;
		System.out.println("("+l+","+r+")"+":"+A[l]+"+"+A[r]+"="+A[k]);
		l++;r--;				
			}
		else if(A[r]+A[l]<X){
			l++;	
		}	
		else if(A[r]+A[l]>X){
			r--;
		}
	}			
	}
if(flag==0){
	System.out.println("none of the pair is equal to a third element of array");
}
}
}
