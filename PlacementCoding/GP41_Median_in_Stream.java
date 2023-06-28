import java.util.*;
class GP41_Median_in_Stream{
static PriorityQueue<Integer> maxheap_LHS=new PriorityQueue<Integer>(Collections.reverseOrder());
static PriorityQueue<Integer> minheap_RHS=new PriorityQueue<Integer>();
static int findmedian(int element,int median,int i,int n){
	System.out.print(i+" "+element);
	if(i==0){
		maxheap_LHS.add(element);
		median=element;
		}
	else{
		if(element<median){
			//should go to maxheap on lhs
			System.out.print(" going to maxheap ");
			if(maxheap_LHS.size()>minheap_RHS.size()){
				minheap_RHS.add(maxheap_LHS.poll());
				maxheap_LHS.add(element);				
				}
			else{
				maxheap_LHS.add(element);				
				}			
			}
		else if(element>=median){
			//should go to min heap on rhs
			System.out.print(" going to minheap ");
			if(minheap_RHS.size()>maxheap_LHS.size()){
				maxheap_LHS.add(minheap_RHS.poll());
				minheap_RHS.add(element);					
				}
			else{	
				minheap_RHS.add(element);			
			}						
			}			
		if(i%2==1){	//even number of elements
			System.out.print(" even elemes ");
			System.out.print(minheap_RHS.peek()+" "+maxheap_LHS.peek()+"  ");
			median=(minheap_RHS.peek()+maxheap_LHS.peek())/2;	
			}
		else if(i%2==0){	//odd number of elements
			System.out.print(" odd elems ");
			if(maxheap_LHS.size()>minheap_RHS.size())
				median=maxheap_LHS.peek();			
			}
			else{
				median=minheap_RHS.peek();				
			}	
		}
	return median;	
}
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int[] a=new int[n];
	for(int i=0;i<n;i++){
		a[i]=s.nextInt();					
		}
	int m=a[0];
	for(int i=0;i<n;i++){
		m=findmedian(a[i],m,i,n);
		System.out.println(" median "+m);		
	}
	
	}
}
