import java.util.*;
class IB11_NobleInteger{

    static int solve(ArrayList<Integer> A) {
        Collections.sort(A);
        for(int i=0;i<A.size()-1;i++){
            if(A.get(i)==A.get(i+1))
                continue;
            if(A.get(i)==A.size()-i-1)
            return 1;
        }
        if(A.get(A.size()-1)==0){
            return 1;
        }
        return -1;
    }

public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	ArrayList<Integer> A=new ArrayList<Integer>();
	A.add(1);
	A.add(2);
	A.add(7);
	A.add(4);
	A.add(0);
	A.add(8);
	A.add(3);
	A.add(9);
int res=solve(A);
System.out.println(res);
}

}
