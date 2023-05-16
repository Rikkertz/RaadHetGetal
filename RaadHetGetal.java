import java.util.Objects;
import java.util.Random;
import java.util.Scanner;


public class RaadHetGetal {
    public static void main(String[] args) {
        Random rand = new Random();
        //  Generate a number between 1 and 1000
        int number = rand.nextInt(999) + 1;
        int guesses = 0;
        int lower_bound = 1;
        int upper_bound = 1000;
        // User has 10 guesses to guess the number
        while(guesses < 10){
            Scanner userinput = new Scanner(System.in);
            System.out.printf("Guess a number between %s and %s.\nYou have %s guesses left.\n", lower_bound, upper_bound, (10-guesses));
            int guess = userinput.nextInt();
            while(!(lower_bound < guess && guess < upper_bound)) {
                System.out.printf("Please guess a number between %s and %s.\n", lower_bound, upper_bound, (10-guesses));
                guess = userinput.nextInt();
            }
            if(guess == number){
                System.out.printf("Congratulations! The number was %s.\n", number);
                // Allow the user to play again without restarting the program
                Scanner end_of_game = new Scanner(System.in);
                System.out.println("Type 'Yes' if you want to play again.");
                String playagain = end_of_game.nextLine();
                if(Objects.equals(playagain, "Yes")){
                    number = rand.nextInt(999) + 1;
                    guesses = 0;
                    continue;
                }
                return;
            } else if (guess <= number) {
                System.out.println("Your guess was too low!");
                lower_bound = guess;
            } else {
                System.out.println("Your guess was too high!");
                upper_bound = guess;
            }
            guesses ++;
            if(guesses == 10){
            System.out.printf("You have run out of guesses. The number was %s\n", number);
            // Allow the user to play again without restarting the program
            Scanner end_of_game = new Scanner(System.in);
            System.out.println("Type 'Yes' if you want to play again.");
            String playagain = end_of_game.nextLine();
            if(Objects.equals(playagain, "Yes")) {
                number = rand.nextInt(999) + 1;
                guesses = 0;
            }
            }
            }


        }
}
