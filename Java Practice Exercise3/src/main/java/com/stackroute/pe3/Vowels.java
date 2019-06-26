/* Write a program to set up an array of places, Loop round and remove the vowels. Display the new
words in console
Input:
India
United States
Germany
Egypt
czechoslovakia  */

package com.stackroute.pe3;

import java.util.Scanner;

public class Vowels {
    public static void main(String args[])
    {
        Vowels.RemovevowelsArray();
    }

    //Method to remove vowels from array
    public static void RemovevowelsArray()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Number Of Strings: ");
        int numberOfString=scan.nextInt();

        String string1[]=new String[numberOfString];
        String string2[]=new String[numberOfString];

        System.out.println("Enter String in Array: ");
        for(int i=0;i<numberOfString;i++) {
            string1[i]=scan.nextLine();
        }

        for(int i=0;i<numberOfString;i++) {
            string2[i] = string1[i].replaceAll("[aeiou]", "");
            System.out.println("Place Name without Vowels: " + string2[i]);
        }
    }
}
