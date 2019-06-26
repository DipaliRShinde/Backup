/*  Write a java program to count the total number of occurrences of a given character in a string
without using any loop?  */

package com.stackroute.pe4;

import java.util.Scanner;

public class OccurrenceOfCharacter {
    public static void main(String args[])
    {
        OccurrenceOfCharacter.countCharacter();
    }

    public static void countCharacter()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter String: ");
        String string=scan.nextLine();

        System.out.println("Enter Character: ");
        String character=scan.nextLine();
        int count;

        count=string.length()-string.replaceAll(character,"").length();
        System.out.println("Number of Occurrences Of Character "+character+" :"+count);
    }
}
