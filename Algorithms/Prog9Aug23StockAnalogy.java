import java.util.Scanner;
class Prog9Aug23StockAnalogy{
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int[] A=new int[n];
	for(int i=0;i<n;i++){
		A[i]=s.nextInt();
		}
	int l=0;
	int r=1;
	

	int max=A[r]-A[l];
	r++;
	while(r<n){
		if(A[r-1]<A[l]){
			l=r-1;
						
			}
		if(A[r]-A[l]>max){
		max=A[r]-A[l];
		
			}
		r++;
	
	}
r=1;
l=0;
//System.out.println("(r,l) : ("+r+","+l+") = "+A[l]+","+A[r]);
//for printing only
while(r<n){
		if(A[r-1]<A[l]){
			l=r-1;
						
			}
		if(A[r]-A[l]==max){
			System.out.println("(r,l) : ("+l+","+r+") = "+A[l]+","+A[r]);
			}
		r++;
	
	}
System.out.println("max: "+max);
}
}
