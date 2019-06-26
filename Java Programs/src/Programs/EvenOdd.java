package Programs;

import java.util.Scanner;

public class EvenOdd
{
    public static void main(String[] args)
    {
        EvenOdd.check();
    }

    static void check()
    {
        System.out.println("Enter Number: ");
        Scanner s=new Scanner(System.in);

        int num=s.nextInt();

        if(num%2!=0)
        {
            if(num>=20 && num<=30)
            {
                System.out.println("Tom");
            }
            else
            {
                System.out.println("Cartoon");
            }
        }
        else if(num%2==0)
        {
            if(num>=20 && num<=30)
            {
                System.out.println("Jerry");
            }
            else
            {
                System.out.println("Cartoon");
            }
        }
        else
        {
            System.out.println("Cartoon");
        }

    }

}
