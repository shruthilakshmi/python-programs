/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

 class Palindrome {

    public static void main(String[] args) {

        int num, reversedInteger = 0, remainder, originalInteger;
        Scanner s=new Scanner(System.in);
        num=s.nextInt();
        originalInteger=num;
        while( num != 0 )
        {
            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            num  /= 10;
        }
        if (originalInteger == reversedInteger)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
