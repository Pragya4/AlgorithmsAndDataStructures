import java.util.*;
public class IB13_repeatednumberBinarySearch {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
static int first(List<Integer> A,int low,int high,int B){
	if(high>=low){
	int mid=(low+high)/2;
	
	if((mid==0 || ((mid-1)>=0 && A.get(mid-1)<B)) && A.get(mid)==B){
		
		return mid;		
		}
	else if(A.get(mid)<B){
		
		return first(A,mid+1,high,B);		
		}
	else {
		
		return first(A,low,mid-1,B);		
		}	
}
return -1;
}
static int last(List<Integer> A,int low,int high,int B){
	if(high>=low){
	int mid=(low+high)/2;

	if(A.get(mid)==B && (mid==A.size()-1 || A.get(mid+1)>B)){

		return mid;		
		}
	if(A.get(mid)>B){
		return last(A,low,mid-1,B);		
		}
	else{
		return last(A,mid+1,high,B);		
		}
	}	
return -1;	
	}
	static int findCount(final List<Integer> A, int B) {
	System.out.println("flag0");
        int low=0;
        int high=A.size()-1;
	int first_occ= first(A,low,high,B);
	System.out.println("first_occ="+first_occ);
	if(first_occ==-1)
		return -1;
	int last_occ= last(A,first_occ+1,high,B);
	System.out.println("last_occ="+last_occ);
	return last_occ-first_occ+1;
    }
public static void main(String args[]){
	List<Integer> a=new ArrayList<Integer>();
	a.add(1);
	a.add(3);
	a.add(3);
	a.add(3);
	a.add(3);
	a.add(6);
	a.add(7);
	a.add(8);
 int res=findCount(a,3);
System.out.println(res);
}
}

