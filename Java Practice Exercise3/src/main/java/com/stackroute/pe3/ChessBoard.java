/* Write a program to create a ChessBoard pattern with the help of multidimensional array, where
WWrepresents white color and BB represents Black color.  */

package com.stackroute.pe3;

public class ChessBoard {
    public static void main(String args[])
    {
        ChessBoard.chessBoard();
    }

    //Method to print chess board
    public static void chessBoard()
    {
        String chess[][]=new String[8][4];
        for (int i = 0; i < 8; i++) {
            System.out.println();
            for (int j = 0; j < 4; j++) {
                if(i%2==0) {
                    chess[i][j]="WW" + "|" + "BB" + "|";
                }
                else {
                    chess[i][j]="BB" + "|" + "WW" + "|";
                }
            }
        }

        for (int i=0;i<8;i++)
        {
            for(int j=0;j<4;j++) {
                System.out.print(chess[i][j]);
            }
            System.out.println();
        }
    }
}
