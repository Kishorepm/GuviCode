#include<stdio.h>
void thunai(int disk,char sou,char temp,char des);
int main()
{
    char sou='S',temp='D',des='A';
    int disk;
    printf("Enter number of disks");
    scanf("%d",&disk);
    thunai(disk,sou,temp,disk);
    return 0;
    }
void thunai(int disk,char sou,char temp,char des)
{
    {
        if(disk==1)
        {
            printf("%d From %c to %c\n",disk,sou,des);
        }
     }
thunai(disk-1,sou,des,temp);
printf("%d from %c to %c\n",disk,sou,des);
thunai(disk-1,temp,sou,des);
}
