#include<stdio.h>
#include<time.h>

int main(){
long int beg=clock();
int a[10000000];
a[0]=1;
a[1]=1;
a[2]=2;
for(int i=3;i<10000000;i++){
a[i]=(a[i-1]+a[i-2])%100;
}
printf("%d",a[9999999]);

long int end=clock();
printf("Time: %ld\n",(end-beg)/CLOCKS_PER_SEC);
}
