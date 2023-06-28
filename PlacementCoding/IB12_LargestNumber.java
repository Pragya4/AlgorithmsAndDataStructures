import java.util.*;
class IB12_LargestNumber{

static int concat(int a,int b){
	int numofdig=0;
	int x=b;
	while(b!=0){
		numofdig++;
		b=b/10;		
		}
	a=a*(int)Math.pow(10,numofdig);
	
	return a+x;
}
static String converttostring(List<Integer> a){
	String str="";
	for(int i=0;i<a.size();i++){
		str+=Integer.toString(a.get(i));		
	}
return str;
}
static String largest(List<Integer> A){
	String res="";	
	int swaps=0;
	for(int i=0;i<A.size()-1;i++){
	swaps=0;
	
	for(int j=i+1;j<A.size();j++){
		if(concat(A.get(i),A.get(j))<concat(A.get(j),A.get(i))){
			
			int temp=A.get(i);
			A.set(i,A.get(j));
			A.set(j,temp);
			
			swaps=1;			
			}
		}
		
	}
res=converttostring(A);		
return res;
}
public static void main(String args[]){
	ArrayList<Integer> A=new ArrayList<Integer>();
	A.add(8);
	A.add(89);
	
	String result=largest(A);
	System.out.println(result);
	}
}
