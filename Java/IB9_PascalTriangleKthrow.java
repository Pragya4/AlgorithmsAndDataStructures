import java.util.*;
class IB9_PascalTriangleKthrow{
static ArrayList<Integer> generateMatrix(int A){
	//ArrayList<ArrayList<Integer>> outer=new ArrayList<ArrayList<Integer>>();
	        A=A+1;
        ArrayList<Integer> inner1=new ArrayList<Integer>();
        for(int i=1;i<=A;i++){
            if(i==1){
                inner1.add(1);
            }
            else{
                
                for(int j=inner1.size()-1;j>0;j--){
                    inner1.set(j,inner1.get(j)+inner1.get(j-1));
                }
                inner1.add(1);
            }
        
    }

return inner1;
}
public static void main(String args[]){
	ArrayList<Integer> res=generateMatrix(3);
	for (int i = 0; i < res.size(); i++){
   	 
        	System.out.print(res.get(i)+" ");
    

}


}

}
