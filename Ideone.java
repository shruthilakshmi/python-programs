/*Positive or Negative*/
/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		      int num;
        //Scanner class to read value
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
         
        //check condition for +ve, -ve and Zero
        if(num>0)
            System.out.println("Positive");
        else if(num<0)
            System.out.println("Negative");
        else
            System.out.println("Zero");
    }
}
