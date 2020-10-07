import java.util.Scanner;
class GP24_ArrayZigZag{
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
		int l1,g,l2;
		if(n==2){
			if(a[0]>a[1]){
				int temp=a[0];
				a[0]=a[1];
				a[1]=temp;				
				}			
			}
		if(n>=3){
			for(int i=0;i<n;i+=2){
				if(i+1<n && a[i]>a[i+1]){
					int temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;					
				}
				if(i+2<n && a[i+1]<a[i+2]){
					int temp=a[i+1];
					a[i+1]=a[i+2];
					a[i+2]=temp;					
				}
				//for(int k=0;k<n;k++){
				//System.out.print(a[k]+" ");					
				//}
			}		
		}
		/*if(n%3!=2){
			if(a[n-2]>a[n-1]){
				int temp=a[n-2];
				a[n-2]=a[n-1];
				a[n-1]=temp;
				}		
			}*/
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");			
		}
		System.out.println();
	}
		}


}
