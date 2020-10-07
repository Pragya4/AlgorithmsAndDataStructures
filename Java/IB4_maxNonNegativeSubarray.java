import java.util.*;
class IB4_maxNonNegativeSubarray{
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	System.out.println("Enter n");
	int n=s.nextInt();
	int[] a=new int[n];
	for(int i=0;i<n;i++){
		a[i]=s.nextInt();		
			}
	System.out.println("acc");
	int start=0;
	int end=0;

	int res=0;
	for(int i=0;i<n;i++){
		int len=0;
		int sum=0;		
		while(i<n && a[i]>0){
			i++;
			len++;
			sum+=a[i];			
			}
		res=Math.max(res,len);
	}
System.out.println(res);
}

}
