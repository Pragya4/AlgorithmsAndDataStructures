import java.util.*;
class IB2_MissingRepeated{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
ArrayList<Integer> A=new ArrayList<Integer>();
int t=1;
while(t!=-1){
	t=s.nextInt();
	if(t!=-1){
		A.add(t);		
		}
}
int n=A.size();
for(int i=0;i<n;i++){
	if(A.get(i)>0){
		//System.out.println(i+" "+A.get(i)+" "+A.get(A.get(i)-1));
		A.set(A.get(i)-1,(-1)*(A.get(A.get(i)-1)));			
		}
	else{
		System.out.println(Math.abs(A.get(i)));
		}

}
for(int i=0;i<n;i++){
if(A.get(i)>0){
	System.out.println(i+1);
}

}
}
}
