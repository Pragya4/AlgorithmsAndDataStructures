import java.util.*;
class IB41_NBy3RepeatNumber{
static int replace(int[] n,int[] count){
	int i=0;
	for(i=0;i<count.length;i++){
		if(count[i]==0)
			return i;		
		}
	if(i==count.length){
		for(int i=0;i<count.length;i++){
		count[i]=count[i]-1;			
		}
	
	min=-1;
	}
//	int min=count[0];
//	for(int i=0;i<count.length;i++){
//		if(count[i]<min){
//			min=i;			
//			}	
//		}
System.out.println("replacing index "+min);
return min;
}
static boolean isPresent(int[] n,int[] count,int k){
	for(int i=0;i<n.length;i++){
		if(n[i]==k){
			count[i]+=1;
//			System.out.println("num "+k+" is present at "+i+" count "+count[i]);
			return true;
			}
		}
return false;
}
static int repeatedNumber(final List<Integer> a) {
	int[] num=new int[2];
	int[] count=new int[2];
	int num_ind=0;
	int isempty=0;
	for(int i=0;i<a.size();i++){
		if(isempty<2){
			if(!isPresent(num,count,a.get(i))){
//			System.out.println("k array is empty for numbers");
			num[num_ind]=a.get(i);
			count[num_ind]=1;
//			System.out.println("num "+num_ind+": has "+a.get(i)+" count:"+count[num_ind]);
			num_ind++;
			isempty++;	
			}		
		}
		else if(!isPresent(num,count,a.get(i))){
			System.out.println("num "+i+" "+a.get(i)+" is not present");
			int replace_res=replace(num,count);
			if(replace_res==-1){
				break;	
			}
			else if(replace_res!=-1){
				num[num_ind]=a.get(i);
				count[num_ind]=1;
				num_ind=(num_ind+1)%2;
				} 			//%k	
				System.out.println("numind value"+num_ind);		
			
		}
			
	}
	for(int i=0;i<2;i++){
		if(count[i]>=a.size()/3){
			return num[i];			
			}			
		}
return -1;
    }
public static void main(String args[]){
Scanner s=new Scanner(System.in);
List<Integer> a=new ArrayList<Integer>();
int k=s.nextInt();
for(int i=0;i<k;i++){
	int x=s.nextInt();
	a.add(x);	
	}
//a.add(1);
//a.add(3);
//a.add(1);
System.out.println(repeatedNumber(a));
}
}
