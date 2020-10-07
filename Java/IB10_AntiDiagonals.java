import java.util.*;
class IB10_AntiDiagonals{
static ArrayList<ArrayList<Integer>> generateMatrix(ArrayList<ArrayList<Integer>> A){
	
	ArrayList<ArrayList<Integer>> outer=new ArrayList<ArrayList<Integer>>();
	int r=0;
	int c=0;
	int n=A.size();
	while(r<n && r>=0){
		int i=0;
		int j=c;
		ArrayList<Integer> inner=new ArrayList<Integer>();
		while(j>=0 && i<n && c<n && c>=0){
				inner.add(A.get(i).get(j));
				i++;
				j--;		
			}
		c++;
		r++;
		//System.out.println("c"+c+"R"+r);
		/*for(int y=0;y<inner.size();y++){
			System.out.print(inner.get(y)+" ");			
			}
		System.out.println();*/
		outer.add(inner);		
		}
	r=1;
	while(r<n){
		int j=c-1;
		ArrayList<Integer> inner=new ArrayList<Integer>();
		int i=r;
		while(i<n && j>=0){
			inner.add(A.get(i).get(j));
			i++;
			j--;			
			}
		
		outer.add(inner);			
		/*for(int y=0;y<inner.size();y++){
			System.out.print(inner.get(y)+" ");			
			}
		System.out.println();*/
		r++;
		}
	

return outer;
}
public static void main(String args[]){
	ArrayList<ArrayList<Integer>> input=new ArrayList<ArrayList<Integer>>();
	ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();	
	ArrayList<Integer> inner1=new ArrayList<Integer>();
	inner1.add(1);
	inner1.add(2);
	inner1.add(3);
	input.add(inner1);
	ArrayList<Integer> inner2=new ArrayList<Integer>();
	inner2.add(4);
	inner2.add(5);
	inner2.add(6);
	input.add(inner2);
	ArrayList<Integer> inner3=new ArrayList<Integer>();
	inner3.add(7);
	inner3.add(8);
	inner3.add(9);
	input.add(inner3);
	res=generateMatrix(input);
	for(int i=0;i<res.size();i++){
		for(int j=0;j<res.get(i).size();j++){
			System.out.print(res.get(i).get(j)+" ");			
			}
		System.out.println();			
		}	
	
	

}
}
