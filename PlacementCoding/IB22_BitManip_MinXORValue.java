import java.util.*;
class IB22_BitManip_MinXORValue{
static int findMinXor(ArrayList<Integer> A){
Collections.sort(A);
int min=Integer.MAX_VALUE;
for(int i=0;i<A.size()-1;i++){
		if((A.get(i)^A.get(i+1))<min)
			min=(A.get(i)^A.get(i+1));

}
return min;
}

public static void main(String args[]){
	ArrayList<Integer> a=new ArrayList<Integer>();
	a.add(0);
	a.add(2);
	a.add(5);
	a.add(7);	
	System.out.println(findMinXor(a));
}
}
