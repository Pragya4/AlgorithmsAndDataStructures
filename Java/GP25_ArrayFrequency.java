import java.util.Scanner;
class GP25_ArrayFrequency{
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int[] a=new int[n];
	for(int i=0;i<n;i++){
		a[i]=s.nextInt();			
		}
	for(int i=0;i<n;i++){
		if(a[i]<0){
			continue;			
			}	
		else if(a[i]>0){
			int key=a[i];
			if(a[a[i]-1]<0){
				a[a[i]-1]-=1;				
				}
			else{
				a[a[i]-1]=-1;	
				}			
			}	
		}
for(int i=0;i<n;i++){
	if(a[i]>0)
		System.out.print("0 ");
	else
		System.out.print(-1*a[i]+" ");	
	}
}

}
