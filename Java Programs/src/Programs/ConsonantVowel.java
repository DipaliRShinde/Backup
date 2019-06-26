package Programs;

import java.util.Scanner;
import java.lang.*;

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
            if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch==' ')
            {
                System.out.println(ch + " - Vowel");
            }
            else if (Character.isDigit(ch))
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
