import java.util.*;
class GP_DP2_GoldMine{
static int goldmine(int[][] a,int r,int c){
	int max=Integer.MIN_VALUE;
	int val=0;
	if(r==1 && c==1)
		return a[0][0];
	for(int i=0;i<r;i++){
		val=a[i][0];
		int diagup=i;
		int diagdown=i;
		for(int j=1;j<c;j++){
			//System.out.println(diagup+" val "+diagdown);
			if(diagup>0 && diagdown<r-1){
			//System.out.println("diag");
			val+=Math.max(a[diagup-1][j],a[diagdown+1][j]);
				if(Math.max(a[diagup-1][j],a[diagdown+1][j])==a[diagup-1][j]){
					diagup--;
					diagdown=diagup;
					}
				else{
					diagdown++;
					diagup=diagdown;					
					}
				//System.out.println(val+" : ");
				if(val>max)
					max=val;
			}
			else if(diagup<=0 && diagdown<r){
				//System.out.println("diagdown");
				val+=a[diagdown+1][j];
				diagup=diagdown+1;
				diagdown++;
				//System.out.println(val+" : "+(diagdown)+","+i);
				if(val>max)
					max=val;				
				}
			else if(diagup>0 && diagdown>=r-1){
				//System.out.println("diagup");
				val+=a[diagup-1][j];
				diagup--;
				diagdown=diagup;
				//System.out.println(val+" : "+(diagup)+","+i);	
				if(val>max)
					max=val;				
				}
			
							
			}
		System.out.println("ival "+val);	
		}
return max;
}
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int t=s.nextInt();
while(t!=0){
t--;
int r=s.nextInt();
int c=s.nextInt();
int[][] a=new int[r][c];
for(int i=0;i<r;i++){
	for(int j=0;j<c;j++){
		a[i][j]=s.nextInt();		
		}
}
for(int i=0;i<r;i++){
for(int j=0;j<c;j++){
System.out.print(a[i][j]+" ");
}
System.out.println();
}
System.out.println("result "+goldmine(a,r,c));
}
}
}
