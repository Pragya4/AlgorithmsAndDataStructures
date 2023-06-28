import java.util.*;
class heapbasics{
static void TopDownHeapify(ArrayList<Integer> A){
	swap(A,0,A.size()-1);
	int n=A.size()-1;
	int i=0;
	while(2*i+2<n){
		int left=2*i+1;
		int right=2*i+2;
		int smaller=(A.get(left)<A.get(right))?left:right;
		if(A.get(smaller)<A.get(i)){
			swap(A,smaller,i);
			if(smaller==left)
				i=left;				
				
			else
				i=right;
			}
		else{
			break;				
			}		
		}
}
static void swap(ArrayList<Integer> a,int s,int e){
	int temp=a.get(s);
	a.set(s,a.get(e));
	a.set(e,temp);
}
static void BottomUpHeapify(ArrayList<Integer> A){
	int i=A.size()-1;
	while(i>0){
		int p=(i-1)/2;
	if(p>=0 && A.get(p)>A.get(i)){
		while(i>0 && p>=0 && A.get(i)<A.get(p)){
			p=(i-1)/2;
			swap(A,i,p);
			i=i/2;				
			}			
		}
	else{
		break;		
		}
	
	}
}
static void insert(ArrayList<Integer> a,int x){
	a.add(x);
	BottomUpHeapify(a);
	display(a);
}
static void display(ArrayList<Integer> a){
	for(int i=0;i<a.size();i++){
		System.out.print(a.get(i)+" ");			
		}
}
static void delete(ArrayList<Integer> a){
	TopDownHeapify(a);
	display(a);
}
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
ArrayList<Integer> arr=new ArrayList<Integer>();
insert(arr,5);
System.out.println();
insert(arr,6);
System.out.println();
insert(arr,3);
System.out.println();
insert(arr,2);
System.out.println();
delete(arr);

}
}
