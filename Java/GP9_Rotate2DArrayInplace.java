import java.util.Scanner;
class GP9_Rotate2DArrayInplace{
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	int t=s.nextInt();
	while(t!=0){
		t--;
		int n=s.nextInt();
		int[][] arr=new int[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				arr[i][j]=s.nextInt();			
				}			
			}
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.println("swap "+i+","+j+" & "+j+","+(n-1-i));
				int temp=arr[i][j];
				arr[i][j]=arr[j][n-1-i];
				arr[j][n-1-i]=temp;				
				}			
			}
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(arr[i][j]+" ");					
				}
			System.out.println();				
			}
		}



}	
}
