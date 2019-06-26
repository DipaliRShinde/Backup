package com.stackroute.pe2;

public class EvenNum {

    public static boolean isEven(int number) {
        if(!checkInput(number))
        {
            return true;
        }
        return number % 2 == 0;
    }

    public static boolean checkInput(int number) {
        return number<0;
    }
}
