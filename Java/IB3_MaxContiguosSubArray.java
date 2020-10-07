import java.util.Scanner;
import java.util.ArrayList;

class IB3_MaxContiguosSubArray{
public static void main(String args[]){
	ArrayList<Integer> A=new ArrayList<Integer>();
	int t=1;
	Scanner s=new Scanner(System.in);
	while(t!=999){
		t=s.nextInt();
		if(t!=999){
			
			A.add(t);			
		}		
		}
	
	int n=A.size();
	int[] a=new int[n];
	int k=0;
	int pos=0;
	for(int i=0;i<n;i++){
		
		a[i]=A.get(i);
		if(a[i]>0)
			pos=1;			
		}
	int max=a[0];
	for(int i=0;i<n;i++){
		if(a[i]>max){
			max=a[i];		
			}		
		}
	
	
	int flag=0;
        int start=0;
        int end=0;
        int currentsum=a[0];
        int maxsum=0;
        for(int i=0;i<n;i++){
            if(currentsum<0){
	
                currentsum=0;
                flag=0;
            }
            
		
                currentsum+=a[i];
		
                if(currentsum>maxsum){
		
                    maxsum=currentsum;
                    if(flag==0){
                        start=i;
                        flag=1;
                    }
                    else if(flag==1){
                        end=i;
                    }
                }
            
}
int[] B=new int[end-start+1];
            for(int i=0;i<(end-start+1);i++){
                B[i]=a[i+start];
            }
for(int i=0;i<end-start+1;i++){
System.out.print(B[i]+" ");
}
if(pos==0){
System.out.println("all neg"+max);
}
else{
System.out.println("maxsum"+maxsum);
}
}
}
