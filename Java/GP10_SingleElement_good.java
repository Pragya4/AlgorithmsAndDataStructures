import java.util.Scanner;
class GP10_SingleElement_good{
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	int t=s.nextInt();
	while(t!=0){
		t--;
		int res=0;
		int n=s.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();			
			}
		//use bitwise XOR so if element appears twice then 0 else something
		for(int i=0;i<n;i++){
			res=res^a[i];			
			}
		System.out.println(res);
		}
}
}
