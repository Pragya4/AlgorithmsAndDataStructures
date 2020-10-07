/* IMPORTANT: Multiple classes and nested static classes are supported */

import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class HackerEarthTest_NaviMagic {
    public static void main(String args[] ) throws Exception {
    try{
        Scanner s = new Scanner(System.in);
        int T=s.nextInt();
        
        while(T!=0){
            T--;
            int days=0;;
            int N=s.nextInt();
	    #System.out.println(Math.log(N));
	    #System.out.println(Math.abs(Math.log(N)/Math.log(2)));
            #System.out.println((N-Math.floor(Math.log(N)/Math.log(2))));
	    days=(int)(N-Math.pow(2,Math.floor(Math.log(N)/Math.log(2)))+1);
            System.out.println(days);
            
        }
        
    s.close();
    }
    catch(Exception e){
        return;
    }
    }
}
