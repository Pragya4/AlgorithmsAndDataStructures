import java.util.*;
class Dynamic01Knapsack{
int max(int a,int b ){
if(a>b)
	return a;
else
	return b;
}

public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	int n;
	Dynamic01Knapsack obj=new Dynamic01Knapsack();
	n=s.nextInt();
	int[] w=new int[n];
	int[] p=new int[n];
	
	for(int i=0;i<n;i++){
		w[i]=s.nextInt();
		p[i]=s.nextInt();		
		}
	System.out.println("Max accomodation");
	int Weight=s.nextInt();
	int[][] table=new int[n+1][Weight+1];
	for(int i=0;i<n+1;i++){
		table[i][0]=0;		
		}
	for(int j=0;j<Weight+1;j++){
		table[0][j]=0;
				
	}
	for(int i=1;i<=n;i++){
		for(int j=1;j<=Weight;j++){
			
			if(j>0 && i>0){
				if(j<w[i-1]){
					System.out.println(i+" ,"+j);
					table[i][j]=table[i-1][j];					
					}
				else if(j>=w[i-1]){
					table[i][j]=obj.max(table[i-1][j],(p[i-1]+table[i-1][j-w[i-1]]));					
					}
							
				}

		
				
		}
	}
for(int j=0;j<Weight+1;j++){
System.out.print(j+" ");
}

for(int i=0;i<n+1;i++){
System.out.println();
	for(int j=0;j<Weight+1;j++){
		System.out.print(table[i][j]+" ");		
		}		
	}
int j=n;
System.out.println("here");
while(Weight>0 && n>0){
	if(table[n][Weight]!=table[n-1][Weight]){
		System.out.println("no:"+w[n-1]);
		Weight=Weight-w[n-1];	
		n=n-1;	
		}
	else {
		//System.out.println("match"+w[n-2]);
		n=n-1;
		//Weight=Weight-w[n-1];
			
	}

}		

}

}
