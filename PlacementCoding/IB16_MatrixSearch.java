import java.util.*;
class IB16_MatrixSearch{
    static int BinarySearch(ArrayList<ArrayList<Integer>> a,int i,int j_low,int j_high,int b){
	if(j_low<=j_high){	
	int j_mid=(j_low+j_high)/2;
	if(a.get(i).get(j_mid)==b)
		return 1;
	else if(a.get(i).get(j_mid)<b){
		return BinarySearch(a,i,j_mid+1,j_high,b);			
		}
	else
		return BinarySearch(a,i,j_low,j_mid-1,b);	
	}
return 0;
	}
	static int searchMatrix(ArrayList<ArrayList<Integer>> a, int b) {
	int i_low=0;
	int i_high=a.size()-1;
	int j_mid=a.get(i_low).size()/2;
	
		if(a.size()==1){
			return BinarySearch(a,0,0,a.get(0).size()-1,b);			
			}
		else{
		while(i_low+1<i_high){
			int i_mid=(i_low+i_high)/2;
			if(a.get(i_mid).get(j_mid)==b){
				return 1;				
				}
			else if(a.get(i_mid).get(j_mid)>b){
				i_high=i_mid;				
					}
			else{
				i_low=i_mid;							
					}	
			}
		if(a.get(i_low).get(j_mid)==b){
			return 1;			
			}
		else if(i_low+1<a.size() && a.get(i_low+1).get(j_mid)==b){
			return 1;				
			}

		else if(j_mid-1 >=0 && a.get(i_low).get(j_mid-1)>=b){
			return BinarySearch(a,i_low,0,j_mid-1,b);				
			}
		else if(j_mid+1<a.get(i_low).size() && a.get(i_low).get(j_mid+1)<=b && a.get(i_low).get(a.get(i_low).size()-1)>=b){
			return BinarySearch(a,i_low,j_mid+1,a.get(i_low).size()-1,b);				
			}
		else if(i_low+1<a.size() && j_mid-1>=0 && a.get(i_low+1).get(j_mid-1)>=b){
			return BinarySearch(a,i_low+1,0,j_mid-1,b);				
			}
		else{
			return BinarySearch(a,i_low+1,j_mid+1,a.get(i_low).size()-1,b);				
			}


				
		}

}
public static void main(String args[]){
ArrayList<ArrayList<Integer>> a=new ArrayList<ArrayList<Integer>>();
ArrayList<Integer> inner1=new ArrayList<Integer>();
inner1.add(1);
inner1.add(3);
inner1.add(5);
inner1.add(7);
a.add(inner1);
ArrayList<Integer> inner2=new ArrayList<Integer>();
inner2.add(10);
inner2.add(11);
inner2.add(16);
inner2.add(20);
a.add(inner2);
ArrayList<Integer> inner3=new ArrayList<Integer>();
inner3.add(23);
inner3.add(30);
inner3.add(34);
inner3.add(50);
a.add(inner3);
System.out.print(searchMatrix(a,44));
}

}
