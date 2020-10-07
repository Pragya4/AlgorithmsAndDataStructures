import java.util.*;
class GP68_NthNumberWithGivenDigits{
static int count(int[] a,int n,int Nth){
	//Set<Integer> set=new Set<Integer>();
	ArrayList<Integer> set=new ArrayList<Integer>();
	for(int i=0;i<n;i++){
		System.out.println("adding "+a[i]);
		set.add(a[i]);
		}
	
	int res=0;
	int count=0;
	for(int i=0;i<=Nth;i++){
		for(int j=0;j<n;j++){
			res=set.get(i)*10+set.get(j);
			if(res!=0){
				System.out.println("adding "+res);
				set.add(res);	
				count++;
				if(count==Nth)
					break;	
				}	
			}	
		}
return set.get(Nth+n-2);
}
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int[] a=new int[n];
	for(int i=0;i<n;i++){
		a[i]=s.nextInt();			
		}
	int Nth=s.nextInt();
	System.out.println(count(a,n,Nth));	
	}
}
