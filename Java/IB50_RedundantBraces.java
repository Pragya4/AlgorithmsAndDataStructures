import java.util.*;
class IB50_RedundantBraces{
static int redundant(String str){
	Stack<Integer> stk=new Stack<Integer>();
	int last=-1;
	for(int i=0;i<str.length();i++){
		if(str.charAt(i)=='(' ){
			stk.push(i);			
			}
		else if(str.charAt(i)==')'){
			if(last==i-1){
				System.out.println("redundant at "+i);
				last=i;
				stk.pop();				
				}
			else{
				stk.pop();
				last=i;				
				}			
			}
		
			
	}
return 9;
}
public static void main(String args[]){
	redundant("((a+b)+c+(d-e))");
	}

}
