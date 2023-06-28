#include<stdio.h>
#include<stdlib.h>
#include<string.h>
struct arst{
int a[3][3];
};
int Expon(struct arst *A,int *N,int n,int m);
struct arst* Power(struct arst *A,int p,int m);
struct arst* MM(struct arst *A1,struct arst *A2,int m);


int Expon(struct arst *A,int *N,int n,int m){
struct arst *Y=(struct arst*)malloc(sizeof(struct arst));
Y->a[0][0]=1;
Y->a[0][1]=0;
Y->a[0][2]=0;
Y->a[1][0]=0;
Y->a[1][1]=1;
Y->a[1][2]=0;
Y->a[2][0]=0;
Y->a[2][1]=0;
Y->a[2][2]=1;
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
Y->a[0][2]=0;
Y->a[1][0]=0;
Y->a[1][1]=1;
Y->a[1][2]=0;
Y->a[2][0]=0;
Y->a[2][1]=0;
Y->a[2][2]=1;
while(p>0){
if(p%2!=0){
Y=MM(A,Y,m);
}
A=MM(A,A,m);
p=p/2;
}
return Y;
}


struct arst *MM(struct arst *M,struct arst *N,int m){
struct arst *Q=(struct arst*)malloc(sizeof(struct arst));
    for(int i=0;i<3;i++){

for(int j=0;j<3;j++){int sum=0;
for(int k=0;k<3;k++){
sum=sum+((M->a[i][k])*(N->a[k][j]));
}
Q->a[i][j]=sum%m;}}
return Q;
}
int main(){

	struct arst *A=(struct arst*)malloc(sizeof(struct arst));
	int N[1000000];
	int m,num,len;
	scanf("%d",&m);
	int Cstore[(6*m)+3];
	A->a[0][0]=1;
	A->a[0][1]=0;
	A->a[0][2]=1;
	A->a[1][0]=1;	
	A->a[1][1]=0;
	A->a[1][2]=0;
	A->a[2][0]=0;
	A->a[2][1]=1;
	A->a[2][2]=0;
	Cstore[0]=0;
	Cstore[1]=1;
	int j;
	for(int i=2;i<(6*m)+3;i++){
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
	if((Cstore[i-1]==0)&&(Cstore[i]==1)){  
		printf("Position:%d,%d",i-1,i);
		return 0;
}
}
printf("not repeating in the specified range of the loop(6m+3)\n");
	
return 0;
}
