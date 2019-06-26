/*   Create a class with a main( ) that throws an object of class Exception inside a try block.
a. Give the constructor for Exception a String argument.
b. Catch the exception inside a catch clause and print the String argument.
c. Add a finally clause and print a message to prove you were there.  */

package com.stackroute.pe3;

public class ExceptionMain {
    ExceptionMain(String message)
    {
        message="throws an object of class ExceptionMain inside a try block";
        System.out.println(message);
    }

    //Exception in main
    public static void main(String args[]) throws Exception
    {
        try{
            throw new Exception();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        finally {
            System.out.println("Printed a message to prove we are here.");
        }
    }

}
