import java.util.Random;
import java.util.Scanner;

public class RandomNumberGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNum = rand.nextInt(500) * 2 + 1;                        
        Scanner scanner = new Scanner(System.in);
        int guessCount = 0;
        
        while (guessCount < 3) {                                          
            System.out.print("Guess the number: ");
            int guess = scanner.nextInt();
            
            if (guess == randomNum) {
                System.out.println("Correct! You won the game.");
                return;                                                     
            } else if (guess < randomNum) {
                System.out.println("Too Low");
            } else {
                System.out.println("Too High");
            }
            
            guessCount++;
        }
        
        System.out.println("You lost the game. The number was " + randomNum);
    }
}