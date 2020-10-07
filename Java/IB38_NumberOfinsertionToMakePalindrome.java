import java.util.Scanner;
class IB38_NumberOfinsertionToMakePalindrome{
static int solve(String A){
int i=0;
int count=0;
int j=A.length()-1;
while(i<=j){
	if(A.charAt(i)!=A.charAt(j)){
		count++;
		j--;
		}
	else{
		i++;
		j--;			
		}
}
return count;
}
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	String a=new String();
	a=s.next();
	System.out.println(solve(a));
}	

}
