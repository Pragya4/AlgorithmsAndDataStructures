/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GP61_QuadrupleSum {
    static void sum4(int[] a,int k){
        TreeMap<Integer,ArrayList<Integer>> hm=new TreeMap<Integer,ArrayList<Integer>>();
        int n=a.length;
        
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(!hm.containsKey(a[i]+a[j])){
                    ArrayList<Integer> index=new ArrayList<Integer>();
                    index.add(i);
                    index.add(j);
                    hm.put(a[i]+a[j],index);
                }
                else{
                    ArrayList<Integer> index=new ArrayList<Integer>();
                    index=hm.get(a[i]+a[j]);
                    index.add(i);
                    index.add(j);
                    hm.put(a[i]+a[j],index);
                }
            }
        }
        
        Set<Integer> keys=hm.keySet();
        
       for(Integer key:keys){
           //System.out.println("key "+key);
           int l=0;
            int r=n-1;
            while(l<r){
                //System.out.println("at l r "+l+", "+r+" key "+key);
            int sum=a[l]+a[r];
            if(key+sum==k){
                //System.out.println("at "+l+" "+r+" sum "+sum);
                ArrayList<Integer> index=new ArrayList<Integer>();
                index=hm.get(k-sum);
                if(!index.contains(l) || !index.contains(r)){
                    for(int i=0;i<index.size();i+=2){
                        System.out.println(a[l]+" "+a[r]+" "+a[index.get(i)]+" "+a[index.get(i+1)]);
                    }
                    l++;
                    r--;
                }
		else{
			
			l++;		
		}
            }
            else if(key<k-sum){
                l++;        //ie sum should be greater to reduce k-sum
            }
            else{
                r--;
            }
        }
       }
    }
	public static void main (String[] args) {
		//code
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t!=0){
		    t--;
		    int n=s.nextInt();
		    int k=s.nextInt();
		    int[] a=new int[n];
		    for(int i=0;i<n;i++){
		        a[i]=s.nextInt();
		    }
		    
		    sum4(a,k);
		}
	}
}
