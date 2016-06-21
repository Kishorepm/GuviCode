package player_LEVEL;

import java.util.Scanner;

public class StringtoInt {
public static void main(String[] args)
{
	String real;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the String:");
	real=s.nextLine();
	int number = Integer.parseInt(real);
	System.out.println("The number is: " + number);
}
}
