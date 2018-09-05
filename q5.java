/*
Q5. Write a Java program to count the number of words in a sentence taken as input.
*/

import java.util.Scanner;

class q5
{
	public static void main(String[] x)
	{
		String line;
		int count = 1;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string : ");
		line = sc.nextLine();
		
		System.out.println("\nThe entered line : " + line);
		if(line.length() == 0)
			count = 0;
		else
		{
			for(int i=0;i<line.length()-1;i++)
			{
				if(line.charAt(i) == ' ' && line.charAt(i+1) != ' ')
				{
					count++;
				}
			}
		}
		System.out.println("\nThe number of words : " + count);
		
		sc.close();
	}
}
