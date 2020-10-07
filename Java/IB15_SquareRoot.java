import java.util.Scanner;
class IB15_SquareRoot_USEOFLONG_INTEGEROVERFLOW{
public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		
	   long a1=s.nextLong();
	    if(a1==0 || a1==1)
	        System.out.println(a1);
	else{
	   long low=1;
	   long high=(int)(a1/2)+1;
	   long res=0;
	   while(low<=high){
	       long mid=(low+high)/2;
	       if(mid*mid==a1){
	           res=mid;
			low=high+1;
	       }
	       if(mid*mid<a1){
	           low=mid+1;
	           res=mid;
	       }
	       else{
	           high=mid-1;
	       }
	   }
	   
	   System.out.println(res);
	}


}
}
