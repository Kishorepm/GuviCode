package pro_LEVEL;

import java.util.Scanner;
import java.util.Arrays;

public class DeleteLeast {
	public static void main(String[] args)
	{
		System.out.println("Enter the Initial number:");
		int num;
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		System.out.println("The number is: " + num);
		String temp = Integer.toString(num);
		int a[]=new int[temp.length()];
		for(int i=0;i<temp.length();i++)
		{
		 a[i]=num%10;
		 num=num/10;
		}
		Arrays.sort(a);        
		   int q;
		   System.out.println("Enter how many numbers to remove:");
		   Scanner n=new Scanner(System.in);
			q=n.nextInt();
			int res=temp.length()-q;
			if(q<temp.length())
			{
			for(int i=0;i<res;i++)
			{
				System.out.print(+a[i]);
				
			}
			}else
			{
				System.out.println("Enter value less than number of digits and try again");
			}
			
	}      
	

}
