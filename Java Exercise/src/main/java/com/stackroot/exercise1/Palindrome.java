package com.stackroot.exercise1;

import java.util.Scanner;

//Program to check number is Palindrome or not
public class Palindrome
{
    public static void main(String[] args)
    {
        Palindrome.check();
    }

    static void check()
    {
        System.out.println("Enter Number: ");
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();

        int rem, res=0, temp, sum=0;

        temp=num;

        while(temp>0)
        {
            rem=temp%10;
            res=(res*10)+rem;
            temp=temp/10;
        }

        if(num==res)    //if the number and reverse of number is same then number is palindrome
        {
            System.out.println("Number is Palindrome");

            while(num>0)
            {
                rem = num % 10;
                if (rem % 2 == 0) {
                    sum = sum + rem;
                }
                num = num / 10;
            }

            if(sum>25)
            {
                System.out.println("and the sum of even numbers is greater than 25 ");
            }
            else {
                System.out.println("and the sum of even numbers is less than 25 ");
            }
        }
        else
        {
            System.out.println("Number is not Palindrome");
        }

    }

}

