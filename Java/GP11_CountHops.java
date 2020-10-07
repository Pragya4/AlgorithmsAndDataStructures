import java.util.Scanner;
class GP11_CountHops{
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	int t=s.nextInt();
	while(t!=0){
		t--;
		int n=s.nextInt();
		int[] a=new int[n];
		if(n>=1)
			a[0]=1;		//n=1,only 1 hop can be taken
			if(n>=2)
			a[1]=2;		//n=2,either 1hops*2 or 2hop*1
			if(n>=3)
			a[2]=4;		//n=3,either 1*3 or 2*1+1*1 or 1*1+2*1	or 3*1	
		for(int i=3;i<n;i++){
			a[i]=a[i-1]+a[i-2]+a[i-3];		
			}
	System.out.println(a[n-1]);
	}

}		
}
