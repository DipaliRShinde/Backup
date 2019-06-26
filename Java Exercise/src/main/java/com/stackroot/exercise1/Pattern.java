package com.stackroot.exercise1;

import java.util.Scanner;

//Program for pattern
public class Pattern
{
    public static void main(String args[])
    {
        Pattern.draw();
    }

    static void draw()
    {
        System.out.println("Enter Number: ");
        Scanner s=new Scanner(System.in);   //To accept input from console

        int n=s.nextInt();

        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(i + " ");  //Printing 'i' with space
            }
        }
    }

}
