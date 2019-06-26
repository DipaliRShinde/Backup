//Program to check name in present in string using regular expression

package com.stackroute.pe4;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PresenceOfName {
    public static void main(String args[])
    {
        PresenceOfName obj = new PresenceOfName();
        Scanner scn=new Scanner(System.in);
        obj.presentword("harry","harry");
    }

    public String presentword(String str, String word) {
        Pattern pattern = Pattern.compile(word);
        Matcher matcher = pattern.matcher(str);
        if (matcher.find())
            System.out.println("Is " + word + " here? true");
        else
            System.out.println("Is " + word + " here? false");
        return null;
    }
}
