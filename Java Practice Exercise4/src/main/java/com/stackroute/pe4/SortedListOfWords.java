//Program to sort words from string in sorted order

package com.stackroute.pe4;

import java.util.Scanner;

public class SortedListOfWords {
    public static void main(String args[])
    {
        SortedListOfWords.sortWords();
    }

    public static void sortWords()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Paragraph of your choice: ");
        String paragraph=scan.nextLine();
        String array[]=paragraph.split(" ");
        String temp;

        for(int i=0;i<array.length;i++)
        {
            for(int j=i+1;j<array.length;j++)
            {
                if(array[i].compareTo(array[j])>0)
                {
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }

        System.out.println("Sorted List Of Words: ");
        for(int i=0;i<array.length;i++)
        {
            System.out.println(array[i]+" ");
        }
    }
}
