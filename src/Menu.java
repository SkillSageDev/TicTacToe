import java.util.Scanner;
public class Menu {
    Scanner input = new Scanner(System.in);
    
    // prints main menu
    public int main(){
        System.out.println("Welcom to XO Game!\n1. start game\n2. quit game\nPlease pick a number!");
        return input.nextInt();
    }

    // prints end menu
    public int end(){
        System.out.println("Game Over!\n1. restart game\n2. quit game\nPlease pick a number!");
        return input.nextInt();
    }
}
