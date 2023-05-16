import java.util.Objects;
import java.util.Random;
import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class RaadHetGetal {
    public static void main(String[] args) {
        Random rand = new Random();
        //  Generate a number between 1 and 1000
        int number = rand.nextInt(999) + 1;
        int guesses = 0;
        // User has 10 guesses to guess the number
        while(guesses < 10){
            Scanner userinput = new Scanner(System.in);
            System.out.printf("Guess a number between 1 and 1000.\nYou have %s guesses left.\n", (10-guesses));

            int guess = parseInt(userinput.nextLine());
            if(guess == number){
                System.out.printf("Congratulations! The number was %s.\n", number);
                // Allow the user to play again without restarting the program
                System.out.println("Type 'Yes' if you want to play again.");
                String playagain = userinput.nextLine();
                if(Objects.equals(playagain, "Yes")){
                    number = rand.nextInt(999) + 1;
                    guesses = 0;
                    continue;
                }
                return;
            } else if (guess <= number) {
                System.out.println("Your guess was too low!");
            } else {
                System.out.println("Your guess was too high!");
            }
            guesses ++;
            if(guesses == 10){
            System.out.printf("You have run out of guesses. The number was %s\n", number);
            // Allow the user to play again without restarting the program
            System.out.println("Type 'Yes' if you want to play again.");
            String playagain = userinput.nextLine();
            if(Objects.equals(playagain, "Yes")) {
                number = rand.nextInt(999) + 1;
                guesses = 0;
            }
            }
            }


        }
}
