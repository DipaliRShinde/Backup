package com.stackroot.exercise1;

import java.util.Scanner;

//Program for Addition of Array Elements
public class ArrayAddition
{
    public static void main(String args[])
    {
        ArrayAddition.addition();
    }

    static void addition()
    {
        System.out.println("Enter Number: ");
        Scanner s=new Scanner(System.in);

        int n=s.nextInt();
        int a[]=new int[n];
        int sum=0;

        System.out.println("Enter elements of array: ");
        for(int i=0; i<n; i++)
        {
            a[i]=s.nextInt();       //Accepting input from consol
            if (a[i] == (int)a[i])
            {
                System.out.print("");
            }
            else
            {
                System.out.println("Please enter Number..");
            }
        }

        for(int i=0; i<a.length; i++)
        {
            sum=sum + a[i];
        }

        System.out.println(sum);    //Print sum
    }

}
