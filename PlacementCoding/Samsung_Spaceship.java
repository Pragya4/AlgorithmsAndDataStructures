import java.util.*;
class Samsung_Spaceship{
//static int coins=0;
static int collectcoins(int[][] a,int r,int c,int x,int y,int bombs,int coins){
			//System.out.println("enter  x y r c "+x+","+y+","+r+","+c);
	if(x<0||x>r||y<0||y>c){
			//System.out.println("out of bounds x y r c "+x+","+y+","+r+","+c+"="+coins);
			return coins;
	}
	if(x!=r && y!=c){	
	if(a[x][y]==2 && bombs==0)
		return coins;
	if(a[x][y]==1){	
		System.out.println("coin added at "+x+","+y+","+r+","+c+"="+coins);	
		coins++;
	}
	}
	if(bombs==1){
	int[][] b=new int[r][c];
	for(int i=0;i<r;i++){
		for(int j=0;j<c;j++)
			b[i][j]=a[i][j];		
			}
	int index=x;
	int count=5;
	while(index-->0 && count-->0){
		for(int i=0;i<c;i++){
			if(b[index][i]==2)
				b[index][i]=0;			
			}			
		}
	}
	if(bombs==1){
		//int y1=y-1;

		int k=collectcoins(a,r,c,x-1,y-1,1,coins);
		System.out.println("k "+k);
		int l=collectcoins(a,r,c,x-1,y+1,1,coins);
		System.out.println("l "+l);
		int m=collectcoins(a,r,c,x-1,y,1,coins);
		System.out.println("m "+m);	
		int n=collectcoins(a,r,c,x-1,y-1,0,coins);
		System.out.println("n "+n);
		int o=collectcoins(a,r,c,x-1,y+1,0,coins);
		System.out.println("o "+o);
		int p=collectcoins(a,r,c,x-1,y,0,coins);
		System.out.println("p "+p);	
		int retval= Math.max(Math.max(k,l),Math.max(Math.max(m,n),Math.max(o,p)));	
		return retval;	
		}
	else {
		int q1=collectcoins(a,r,c,x-1,y-1,0,coins);	
		int r1=collectcoins(a,r,c,x-1,y+1,0,coins);
		int s1=collectcoins(a,r,c,x-1,y,0,coins);
		return Math.max(q1,Math.max(r1,s1));
		}
	//return coins;		
		}
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	int r=s.nextInt();
	int c=s.nextInt();
	int[][] a=new int[r][c];
	for(int i=0;i<r;i++){
		for(int j=0;j<c;j++){
			a[i][j]=s.nextInt();			
			}		
		}
	System.out.println("spaceship coorda ");
	int sx=s.nextInt();
	int sy=s.nextInt();	
	System.out.println("number of bombs");
	int bombs=s.nextInt();
	System.out.println(collectcoins(a,r,c,sx,sy,bombs,0));
	}
}
