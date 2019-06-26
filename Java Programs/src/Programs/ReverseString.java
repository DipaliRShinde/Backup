package Programs;

import java.util.Scanner;

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

        int len=str.length();


        for(int i=len-1; i>=0; i--)
        {
            rev=rev + str.charAt(i);
        }

        System.out.println(rev);
    }

}


