import java.util.*;
class Median_Sorted2dArray{
static int median(int[][] a,int r,int c){
	int min=Integer.MAX_VALUE;
	int max=Integer.MIN_VALUE;
	
	for(int i=0;i<r;i++){
		if(a[i][0]<min)
			min=a[i][0];
		if(a[i][a[i].length-1]>max)
			max=a[i][a[i].length-1];
		}
	int desired=(r*c+1)/2;
	while(min<max){
		int min_in_row=0;
		int min_till_now=0;
		int mid=min+(max-min)/2;
		for(int i=0;i<r;i++){
		min_in_row=Arrays.binarySearch(a[i],mid);
		if(min_in_row<0){
			min_in_row=(-1)*min_in_row-1;		
		}
		else {
			while(min_in_row<a[i].length && a[i][min_in_row]==mid)
				min_in_row+=1;	
		}


	min_till_now+=min_in_row;
	}
	
	if(min_till_now<desired){
		min=mid+1;	
		}
	else {
		max=mid;		
		}		


}
return max;

}
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	int r=s.nextInt();
	int c=s.nextInt();
	int[][] a=new int[r][c];
	for(int i=0;i<r;i++){
		for(int j=0;j<c;j++){
			a[i][j]=s.nextInt();			
			}		
	}
System.out.println("median "+median(a,r,c));
}
}
