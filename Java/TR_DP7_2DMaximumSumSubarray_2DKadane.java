import java.util.*;
class TR_DP7_2DMaximumSumSubarray_2DKadane{
static ArrayList<Integer> Kadane1D(int[] a){
	ArrayList<Integer> res=new ArrayList<Integer>();
	int start=0;
	int end=-1;
	int max_ending_here=0;
	int max_overall=0;
	int flag=0;
	for(int i=0;i<a.length;i++){
		max_ending_here=max_ending_here+a[i];
		if(max_ending_here<0){
			start=i+1;
			flag=0;
			max_ending_here=0;				
			}		
		else if(max_ending_here>max_overall)	{
			max_overall=max_ending_here;
			if(flag==0){
				start=i;
				flag=1;				
				}
			else {
				end=i;				
				}			
			}
			
		}
	if(end==-1){
		
		for(int i=0;i<a.length;i++){
			if(a[i]>max_overall){
				max_overall=a[i];
				start=i;
				end=i;				
				}			
			}			
		}
	System.out.println("1Dkadane "+max_overall+" "+start+" "+end);
	res.add(max_overall);
	res.add(start);
	res.add(end);
return res;
}
static int[][] Kadane2D(int[][] a){
	int r=a.length;
	int c=a[0].length;
	int left=0,right=0,top=0,bottom=0;
	int max=Integer.MIN_VALUE;
	int[] oneD=new int[r];
	for(int Left=0;Left<c;Left++){
		Arrays.fill(oneD,0);
		for(int Right=Left;Right<c;Right++){
			for(int i=0;i<r;i++){
				oneD[i]+=a[i][Right];
				}
			ArrayList<Integer> local_res=Kadane1D(oneD);
			if(local_res.get(0)>max){
				max=local_res.get(0);
				left=Left;
				right=Right;
				top=local_res.get(1);
				bottom=local_res.get(2);				
				}			
			}			
		}
System.out.println(max+":"+"tp "+top+" bottom "+bottom+" right "+right+" left "+left);
System.out.println("dimensions "+(bottom-top+1)+","+(right-left+1));
int[][] result=new int[bottom-top+1][right-left+1];
for(int i=top;i<=bottom;i++){
	//System.out.println(top);
	for(int j=left;j<=right;j++){
		result[i-top][j-left]=a[i][j];	
		//System.out.print(a[i][j]+"bgurab ");		
		}
	//System.out.println();		
	}

return result;
}
public static void main(String args[]){
	int[][] arr={{1,2,-1,-4,-20},{-8,-3,4,2,1},{3,8,10,1,3},{-4,-1,1,7,-6}};
	for(int i=0;i<arr.length;i++){
		for(int j=0;j<arr[0].length;j++){
			System.out.print(arr[i][j]+" ");			
			}		
		System.out.println();
		}
	int[][] res=Kadane2D(arr);
	for(int i=0;i<res.length;i++){
		for(int j=0;j<res[i].length;j++){
			System.out.print(res[i][j]+" ");			
			}
			System.out.println();		
		}
}

}
