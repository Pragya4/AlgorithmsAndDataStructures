import java.util.*;
class IB6_Flip{
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	String str=s.next();
	int[] a=new int[str.length()];
	for(int i=0;i<str.length();i++){
		a[i]=Integer.parseInt(str.valueOf(str.charAt(i)));			
		}
	int curmax=0;
	int max=0;
	int start=-1;
	int end=-1;
	int flag=0;
	for(int i=0;i<str.length();i++){
		if(curmax<0){
			flag=0;
			curmax=0;
			start=-1;
			end=-1;			
		}
		if(a[i]==0){
			curmax+=1;			
			}
		else if(a[i]==1){
			curmax-=1;
			}
		if(curmax>max){
			max=curmax;
			if(flag==0){
				start=i;
				flag=1;				
				}
			if(flag!=0){
				end=i;				
				}				
			}		
		}
	System.out.println(max+" ("+start+","+end+")");
}

}
