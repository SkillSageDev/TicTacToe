import java.util.Scanner;

public class Board {
    Scanner input = new Scanner(System.in);
    int range = 9;
    int value = 1;
    public char[] board = {'1','2','3','4','5','6','7','8','9'};

    public void creatBoard(){
        board = new char[]{'1','2','3','4','5','6','7','8','9'};
    }

    public void printBoard(){
        for (int i = 0; i < board.length; i++){
            if (i != 2 && i != 5 && i != 8){
                System.out.print(board[i] + "|");
            }
            else
                System.out.print(board[i]);
            if (i == 2 || i == 5){
                System.out.println();
                System.out.println("─╬─╬─");
            }
        }
        System.out.println("\n");
    }
    public boolean updateBoard(int choice, char symbol){
        if (isValidMove(choice)){
            board[choice-1] = symbol;
            return true;
        }
        return false;
    }
    
    // checks if the index contains a digit not x or o
    public boolean isValidMove(int choice) {
        // we do minus 1 because the list index starts from 0
        return Character.isDigit(board[choice-1]);
    }

    public boolean winCheck() {
        int[][] winConditions = {
                { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 },
                { 0, 3, 6 }, { 1, 4, 7 }, { 2, 5, 8 },
                { 0, 4, 8 }, { 2, 4, 6 }
        };
        for (int[] condition : winConditions) {
            if (board[condition[0]] == board[condition[1]]
                    && board[condition[1]] == board[condition[2]]) {
                        return true;
            }
        }
        return false;
    }

    public boolean drawCheck() {
        for (char c : board) {
            if (!winCheck() && !Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        Board board = new Board();
        boolean isDigit = false;
        for(char c : board.board){
            isDigit = Character.isDigit(c);
        }
        System.out.println("isDigit = " + isDigit);
        boolean checkWin = board.winCheck();
        boolean checkDraw = board.drawCheck();
        System.out.println("Win is " + checkWin);
        System.out.println("Draw is " + checkDraw);
        board.creatBoard();
        for(char c : board.board){
            isDigit = Character.isDigit(c);
        }
        checkWin = board.winCheck();
        checkDraw = board.drawCheck();
        System.out.println();
        System.out.println("isDigit = " + isDigit);
        System.out.println("Win is " + checkWin);
        System.out.println("Draw is " + checkDraw);
    }
}

// Old Code
/* 
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Board {
    Scanner input = new Scanner(System.in);
    int rows = 3;
    int columns = 3;
    int value = 1;
    String[][] board = new String[rows][columns];

public void creatBoard() {
        // entering numbers from 1 to 9 into the board
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = Integer.toString(value);
                value++;
            }
        }
    }

    public void displayBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                // don't put "|" after number 3 in the list
                if (j < 2)
                    System.out.print(board[i][j] + "|");
                else
                    System.out.print(board[i][j]);
            }
            // draw "-----" only 2 times
            if (i < 2)
                System.out.println("\n─╬─╬─");
        }
    }

    public void cdBoard() {
        // creat board
        // entering numbers from 1 to 9 into the board
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = Integer.toString(value);
                value++;
            }
        }
        // display board
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                // don't put "|" after number 3 in the list
                if (j < 2)
                    System.out.print(board[i][j] + "|");
                else
                    System.out.print(board[i][j]);
            }
            // draw "-----" only 2 times
            if (i < 2)
                System.out.println("\n─╬─╬─");
        }
    }

    public void updateBoard(String choice, String symbol) {
        creatBoard();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                // Change cell to (x or o)
                // if (isValid(choice)){
                //     value++;
                // }
                if (board[i][j].equals(choice)) {
                    board[i][j] = symbol;
                }
                // don't put "|" after number 3 in the list
                if (j < 2)
                    System.out.print(board[i][j] + "|");
                else
                    System.out.print(board[i][j]);
            }
            // draw "-----" only 2 times
            if (i < 2)
                System.out.println("\n-----");
        }

    }
*/