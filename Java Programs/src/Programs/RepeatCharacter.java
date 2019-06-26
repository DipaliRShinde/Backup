package Programs;

import java.util.Scanner;

public class RepeatCharacter
{
    public static void main(String[] args)
    {
        RepeatCharacter.repeatPrint();
    }

    static void repeatPrint()
    {
            Scanner s=new Scanner(System.in);

            System.out.println("Enter String: ");
            String str1=s.nextLine();

            System.out.println("Enter Number: ");
            int n=s.nextInt();

            int index=str1.length()-n;

            String str2=str1.substring(index);

            System.out.print(str1);

            while(n!=0)
            {
                System.out.print(str2);
                n--;
            }
    }

}


