import java.util.*;
class KadaneAlgo{
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int[] a=new int[n];
	for(int i=0;i<n;i++){
		a[i]=s.nextInt();			
		}
	int finalmax=0;
	int trackr=0,trackl=0;
	int maxtillnow=a[0];
	for(int i=1;i<n;i++){
		maxtillnow+=a[i];
		
		if(maxtillnow>finalmax){
			finalmax=maxtillnow;			
			trackr=i;		
			}
		if(maxtillnow<0){
			maxtillnow=0;
			trackl=i;			
		}
		
		}
System.out.println(finalmax+" "+trackl+","+trackr);


}

}
