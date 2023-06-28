import java.util.*;
import java.util.Hashtable;
class SymmetricSetHashing{
	public static void main(String args[]){
		Hashtable<Integer,Integer> h=new Hashtable<Integer,Integer>();
		Scanner s=new Scanner(System.in);
		int a=0,b=0;
		while(a!=-1){
			a=s.nextInt();
			b=s.nextInt();
			if(!h.containsKey(b)){
				h.put(a,b);					
				}
			else if(h.containsKey(b)){
					if(h.get(b)==a){
						System.out.println(a+","+b);					
						}
					else{
						h.put(a,b);						
					}				
				}		
			}	
		}
}
			
