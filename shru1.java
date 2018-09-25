/* Alphabet or Not */
/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class shru1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		char ch;
		Scanner scan=new Scanner(System.in);
		ch=scan.next().charAt(0);
		if((ch>='a' &&ch<='z') || (ch>='A' && ch<='Z'))
		{
			System.out.printf("Alphabet");
		}
		else
		{
			System.out.println("No");
		}
	}
}
