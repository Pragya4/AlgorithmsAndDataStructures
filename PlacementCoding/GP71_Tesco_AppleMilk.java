import java.util.*;
class GP71_Tesco_AppleMilk{
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	int t=s.nextInt();
	while(t!=0){
		t--;
		int n=s.nextInt();
		int p=s.nextInt();
		int[] a=new int[n];
		int[] m=new int[n];
		for(int i=0;i<n;i++){
			m[i]=s.nextInt();				
			}
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();				
		}
		int milk=0;
		int apple=0;
		int i=0;
		int max=0;
		while(i<n){
			if(milk<=1){
				milk=Math.max(m[max]-(i-max),m[i]);
				if(max!=0 && milk==m[max]-(i-max))
					apple-=a[max];
				i++;				
				}
			else{
				milk--;
				if(m[i]>max)
					max=m[i];	
				apple+=a[i];
				i++;			
				}			
			}
	System.out.println("apples "+apple);			
		}
}
}
