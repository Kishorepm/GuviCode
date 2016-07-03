#include<stdio.h>
#include<conio.h>
void main()
{
int a,c;
printf("Enter any number to print multiplication table : ");
scanf("%d",&a);
for(i=0;i<11;i++)
{
c=a*i;
printf("\n%d  *  %d  = %d\n",a,i,c);
}
printf("The required multiplication table is printed");
getch();
}
