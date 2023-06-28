import java.util.*;
class ArrayListtest{
public static void main(String args[]){
Hashtable<Integer,ArrayList<Integer>> ht=new Hashtable<Integer,ArrayList<Integer>>();
ArrayList<Integer> res=new ArrayList<Integer>();
res.add(5);
res.add(3);
ht.put(1,res);
ArrayList<Integer> check=ht.get(1);
for(int i=0;i<res.size();i++){
	System.out.println(check.get(i));
	
}
}

}
