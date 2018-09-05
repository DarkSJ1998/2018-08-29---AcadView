/*
Q1. Write a Java program to reverse a String.
*/

class q1
{
	public static void main(String[] x)
	{
		String str = "Hello World!";
		String rev = "";
		char ch;
		int i,len = str.length();
		for(i=0;i<len;i++)
		{
			ch = str.charAt(len-i-1);
			rev = rev.concat(""+ch);
		}
		
		System.out.println("String : \"" + str + "\"");
		System.out.println("Reverse = \"" + rev + "\"");
		System.out.println();
	}
}
