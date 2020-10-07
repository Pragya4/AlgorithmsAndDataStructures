import java.util.*;
class GP32_Stack_NextGreaterElement{
static int[] stackIm(int[] arr){
	int[] res=new int[arr.length];
	Arrays.fill(res,-1);
	Stack<Integer> stk=new Stack<Integer>();
	stk.push(0);
	for(int i=1;i<arr.length;i++){
		if(stk.isEmpty() || arr[stk.peek()]>arr[i]){
			System.out.println("pushing "+arr[i]);			
			stk.push(i);			
			}
		else{
			while(!stk.isEmpty()){
				System.out.println("popping "+arr[stk.peek()]+" dur to "+arr[i]);
				int ind=stk.pop();
				res[ind]=i;				
				}
			stk.push(i);		
			}			
		}
	return res;	
	}
public static void main(String args[]){

	int[] arr={3,4,2,7,5,8,10,6};
	int[] res=stackIm(arr);
	for(int i=0;i<res.length;i++){
		if(res[i]!=-1)
			System.out.print(arr[res[i]]+" ");
		else
			System.out.print("-1 ");		
	}
}
}
