package com.bptn.course._100_GameChallenge;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {

    private Player[] players;
    private Board board;
    private static Scanner scanner = new Scanner(System.in);

    public Game() {
        // let's default it two players for now. Later you could improve this to allow the game creator to choose how many players are involved.
        this.players = // complete line.
        this.board = // complete line
    }

    public void setUpGame() {
        System.out.println("Enter player 1's name: ");
        players[0] = new Player(scanner.nextLine(), "1");
        System.out.println("Enter player 2's name: ");
        String playerTwoName = scanner.nextLine();
        /** add logic to prevent user from giving a second name that's equal to the first. Allow user to try as long as the names are not different.*/
        String playerTwoName;
        //wrap the code in here with a conditional block that would enable the check described above. 
        do {
            System.out.println("Error! Both Players cannot have the same name.");
            System.out.println("Enter player 2's name: ");
            playerTwoName = scanner.nextLine();
            if (playerTwoName.equals(players[0].getName())) {
                System.out.println("Error! Both Players cannot have the same name."); 
            }           
        } while (playerTwoName.equals(players[0].getName()));
       
        players[1] = new Player(playerTwoName, "2");

        // set up board using appropriate method
        board.boardSetUp();
        // print board using appropriate method
        board.printBoard();
    }

    public void printWinner(Player player) {
        System.out.println(player.getName() + " is the winner");
    }

    public void playerTurn(Player currentPlayer) {
        try {
            int col = currentPlayer.makeMove();
            while (!board.addToken(col, currentPlayer.getPlayerNumber())) {
                // call board method to add token.
                System.out.print("Column is full. Choose another column: ");
                col = currentPlayer.makeMove();
            }
        board.printBoard();// print board
        }

        // If you think functions calling themselves sounds interesting you may find the topic of Recursion interesting. https://www.youtube.com/watch?v=k-7jJP7QFEM&ab_channel=CodingwithJohn
        
        catch (IllegalArgumentException e) {
            System.out.print("Retry: ");
            System.out.println(e.getMessage());
            playerTurn(currentPlayer); // calling the method again to let the player take a turn again
        } catch (InputMismatchException invalidInputMismatchException) {
            System.out.print("Please provide a valid value for column");
            playerTurn(currentPlayer);
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
            playerTurn(currentPlayer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void play() {
        boolean noWinner = true;
        this.setUpGame();
        int currentPlayerIndex = 0;

        while (noWinner) {
            if (board.boardFull()) {
                System.out.println("Board is now full. Game Ends.");
                return;
            }

            Player currentPlayer = players[currentPlayerIndex];
            // Override default tostring for Player class
            System.out.println("It is player " + currentPlayer.getPlayerNumber() + "'s turn. " + currentPlayer);
            playerTurn(currentPlayer);
            if (board.checkIfPlayerIsTheWinner(currentPlayer.getPlayerNumber())) {
                printWinner(currentPlayer);
                noWinner = false;
            } else {
                currentPlayerIndex = (currentPlayerIndex + 1) % players.length; // reassign the variable to allow the game to continue. Note the index would wrap back to the first player if we are at the end. Think of using modulus (%).
            }
        }
    }
}

