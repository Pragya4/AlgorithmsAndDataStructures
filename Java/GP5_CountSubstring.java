import java.util.*;
class GP5_CountSubstring{
public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t!=0){
			int count=0;
			t--;
			String str=s.next();
			for(int i=0;i<str.length();i++){
				if(str.charAt(i)=='1'){
					count++;					
					}				
				}
			count=(count*(count-1))/2;
			System.out.println(count);		
		}


}

}
