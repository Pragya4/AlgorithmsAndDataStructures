import java.util.Scanner;
import java.util.Arrays;
import java.text.DecimalFormat;
class GP1_CheckIfSquare{
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	int t=s.nextInt();
	while(t!=0){
		t--;
	double[] x=new double[4];
	double[] y=new double[4];
	for(int i=0;i<4;i++){
			x[i]=s.nextDouble();
			y[i]=s.nextDouble();
		}
	int flag=0;
	double side[]=new double[6];
	
	side[0]=Math.sqrt(Math.pow((x[1]-x[0]),2)+Math.pow((y[1]-y[0]),2));
	side[0]=Double.parseDouble(String.format("%.4f", side[0]));	
	side[1]=Math.sqrt(Math.pow((x[3]-x[2]),2)+Math.pow((y[3]-y[2]),2));
	side[1]=Double.parseDouble(String.format("%.4f", side[1]));
	side[2]=Math.sqrt(Math.pow((x[2]-x[0]),2)+Math.pow((y[2]-y[0]),2));
	side[2]=Double.parseDouble(String.format("%.4f", side[2]));
	side[3]=Math.sqrt(Math.pow((x[1]-x[2]),2)+Math.pow((y[1]-y[2]),2));
	side[3]=Double.parseDouble(String.format("%.4f", side[3]));
	side[4]=Math.sqrt(Math.pow((x[3]-x[1]),2)+Math.pow((y[3]-y[1]),2));
	side[4]=Double.parseDouble(String.format("%.4f", side[4]));
	side[5]=Math.sqrt(Math.pow((x[3]-x[0]),2)+Math.pow((y[3]-y[0]),2));
	side[5]=Double.parseDouble(String.format("%.4f", side[5]));	
	
	int high=0;
	double sside=0;
	Arrays.sort(side);
	for(int i=0;i<6;i++){
			System.out.println(i+":"+side[i]);	
		}	
	if(side[0]==side[1] && side[1]==side[2] && side[2]==side[3]){
		sside=side[1];
		flag=0;
		System.out.println("All sides equal");
			}
	else{
		flag=1;
		System.out.println("Unequal sides");
		}
	if(flag==0 && side[4]==side[5]){
		flag=0;
		System.out.println("All sides equal equal diag");	
	}
	else{
		flag=1;
		System.out.println("All sides equal uneq dia");
		}
	if(flag==0 && (side[4]==Double.parseDouble(String.format("%.4f",(Math.sqrt(2)*sside)))) && (side[4]==side[5])){
		flag=0;
		System.out.println("All sides equal diag equal ,diag sync with sides");
	}
	else{
		flag=1;
		System.out.println(Double.parseDouble(String.format("%.4f",(Math.sqrt(2)*sside)))+" , "+side[4]+" , "+side[5]);
		System.out.println("All sides equal diag side issue");
	}
	if((side[0]==0)&&(side[0]==side[1])&&(side[1]==side[2])&&(side[2]==side[3]))
		flag=1;
if(flag==0){
	System.out.println("Yes");	
	}
else{
	System.out.println("No");
}
}
}
}
