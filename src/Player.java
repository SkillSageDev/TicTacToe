import java.util.Scanner;
public class Player {
    // varibales
    Scanner input = new Scanner(System.in);
    char symbol;

    // asks player1 to choose the symbol
    public char chooseSymbol(){
        System.out.println("Player 1, choose a symbol! (x\\o)");
        symbol = input.next().charAt(0);
        // make sure player choose x or o only
        while (true) {
            if (symbol == 'x' || symbol == 'o') {
                break;
            } else {
                System.out.println("The symbol you have chosen \"" + symbol + "\" is invalid. Please choose \"x\" or \"o\"");
                symbol = input.next().charAt(0);
            }
        }
        return symbol;
    }        
    public static void main(String[] args){
        // asigning symbols to players
        Player p1 = new Player();
        Player p2 = new Player();
        p1.chooseSymbol();
        if (p1.symbol == 'x')
            p2.symbol = 'o';
        else
            p2.symbol = 'x';
        System.out.println("Player 1, symbol is: " + "\"" + p1.symbol + "\"" + "\n" + "Player 2, symbol is: " + "\"" + p2.symbol + "\"");
    }
}