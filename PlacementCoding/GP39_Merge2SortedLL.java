import java.util.*;
class GP39_Merge2SortedLL{
public static void main(String args[]){
	LinkedList<Integer> ll1=new LinkedList<Integer>();
	ll1.add(5);
	ll1.add(10);
	ll1.add(15);
	ll1.add(25);
	LinkedList<Integer> ll2=new LinkedList<Integer>();
	ll2.add(2);
	ll2.add(3);
	ll2.add(20);
	ll2.add(30);
	int i=0;
	int j=0;
	while(i<ll1.size() && j<ll2.size()){
		if(ll1.get(i)>ll2.get(j)){
			System.out.println(ll1.get(i)+","+ll2.get(j));
			ll1.add(i,ll2.get(j));
			j++;
			i++;				
			}
		else{
			i++;				
			}		
		}
	System.out.println(i+",,,"+j);
	if(j-1<ll2.size()-1){
		for(int k=j;k<ll2.size();k++){
			ll1.addLast(ll2.get(k));				
			}				
		}
for(int i1=0;i1<ll1.size();i1++){
	System.out.print(ll1.get(i1)+" ");		
	}
}

}
