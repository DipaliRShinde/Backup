//Program to replace characters from given string

package com.stackroute.pe4;

public class ReplaceCharacter {
    public static void main(String args[])
    {
        ReplaceCharacter.replace();
    }

    public static void replace()
    {
        String string="daily dry";
        String string1=string.replace("d","f");
        String string2=string1.replace("l","t");

        System.out.println("Original String: "+string);
        System.out.println("New String: "+string2);
    }
}
