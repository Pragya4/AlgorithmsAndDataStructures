import java.util.Scanner;
class GP8_PalindromicArray{
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
		int start=0;
		int end=n-1;
		int op=0;
		while(start<=end){
			if(a[start]==a[end]){
				start++;
				end--;					
				}
			else if(a[start]<a[end]){
				int key=a[start];
				start++;
				a[start]=a[start]+key;
				op++;			
				}	
			else if(a[start]>a[end]){
				int key=a[end];
				end--;
				a[end]=a[end]+key;
				op++;			
				}			
		
			}
	System.out.println(op);			
		}


}		
	
}
