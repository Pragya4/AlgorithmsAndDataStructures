import java.util.*;
class GP69_ReplaceWithSameIndex_DistinctString{
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	String str11=s.next();
	String str12=s.next();
	StringBuilder str1=new StringBuilder(str11);
	StringBuilder str2=new StringBuilder(str12);
	Set<String> set=new HashSet<String>();
	for(int len=1;len<=str1.length();len++){
		StringBuilder temp=new StringBuilder(str1);
		for(int i=0;i<str11.length()-len+1;i++){
			temp=new StringBuilder(str1);
			temp.replace(i,i+len,str12.substring(i,i+len));
			System.out.println(temp);
			set.add(temp.toString());				
			}			
		}
	for(int len=1;len<=str1.length();len++){
		StringBuilder temp=new StringBuilder(str2);
		for(int i=0;i<str11.length()-len+1;i++){
			temp=new StringBuilder(str2);
			temp.replace(i,i+len,str11.substring(i,i+len));
			System.out.println(temp);
			set.add(temp.toString());				
			}			
		}
System.out.println(set.size());
}
}
