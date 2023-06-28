import java.util.Scanner;
class DPCoinChange{
int min(int a,int b){
if(a<b)
	return a;
else
	return b;

}
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	DPCoinChange obj=new DPCoinChange();
	int deno_index,amount;
	System.out.println("enter number of denominations");
	deno_index=s.nextInt();
	System.out.println("enter amount+1");
	amount=s.nextInt();
	int[][] table=new int[amount+1][deno_index+1];
	for(int j=1;j<=deno_index;j++){
		table[0][j]=s.nextInt();
	
		}
	for(int i=1;i<=amount;i++){
		table[i][0]=i-1;			//showing the amount 
			}
	for(int i=1;i<=amount;i++){
		for(int j=1;j<=deno_index;j++){
			if(i==1){
				
				table[1][j]=0;
				//System.out.println("flag1 "+i+" "+j);		//setting 0 denomintions for 0 amount
				}
			else if(j==1 && i!=1){
				table[i][1]=i-1;
				//System.out.println("flag2 "+i+" "+j);		//no of 1's=amount
				}
			else if(i!=1 && j!=1){
				if((i-1)>=table[0][j]){
					int x=table[i-table[0][j]][j];
					//System.out.println("here"+i+","+j+":"+x);
					table[i][j]=obj.min(table[i][j-1],x+1);
				//	System.out.println(table[i][j])	;				
				}
				else{
					table[i][j]=table[i][j-1];
				}
			}
				
				
		}		
				
	}
for(int i=0;i<amount+1;i++){
		System.out.println();
		for(int j=0;j<deno_index+1;j++){
			System.out.print(table[i][j]+"      ");
			
				
				
		}		
				
	}
System.out.println();
System.out.println("denominations for "+(amount-1));
int i=amount;
int j=deno_index;
//shows which denominations are used,backtracking
while(i>0 && j>0){
if(table[i][j]==table[i][j-1]){
	//System.out.println("Moving from "+i+j);
	j--;
	if(j==1){
		for(int k=0;k<table[i][j];k++){
			System.out.println(table[0][j]);}
}		
}
else{
System.out.println(table[0][j]);
i=i-table[0][j];
//System.out.println("new amount"+i+j);
}
}
}
}
