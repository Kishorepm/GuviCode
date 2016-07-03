#include<stdio.h>
#include<conio.h>
void main()
{
int i,sum=0,n;
clrscr();
printf("Enter the value for which u need the sum : ");
scanf("%d",&n);
for(i=1;i<=n;i++)
{
sum=i+sum;
}
printf("%d",sum);
getch();
}
