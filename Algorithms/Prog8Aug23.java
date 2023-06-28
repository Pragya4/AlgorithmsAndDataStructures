import java.util.Scanner;
//find minimum difference in array
//sort the array-todo
//element distinctness if difference is 0
class Prog8Aug23{
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	int n;
	n=s.nextInt();
	int[] A=new int[n];
	for(int i=0;i<n;i++){
		A[i]=s.nextInt();
	}
	int min=Math.abs(A[1]-A[0]);
	for(int i=1;i<n;i++){
	if(Math.abs(A[i-1]-A[i])<min){
		min=Math.abs(A[i-1]-A[i]);
	}
}
System.out.println("minimum difference: "+min);

}
}
