import java.util.*;
class TR_DP6_EggDrop{
static int EggsFloors(int floors,int eggs){
	int[][] table=new int[eggs+1][floors+1];
	
	//if only one egg then, rials =number of floors
	for(int i=1;i<=floors;i++){
		table[1][i]=i;		
		}
//if floors =1 ,0 then 1 or zero trails for any numbers of eggs
	for(int i=0;i<=eggs;i++){
		table[i][0]=0;
		table[i][1]=1;			
		}
	for(int i=2;i<=eggs;i++){
		//for each egg check all floors
		for(int j=2;j<=floors;j++){
		table[i][j]=Integer.MAX_VALUE;
			for(int x=1;x<j;x++){
				int res=1+Math.max(table[i-1][x-1],table[i][j-x]);
				if(res<table[i][j])
					table[i][j]=res;					
					}		
				}			
		}
for(int i=0;i<=eggs;i++){
for(int j=0;j<=floors;j++){
	System.out.print(table[i][j]+" ");
}
System.out.println();
}
return table[eggs][floors];
}
public static void main(String args[]){
	System.out.println(EggsFloors(6,2));		
	}
}
