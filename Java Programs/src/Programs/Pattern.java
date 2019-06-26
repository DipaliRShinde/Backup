package Programs;

import java.util.Scanner;

public class Pattern
{
    public static void main(String args[])
    {
        Pattern.draw();
    }

    static void draw()
    {
        System.out.println("Enter Number: ");
        Scanner s=new Scanner(System.in);

        int n=s.nextInt();

        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(i + " ");
            }
        }
    }

}
