#include<stdio.h>
#include<conio.h>
void main()
{
int i,count=0,n;
clrscr();
printf("Enter the value : ");
scanf("%d",&n);
for(i=1;i<=n;i++)
{
if(n%i==0)
count++;
}
if(count==2)
printf("The number %d is a prime number",n);
else
printf("The number %d is not a prime number",n);
getch();
}
