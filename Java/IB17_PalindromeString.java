import java.util.Scanner;
class IB17_PalindromeString{
static int isPalindrome(String str){
	str=str.replaceAll("\\s","");
	System.out.println("flag2: "+str);
	String str1="";
	str=str.toLowerCase();
	System.out.println("flag3: "+str);
	int l=0;
	int r=str.length()-1;
	int flag=0;
	while(l<=r && flag==0){
	System.out.println("flagwhile"+str.charAt(l)+" "+str.charAt(r)+"l & r"+l+","+r);
	if(!Character.isLetterOrDigit(str.charAt(l))){
		System.out.println("flag4");
		l++;			
		}
	if(!Character.isLetterOrDigit(str.charAt(r))){
		System.out.println("flag5");
		r--;			
		}
	else if(Character.isLetterOrDigit(str.charAt(l)) && Character.isLetterOrDigit(str.charAt(l)) && (str.charAt(l)==str.charAt(r))){
		System.out.println("flag6");
		l++;
		r--;
		}
	else if(Character.isLetterOrDigit(str.charAt(r)) && Character.isLetterOrDigit(str.charAt(l)) && str.charAt(l)!=str.charAt(r)){
		System.out.println("flag7");
			flag=1;	
			l=r+1;		
			return 0;			
			}		
		}
System.out.println("l"+l+"r"+r);
if(l==r+2 && flag==0)
	return 1;
return 0;	
}
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	System.out.println("flag0");
	String str=s.nextLine();
	System.out.println("flag1");
	System.out.println(isPalindrome(str));
}

}
