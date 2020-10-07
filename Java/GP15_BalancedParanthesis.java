import java.util.*;
class GP15_BalancedParanthesis{
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	int t=s.nextInt();
	while(t!=0){
		t--;
		String str=s.next();
		Stack<Character> stk=new Stack<Character>();
		for(int i=0;i<str.length();i++){	
			if(str.charAt(i)=='('||str.charAt(i)=='{'||str.charAt(i)=='['){
				stk.push(str.charAt(i));				
				}
			else if(str.charAt(i)==')' && stk.peek()=='('){
				stk.pop();				
				}
			else if(str.charAt(i)==']' && stk.peek()=='['){
				stk.pop();				
				}
			else if(str.charAt(i)=='}' && stk.peek()=='{'){
				stk.pop();				
				}			
			}
		if(stk.isEmpty()){
			System.out.println("Balanced");			
			}
		else{
			System.out.println("Unbalanced");		
			}		
	}

}
}
