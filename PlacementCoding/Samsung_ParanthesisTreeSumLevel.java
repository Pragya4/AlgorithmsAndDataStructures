import java.util.*;
class Samsung_ParanthesisTreeSumLevel{
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	String str=s.next();
	int level=-1;
	int sum=0;
	int k=s.nextInt();
	for(int i=0;i<str.length();i++){
		if(str.charAt(i)=='(')
			level++;
		if(str.charAt(i)==')')
			level--;
		if(str.charAt(i)!='(' && str.charAt(i)!=')' && level==k){
			sum+=(str.charAt(i)-'0');				
			}			
		}
	System.out.println(sum);
	}
}
