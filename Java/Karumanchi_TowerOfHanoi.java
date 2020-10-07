import java.util.Scanner;

class Karumanchi_TowerOfHanoi{
static int Hanoi(int n,char source,char aux,char dest){
	if(n==1){
		System.out.println("Moving ring "+n+" from "+source+" to "+dest);		
		return 1;		
		}
	Hanoi(n-1,source,dest,aux);
	System.out.println("Moving ring "+n+" from "+source+" to "+dest);
	Hanoi(n-1,aux,dest,source);
	
return 1;
}
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	char source='A';
	char Destination='C';
	char Auxillary='B';
	Hanoi(n,source,Auxillary,Destination);


}
}
