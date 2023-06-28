import java.util.*;


class ArrayOfPowerN{
static int[][] MatrixMultiplication(int[][] m1,int[][] m2){
	int[][] m3=new int[m1[0].length][m1[0].length];
	for(int i=0;i<m1[0].length;i++){
		for(int j=0;j<m2[0].length;j++){
			for(int k=0;k<m1[0].length;k++){
				m3[i][j]+=m1[i][k]*m2[k][j];				
				}
		}
	}
System.out.println("flag2");
for(int i=0;i<m1[0].length;i++){
	System.out.println("");
	for(int j=0;j<m1[0].length;j++){
		System.out.print(m3[i][j]+" ");
		}		
	}
System.out.println();
return m3;
}
static int[][] OptimizedPower(int[][] a,int n,int[][] y){
	if(n%2==1){
		System.out.println();
		y=MatrixMultiplication(a,y);
		System.out.println("flag1");
		for(int i=0;i<a[0].length;i++){
			System.out.println();
			for(int j=0;j<a[0].length;j++){
				System.out.print(y[i][j]+" ");				
				}			
			}	
		}
	a=MatrixMultiplication(a,a);
	System.out.println("");
	for(int i=0;i<a[0].length;i++){
		System.out.println();
		for(int j=0;j<a[0].length;j++){
			System.out.print(a[i][j]+" ");			
			}		
		}
	System.out.println("flag4");	
	n=n/2;
return y;
}
public static void main(String args[]){
	int[][] m1=new int[3][3];
	int[][] m2=new int[3][3];
	Scanner s=new Scanner(System.in);
	for(int i=0;i<m1[0].length;i++){
		for(int j=0;j<m1[0].length;j++){
			
				m1[i][j]=s.nextInt();			
				}		
		}
	int power=s.nextInt();
	int[][] y=new int[m1[0].length][m1[0].length];
	for(int i=0;i<m1[0].length;i++){
		for(int j=0;j<m1[0].length;j++){
		if(i==j){
			y[i][j]=1;
			}			
		}
	}
	System.out.println("flag0");
	y=OptimizedPower(m1,power,y);
	System.out.println("FLAGFINAL");
	for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){
			System.out.print(y[i][j]+" ");			
			}
		System.out.println();		
		}

	}

}
