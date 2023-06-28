import java.util.Scanner;
class Prog12Aug23{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] A=new int[n];
		for(int i=0;i<n;i++){
			A[i]=s.nextInt();
			}
		int sum=0;
		int max=0;
		int lower_bound=0;
		int upper_bound=0;
		for(int i=0;i<n;i++){
		if(sum<0){
			sum=0;
			lower_bound=i;
			}
		sum=sum+A[i];
		if(sum>max){
			max=sum;
			upper_bound=i;
			}
		}
System.out.println("Max"+max);
for(int i=0;i<n;i++){
if(i==lower_bound || i==upper_bound+1){
System.out.print(" || ");
}
System.out.print(A[i]+" ");
}
}

}
