import java.util.*;
class RemoveDuplicates{
	public static void main(String args[]){
		HashSet<Character> h=new HashSet<Character>();
		Scanner s=new Scanner(System.in);
		String str=s.next();
		char c[]=str.toCharArray();
		for(int i=0;i<str.length();i++){
			if(!h.contains(c[i])){
				h.add(c[i]);				
				}			
			}
		Iterator<Character> i = h.iterator();
        		while (i.hasNext())
        		    System.out.println(i.next());
		}
}
