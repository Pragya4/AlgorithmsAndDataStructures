import java.util.*;
class IB49_DP_LIS_LDS{
 static int longestSubsequenceLength(final List<Integer> A) {
	int[] lis=new int[A.size()];
	Arrays.fill(lis,1);
	for(int i=0;i<A.size();i++){
		for(int j=0;j<i;j++){
			if(A.get(j)<A.get(i) && lis[j]+1>lis[i])
				lis[i]=lis[j]+1;			
			}		
		}
	for(int i=0;i<A.size();i++){
		System.out.print(lis[i]+" ");			
		}
	int[] lds=new int[A.size()];
	Arrays.fill(lds,1);
	for(int i=0;i<A.size();i++){
		for(int j=0;j<i;j++){
			if(A.get(j)>A.get(i) && lds[j]+1>lds[i])
				lds[i]=lds[j]+1;			
			}		
		}
System.out.println();
	for(int i=0;i<A.size();i++){
		System.out.print(lds[i]+" ");			
		}
int max=lis[0]+lds[0]-1;
for(int i=0;i<A.size();i++){
	if(lis[i]+lds[i]-1>max)
		max=lis[i]+lds[i]-1;
}
return max;
    }
public static void main(String args[]){
ArrayList<Integer> arr=new ArrayList<Integer>();
arr.add(1);
arr.add(11);
arr.add(2);
arr.add(10);
arr.add(4);
arr.add(5);
arr.add(2);
arr.add(1);
System.out.println("result"+longestSubsequenceLength(arr));
}
}
