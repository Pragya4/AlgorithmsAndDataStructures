import java.util.*;
class AtmostK_1s_in_LargestSubmatrix{
static void SubmatrixDP(int[][] a,int n,int k){
	int[][] fullmatrix_maxcount=new int[n+1][n+1];
	for(int i=0;i<=n;i++){
		for(int j=0;j<=n;j++){
			if(i==0||j==0){
				fullmatrix_maxcount[0][0]=0;				
				}
			else if(a[i-1][j-1]==1){
				fullmatrix_maxcount[i][j]=1+fullmatrix_maxcount[i-1][j]+fullmatrix_maxcount[i][j-1]-fullmatrix_maxcount[i-1][j-1];				
				
				}
			else if(a[i-1][j-1]==0){
				fullmatrix_maxcount[i][j]=fullmatrix_maxcount[i-1][j]+fullmatrix_maxcount[i][j-1]-fullmatrix_maxcount[i-1][j-1];				
				}		
			}		
		}
		System.out.println("this array represents the total 1s from 0,0 to i,j ");
		for(int i=0;i<=n;i++){
			for(int j=0;j<=n;j++){
				System.out.print(fullmatrix_maxcount[i][j]+" ");				
				}
			System.out.println();			
		}
	int[][] submatrixcount=new int[n+1][n+1];
	int res=0;
	int flag=0;
	int size=n;
	for(size=n;size>=1;size--){
		//System.out.println("size beg"+size);
		for(int i=n;i>=size-1;i--){
			for(int j=n;j>=size-1;j--){
				//if(fullmatrix[i][j])
				submatrixcount[i][j]=fullmatrix_maxcount[i][j]-fullmatrix_maxcount[i-size+1][j]-fullmatrix_maxcount[i][j-size+1]+fullmatrix_maxcount[i-size+1][j-size+1];
				//System.out.print(i+", "+j+": "+fullmatrix_maxcount[i][j]+"-"+fullmatrix_maxcount[i-size+1][j]+"-"+fullmatrix_maxcount[i][j-size+1]+"+"+fullmatrix_maxcount[i-size+1][j-size+1]+"="+submatrixcount[i][j]);
				if(submatrixcount[i][j]<=k || fullmatrix_maxcount[i][j]<=k){
					res=submatrixcount[i][j];
					flag=1;
					break;
					}
				}
			if(flag==1)
				break;				
			System.out.println();				
			}
		if(flag==1)
			break;			
		}
System.out.println("result "+(size-1));
/*for(int i=0;i<=n;i++){
for(int j=0;j<=n;j++){
	System.out.print(submatrixcount[i][j]+" ");		
	}
System.out.println();
}*/
System.out.println(res);
	}
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int[][] a=new int[n][n];
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			a[i][j]=s.nextInt();			
			}			
		}
	int k=s.nextInt();
	SubmatrixDP(a,n,k);
	}
}
