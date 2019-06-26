/*  Write a program to implement set interface which sorts the given randomly ordered names in
ascending order. Convert the sorted set in to an array list
Input : Harry Olive Alice Bluto Eugene
Output :
Sorted Set : Alice Bluto Eugene Harry Olive
Array list from Set : Alice Bluto Eugene Harry Olive   */

package com.stackroute.pe5;

import java.util.*;

public class SortSetInterface {
    public static void main(String args[])
    {
        SortSetInterface.sort();
    }

    //Method to sort given String
    public static void sort()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter String");
        String inputString=scanner.nextLine();
        String input[] = inputString.split(" ");
        int length=input.length;

        //Set to take input from user
        Set<String> set = new HashSet<String>();

        for(int i = 0; i < length; i++)
        {
            set.add(input[i]);
        }
        System.out.println(set);

        //TreeSet to sort the set
        TreeSet sortedSet = new TreeSet<String>(set);
        System.out.print("Sorted Set : ");
        System.out.print(sortedSet);

        //Converted sorted set into ArrayList
        ArrayList<String> arrayList=new ArrayList<>(sortedSet);
        System.out.print("\nArray list from Set : ");
        for(String list:arrayList)
        {
            System.out.print(list+" ");
        }
    }

}
