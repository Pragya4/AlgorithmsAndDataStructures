import java.util.*;
class GP_DP1_UglyNumbers{
static int compute(int n){
int[] ugly=new int[n];
ugly[0]=1;
int i2=0;
int i3=0;
int i5=0;
for(int i=1;i<n;i++){
	ugly[i]=Math.min(ugly[i2]*2,Math.min(ugly[i3]*3,ugly[i5]*5));
	if(ugly[i2]*2==ugly[i]) i2++;
	if(ugly[i3]*3==ugly[i]) i3++;
	if(ugly[i5]*5==ugly[i]) i5++;
}
for(int i=0;i<n;i++){
	System.out.print(ugly[i]+" ");
}
return ugly[n-1];
}
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	System.out.println("UGLY "+compute(n));
}
}
