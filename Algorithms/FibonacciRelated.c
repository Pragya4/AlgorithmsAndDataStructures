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
Q->a[i][j]=sum;}}
return Q;
}
int main(){

	struct arst *A=(struct arst*)malloc(sizeof(struct arst));
	int N[1000000];
	int m;
	scanf("%d",&m);
	A->a[0][0]=1;
	A->a[0][1]=0;
	A->a[0][2]=1;
	A->a[1][0]=1;	
	A->a[1][1]=0;
	A->a[1][2]=0;
	A->a[2][0]=0;
	A->a[2][1]=1;
	A->a[2][2]=0;
	char strnew[1000000];
	char str[1000000];
	scanf("%s",str);        //we are taking a string because obviously we cannot take 10^5 or 10^6 digits in an int and so we take it to into a string and then convert it into an array of 10^6 cells. 
	char ch;
	int len=strlen(str);
	//printf("%d",len);
	for(int i=0;i<len;i++){
	char c[2];
	c[0]=str[len-i-1];	
	c[1]='\0';
	N[i]=atoi(c);
	}
	int c=Expon(A,N,len,m);

	printf("%d",c);
return 0;
}
