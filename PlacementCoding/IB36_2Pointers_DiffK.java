import java.util.*;
class IB36_2Pointers_DiffK{
static boolean throughRecursion(ArrayList<Integer> A,int i,int j,int k){
	int flag=0;
	if(j<i){
		if(A.get(i)-A.get(j)==k){
			return true;
		}
		else if(A.get(i)-A.get(j)>k){
				return (throughRecursion(A,i,j+1,k) || throughRecursion(A,i-1,j,k));
			}
			
		else 
			return false;
						
		}
return false;
}
static int diffPossible(ArrayList<Integer> A, int B) {
	int i=A.size()-1;
	int j=0;
	if(throughRecursion(A,i,j,B))
		return 1;
	return 0;
    }
public static void main(String args[]){
	int k=30;	
	ArrayList<Integer> a=new ArrayList<Integer>();
	a.add(2);
	a.add(3);
	a.add(5);
	a.add(20);
	a.add(50);
	a.add(80);	
	System.out.println(diffPossible(a,k));
	
}

}
