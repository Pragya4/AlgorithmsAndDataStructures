import java.util.Scanner;
class GP7_AdditionOfSubmatrix{
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	int t=s.nextInt();
	while(t!=0){
		t--;
		int r=s.nextInt();
		int c=s.nextInt();
		int[][] arr=new int[r][c];
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				arr[i][j]=s.nextInt();					
				}			
			}
		int r1=s.nextInt();
		int c1=s.nextInt();
		int r2=s.nextInt();
		int c2=s.nextInt();
		int sum=0;
		for(int i=r1-1;i<=r2-1;i++){
			for(int j=c1-1;j<=c2-1;j++){
				sum+=arr[i][j];	
				}			
			}
		
		System.out.println(sum);	
	}


}

}
