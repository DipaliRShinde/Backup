package com.stackroot.exercise1;

import java.util.Scanner;

//Program for checking Even Odd numbers
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

        if(num%2!=0)    //First condition if the remainder is 0 or not
        {
            if(num>=20 && num<=30)
            {
                System.out.println("Tom");  //condition to check the range
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
