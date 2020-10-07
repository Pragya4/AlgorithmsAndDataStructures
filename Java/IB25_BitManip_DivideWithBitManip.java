import java.util.Scanner;
class IB25_BitManip_DivideWithBitManip{
static int divide(int A,int B){
	int divisor=Math.abs(B);
	int dividend=Math.abs(A);
	int quotient=0;
	int temp=0;
	int sign=1;
	if(A>0 && B<0 || A<0 && B>0)
		sign=-1;
	for(int i=16;i>=0;--i){	
		System.out.println(divisor<<i);
		if(temp+(divisor<<i) <= dividend){
			System.out.println(" above yes");
			temp+=divisor<<i;
			System.out.println(1<<i);
			quotient=quotient | 1<<i;			
			}
		}
return sign*quotient;

}
public static void main(String args[]){
	System.out.println(divide(45,-4));
	System.out.println(divide(23,7));

}


}
