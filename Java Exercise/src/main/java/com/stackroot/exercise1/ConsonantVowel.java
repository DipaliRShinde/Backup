package com.stackroot.exercise1;

import java.util.Scanner;
import java.lang.*;

//Program to check given input is consonant or Vowel
public class ConsonantVowel
{
    public static void main(String args[])
    {
        ConsonantVowel.check();
    }

    static void check()
    {
        System.out.println("Enter String: ");
        Scanner s=new Scanner(System.in);

        String str=s.nextLine();
        int len=str.length();

        int i;

        for(i=0; i<len; i++)
        {
            char ch=str.charAt(i);
            if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch==' ')  //Checking for vowels
            {
                System.out.println(ch + " - Vowel");
            }
            else if (Character.isDigit(ch))     //checking for digits
            {
                System.out.println(ch + " is not character");
            }
            else
            {
                System.out.println(ch + " - consonant");
            }

        }
    }

}
