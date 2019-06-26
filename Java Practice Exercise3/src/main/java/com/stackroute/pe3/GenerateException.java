/*  Write a program that will generate exceptions of type NegativeArraySizeException,
IndexOutOfBoundsException, NullPointerException. Record the catching of each exception by
displaying the message stored in the exception object.  */

package com.stackroute.pe3;

public class GenerateException {
    public static void main(String args[])
    {
        try {
            throw new NegativeArraySizeException();
        }
        catch (NegativeArraySizeException negativeArraySizeException) {
            System.out.println(negativeArraySizeException);
        }

        try {
            throw new IndexOutOfBoundsException();
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            System.out.println(indexOutOfBoundsException);
        }

        try {
            throw new NullPointerException();
        }
        catch (NullPointerException nullPointerException) {
            System.out.println(nullPointerException);
        }
    }
}
