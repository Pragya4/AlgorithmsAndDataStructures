import java.util.*;
class GP33_ReverseStackUsingRecursion{
static Stack<Integer> stk=new Stack<Integer>();
static void reinsert(int x){
	if(stk.isEmpty()){
		stk.push(x);		
		}	
	else{
		int x1=stk.pop();
		reinsert(x);
		stk.push(x1);		
		}
	}
static void reverse(){	
	if(!stk.isEmpty()){	
		int x=stk.pop();
		System.out.println("seeing "+x);
		reverse();
		
		reinsert(x);
	}
	
}
public static void main(String args[]){

		stk.push(1);
		stk.push(2);
		stk.push(3);
		stk.push(4);
		reverse();
		while(!stk.isEmpty()){
			System.out.print(stk.pop()+" ");		
		}
		
	}	
}
