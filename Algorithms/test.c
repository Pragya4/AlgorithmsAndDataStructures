#include <stdio.h>
int main()
{
printf("hello");
     int marks[10], i, n, sum = 0, average=99;
     printf("Enter n: ");
     scanf("%d", &n);
     for(i=0; i<n; ++i)
     {
          printf("Enter number%d: ",i+1);
          scanf("%d", &marks[i]);
          sum += marks[i];
     }
     

     printf("Average = %d", average);

     return 0;
}


