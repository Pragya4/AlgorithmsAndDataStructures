import java.util.Scanner;
class GP16_RainwaterTrapping{
static int min(int a,int b){
	if(a<b)
		return a;
	else
		return b;

}
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	int t=s.nextInt();
	while(t!=0){
		t--;
		int n=s.nextInt();
		int[] a=new int[n];
		int[] left_max_height=new int[n];
		int[] right_max_height=new int[n];
		int water=0;
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();			
			}
		int leftmax=a[0];
		int rightmax=a[n-1];
		left_max_height[0]=a[0];
		right_max_height[n-1]=a[n-1];
		for(int i=1;i<n;i++){
			left_max_height[i]=leftmax;
			right_max_height[n-i-1]=rightmax;		
			if(a[i]>leftmax){
				leftmax=a[i];			
				}
			
			if(a[n-i-1]>rightmax){
				rightmax=a[n-i-1];				
					}
				
			}
		for(int i=0;i<n;i++){
			if(min(left_max_height[i],right_max_height[i])-a[i]>=0){
					water+=(min(left_max_height[i],right_max_height[i])-a[i]);		
					}			
			}
		/*for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
			}
		System.out.println();
		for(int i=0;i<n;i++){
			System.out.print(left_max_height[i]+" ");
			}
		System.out.println();
		for(int i=0;i<n;i++){
			System.out.print(right_max_height[i]+" ");
			}
		System.out.println();*/

	System.out.println(water);



}

}


}
