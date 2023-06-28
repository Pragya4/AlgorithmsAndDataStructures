#include<stdio.h>
#include<stdlib.h>
int main(){
int A[8]={3,6,8,7,5,2,9,10};
int S[8];
S[0]=0;
int n=8,w=3,l=0;
int j=1,i=0;
while(j<n){
	if(A[j]>A[S[i]]){
		S[++i]=j;
		printf("if TOS %d",S[i]);
		j++;

		
	}
	else if(A[S[i]]>A[j]){
	while(i>=0 && A[j]<A[S[i]]){
			i--;			
			}
		if(i==0){
			S[++i]=j;	}
		printf("else TOS: %d",S[i]);		
		}
	printf("outside %d",j);
	if(l<(j-w+1)){
		++l;		
		}
	if(l>=(j-w+1)&&(l<j)){
		printf("%d minimum",A[S[l]]);
		
				
		}	
	
}

}
