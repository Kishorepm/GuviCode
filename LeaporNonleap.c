#include<stdio.h>
#include<conio.h>
void main()
{
int year;
clrscr();
printf("Enter a year : ");
scanf("%d",&year);
if(year%4==0)
{
printf("The entered year %d is a leap year",year);
}
else
{
printf("The entered year %d is not a leap year");
}
getch();
}
