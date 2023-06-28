import java.util.Scanner;
class Prog1Aug23{
//A[i]+A[j]=X,X might not be from the collection given
//complexity=O(n^2)
public static void main(String args[]){
	int n;
	Scanner s=new Scanner(System.in);	
	n=s.nextInt();	
	int[] A=new int[n];
	for(int i=0;i<n;i++){
		A[i]=s.nextInt();
		}
	int X=s.nextInt();
	for(int i=0;i<n;i++){
		for(int j=i+1;j<n;j++){
			if(A[i]+A[j]==X){
				System.out.println(i+" : "+A[i]);
				System.out.println(j+" : "+A[j]);
					}		
				}
			}

	}	
}
