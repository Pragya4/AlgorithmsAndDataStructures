#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<time.h>
int percentile(char numstring[1000000],int period){
int len=strlen(numstring);
len=len-1;		//we are taking string and then converting oto an array because of we directly take in to an array we'll have to press enter for every digit
char c[2];
int numarray[100000];
int number;
for(int i=0;i<len;i++){
 c[0]=numstring[i];
 c[1]='\0';
numarray[i]=atoi(c);
}
/*for(int i=0;i<len;i++){
printf("%d",numarray[i]);
}*/
number=numarray[0];
int i=0;
while(i<len-1){
if(number<period){
number=number*10;
number=number+numarray[++i];
}
number=number%period;

}
printf("\npercentile:%d\n",number);
return number;
}


int main(){
/*the thing is,in periodocity,we dont need to take any number as an input as we just want to know the periodocity given a particular value of modulo-m,so in that case we just need to know when wil 0,1 be repeated again consecutively ,tthe first time we encounter them will eaily give us the period for that particular m */
	clock_t start,end;
	start=clock();
	int analogous_num;
	
	int m,len,a,b,c;
	int chartoint[2];
	int N[1000000];
	char Bigno_analog_per[1000000];
	int period;
	printf("Big number:");
	fgets(Bigno_analog_per,100000,stdin);
	printf("mod");
	scanf("%d",&m);
	int Cstore[7*m+1];
	Cstore[0]=0;
	Cstore[1]=1;
	a=0;
	b=1;
	
	for(int i=2;i<(7*m)+1;i++){
	Cstore[i]=(Cstore[i-2]+Cstore[i-1])%m ;
        //printf("%d %d\n",i,Cstore[i]);
	if((Cstore[i-1]==0)&&(Cstore[i]==1)){                      //as soon as 0,1 == F(0) and F(1) is repeated it'll stop and wont calculate further,why should it ,kaam to hogaya!
		//printf("Position:%d,%d",i-1,i);
		period=i-1;
		i=7*m;
		}
}
printf("\nperiod:%d",period);
analogous_num=percentile(Bigno_analog_per,period);
printf("\n%d",Cstore[analogous_num]);

return 0;
}
