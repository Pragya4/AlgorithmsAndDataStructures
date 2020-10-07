/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GP48_RelativeOrdering {
	public static void main (String[] args) {
		//code
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t!=0){
		    t--;
		    int n1=s.nextInt();
		    int n2=s.nextInt();
		    int[] a1=new int[n1];
		    int[] a2=new int[n2];
		    for(int i=0;i<n1;i++){
		        a1[i]=s.nextInt();
		    }
		    for(int i=0;i<n2;i++){
		        a2[i]=s.nextInt();
		    }
		    HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		    for(int i=0;i<n1;i++){
		        if(!hm.containsKey(a1[i])){
		            hm.put(a1[i],1);
		        }
		        else{
		            hm.put(a1[i],hm.get(a1[i])+1);
		        }
		    }
		    Set<Integer> keys1=hm.keySet();
		    for(Integer key1:keys1){
		        System.out.println(key1 +" , "+hm.get(key1));
		    }
		    int[] res=new int[n1];
		    int p=0;
		    for(int i=0;i<n2;i++){
		        System.out.println(a2[i]);
		        int count=hm.get(a2[i]);
		        int k=0;
		        for(k=0;k<count;k++){
		            res[p]=a2[i];
				System.out.println(p+" : "+res[p]);
		            p++;
		        }
		        hm.remove(a2[i]);
		    }
		    int[] temp=new int[hm.size()];
		    int i=0;
		    Set<Integer> keys=hm.keySet();
		    for(Integer key:keys){
		        temp[i]=key;
		        i++;
		    }
		    Arrays.sort(temp);
		    for(int k=0;k<temp.length;k++){
		        for(int y=0;y<hm.get(temp[k]);y++){
		            res[p]=temp[k];
				System.out.println(p+" : "+res[p]);
		            p++;
		        }
		    }
		System.out.println("Final Result");
		for(int i2=0;i2<n1;i2++){
			System.out.print(res[i2]+" " );			
			}
		}
	}
}
