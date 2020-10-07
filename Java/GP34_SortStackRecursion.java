import java.util.*;
class GP34_SortStackRecursion{
static Stack<Integer> stk=new Stack<Integer>();
static void sortedArr(Stack<Integer> stk){
	if(!stk.isEmpty()){
	int temp=stk.pop();
	sortedArr(stk);
	SortElement(stk,temp);		
	}
}
static void SortElement(Stack<Integer> stk,int x){
	if(stk.isEmpty()||x>stk.peek()){
		stk.push(x);		
		}
	else{
		int temp=stk.pop();
		SortElement(stk,x);
		stk.push(temp);		
		}	
	}
public static void main(String args[]){
	stk.push(10);
	stk.push(4);
	stk.push(7);
	stk.push(1);
	stk.push(8);
	sortedArr(stk);
	while(!stk.isEmpty()){
		System.out.println(stk.pop());		
		}		
	}
}
