
import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{ 
	public static void main(String[] args) 
	{
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = reader.nextInt();
        if(num % 2 == 0)
            System.out.println("Even");
        else if(num%3==0) 
            System.out.println("Odd");
              else    
            System.out.println("Invalid");
	}
    }
