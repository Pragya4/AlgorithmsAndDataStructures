import java.util.*;
class IB33_SumOf3NosClosestToTarget{
static int threeSumClosest(ArrayList<Integer> A, int B) {
	int sum=0;
	int close=Integer.MAX_VALUE;
	int val1=0;
	int val2=0;
	int val3=0;
	int res=0;
    for(int i=0;i<A.size();i++){
		int j=i+1;
		int k=A.size()-1;
		while(j<k && j<A.size() && k>=0){
			sum=A.get(i)+A.get(j)+A.get(k);	
			int diff=B-sum;	
			if(sum==B || Math.abs(diff)<close ){
				close=Math.abs(diff);
				val1=A.get(i);
				val2=A.get(j);
				val3=A.get(k);
				res=sum;
				if(sum==B){
					j=k;
					i=A.size();					
				}				
			}
			if(sum>B)
				k--;
			if(sum<B)
				j++;			
		}
		}
System.out.println(val1+"+"+val2+"+"+val3+"="+res);
return sum;
}

public static void main(String args[]){
Scanner s=new Scanner(System.in);
ArrayList<Integer> a=new ArrayList<Integer>();
a.add(-4);
a.add(-1);
a.add(1);
a.add(2);
System.out.println("in main"+threeSumClosest(a,1));
	

}

}
