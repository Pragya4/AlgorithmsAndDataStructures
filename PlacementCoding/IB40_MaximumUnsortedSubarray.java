import java.util.*;
class IB40_MaximumUnsortedSubarray{
static ArrayList<Integer> subUnsort(ArrayList<Integer> A) {
int issorted=1;
int flag=0;
int start=-1;
int i=0;
int end=-1;
int max=Integer.MIN_VALUE;
ArrayList<Integer> res=new ArrayList<Integer>();
	while(i<A.size()-1){
		if(A.get(i)<=A.get(i+1)){
			System.out.print(A.get(i)+" < "+A.get(i+1)+" ");
			i++;
		}
		else if(A.get(i)>A.get(i+1)){
			System.out.print(A.get(i)+" > "+A.get(i+1)+" ");
			issorted=0;
			if(flag==0){
				start=i;
				flag=1;				
			}
			if(flag==1){
				if(max<A.get(i)){
					max=A.get(i);					
					}
				end=i+1;
				
				}
			i++;		
			}
		
		}
	res.add(start);
	res.add(end);
	return res;
    }

public static void main(String args[]){
	ArrayList<Integer> a=new ArrayList<Integer>();
	a.add(1);
	a.add(2);
	a.add(3);
	a.add(4);
	a.add(5);
	
	ArrayList<Integer> res=subUnsort(a);
	System.out.println("result");
	System.out.println(res.get(0));
	System.out.println(res.get(1));
}

}
