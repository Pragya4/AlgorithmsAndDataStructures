#include<stdio.h>
#include<stdlib.h>
int main(){
int S[8];

int w=3;
int i=0;

int j=1,r=0;
int l=0;

S[l]=0;
int n=8;
printf("flag5\n");
int A[8]={3,4,5,6,7,8,9,10};
printf("flag6\n");
while(j<n){
printf("%d",j);
printf(": %d",A[j]);
	if(A[j]<A[S[r]]){	
		while(r>=l && A[j]<A[S[r]]){
		r--;
		}
	}
	
	S[++r]=j;
	if(j>=(w-1)){
		if(r-w+1>=l){
			l++;
			}
		//printf("\n min %d\n",A[S[l]]);

}
printf("\nminimum in window %d : %d\n",j,A[S[l]]);
j++;
}
}
