import java.util.*;
class GP46_numberOfIslands{
static int countisland(int[][] island,int r,int c){
	int count=0;
	int starti=0,startj=0,endi=0,endj=0;
	for(int i=0;i<r;i++){
		for(int j=0;j<c;j++){
			if(island[i][j]==1){
				starti=i;
				startj=j;
				while(j<c && island[i][j]==1){
					j++;					
					}
				endj=j;
				j=startj;
				while(i<r && island[i][j]==1){	
					i++;					
					}
				endi=i;							
				}
			System.out.println(starti+","+startj);
			System.out.println(endi+","+endj);
			i=endi;
			j=endj+1;	
			}			
		}
return count;

}
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int m=s.nextInt();
	int[][] island=new int[n][m];
	for(int i=0;i<n;i++){
		for(int j=0;j<m;j++){
			island[i][j]=s.nextInt();					
		}			
	}
countisland(island,n,m);
}
}
