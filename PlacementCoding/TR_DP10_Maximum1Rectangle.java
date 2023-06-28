import java.util.*;
class TR_DP10_Maximum1Rectangle{
static int histogram(int[] a){
/*System.out.println("array in sist");
for(int i=0;i<a.length;i++){
	System.out.print(a[i]+" ");
}*/
Stack<Integer> stk=new Stack<Integer>();
int res=0;
int max=0;
int i=0;
int top;
while(i<a.length){
	if(stk.isEmpty() || a[stk.peek()]<=a[i]){
		stk.push(i++);			
		}
	else if(a[stk.peek()]>a[i]){
		//while(!stk.isEmpty() && a[stk.peek()]>a[i]){
		top=stk.pop();
		if(stk.isEmpty()){
			res=a[top]*i;	
		}
		else if(!stk.isEmpty()){
			res=a[top]*(i-stk.peek()-1);				
		}
	if(res>max){
		max=res;		
		}
	//}
	}	
}
while(!stk.isEmpty()){
top=stk.pop();
		if(stk.isEmpty()){
			res=a[top]*i;	
		}
		else if(!stk.isEmpty()){
			
			res=a[top]*(i-stk.peek()-1);				
					
		}
	if(res>max){
		max=res;		
		}
}
System.out.println("hist "+max);
return max;
}
static int count(int[][] arr){
	if(arr.length==0){
		return 0;		
		}
	int max=0;
	int[] a=new int[arr[0].length];
	Arrays.fill(a,0);
	for(int i=0;i<arr.length;i++){
		for(int j=0;j<arr[0].length;j++){
			//System.out.print("at "+i+""+j+" "+arr[i][j]+" ");
			if(arr[i][j]==0){
				a[j]=0;				
				}
			else if(arr[i][j]==1){
				a[j]+=arr[i][j];
			}
		//System.out.println("a[] "+a[i]);			
			}
		System.out.println("arr");
		for(int j=0;j<arr[0].length;j++){
			System.out.print(a[j]+" ");			
			}
		int count=histogram(a);	
		if(count>max)
			max=count;	
		}
return max;	
}
public static void main(String args[]){
int[][] a={{1,0,0,1,1,1},{1,0,1,1,0,1},{0,1,1,1,1,1},{0,0,1,1,1,1}};
for(int i=0;i<a.length;i++){
	for(int j=0;j<a[0].length;j++){
		System.out.print(a[i][j]+" ");		
		}	
	System.out.println();
	}
System.out.println(count(a));

}

}
