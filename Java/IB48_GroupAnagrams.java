import java.util.*;
class IB48_GroupAnagrams{
static String sort(String str){
	char[] charr=str.toCharArray();
	Arrays.sort(charr);
	return new String(charr);
	}
static ArrayList<ArrayList<Integer>> anagrams(final List<String> A) {
	
    	Hashtable<String,ArrayList<Integer>> ht=new Hashtable<String,ArrayList<Integer>>();
	for(int i=0;i<A.size();i++){
		String str=sort(A.get(i));
		if(!ht.containsKey(str)){
			ArrayList<Integer> inner=new ArrayList<Integer>();
			inner.add(i+1);
			ht.put(str,inner);		
			}
		else{
			ArrayList<Integer> inner=ht.get(str);
			inner.add(i+1);
			ht.put(str,inner);				
			}		
		}
		Set<String> keys =ht.keySet();
		ArrayList<ArrayList<Integer>> outer=new ArrayList<ArrayList<Integer>>();
		for(String key:keys){
			ArrayList<Integer> inner=new ArrayList<Integer>();
			inner=ht.get(key);
			outer.add(inner);			
			}
	return outer;	
}
public static void main(String args[]){
	List<String> list=new ArrayList<String>();
	list.add("cat");
	list.add("dog");
	list.add("god");
	list.add("atc");
	ArrayList<ArrayList<Integer>> outer=new ArrayList<ArrayList<Integer>>();
	outer=anagrams(list);
	for(int i=0;i<outer.size();i++){
		ArrayList<Integer> inner=outer.get(i);
		for(int j=0;j<inner.size();j++){
			System.out.print(inner.get(j)+",");			
			}
		System.out.println();		
		}
}
}
