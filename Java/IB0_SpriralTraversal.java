import java.util.Scanner;
class IB0_SpriralTraversal{
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int[][] a=new int[n][n];
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			a[i][j]=s.nextInt();		
		}		
	}
	for(int i=0;i<n;i++){
		System.out.println(a[i][n-1]);		
		}
	int top=0;
	int bottom=n-1;
	int L=0;
	int R=n-1;
	while(top<=bottom || L<=R){
		for(int i=L;i<=R;i++){
			System.out.print(a[top][i]+" ");			
			}
		top++;
		for(int i=top;i<=bottom;i++){
			System.out.print(a[i][R]+" ");			
			}
		R--;
		
		for(int i=R;i>=L;i--){
			System.out.print(a[bottom][i]+" ");			
			}
		bottom--;
		for(int i=bottom;i>=top;i--){
			System.out.print(a[i][L]+" ");		
			}
		L++;	
		
		}


}

}
