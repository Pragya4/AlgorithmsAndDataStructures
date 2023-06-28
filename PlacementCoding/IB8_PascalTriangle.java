import java.util.*;
class IB8_PascalTriangle{
static ArrayList<ArrayList<Integer>> generateMatrix(int A){
	ArrayList<ArrayList<Integer>> outer=new ArrayList<ArrayList<Integer>>();
	ArrayList<Integer> inner1=new ArrayList<Integer>();
	for(int i=1;i<=A;i++){
		
		ArrayList<Integer> inner2=new ArrayList<Integer>();
		if(i==1){
			inner1.add(1);			
			}
		else{
			inner2.add(1);
			for(int j=1;j<i-1;j++){
				inner2.add(inner1.get(j-1)+inner1.get(j));				
				}
			inner2.add(1);
			inner1=inner2;			
			}
			outer.add(inner1);	
		}

return outer;
}
public static void main(String args[]){
	ArrayList<ArrayList<Integer>> res=generateMatrix(5);
	for (int i = 0; i < res.size(); i++){
   	 for (int j = 0; j < res.get(i).size(); j++){
        	System.out.print(res.get(i).get(j)+" ");
    } 
	System.out.println();
}


}

}
