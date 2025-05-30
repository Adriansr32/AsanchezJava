package metodes3_AdrianSanchez;

import java.util.*;

/**
 * Represents a Tic-Tac-Toe game where two players take turns to mark spaces on a 3x3 grid.
 * The game ends when one player aligns three marks or the grid is full.
 * 
 * @author Adrian Sanchez
 * @version 1.0
 * @since 2025-01-22
 */
public class Metodes3_3 {

    /**
     * Main method that initializes the game board and starts the gameplay loop.
     *
     * @param args Command-line arguments, not used.
     * @since 2025-01-22
     */
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> board = initializeBoard();
        playGame(board);
    }

    /**
     * Initializes a 3x3 Tic-Tac-Toe game board with empty spaces.
     *
     * @return A 3x3 grid represented as a list of lists of strings.
     * @since 2025-01-22
     */
    public static ArrayList<ArrayList<String>> initializeBoard() {
        ArrayList<ArrayList<String>> board = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            ArrayList<String> row = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                row.add(" ");
            }
            board.add(row);
        }
        return board;
    }

    /**
     * Executes the main gameplay loop for Tic-Tac-Toe, alternating turns between two players.
     *
     * @param board The 3x3 game board where moves are made.
     * @since 2025-01-22
     */
    public static void playGame(ArrayList<ArrayList<String>> board) {
        Scanner in = new Scanner(System.in);
        String player1 = "X";
        String player2 = "O";
        String currentPlayer = player1;
        int turns = 0;
        int player1Turns = 0;
        int player2Turns = 0;
        boolean winner = false;

        while (turns < 9 && !winner) {
            displayBoard(board);

            int row = getValidInput(in, "Turn of " + currentPlayer + ": Enter row (0, 1 or 2): ");
            int column = getValidInput(in, "Turn of " + currentPlayer + ": Enter column (0, 1 or 2): ");

            if (isValidMove(board, row, column)) {
                makeMove(board, currentPlayer, row, column);
                turns++;

                if (currentPlayer.equals(player1)) {
                    player1Turns++;
                } else {
                    player2Turns++;
                }

                if (checkWinner(board, currentPlayer)) {
                    winner = true;
                    displayBoard(board);
                    System.out.print("Congratulations! Player " + currentPlayer + " has won in ");
                    if (currentPlayer.equals(player1)) {
                        System.out.print(player1Turns + " turns.\n");
                    } else {
                        System.out.print(player2Turns + " turns.\n");
                    }
                } else {
                    currentPlayer = switchPlayer(currentPlayer, player1, player2);
                }
            } else {
                System.err.println("Cell is occupied or invalid! Try again.");
            }
        }

        if (!winner) {
            displayBoard(board);
            System.out.println("It's a draw!");
            System.out.println("Player 1 turns: " + player1Turns);
            System.out.println("Player 2 turns: " + player2Turns);
        }
        in.close();
    }

    /**
     * Prompts the user for valid input within the range 0-2.
     *
     * @param in Scanner object to read user input.
     * @param prompt The message displayed to the user.
     * @return A valid integer input between 0 and 2.
     * @since 2025-01-22
     */
    public static int getValidInput(Scanner in, String prompt) {
        int input = -1;
        boolean valid = false;

        while (!valid) {
            System.out.print(prompt);
            if (in.hasNextInt()) {
                input = in.nextInt();
               if (input >= 0 && input <= 2) {
                    valid = true;
                } else {
                    System.err.println("Error: Input must be between 0 and 2.");
                }
            } else {
                System.err.println("Error: Input must be a number.");
                in.next();
            }
        }

        return input;
    }

    /**
     * Displays the current state of the game board.
     *
     * @param board The 3x3 game board to display.
     * @since 2025-01-22
     */
    public static void displayBoard(ArrayList<ArrayList<String>> board) {
        for (int i = 0; i < 3; i++) {
            System.out.println("-------------");
            for (int j = 0; j < 3; j++) {
                System.out.print("| " + board.get(i).get(j) + " ");
            }
            System.out.println("|");
        }
        System.out.println("-------------");
    }

    /**
     * Checks if a move is valid at the specified position.
     *
     * @param board The game board.
     * @param row The row index of the move.
     * @param column The column index of the move.
     * @return True if the move is valid, otherwise false.
     * @since 2025-01-22
     */
    public static boolean isValidMove(ArrayList<ArrayList<String>> board, int row, int column) {
        return board.get(row).get(column).equals(" ");
    }

    /**
     * Places a player's mark on the board at the specified position.
     *
     * @param board The game board.
     * @param player The player's mark ("X" or "O").
     * @param row The row index for the move.
     * @param column The column index for the move.
     * @since 2025-01-22
     */
    public static void makeMove(ArrayList<ArrayList<String>> board, String player, int row, int column) {
        board.get(row).set(column, player);
    }

    /**
     * Checks if the specified player has won the game.
     *
     * @param board The game board.
     * @param player The player's mark ("X" or "O").
     * @return True if the player has won, otherwise false.
     * @since 2025-01-22
     */
    public static boolean checkWinner(ArrayList<ArrayList<String>> board, String player) {
        for (int i = 0; i < 3; i++) {
            if (board.get(i).get(0).equals(player) &&
                board.get(i).get(1).equals(player) &&
                board.get(i).get(2).equals(player)) {
                return true;
            }
        }

        for (int j = 0; j < 3; j++) {
            if (board.get(0).get(j).equals(player) &&
                board.get(1).get(j).equals(player) &&
                board.get(2).get(j).equals(player)) {
                return true;
            }
        }

        if (board.get(0).get(0).equals(player) &&
            board.get(1).get(1).equals(player) &&
            board.get(2).get(2).equals(player)) {
            return true;
        }

        if (board.get(0).get(2).equals(player) &&
            board.get(1).get(1).equals(player) &&
            board.get(2).get(0).equals(player)) {
            return true;
        }

        return false;
    }

    /**
     * Switches the current player to the other player.
     *
     * @param currentPlayer The current player's mark ("X" or "O").
     * @param player1 The first player's mark ("X").
     * @param player2 The second player's mark ("O").
     * @return The other player's mark.
     * @since 2025-01-22
     */
    public static String switchPlayer(String currentPlayer, String player1, String player2) {
        return currentPlayer.equals(player1) ? player2 : player1;
    }
}
