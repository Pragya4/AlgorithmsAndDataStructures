import java.util.*;
class GP35_SortStackUsing_Temperory_Stack{
static Stack<Integer> sortElements(Stack<Integer> stk){
	Stack<Integer> temp=new Stack<Integer>();
	while(!stk.isEmpty()){
		int x=stk.pop();
		if(temp.isEmpty() || temp.peek()<x){
			temp.push(x);			
			}
		else{
			while(!temp.isEmpty() && temp.peek()>x){
				stk.push(temp.pop());				
			}
		temp.push(x);			
		}		
		}
return temp;
}

public static void main(String args[]){
	Stack<Integer> stk=new Stack<Integer>();
	stk.push(6);
	stk.push(9);
	stk.push(1);
	stk.push(4);
	stk.push(0);
	stk.push(3);
	stk.push(7);
	stk.push(2);
	Stack<Integer> res=sortElements(stk);
	while(!res.isEmpty()){
		System.out.println(res.pop());		
		}
}

}
