import java.util.*;
class IB52_DP_MaximumJumps{
 public int jump(ArrayList<Integer> A) {
        if(A.size()<=1)
            return 0;
        int[] jump=new int[A.size()];
        int[] via=new int[A.size()];
        Arrays.fill(jump,Integer.MAX_VALUE);
        Arrays.fill(via,-1);
        jump[0]=0;
        via[0]=0;
        for(int i=1;i<A.size();i++){
            for(int j=0;j<i;j++){
                if(j+A.get(j)>=i){
                    if(jump[j]+1<jump[i] && via[j]!=-1){
                        jump[i]=1+jump[j];
                        via[i]=j;
                    }
                }
            }
        }
        if(via[A.size()-1]==-1)
            return -1;
        return jump[A.size()-1];
            
    }
	public static void main(String args[]){
		int[] a={3,2,1,0,4};
		canjump(a);
			
	}	

}
