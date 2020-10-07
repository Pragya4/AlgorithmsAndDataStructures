import java.util.*;
class IB18_TripleSumInGivenRange{
static int sum(float[] a){
	ArrayList<Float> x=new ArrayList<Float>();
	ArrayList<Float> x1=new ArrayList<Float>();
	int x1_num=0,x2_num=0,x_num=0,y_num=0,z_num=0;
	ArrayList<Float> x2=new ArrayList<Float>();
	ArrayList<Float> y=new ArrayList<Float>();
	ArrayList<Float> z=new ArrayList<Float>();
	for(int i=0;i<a.length;i++){
		if(a[i]>0 && a[i]<0.5){
			x1.add(a[i]);	
			x1_num++;
			x.add(a[i]);
			x_num++;		
			}
		else if(a[i]>=0.5 && a[i]<(2.0/3.0)){
			x2.add(a[i]);
			x2_num++;
			x.add(a[i]);
			x_num++;		
			}
		else if(a[i]>=(2.0/3.0) && a[i]<=1){
			y.add(a[i]);
			y_num++;			
			}
		else if(a[i]>1 && a[i]<2){
			z.add(a[i]);
			z_num++;			
			}
				
		}
	//case A
	if(x_num>=3){
		System.out.println("case a");
		Collections.sort(x);
		if(x.get(x.size()-1)+x.get(x.size()-2)+x.get(x.size()-3)>1)
			return 1;
	}
	//case C
	if(x_num>=2 && z_num>=1){
		System.out.println("case c");
		Collections.sort(x);
		Collections.sort(z);
		if(x1.get(0)+x.get(1)+z.get(0)<2)
			return 1;			
		}
	//case d
	if(x_num>=1 && y_num>=2){
		System.out.println("case d");
		Collections.sort(x);
		Collections.sort(y);
		if(x.get(0)+y.get(0)+y.get(1)<2)
			return 1;			
		}
	//case e
	if(x_num>=1 && y_num>=1 && z_num>=1){
		System.out.println("case e");
		if(Collections.min(x)+Collections.min(y)+Collections.min(z)<2)	
			return 1;
		}
	//case B1
	if(x1_num>=1 && x2_num>=1 &&  y_num>=1){
		System.out.println("case b1");
		Collections.sort(x1);
		Collections.sort(x2);
		Collections.sort(y);
		if(x1.get(0)+x2.get(0)+y.get(0)>1 && x1.get(0)+x2.get(0)+y.get(0)<2)
			return 1;		
		}
	//caseb2
	if(x1_num>=2 && y_num>=1){
		System.out.println("case b2");
		Collections.sort(x1);
		Collections.sort(y);
		System.out.println(x1.get(0)+" "+x1.get(1)+" "+y.get(0));
		if(x1.get(0)+x1.get(1)+y.get(0)>1 && x1.get(0)+x1.get(1)+y.get(0)<2)
			return 1;			
		}
	//case b3	
	if(x2_num>=2 && y_num>=1){
		System.out.println("case b3");
		Collections.sort(x2);
		Collections.sort(y);
		if(x2.get(0)+x2.get(1)+y.get(0)>1 && x2.get(0)+x2.get(1)+y.get(0)<2)
			return 1;			
		}
		
	return 0;
}
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();	
	float[] a=new float[n];
	for(int i=0;i<n;i++){
		a[i]=s.nextFloat();			
		}
	
	System.out.println(sum(a));		
	}

}
