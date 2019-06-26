package com.stackroot.exercise1;

import java.util.Scanner;

//Program to reverse the given string
public class ReverseString
{
    public static void main(String args[])
    {
        ReverseString.reverseStr();
    }

    static void reverseStr()
    {
        System.out.println("Enter String: ");
        Scanner s = new Scanner(System.in);
        String str=s.nextLine();
        String rev="";

        int len=str.length();      //calculate lenght of string


        for(int i=len-1; i>=0; i--)
        {
            rev=rev + str.charAt(i);    //print reverse string
        }

        System.out.println(rev);
    }

}


