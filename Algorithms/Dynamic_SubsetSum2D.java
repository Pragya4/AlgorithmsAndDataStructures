import java.util.*;
class Dynamic_SubsetSum2D{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int[] set=new int[n];
for(int i=0;i<n;i++){
		set[i]=s.nextInt();	
}
System.out.println("Enter sum");
int sum=s.nextInt();
boolean[][] table=new boolean[sum+1][n+1];
for(int i=0;i<=sum;i++){
		table[i][0]=false;	//first fill the rows		
	}

for(int j=0;j<=n;j++){
	//then fill the columns
		table[0][j]=true;		
		
	}

for(int i=1;i<=sum;i++){
for(int j=1;j<=n;j++){
	
	if(i<set[j-1]){
		table[i][j]=table[i][j-1];			
		}
	
	else{
			//either include or exclude the table value
		table[i][j]=(table[i-set[j-1]][j-1]) || (table[i][j-1]);			
		}

}

}
/*PRINT THE TABLE
for(int i=0;i<=sum;i++){
System.out.println(i+" ");
	for(int j=0;j<=n;j++){
		System.out.print(table[i][j]+"    ");
	}
//System.out.println();
}*/
System.out.println(table[sum][n]);
}
}
