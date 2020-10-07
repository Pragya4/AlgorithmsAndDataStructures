import java.util.*;
class IB46_4Sum_Hashing{
static ArrayList<Integer> sort(ArrayList<Integer> A){
	for(int i=0;i<A.size();i++){		
		for(int j=i+1;j<A.size();j++){
			if(A.get(i)>A.get(j)){
				int temp=A.get(i);
				A.set(i,A.get(j));
				A.set(j,temp);	
				}			
			}		
	}
//System.out.println("sort");
for(int i=0;i<A.size();i++)
	System.out.print(A.get(i)+" ");
return A;
}
static ArrayList<ArrayList<Integer>> fourSum(ArrayList<Integer> A, int B) {
    Hashtable<Integer,ArrayList<Integer>> ht=new Hashtable<Integer,ArrayList<Integer>>();    
    for(int i=0;i<A.size();i++){
        for(int j=i+1;j<A.size();j++){
            int sum=A.get(i)+A.get(j);
            //System.out.println(sum);
            if(!ht.containsKey(sum)){
                ArrayList<Integer> inner=new ArrayList<Integer>();
                inner.add(i);
                inner.add(j);
                ht.put(sum,inner);            
                }
            else{
                ArrayList<Integer> inner=ht.get(sum);
                inner.add(i);
                inner.add(j);
                ht.put(sum,inner);                        
                }        
            }        
        }
    ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
    for(int i=0;i<A.size();i++){
        for(int j=i+1;j<A.size();j++){
        int sum=A.get(i)+A.get(j);
        if(ht.containsKey(B-sum)){
            
            ArrayList<Integer> xy=ht.get(B-sum);
            for(int k=0;k<xy.size();k+=4){
                ArrayList<Integer> inner=new ArrayList<Integer>();
                //System.out.println("sum "+sum+" from "+A.get(i)+","+A.get(j)+" b-sum "+(B-sum)+" b from "+A.get(xy.get(0))+","+A.get(xy.get(1)));
                if(Math.min(A.get(xy.get(k)),A.get(xy.get(k+1)))!=Math.min(A.get(i),A.get(j)) && Math.max(A.get(xy.get(k)),A.get(xy.get(k+1)))!=Math.max(A.get(i),A.get(j))){
                //System.out.println("IIIFFFFFF  sum "+sum+" from "+A.get(i)+","+A.get(j)+" b-sum "+(B-sum)+" b from "+A.get(xy.get(0))+","+A.get(xy.get(1)));
                inner.add(A.get(xy.get(k)));
                inner.add(A.get(xy.get(k+1)));
                inner.add(A.get(i));
                inner.add(A.get(j));
                inner=sort(inner);
                //System.out.println(inner.size());
                if(inner.get(0)+inner.get(1)+inner.get(2)+inner.get(3)==B && !result.contains(inner)){
                    result.add(inner);
                    
                }
                }
            }
                
            }        
        }
    
    }
return result;
}

public static void main(String args[]){
ArrayList<Integer> input=new ArrayList<Integer>();
input.add(1);
input.add(0);
input.add(-1);
input.add(0);
input.add(-2);
input.add(2);
ArrayList<ArrayList<Integer>> result=fourSum(input, 0);
System.out.println("fuck9ng result");
for(int i=0;i<result.size();i++){
	for(int j=0;j<4;j++){
			System.out.print(result.get(i).get(j)+" ");			
			}
	System.out.println();
}   
}
}
