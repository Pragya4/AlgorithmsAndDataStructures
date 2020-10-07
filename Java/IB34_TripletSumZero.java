import java.util.*;
class IB34_TripletSumZero{
static ArrayList<ArrayList<Integer>> threeSum(ArrayList<Integer> A){
	Collections.sort(A);
	ArrayList<ArrayList<Integer>> outer=new ArrayList<ArrayList<Integer>>();
	ArrayList<Integer> inner =new ArrayList<Integer>();
	int flag=0;
	for(int i=0;i<A.size();i++){
		int j=i+1;
		int k=A.size()-1;
		flag=0;
		while(j<k && j<A.size() && k>=0){
			flag=0;
			long sum=A.get(i)+A.get(j)+A.get(k);
			if(sum==0L){
				flag=1;
				inner.add(A.get(i));
				inner.add(A.get(j));
				inner.add(A.get(k));
				j++;
				k--;				
				}
			else if(sum<0L){
				j++;					
				}
			else{
				k--;				
				}
			if(flag==1){
				outer.add(inner);
				flag=0;				
				}			
			}		
		}
return outer;
}
public static void main(String args[]){
ArrayList<Integer> a=new ArrayList<Integer>();
a.add(-1);
a.add(0);
a.add(1);
a.add(2);
a.add(-1);
a.add(-1);
ArrayList<ArrayList<Integer>> outer=new ArrayList<ArrayList<Integer>>();
outer=threeSum(a);
for(int i=0;i<outer.size();i++){
	for(int j=0;j<outer.get(i).size();j++){
		System.out.print(outer.get(i).get(j)+" ");		
		}
		System.out.println();
}

}

}
