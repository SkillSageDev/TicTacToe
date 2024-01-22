import java.util.Scanner;
public class Menu {
    Scanner input = new Scanner(System.in);
    public int main(){
        System.out.println("Welcom to XO Game!\n1. start game\n2. quite game\nPlease pick a number!");
        return input.nextInt();
    }
    public int end(){
        System.out.println("Game Over!\n1. restart game\n2. quite game\nPlease pick a number!");
        return input.nextInt();
    }
}
