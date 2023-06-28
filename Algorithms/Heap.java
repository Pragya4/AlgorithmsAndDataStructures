import java.util.Scanner;
class Heap{
void BottomupHeapify(int[] a,int i){
	int p=(i-1)/2;
	while(i>0 && a[p]>a[i]){
		int tracki=i;
		System.out.println("Swapping "+a[i]+" "+a[p]);
		int temp=a[i];
		a[i]=a[p];
		a[p]=temp;
		i=p;
		p=(i-1)/2;		
		}		
		
}
int TopDownHeapify(int[] a,int n){
	int l=1;
	int r=2;
	int i=0;
	int minchild;
	while(r<n){
		if(a[l]<a[r]){		
			minchild=l;
		}
		else{
			minchild=r;				
			}
		System.out.println("mincild is "+a[minchild]);
		if(a[i]>a[minchild]){
			int temp=a[minchild];
			a[minchild]=a[i];
			a[i]=temp;
			i=minchild;
			l=(2*i)+1;
			r=(2*r)+2;	
			
		}
		else{
			
			i++;
			l=(2*i)+1;
			r=(2*i)+2;
			System.out.println(a[i]+" "+a[l]+" "+a[r]);
			}
}		
return n-1;	
}

int insert(int[] a,int i,int x){
	a[i]=x;
	BottomupHeapify(a,i);
	return i+1;
}
int delete(int[] a,int n){
	int temp=a[0];
	a[0]=a[n-1];
	a[n-1]=temp;
	int ind=TopDownHeapify(a,n);
return ind;
}
void ChangeKey(int[] a,int i,int x,int index){
	int old=a[i];
	a[i]=x;
	if(old>x){
		BottomupHeapify(a,index);
		}
	else if(old<x){
		TopDownHeapify(a,index);		
		}
}
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	Heap obj=new Heap();
	int[] a=new int[100];
	System.out.println("Enter your choice");
	int choice=s.nextInt();
	int x;
	int index=0;
	while(choice!=-1){
		if(choice==1){
			x=s.nextInt();
			index=obj.insert(a,index,x);
			}
		if(choice==2){
			System.out.println("Index"+index);
			index=obj.delete(a,index);	
			}
		if(choice==3){
			System.out.println("Enter the index to be changed");
			int i=s.nextInt();
			System.out.println("changed to what?");
			int el=s.nextInt();
			obj.ChangeKey(a,i,el,index);			
			}
		if(choice==4){
			for(int i=0;i<index;i++)
				System.out.println(a[i]);				
			}
	System.out.println("choice");
	choice=s.nextInt();
			}		
	}
}
