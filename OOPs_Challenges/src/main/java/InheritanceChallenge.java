import java.util.Scanner;

public class InheritanceChallenge {
    public static void main(String args[])
    {

    }
}

class Vehicle
{
    Scanner s=new Scanner(System.in);
    boolean steering;
    int gears;
    int speed;

    public void changeGear()
    {
        System.out.println("Enter Your Choice: 1. First Gear 2. Second Gear 3. Third Gear 4. Fourth Gear 5. Reverse Gear");
        int choice=s.nextInt();

        switch (choice)
        {
            case 1:
                System.out.println("Car is in first gear");

            case 2:
                System.out.println("Car is in second gear");

            case 3:
                System.out.println("Car is in third gear");

            case 4:
                System.out.println("Car is in fourth gear");

            case 5:
                System.out.println("Car is in reverse gear");
        }

    }

}

class Car extends Vehicle
{
    int minSpeed=30;
    int maxSpeed=150;
    public void speed(int speed){
        if(speed==minSpeed)
        {
            System.out.println("Increase the speed");
        }
        else if(speed==maxSpeed)
        {
            System.out.println("Decrease the speed");
        }
    }
}

class Honda extends Car
{

}
