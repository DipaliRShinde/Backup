package com.stackroute.pe2;

public class Power {
    public boolean power4(int num) {
        while (num != 1) {
            if (num % 4 == 0) {
                num = num / 4;
            } else {
                return false;
            }
        }
        return true;
    }

    public boolean negativeInput(int num) {
        return num >= 0;
    }

    public boolean zeroInput(int num) {
        return num != 0;
    }
}
