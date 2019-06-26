/* Write a program to find out if a series of 7 digits are consecutive numbers. To make this easier,
assume the digits are a string and use split()  */

package com.stackroute.pe3;

import java.util.Scanner;

public class ConsecutiveNumberSeries {
    public static void main(String args[])
    {
        ConsecutiveNumberSeries.checkConsecutiveNumber();
    }

    //Method to check the numbers are consecutive or not
    public static void checkConsecutiveNumber()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Series: ");
        String series=scan.nextLine();

        String seriesdigit[]=series.split(" ");
        int length=seriesdigit.length;
        int arrayDigit[]=new int[length+1];
        int flag=0;

        for(int i=0;i<seriesdigit.length;i++)
        {
            arrayDigit[i]=Integer.parseInt(seriesdigit[i]);
        }

        for(int i=0;i<seriesdigit.length;i++)
        {
            int number=arrayDigit[i];
            if(arrayDigit[i+1]==(number+1) || arrayDigit[i+1]==(number-1))
            {
                i++;
                flag=1;
            }
            else {
                break;
            }
        }

        if(flag==1)
        {
            System.out.println(series+" are consecutive numbers");
        }
        else {
            System.out.println(series+" are non consecutive numbers");
        }
    }
}
