import java.util.*;
public class IB30_SearchRange_BinSearch {
	// DO NOT MODIFY THE LIST
	static int first(List<Integer> a,int low,int high,int key){
	System.out.println("FIRST "+low+","+high);
	    int mid=low+(high-low)/2;
	    while(mid>=low){
	    System.out.println("fisrt mid"+mid);
	    if(mid-1>=low && a.get(mid)==key && a.get(mid-1)!=key){
		System.out.println("a.get(mid)==key && a.get(mid-1)!=key at mid "+mid);
	        mid=low-2;
	        return mid;
	    }
	    else if(mid==low && a.get(mid)==key)
			return mid;
	    else if(a.get(mid)<key){
	           mid++;
	           low=mid;
	    }
	   else{
		mid--;
		high=mid;
		}
	    }
	    return -1;
	}
	static int last(List<Integer> a,int low,int high,int key){
			int mid=low+(high-low)/2;
		System.out.println("LAST "+low+","+high);
	    while(mid<=high && low<=high){
	    	mid=low+(high-low)/2;
	    if(mid+1<=low && a.get(mid)==key && a.get(mid+1)!=key){
//		System.out.println("a.get(mid)==key && a.get(mid+1)!=key at mid "+mid);
	        low=high;
	        return mid;
	    }
	    else if(mid==high && a.get(mid)==key){
		return mid;
		}
	   else if(a.get(mid)>key){
	           mid--;
	           high=mid;
	    }
	else{
		mid++;
		low=mid;			
		}
	    }
	    return -1;
	}
	
	static ArrayList<Integer> searchRange(final List<Integer> a, int b) {
	    ArrayList<Integer> res=new ArrayList<Integer>();
	    int low=0;
	    int high=a.size()-1;
	    int first_occurance=-1;
	    int last_occurance=-1;
	    int mid=-1;
	    int flag=0;
	    while(low<=high){
	        mid=low+(high-low)/2;
	        if(a.get(mid)==b){
			flag=1;
			System.out.println("0. mid "+mid);
	                first_occurance=first(a,low,mid-1,b);
//			System.out.println("1. First occ "+first_occurance);
	                last_occurance=last(a,mid+1,high,b);
//			System.out.println("2. Last occ "+last_occurance);
	                break;
	        }
	        else if(a.get(mid)<b){
//		System.out.println("a.get(mid)<b ");
	            low=mid+1;
	        }
	        else{
//		System.out.println("a.get(mid)>b ");
	            high=mid-1;
	        }
	    }
	    
	    if(flag==0 ||mid==-1){
	        res.add(-1);
	        res.add(-1);
//		System.out.println("result "+res.get(0)+","+res.get(1));
	        return res;
	    }
	    if(first_occurance==-1 && last_occurance!=-1){
	        res.add(mid);
	        res.add(last_occurance);
//		System.out.println("result "+res.get(0)+","+res.get(1));
	    }
	    else if(first_occurance!=-1 && last_occurance==-1){
	        res.add(first_occurance);
	        res.add(mid);
//		System.out.println("result "+res.get(0)+","+res.get(1));
	    }
	    else if(first_occurance !=-1 && last_occurance!=-1){
	        res.add(first_occurance);
	        res.add(last_occurance);
//		System.out.println("result "+res.get(0)+","+res.get(1));
	    }
		else if(flag==1){
			res.add(mid);
			res.add(mid);			
		}
	    return res;
	}
public static void main(String args[]){
	ArrayList<Integer> a=new ArrayList<Integer>();
	a.add(1);
	a.add(1);
	a.add(1);
	a.add(1);
	a.add(2);
	a.add(3);
	a.add(3);
	a.add(3);
	a.add(3);
	a.add(3);
	a.add(3);
	a.add(3);
	a.add(3);
	a.add(3);
	a.add(3);
	a.add(3);
	a.add(3);
	a.add(3);
	a.add(3);
	a.add(3);
	ArrayList<Integer> r=new ArrayList<Integer>();
	//for(int i=0;i<a.size();i++){
	//	System.out.print(a.get(i)+" ");		
	//	}
	//System.out.println();
	r=searchRange(a,3);
	for(int i=0;i<r.size();i++){
		System.out.println(r.get(i));		
		}
}
}

