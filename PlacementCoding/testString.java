import java.util.*;
class testString{
	public static void main(String args[]){
		String a="10";
		try{
		int res1=Integer.valueOf(a);
		System.out.println(res1);
		}
		catch(Exception e){
			System.out.println("Incorrect 1");			
			}
		String b="10u";
		try{
			
			int res2=Integer.valueOf(b);
			System.out.println(res2);
		}
		catch(Exception e){
			System.out.println("Incorrect");			
		}
					
		}

}
