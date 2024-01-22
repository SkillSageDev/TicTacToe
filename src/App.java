public class App {
    public static void main(String[] args) {
        Game game = new Game();
        game.startGame();
    }
}

// Old Code

/*
import java.util.Scanner;

public class App {
    

    public static void printarray() {
        // Variables
        Scanner input = new Scanner(System.in);
        int player1 = 0;
        int player2 = 0;
        int turn = 0;
        String x = "0", o  ;
        int rows = 3, columns = 3;
        String[][] board = new String[rows][columns];
        int value = 1;

        // Input
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = Integer.toString(value);
                value++;
            }
        }

        // Output
        System.out.println("Welcome To XO Game!");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (j <= 1)
                    System.out.print(board[i][j] + "|");
                else
                    System.out.print(board[i][j]);
            }
            if (i <= 1)
                System.out.println("\n-----");
        }
        System.out.println();

        // Change Input
        
        while (true){
            System.out.println("Player 1, Enter A Number!");   
            player1 = input.nextInt();
            if(player1 != 0 && turn == 0){
                for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board.length; j++) {
                    if (board[i][j].equals(Integer.toString(player1))) {
                        board[i][j] = "x";
                    }
                }
            }
            // // Update Output
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board.length; j++) {
                    if (j <= 1)
                        System.out.print(board[i][j] + "|");
                    else
                        System.out.print(board[i][j]);
                }
                if (i <= 1)
                    System.out.println("\n-----");
            }
            turn++;
            }
            System.out.println("Player 2, Enter A Number!");   
            player2 = input.nextInt();
            if(player2 != 0 && turn == 1){
                for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board.length; j++) {
                    if (board[i][j].equals(Integer.toString(player1))) {
                        board[i][j] = "o";
                    }
                }
            }
            // // Update Output
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board.length; j++) {
                    if (j <= 1)
                        System.out.print(board[i][j] + "|");
                    else
                        System.out.print(board[i][j]);
                }
                if (i <= 1)
                    System.out.println("\n-----");
            }
            turn++;
            }
            
        }
        
    }

    public static void main(String[] args) {
        printarray();

    }
}

 
 */