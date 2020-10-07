import java.util.Scanner;
class GP6_NumberofPaths{
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	int t=s.nextInt();	
	while(t!=0){
		t--;
		int r=s.nextInt();
		int c=s.nextInt();
		int[][] table=new int[r][c];
		table[0][0]=1;
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
			if(i!=0 || j!=0){
				if(i==0){
					table[i][j]=table[i][j-1];						
					}
				if(j==0){
					table[i][j]=table[i-1][j];						
					}
				else if(i>0 && j>0){
					table[i][j]=table[i-1][j]+table[i][j-1];					
					}			
				}			
					
				}	
			}
		/*for(int i=0;i<r;i++){
			System.out.println("");
			for(int j=0;j<c;j++){
				System.out.print(table[i][j]+" ");				
				}			
			}*/
	System.out.println(table[r-1][c-1]);

}


}

}
