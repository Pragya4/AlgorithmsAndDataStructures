/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;
class customcomparator implements Comparator<Entry<Integer,Integer>>{
    public int compare(Map.Entry<Integer,Integer> e1,Map.Entry<Integer,Integer> e2){
        if (e1.getValue()>=e2.getValue()) return -1;
        return -1;
    }
}
class GP49_SortByFreq {
    static ArrayList<Map.Entry<Integer,Integer>> sortbyvalue(Map<Integer,Integer> hm){
        List<Map.Entry<Integer,Integer>> list_of_hm=hm.entrySet();
        list_of_hm=Collections.sort(list_of_hm,new customcomparator());
    }
	public static void main (String[] args) {
		//code
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t!=0){
		    t--;
		    int n=s.nextInt();
		    int[] a=new int[n];
		    for(int i=0;i<n;i++){
		        a[i]=s.nextInt();
		    }
		    Map<Integer,Integer> hm=new HashMap<Integer,Integer>();
		    for(int i=0;i<n;i++){
		        if(!hm.containsKey(a[i])){
		            hm.put(a[i],1);
		        }
		        else{
		            hm.put(a[i],hm.get(a[i])+1);
		        }
		    }
		    ArrayList<Map.Entry<Integer,Integer>> res=sortbyvalue(hm);
		    for(Map.Entry<Integer,Integer> e:res){
		        System.out.println(e.getKey()+","+e.getValue());
		    }
		    }
		}
	}

