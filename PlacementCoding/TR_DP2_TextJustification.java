import java.util.*;
class TR_DP2_TextJustification{
static int compute(String[] str,int maxlen){
	int[] wordlen=new int[str.length];
	for(int i=0;i<str.length;i++){
		wordlen[i]=str[i].length();		
	}
	int[][] table=new int[str.length][str.length];
	for (int[] row : table)
            Arrays.fill(row, Integer.MAX_VALUE);
	for(int i=0;i<str.length;i++){
		int fill=0;
		for(int k=i;k<str.length;k++){
			fill+=wordlen[k]+(k-i);
			if(fill<=maxlen){
				table[i][k]=(int)Math.pow((maxlen-fill),2);				
				}		
			}		
		}
int[] mincost=new int[str.length];
int[] breakpt=new int[str.length];
int tracki=0;
//for(int i=str.length-1;i>=0;i--){
	int i=str.length-1;
	for(int j=str.length-1;j>=0;j--){
		if(table[j][i]!=Integer.MAX_VALUE){
			mincost[j]=table[j][i];
			breakpt[j]=str.length-1;			
			}
		else if(table[i][j]==Integer.MAX_VALUE){
			int min=Integer.MAX_VALUE;
			while(table[j][i]==Integer.MAX_VALUE){
				i--;					
				}
			while(j<=i && i>=0){
				if(table[j][i]+mincost[i+1]<min){
					min=table[j][i]+mincost[i+1];
					tracki=i;
					}
				i--;			
				}
			mincost[j]=min;
			breakpt[j]=tracki;
			}
			i=str.length-1;	
		}	
//	}
//for(int i=0;i<str.length;i++){
	for(int j=0;j<str.length;j++){
		System.out.print(mincost[j]+" ");		
		}
System.out.println();
for(int j=0;j<str.length;j++){
		System.out.print(breakpt[j]+" ");		
		}		
//}
return 0;
}
public static void main(String args[]){
	String input="Tushar roy likes to code";
	String[] strarr=input.split(" ");
	int linewidth=10;
	for(int i=0;i<strarr.length;i++){
		System.out.println(strarr[i]+" ");
			}
	compute(strarr,linewidth);
}
}
