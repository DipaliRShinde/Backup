package com.stackroot.exercise1;

import java.util.Scanner;

//Program to sort array
public class SortArray
{
    public static void main(String args[])
    {
        SortArray.sort();
    }

    static void sort()
    {
        System.out.println("Enter Number: ");
        Scanner s = new Scanner(System.in);

        int n=s.nextInt();

        int l=String.valueOf(n).length();   //Calculate length

        int arr[]=new int[l];
        int temp, rem, sum=0;

        for(int i=0; i<l; i++)
        {
            rem=n%10;
            arr[i]=rem;
            n=n/10;
        }

        //Logic to sort array
        for(int i=0; i<l; i++)
        {
            for(int j=i+1; j<l; j++)
            {
                if(arr[i]<arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];  //swap two numbers
                    arr[j]=temp;
                }
            }
        }

        System.out.print("Sorted number in non-increasing order : ");
        for(int i=0; i<l; i++)
        {
            System.out.print(arr[i]);
        }

        for(int i=0; i<l; i++)
        {
            if(arr[i]%2==0)
            {
                sum=sum+arr[i];
            }
        }

        if(sum>15)
        {
            System.out.println(" ");
            System.out.println("True");
        }
        else
        {
            System.out.println(" ");
            System.out.println("False");
        }

    }

}