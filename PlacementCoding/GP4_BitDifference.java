import java.util.Scanner;
class GP4_BitDifference{
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	int t=s.nextInt();
	while(t!=0){
	t--;
	int a=s.nextInt();
	int b=s.nextInt();
	String a_bin=Integer.toBinaryString(a);
	System.out.println(a_bin);
	String b_bin=Integer.toBinaryString(b);
	System.out.println(b_bin);
	int n=b_bin.length();
	String extra="0";
	if(a_bin.length()>b_bin.length()){
		extra=a_bin.substring(0,(a_bin.length()-b_bin.length()));
		System.out.println("flag1"+extra);
		}
	else if(b_bin.length()>a_bin.length()){
		n=a_bin.length();
		extra=b_bin.substring(0,(b_bin.length()-a_bin.length()));
		System.out.println("flag2:"+extra);
		}
	
	int count=0;
	System.out.println("n: "+n);
	for(int i=0;i<n;i++){
			System.out.println("comparing "+a_bin.charAt(a_bin.length()-i-1)+" ,"+b_bin.charAt(b_bin.length()-i-1));
			if(a_bin.charAt(a_bin.length()-i-1)!=b_bin.charAt(b_bin.length()-i-1)){
				System.out.println("different at "+(a_bin.length()-i-1)+","+(b_bin.length()-i-1));
				count++;		
			}
		}
for(int j=0;j<extra.length();j++){
	if(extra.charAt(j)=='1')
		count++;	
	}
System.out.println(count);
}
}
}
