#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<time.h>
struct arst{
int a[2][2];
};
int Expon(struct arst *A,int *N,int n,int m);
struct arst* Power(struct arst *A,int p,int m);
struct arst* MM(struct arst *A1,struct arst *A2,int m);
int Expon(struct arst *A,int *N,int n,int m){
struct arst *Y=(struct arst*)malloc(sizeof(struct arst));

Y->a[0][0]=1;
Y->a[0][1]=0;
Y->a[1][0]=0;
Y->a[1][1]=1;
int i=0;
while(i<n){
if(*(N+i)>0)
Y=MM(Y,Power(A,*(N+i),m),m);
A=Power(A,10,m);
i=i+1;
}

int c=Y->a[1][0];
return c;
}
struct arst *Power(struct arst *A,int p,int m){
struct arst *Y=(struct arst*)malloc(sizeof(struct arst));

Y->a[0][0]=1;
Y->a[0][1]=0;
Y->a[1][0]=0;
Y->a[1][1]=1;
while(p>0){
if(p%2!=0){
Y=MM(A,Y,m);
}
A=MM(A,A,m);
p=p/2;
}

return Y;
}
struct arst *MM(struct arst *A1,struct arst *A2,int m){
struct arst *Q=(struct arst*)malloc(sizeof(struct arst));
Q->a[0][0]=(A1->a[0][0]*A2->a[0][0]+A1->a[0][1]*A2->a[1][0])%m;
Q->a[0][1]=(A1->a[0][0]*A2->a[0][1]+A1->a[1][0]*A2->a[1][1])%m;
Q->a[1][0]=(A1->a[1][0]*A2->a[0][0]+A1->a[1][1]*A2->a[1][0])%m;
Q->a[1][1]=(A1->a[1][0]*A2->a[0][1]+A1->a[1][1]*A2->a[1][1])%m;

return Q;

}
int main(){
/*the thing is,in periodocity,we dont need to take any number as an input as we just want to know the periodocity given a particular value of modulo-m,so in that case we just need to know when wil 0,1 be repeated again consecutively ,tthe first time we encounter them will eaily give us the period for that particular m */
	clock_t start,end;
	start=clock();
	struct arst *A=(struct arst*)malloc(sizeof(struct arst));
	int m,len;
	int N[1000000];
	scanf("%d",&m);
	int Cstore[(6*m)+3];
	Cstore[0]=0;
	Cstore[1]=1;
	A->a[0][0]=1;
	A->a[0][1]=1;
	A->a[1][0]=1;
	A->a[1][1]=0;
	int j;
	for(int i=2;i<((6*m)+3);i++){
	len=0;	
	j=0;
	int num=i;
	while(num!=0){
	len++;	
	N[j]=num%10;
	num=num/10;
	j++;
	}
	int c=Expon(A,N,len,m);
	Cstore[i]=c;
	if((Cstore[i-1]==0)&&(Cstore[i]==1)){                         //as soon as 0,1 == F(0) and F(1) is repeated it'll stop and wont calculate further,why should it ,kaam to hogaya!
		printf("Position:%d,%d",i-1,i);
		end=clock();
		printf("\nTime taken:%lf",(double)(end-start)/CLOCKS_PER_SEC);
		printf("\n");
		return 0;
}
}
/*for(int i=0;i<((6*m)+3);i++){
printf("\n%d: %d",i,Cstore[i]);
}*/
printf("not repeating in the specified range of the loop(6m+3)\n");
	
return 0;
}
