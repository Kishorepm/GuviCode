#include<stdio.h>
#include<conio.h>
void main()
{
char ch;
printf("Enter an Alphabet : ");
scanf("%c",&ch);
if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
{
printf("The given Alphabet %c is a Vowel");
}
else
{
printf("The given Alphabet %c is a consonant");
}
getch();
}
