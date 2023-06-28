import java.util.*;
class IB35_CountNumberOfTriangle{
static int max(int a,int b){
	if(a>b) return a;
	else return b;
}

static int nTriang(ArrayList<Integer> A){
	Collections.sort(A);
	int countifj=0;
	long count=0;
	int countifk=0;
	int mod=1000000007;
	for(int i=A.size()-1;i>=2;i--){
	//	System.out.println("NEW i "+A.get(i));
		int k=i-1;
		int j=0;
		while(j<k){
	//		System.out.println("j "+A.get(j));
	//		System.out.println("k "+A.get(k));
	//		System.out.println(A.get(j)+" "+A.get(k)+" "+A.get(i));
			if(A.get(i)<A.get(j)+A.get(k)){		 //Sum of two sides> third side of triangle,
				count+=(k-j);			//although it can be <= but we are told positive area
	//			System.out.println("count updaed to "+count+" k "+k+" j "+j);
				k--;
			}
			else{
					j++;	
					}
				
		}
			
	}	
return (int)(count%mod);
}
public static void main(String args[]){
	ArrayList<Integer> arr=new ArrayList<Integer>();
	arr.add(4);
	arr.add(6);
	arr.add(13);
	arr.add(16);
	arr.add(20);
	arr.add(3);
	arr.add(1);
	arr.add(12);
//	arr.add(4);
//	arr.add(6);
//	arr.add(3);
//	arr.add(7);
//	arr.add(2);
/*	arr.add(10);
	arr.add(21);
	arr.add(22);
	arr.add(100);
	arr.add(101);
	arr.add(200);
	arr.add(300);*/
	System.out.println(nTriang(arr));
	
}

}
