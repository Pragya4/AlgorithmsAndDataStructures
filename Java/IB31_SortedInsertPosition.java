import java.util.Scanner
class IB31_SortedInsertPosition{

	public int searchInsert(ArrayList<Integer> a, int b) {
	    int low=0;
	    int high=a.size()-1;
	    int mid=low+(high-low)/2;
	    int res=0;
	    if(b>a.get(a.size()-1)){
	        res=a.size();
	        low=high+1;
	    }
	    while(low<=high){
	        mid=low+(high-low)/2;
	      //  System.out.println(a.get(low)+" "+a.get(mid)+" "+a.get(high));
	        if(a.get(mid)==b){
	            res =mid;
	            low=high+2;
	            break;
	        }
	       else if(mid+1<=a.size()-1 && a.get(mid)<b && a.get(mid+1)>b){
	            res= mid+1;
	            low=high+2;
	            break;
	       }
	       else if(a.get(mid)<b)
	            low=mid+1;
	       else if(a.get(mid)>b)
	            high=mid-1;
	    }
	    //System.out.println("result "+res);
	    return res;
	}


}

