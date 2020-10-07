import java.util.*;
class IB45_Hashing_ColorfulNumbers{
static int colorful(int A){
	Hashtable<Integer,Integer> ht=new Hashtable<Integer,Integer>();
	String numstr=Integer.toString(A);
	for(int i=0;i<numstr.length();i++){
		for(int j=i;j<numstr.length();j++){	
			int prod=1;
			int num=Integer.parseInt(numstr.substring(i,j+1));
			int n=num;
			System.out.println("num "+num);
			while(n!=0){
				prod*=(n%10);
				n=n/10;				
				}
			System.out.println(num+" : "+prod);
			if(ht.contains(prod))
				return 0;
			else
				ht.put(num,prod);
					
		}		
	}
return 1;
}
public static void main(String args[]){
	System.out.println(colorful(322));
}
}
