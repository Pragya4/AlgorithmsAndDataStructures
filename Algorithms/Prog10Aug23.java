import java.util.Scanner;
//window size =w; ie atleast w
class Prog10Aug23{
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int[] A=new int[n];
	for(int i=0;i<n;i++){
		A[i]=s.nextInt();
		}
	System.out.println("Window size");
	int w=s.nextInt();
	int l=0,r=w;
	int max=0;
	int track_min=0,track_max=w;
	while(r<n){
		if(A[r-w]<A[l]){
			l=r-w;
		}
		if(A[r]-A[l]>max){
		max=A[r]-A[l];
		track_min=l;
		track_max=r;
		}
		r++;
		
	}
System.out.println("Max difference keeping a distance(window) of "+w+" is: "+max); 
for(int i=0;i<n;i++){
	if(i==track_min || i==track_max+1){
		System.out.print(" || ");		
		}
	System.out.print(" "+ A[i]+" ");

}
}
}
