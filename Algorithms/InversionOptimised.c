#include<stdio.h>
#include<stdlib.h>
int main(){
int n=8,j=1;
int x,i=0;
int A[100];
int S[8];//stack
S[0]=0;			//1st element pushed always
int B[8];
scanf("%d",&n);
printf("flag0");
for(int i=0;i<n;i++){
scanf("%d",&A[i]);
}
printf("\n");
while(j<n){
	printf("\n %d",j);
	if(A[j]>A[S[i]]){ 		//current element of array is greater than TOS
		S[++i]=j;
		printf("\n i:%d",S[i]);
		printf("\n S[i]:%d",S[i]);
		printf("\n A[S[i]]:%d",A[S[i]]);
		
		}
	else if(A[j]<A[S[i]]){
		while(i>=0 && A[j]<A[S[i]]){		
		//if element of array currently under consideration is less than tos then check and pop TOS until we encounter an  elemnt at 			TOS  which is lesser than curremnt elemnt sos that increasing order is maintained
		B[S[i--]]=j;		//final output array contains the element index jo tos ka inversion hai,pehle i phir i--;
		}
		S[++i]=j;
		printf("\n %d else",S[i]);		//before final j++ current element shoulf be pushed intothe stack ,nahi to wo pop karte jaega par lhud kabhi push nahi ho paaega,and moreover we'll overcome problem of having i=-1 ever
	     }		
j++;


}
while(i>=0){

B[S[i]]=0;
i--;

}
printf("\nfinal\n");
for(int p=0;p<n;p++){
printf("%d\n",B[p]);
}
return 0;

}
