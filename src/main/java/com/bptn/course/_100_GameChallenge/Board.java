package com.bptn.course._100_GameChallenge;

import java.util.Arrays;
import java.util.Scanner;

public class Board {
    // add instance variables

    private Object[] board;

	public void boardSetUp() {
        System.out.println("------ Board Set up -------");
        System.out.println("Number of rows: ");
        int rows = // receive user input
        System.out.println("Number of cols: ");
        // receive column value
        this.board = // initialize a row by column array;

        // initialize empty board with dashes (-)
        for (String[] row : board) {
            // fill up each row of the board with dashes
        }
    }

    public void printBoard() {
        for (String[] row : board) {
            System.out.println(Arrays.toString(row));
        }
    }

    public boolean columnFull(int col) {
        return !board[0][col].equals("-");
    }

    public boolean boardFull() {
        // True understanding this code.
        for (int i = 0; i < this.board[0].length; i++) {
            if (!columnFull(i)) {
                return false;
            }
        }
        return true;
    }

    public boolean addToken(int colToAddToken, String token) {

         if (colToAddToken > this.board[0].length - 1) {
            throw 
            new // complete line
            ("Column number exceeds number of columns on board. Columns go from 0 to " + (this.board[0].length - 1));
        }

        if (columnFull(colToAddToken)) {
            // throw exception here.
        }


        int rowToAddToken = board.length - 1;

        while (rowToAddToken >= 0 ) {
            if (board[rowToAddToken][colToAddToken].equals("-")) {
               // You now know the right row and column to place the token. Place it and then return true.
               board[rowToAddToken][colToAddToken] = token;
                return true;
            } else {
                rowToAddToken -= 1;
            }
        }

        return false;
    }

    public boolean checkIfPlayerIsTheWinner(String playerNumber) {
        if (checkHorizontal(playerNumber)) {
            return true;
        } else if (checkLeftDiagonal(playerNumber)) {
            return true;
        }
        // what other conditions should we include here?
        return false;
    }

    public boolean checkVertical(String playerNumber) {
        for (int col = 0; col < board[0].length; col++) {
            // length - 3 here cos we are comparing 4 in a row items
            for (int row = 0; row < board.length - 3; row++) {
                if (board[row][col].equals(playerNumber)) {
                    if (board[row][col] == board[row + 1][col]
                            && board[row][col] == board[row + 2][col]
                            && board[row][col] == board[row + 3][col]) {
                        return true;
                    }
                }
            }
        }

        return false;

    }

    public boolean checkHorizontal(String playerNumber) {
        for (int col = 0; col < board[0].length - 3; col++) {
           // try implementing this by being inspired by the checkVertical logic. Note avoid off by 1 errors. Also remember that you are now checking across columns within each row this time. 
        }
        return false;
    }

     public boolean checkLeftDiagonal(String playerNumber) {
        for (int row = 0; row < board.length - 3; row++) {
            for (int col = 0; col < board[0].length - 3; col++) {
                if (board[row][col].equals(playerNumber)) {
                    if (board[row][col] == board[row + 1][col + 1]
                            && board[row][col] == board[row + 2][col + 2]
                            && board[row][col] == board[row + 3][col + 3]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean checkRightDiagonal(String playerNumber) {
       // implment method and return appropriate return type.
    }
}
