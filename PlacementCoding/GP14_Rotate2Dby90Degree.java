import java.util.Scanner;
class GP14_Rotate2Dby90Degree{
static int[][] transpose_inplace(int[][] a){
	for(int i=0;i<a.length;i++){	
		for(int j=i;j<a.length;j++){
			int temp=a[j][i];	
			a[j][i]=a[i][j];
			a[i][j]=temp;		
			}			
	}
return a;	
		
}
static int[][] reverse_for_rotation(int[][] a){
	int n=a.length;
	for(int i=0;i<n;i++){
		for(int j=0;j<n/2;j++){
			int temp=a[i][j];
			a[i][j]=a[i][n-j-1];
			a[i][n-j-1]=temp;
			}		
		}
return a;
}

public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	int t=s.nextInt();
	while(t!=0){
		t--;
		int n=s.nextInt();
		int[][] a=new int[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				a[i][j]=s.nextInt();				
				}
			}
		a=transpose_inplace(a);
		/*System.out.println("after transpose");
		for(int i=0;i<n;i++){
			System.out.println();
			for(int j=0;j<n;j++){
				System.out.print(a[i][j]+" ");				
				}			
			}*/
		a=reverse_for_rotation(a);
		//System.out.println("Final after reverse");
		for(int i=0;i<n;i++){
			//System.out.println();
			for(int j=0;j<n;j++){
				System.out.print(a[i][j]+" ");				
				}			
			}	
System.out.println();
		}


}

}
