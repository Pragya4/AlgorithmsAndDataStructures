import java.util.Scanner;
class DPCoinChange1D{
int coinchange(int[] d,int v){
int[] a=new int[v];
a[0]=0;
for(int i=1;i<a.length;i++){
a[i]=i;
}
for(int i=1;i<v;i++){
for(int j=0;j<d.length;j++){
	if(i>=d[j]){
		int subres=a[i-d[j]];
		if(subres+1<a[i]){
			a[i]=subres+1;
			}	
			}
	
}
}
return a[v-1];
}
public static void main(String args[]){
int[] a=new int[15];
int[] d={9,6,5,1};
DPCoinChange1D obj=new DPCoinChange1D();
int x=obj.coinchange(d,15);
System.out.println("Finasl"+x);
}

}
