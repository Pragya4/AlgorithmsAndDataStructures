import java.util.Scanner;
//window size atmost w
class Prog11Aug23{
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int[] A=new int[n];
	for(int i=0;i<n;i++){
		A[i]=s.nextInt();			
		}
	int w=s.nextInt();
	
	int l=0;
	int r=w;
	int track_min=l;
	int track_max=r;

	int p;
	int max=0;
	while(r<n){
		p=r-w;
		l=r-w;
		while(p<r){
			if(A[p]<A[l]){
				l=p;
				}
			if(A[r]-A[l]>max){
				max=A[r]-A[l];
				track_min=l;
				track_max=r;

				}
			p++;
			}
		r++;
	}
for(int i=0;i<n;i++){
	if(i==track_min || i==track_max+1){
		System.out.print(" || ");
}
System.out.print(A[i]+" ");
}
System.out.println("");
System.out.println("max in atmost window"+w+": "+max);
	
}
}
