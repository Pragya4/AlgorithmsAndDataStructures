//find maximum difference of 2 elements in a array
import java.util.Scanner;
class Prog7Aug23{
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int[] A=new int[n];
	for(int i=0;i<n;i++){
	A[i]=s.nextInt();		
	}
	int max=A[0];
	int min=A[0];
	int track_min=0,track_max=0;
	for(int i=0;i<n;i++){
	if(A[i]>max){
		max=A[i];
		track_max=i;
		}
	if(A[i]<min){
		min=A[i];
		track_min=i;
	}
	}
System.out.println("Maximum difference in O(n): "+(max-min)+" at (Min,Max) :("+track_min+","+track_max+")");

}
}
