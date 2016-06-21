package player_LEVEL;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args)
	{
		int a,fact=1;
		System.out.println("Enter the number for factorial:");
		Scanner s=new Scanner (System.in);
		a=s.nextInt();
		for(int i=1;i <= a;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial is:" +fact);
	}

}
