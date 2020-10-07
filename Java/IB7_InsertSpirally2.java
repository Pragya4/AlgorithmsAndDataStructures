import java.util.*;
class IB7_InsertSpirally2{
static void spiral(int n){
	System.out.println("Flag0");
	int[][] a=new int[n][n];
	int top=0;
	int left=0;
	int bottom=n-1;
	int right=n-1;
	int num=1;
	ArrayList<ArrayList<Integer>> Arr=new ArrayList<ArrayList<Integer>>();
	while(top<n && left<n && right>=0 && bottom>=0 && top<=bottom && left<=right){
		System.out.println("flag1");
		for(int i=left;i<=right;i++){
			System.out.println("Flag2 "+top+","+i+":"+num);
			a[top][i]=num;
			num++;			
			}
		top++;
		for(int i=top;i<=bottom;i++){
			System.out.println("Flag3 "+i+","+right+":"+num);
			a[i][right]=num;
			num++;			
			}
		right--;
		for(int i=right;i>=left;i--){
			System.out.println("Flag4 "+bottom+","+i+":"+num);
			a[bottom][i]=num;
			num++;				
			}
		bottom--;
		for(int i=bottom;i>=top;i--){
			System.out.println("Flag5 "+left+","+i+":"+num);
			a[i][left]=num;
			num++;		
		}
		left++;		
		}
	
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){	
			System.out.print(a[i][j]+" ");
			Arr.get(i).add(a[i][j]);
			}
		System.out.println();		
	}
System.out.println(Arr);	
}
public static void main(String arags[]){
	Scanner s=new Scanner(System.in);
	System.out.println("enter n");
	int n=s.nextInt();
	spiral(n);
		
	}

}
