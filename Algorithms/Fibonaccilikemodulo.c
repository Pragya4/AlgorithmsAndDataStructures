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
	clock_t start,end;
	start=clock();
	struct arst *A=(struct arst*)malloc(sizeof(struct arst));
	int m;
	
	int N[1000000];
	scanf("%d",&m);
	
	A->a[0][0]=1;
	A->a[0][1]=1;
	A->a[1][0]=1;
	A->a[1][1]=0;
	char strnew[1000000];
	char str[1000000];
	scanf("%s",str);
	char ch;
	int len=strlen(str);
	//printf("%d",len);
	for(int i=0;i<len;i++){
	char c[2];
	c[0]=str[len-i-1];	
	c[1]='\0';
	
	N[i]=atoi(c);
	}
	//printf("reverse");
	/*for(int i=0;i<len;i++){
	printf("%d",N[i]);
	}*/
	//printf("after");
	int c=Expon(A,N,len,m);
	printf("%d",c);
	end=clock();
	printf("%lf",(double)(end-start)/CLOCKS_PER_SEC);
return 0;
}
