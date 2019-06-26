/*  Write a program to compute the addition of two matrix, Read the number of rows and columns
as input, also the values of each matrix   */

package com.stackroute.pe3;

import java.util.Scanner;

public class AdditionOfMatrix {
    public static void main(String args[])
    {
        AdditionOfMatrix.matrixAddition();
    }

    //Method to perform Addition of Matrix
    public static void matrixAddition()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Input number of rows of matrix: ");
        int row=scan.nextInt();
        System.out.println("Input number of columns of matrix: ");
        int column=scan.nextInt();

        int matrix1[][]=new int[row][column];
        int matrix2[][]=new int[row][column];
        int addition[][]=new int[row][column];

        System.out.println("Input elements of first matrix: ");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                matrix1[i][j]=scan.nextInt();
            }
        }

        System.out.println("Input elements of second matrix: ");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                matrix2[i][j]=scan.nextInt();
            }
        }

	//Addtion of two matrix
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                addition[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        }

        System.out.println("Sum of the matrices:- ");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                System.out.print(addition[i][j]+ "\t");
            }
            System.out.println();
        }
    }
}
