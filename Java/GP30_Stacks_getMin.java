import java.util.*;
class GP30_Stacks_getMin{
static boolean push(Stack<Integer> stk1,Stack<Integer> stk2,int x){
	stk1.push(x);
	if(stk2.isEmpty()){
		stk2.push(x);		
		}
	else if(stk2.peek()<x){
		int top=stk2.peek();
		stk2.push(top);			
		}
	else if(x<=stk2.peek()){
		stk2.push(x);			
		}
return true;		
}
static boolean pop(Stack<Integer> stk1,Stack<Integer> stk2){
	if(!stk1.isEmpty()){
		stk1.pop();
		stk2.pop();			
		}
	else
		return false;
	return true;		
	}
static int getMin(Stack<Integer> stk2){
	if(!stk2.isEmpty()){
		return stk2.peek();		
	}
	else{
		return -1;		
	}			
	}


public static void main(String args[]){
	GP30_Stacks_getMin obj=new GP30_Stacks_getMin();
	Stack<Integer> stk1=new Stack<Integer>();
	Stack<Integer> stk2=new Stack<Integer>();
	
	push(stk1,stk2,7);
	push(stk1,stk2,4);
	push(stk1,stk2,9);
	push(stk1,stk2,0);
	push(stk1,stk2,6);
	System.out.println(getMin(stk2));
	pop(stk1,stk2);
	System.out.println(getMin(stk2));
	pop(stk1,stk2);
	System.out.println(getMin(stk2));			
	}

}
