package player_LEVEL;

import java.util.Scanner;

public class RmvVowrev {
	public static void main(String[]args)
	{
		String real;
		Scanner a=new Scanner(System.in);
		System.out.println("Enter the String:");
		real=a.nextLine();
		StringBuilder sb1 = new StringBuilder(real);
	
	  try{
	  	for(int j=0;j<=sb1.length();j++)
	  	{
				for(int i=0;i<=real.length();i++)
		
			{
				if(sb1.charAt(i)=='a' || sb1.charAt(i)=='e' || sb1.charAt(i)=='i' || sb1.charAt(i)=='o' || sb1.charAt(i)=='u' )
				{
					
					sb1.deleteCharAt(i);
					
				}
			}
	  	}
	
	  }catch(Exception e ){
			System.out.println("After vowels removed the reversed string is :"+sb1);
	  }
		sb1.reverse();
	    System.out.println("Reverse of entered string is: "+sb1);
	   
		
	}
	
}
