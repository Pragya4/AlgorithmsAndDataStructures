#include<stdio.h>
#include<stdlib.h>
#include<string.h>
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
Q->a[0][0]=(A1->a[0][0]*A2->a[0][0]+A1->a[0][1]*A2->a[1][0]);
Q->a[0][1]=(A1->a[0][0]*A2->a[0][1]+A1->a[1][0]*A2->a[1][1]);
Q->a[1][0]=(A1->a[1][0]*A2->a[0][0]+A1->a[1][1]*A2->a[1][0]);
Q->a[1][1]=(A1->a[1][0]*A2->a[0][1]+A1->a[1][1]*A2->a[1][1]);

return Q;

}
int main(){

	struct arst *A=(struct arst*)malloc(sizeof(struct arst));
	int m=10000;
	int n=2;
	int N[1000000];
	scanf("%d",&m);		//modulo
	scanf("%d",&n);		//length of the string/numeric array
	A->a[0][0]=1;
	A->a[0][1]=1;
	A->a[1][0]=1;
	A->a[1][1]=0;
	char strnew[1000000];
	char str[1000000];
	scanf("%s",str);        //we are taking a string because obviously we cannot take 10^5 or 10^6 digits in an int and so we take it to into a string and then convert it into an array of 10^6 cells. 
	
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
	int c=Expon(A,N,n,m);

	printf("%d",c);
return 0;
}
