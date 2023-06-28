import java.util.*;
class IB23_BitManip_CountSetBits{

	static int numSetBits(long a) {
	    String str=Long.toBinaryString(a);
	    int count=0;
	    for(int i=0;i<str.length();i++){
	        if(str.charAt(i)=='1')
	            count++;
	    }
	    return count;
	}
/*OR
public class Solution {
	public int numSetBits(long a) {
	    String str=Long.toBinaryString(a);
	    int count=Long.bitCount(a);
	    return count;
	}
}
*/

public static void main(String args[]){
	Long a=372485856L;
	System.out.println(numSetBits(a));
	System.out.println("diff"+Integer.MAX_VALUE);
}

}
