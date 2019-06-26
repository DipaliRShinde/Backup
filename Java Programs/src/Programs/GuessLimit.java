package Programs;

import java.util.Scanner;

public class GuessLimit
{
    public static void main(String args[])
    {
        GuessLimit.checkGuess();
    }

    public static void checkGuess()
    {
        Scanner s=new Scanner(System.in);

        int target=32;

        while(true)
        {
            System.out.println("Enter Number (1 - 50): ");
            int n=s.nextInt();

            if (target==n)
            {
                System.out.println("Number guessed matches the original number");
                break;
            }
            else if (target > n)
            {
                System.out.println("Number guessed is less than original number");
            }
            else
            {
                System.out.println("Number guessed is more than original number");

            }

        }

    }

}

