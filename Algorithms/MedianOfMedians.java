import java.util.Scanner;
class MedianOfMedians{
int divide(int[] a,int n){
	
	int[] five=new int[5]; 
	int i=0;
	int[] mediana=new int[(n/5)+1];
	if(n>4){
	for(i=0;5*(i+1)<n;i++){
		
		System.out.println("here"+i);
		five[0]=a[5*i];
		five[1]=a[5*i+1];
		five[2]=a[5*i+2];	
		five[3]=a[5*i+3];
		five[4]=a[5*i+4];
		mediana[i]=median(five,5);
		for(int k=0;k<5;k++)
			System.out.print(five[k]);		
		}
		}
	if(n>1){
		System.out.println("out of for"+i);
		//i=i-4;
		System.out.println("size of array"+(n-(5*i)));
		int[] rem=new int[n-(5*i)];
		int j=0;
		int k=i;
		i=i*5;
	while(i<n){
		rem[j]=a[i];
		j++;
		i++;				
	}
	mediana[k]=median(rem,(n-(5*k)));
	System.out.println("median");
	for(int p=0;p<=(n/5);p++){
		System.out.println(mediana[p]);		
		}
	while(n>1 ){
		divide(mediana,(n/5)+1);		
		}
	
}
else{
	n=0;
}
return mediana[0];
}
int median(int[] a,int n){
for(int i=0;i<n;i++){
	for(int j=i+1;j<n;j++){	
	if(a[i]>a[j]){
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;		
	
}	}
}
System.out.println("sorted");
for(int i=0;i<n;i++){
System.out.println(a[i]);
}

return a[(n-1)/2];
}
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	MedianOfMedians obj=new MedianOfMedians();
	int n=s.nextInt();
	int[] a=new int[n];
	for(int i=0;i<n;i++){
		a[i]=s.nextInt();		
		}
	System.out.println("in main"+obj.divide(a,n));
}
}
