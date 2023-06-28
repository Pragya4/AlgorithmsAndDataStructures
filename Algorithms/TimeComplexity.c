#include<stdio.h>
#include<time.h>

int main(){
int i,j,k,s,n;
n=10000;
s=2;
long int beg=clock();
for(i=0;i<n;i++){
for(j=0;j<n;j++){
for(k=0;k<n;k++){
s=2*s+1;
}
}
}
long int end=clock();
printf("%d",s);
printf("time:%ld ",(end-beg)/CLOCKS_PER_SEC)
return 0;
}

