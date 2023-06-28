import java.util.*;
class IB21_LongestCommonPrefix{
    static String longestCommonPrefix(ArrayList<String> A) {
	String prefix="";
	if(A.size()==1)
	    return A.get(0);
	if(A.size()>=2){
		int i=0;
		int len=A.get(0).length();
		int index=0;
		for(int ind=1;ind<A.size();ind++){
		       
		        if(A.get(ind).length()<=len){
		           // System.out.println(ind+": "+A.get(ind).length()+" "+A.get(ind));
		            index=ind;
		            len=A.get(ind).length();
		        }
		}
	    //System.out.println(index+":::::::: "+A.get(index));
		while(i<=A.get(index).length()){
			if((A.get(0).substring(0,i)).equals(A.get(index).substring(0,i))){
			    //System.out.println(i);
			    prefix=A.get(0).substring(0,i);
				i++;
				//System.out.println(prefix);
			}
			else if(i>0){
				prefix=A.get(0).substring(0,i-1);
				//System.out.println("prefix here"+prefix);
				i=A.get(0).length()+5;
				}
			else if(i<=0)
				return "";			
			}								
		}
	int n=prefix.length();
	if(n>0){
	int k=1;
	while(k<A.size()){
	    
		if ((A.get(k).substring(0,n)).equals(prefix))
			k++;
		else if(n>0){
			prefix=prefix.substring(0,n-1);
			k=A.size();				
			}			
		}
	}
return prefix;        
    }
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	ArrayList<String> a=new ArrayList<String>();
	a.add("abcdefgh");
	a.add("abfghijk");
	a.add("abcefgh");	
	System.out.println(longestCommonPrefix(a));
}
}
