import java.util.*;
class IB32_MinimumAbsDiff_3Arrays{
static int minimum(int a,int b){
	if(a<b)
		return a;
return b;
}
static int maximum(int a,int b){
if(a>b)
	return a;
return b;
}
static int solve(ArrayList<Integer> A, ArrayList<Integer> B, ArrayList<Integer> C) {
	int a=0;
	int b=0;
	int c=0;
	int absdif=Integer.MAX_VALUE;
	while(a<A.size() && b<B.size() && c<C.size()){
		int min=minimum(A.get(a),minimum(B.get(b),C.get(c)));
		int max=maximum(A.get(a),maximum(B.get(b),C.get(c)));
		if(max-min<absdif){
			
			absdif=max-min;
		}
	if(A.get(a)==min){	
		
		a++;
	}
	else if(B.get(b)==min){
		
		b++;
		}
	else{
		
		c++;
	}
		

	}

return absdif;
}
public static void main(String args[]){
ArrayList<Integer> A=new ArrayList<Integer>();
ArrayList<Integer> B=new ArrayList<Integer>();
ArrayList<Integer> C=new ArrayList<Integer>();
A.add(1);
A.add(4);
A.add(5);
A.add(8);
A.add(10);
B.add(6);
B.add(9);
B.add(15);
C.add(2);
C.add(3);
C.add(6);
C.add(6);
System.out.println(solve(A,B,C));



}

}
