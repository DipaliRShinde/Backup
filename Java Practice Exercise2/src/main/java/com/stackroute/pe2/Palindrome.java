package com.stackroute.pe2;

public class Palindrome {
    public  String rev="";
    public String reverse(String name)
    {
        checkPalindrome(name);
        int lenght=name.length();

        for(int i=lenght-1;i>=0;i--)
        {
            rev=rev+name.charAt(i);
        }
        return rev;
    }
    public boolean checkPalindrome(String name)
    {
        if(name==rev)
        {
            return true;
        }
        else {
            return false;
        }
    }
}
