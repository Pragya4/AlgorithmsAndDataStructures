import java.util.*;
class Greedy_Knapsack{
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	
	double[] w=new double[n];
	double[] p=new double[n];
	double W;	
	for(int i=0;i<n;i++){
		w[i]=s.nextDouble();
		p[i]=s.nextDouble();		
				
	}
	System.out.println("Max Knapsack Accomodation");
	W=s.nextDouble();
	for(int i=0;i<n-1;i++){
		for(int j=i+1;j<n;j++){
			if((p[i]/w[i])<(p[j]/w[j])){
				double tempw=w[i];
				double tempp=p[i];
				w[i]=w[j];
				p[i]=p[j];
				w[j]=tempw;
				p[j]=tempp;				
						
				}			
			}		
		}
	double sum=0;
	System.out.println("Sorted sequence");
	for(int i=0;i<n;i++){
		System.out.println(w[i]+" "+p[i]);		
		}
	System.out.println("accomodation");
	for(int i=0;i<n;i++){
		if(W==0){	
			i=n+1;			
			}
		else{
			
			if(w[i]>W){
				double x=W/w[i];
				System.out.println(w[i]+" "+(p[i]*x));
				sum+=(p[i]*x);
				W=0;
						
			}
			else if(w[i]<W){
			System.out.println(w[i]+" "+(p[i]));
			W=W-w[i];  
			sum+=p[i];
			}			
			}
				
				
		}
System.out.println("Final profit "+sum);

}
}
