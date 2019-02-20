import model.Game;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Game game = new Game();

        Scanner input = new Scanner(System.in);
        System.out.println("Type number to discard, 0 to sort hand");

        while(true) {
            System.out.println("\nhand: " + game.getHand());
            System.out.println("disc: " + game.getDiscards());

            int instruction = input.nextInt();

            if(instruction == 0) {
                game.sortHand();
            } else {
                if(!game.discard(instruction)) {
                    System.out.println("Tile was not in hand. Please discard again");
                }
            }
        }
    }
}
