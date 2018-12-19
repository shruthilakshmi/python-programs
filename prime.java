 import java.util.Scanner;
 class Prime {

    public static void main(String[] args) {

        int num;
        Scanner s=new Scanner(System.in);
        num=s.nextInt();
        boolean flag = false;
        for(int i =2; i <= num/1000; ++i)
        {
            // condition for nonprime number
            if(num % i == 0)
            {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
