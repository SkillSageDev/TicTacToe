import java.util.Scanner;

public class Game {
    Scanner input = new Scanner(System.in);
    Menu menu = new Menu();
    Player p1 = new Player();
    Player p2 = new Player();
    Player[] players = { p1, p2 };
    int currentPlayer = 0;
    Board board = new Board();

    public void startGame() {
        int choice = menu.main();
        while (true) {
            if (choice == 1) {
                setupPlayers();
                playGame();
                choice = 0;
            } else if (choice == 2) {
                quiteGame();
                break;
            } else {
                choice = menu.main();
            }
        }
    }

    public void playGame() {
        while (true) {
            playTurn();
            if (winCheck() || drawCheck()) {
                int choice = menu.end();
                while (choice == 1 || choice == 2) {
                    if (choice == 1) {
                        restartGame();
                        choice = 2;
                    } else if (choice == 2) {
                        break;
                    } else {
                        choice = menu.end();
                    }
                }
                break;
            }
        }
    }

    private void restartGame() {
        board.creatBoard();
        playGame();
    }

    public boolean winCheck() {
        int[][] winConditions = {
                { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 },
                { 0, 3, 6 }, { 1, 4, 7 }, { 2, 5, 8 },
                { 0, 4, 8 }, { 2, 4, 6 }
        };
        for (int[] condition : winConditions) {
            if (board.board[condition[0]] == board.board[condition[1]]
                    && board.board[condition[1]] == board.board[condition[2]]) {
                return true;
            }
        }
        return false;
    }

    public boolean drawCheck() {
        for (char c : board.board) {
            if (!winCheck() && Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    public void setupPlayers() {
        players[0].chooseSymbol();
        if (players[0].symbol == 'x')
            players[1].symbol = 'o';
        else
            players[1].symbol = 'x';
        System.out.println("Player 1, symbol is: " + "\"" + p1.symbol + "\"" + "\n" + "Player 2, symbol is: " + "\""
                + p2.symbol + "\"");
    }

    public void playTurn() {
        board.printBoard();
        while (true) {
            if (!winCheck() || !drawCheck()) {
                replaceSymbol();
                switchPlayer();
                break;
            }
        }
    }

    public void switchPlayer() {
        currentPlayer = 1 - currentPlayer;
    }

    public void replaceSymbol() {
        System.out.println("Player " + (currentPlayer + 1) + " , select a number");
        while (true) {
            try {
                int choice = input.nextInt();
                if (board.updateBoard(choice, players[currentPlayer].symbol)) {
                    break;
                } else {
                    System.out.println("Invalid Move, the number " + choice + " is already taken\nPlayer "
                            + (currentPlayer + 1) + ", please choose another number!");
                    board.updateBoard(choice, players[currentPlayer].symbol);

                }
            } catch (Exception e) {
                System.out.println("Invalid choice, please enter a number between (1-9)");
            }
        }
    }

    public void quiteGame() {
        System.out.println("Thanks for playing!");
    }
}
