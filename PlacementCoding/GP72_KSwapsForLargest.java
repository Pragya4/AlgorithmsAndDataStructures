import java.util.*;
class GP72_KSwapsForLargest{
static int compare(String a,String b){
	int flag=0;
	for(int i=0;i<a.length();i++){
		if(Character.getNumericValue(a.charAt(i))>Character.getNumericValue(b.charAt(i))){
			flag=1;
			break;				
			}
			
		else if(Character.getNumericValue(a.charAt(i))<Character.getNumericValue(b.charAt(i))){
			flag=0;
			break;				
			}
						
		}
return flag;
} 
static String swap(String str,int i,int j){
	StringBuilder strb=new StringBuilder(str);
	char x=strb.charAt(i);
	strb.setCharAt(i,strb.charAt(j));
	strb.setCharAt(j,x);
return strb.toString();
}
static void findmax(String str,int k,String max){
	System.out.println("fun "+str);
	if(k==0)
		return;
	for(int i=0;i<str.length()-1;i++){
		for(int j=1;j<str.length();j++){
			if(str.charAt(i)<str.charAt(j)){
				str=swap(str,i,j);
				if(compare(str,max)>0){
					max=str;						
					}
				System.out.println("before findmax "+str+" "+max);
				findmax(str,k-1,max);
				System.out.println("after findmax "+str+" "+max);
				str=swap(str,i,j);
				System.out.println("last "+str);					
				}			
			}			
		}

}
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	int t=s.nextInt();
	while(t!=0){
		t--;
		int k=s.nextInt();
		String str=s.next();
		//int[] str=new int[str1.length()];
		//for(int i=0;i<str1.length();i++){
		//	str[i]=Character.getNumericValue(str1.charAt(i));				
		//	}
		String max=str;
		findmax(str,k,max);
		System.out.println(max);		
		}
}

}
