import java.util.Scanner;
class GP13_GreaterOnRightSide{
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	int t=s.nextInt();
	while(t!=0){
		t--;
		int n=s.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();				
			}
		int max=a[n-1];
		int max_till_now=-1;	
		for(int i=n-1;i>=0;i--){
			if(a[i]>max_till_now){
				int temp=a[i];
				a[i]=max_till_now;
				max_till_now=temp;					
				}
			else{
				a[i]=max_till_now;
				}	
			}
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");			
			}
			
	}


}
}
