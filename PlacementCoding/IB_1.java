import java.util.*;
class IB_1{
public static void main(String args[]){
	ArrayList<Integer> A=new ArrayList<Integer>();
	Scanner s=new Scanner(System.in);
	int t=1;
	while(t!=-1){
		t=s.nextInt();
		if(t!=-1){
			A.add(t);			
			}		
		}
	while(A.size()>1 && A.get(0)==0){
		A.remove(0);		
	}
	int n=A.size();
	if(A.get(n-1)>=0 && A.get(n-1)<9){
		A.set(n-1,new Integer(A.get(n-1)+1));			
		}
	else if (n>=1 && A.get(n-1)==9){
		while(n>=1 && A.get(n-1)==9){
			A.set(n-1,new Integer(0));
			
			n=n-1;
			}
		if(n>=1)
			A.set(n-1,new Integer(A.get(n-1)+1));
		else
			A.add(0,1);			
		}
	for(Integer i:A){
		System.out.print(i+" ");			
		}
	}

}
