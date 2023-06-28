import java.util.*;
class IB5_MaxDiff{
public static void main(String args[]){
	ArrayList<Integer> A=new ArrayList<Integer>();
	A.add(1);
	A.add(3);
	A.add(-1);
        int max=0;
        int[] A1=new int[A.size()];
	for(int i=0;i<A.size();i++){
		A1[i]=A.get(i).intValue();		
		}
        Arrays.sort(A1);
        String str=Arrays.toString(A1);
        StringBuilder str1=new StringBuilder(str);
        str1.deleteCharAt(0);
        str1.deleteCharAt(str1.length()-1);
        String[] strarr=str1.toString().split(", ");
        int[] a=new int[strarr.length];
        for(int i=0;i<strarr.length;i++){
            a[i]=Integer.parseInt(strarr[i]);
        }
        int l=0;
        int r=strarr.length-1;
        max=(Math.abs(a[l]-a[r])+Math.abs(l-r))-1;
        System.out.println( max);

}


}
