import java.util.Random;
import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class RaadHetGetal {
    public static void main( String args[] ) {
        //  Maak een getal tussen 0 en 1000
        Random rand = new Random();
        //  Genereer een getal tussen 1 en 999 inclusief
        int number = rand.nextInt(999) + 1;

        while(true){
            Scanner userinput = new Scanner(System.in);
            System.out.println("Raad een getal tussen 1 en 1000");

            int guess = parseInt(userinput.nextLine());
            if(guess == number){
                System.out.println("Congratulations!");
                break;
            } else if (guess <= number) {
                System.out.println("Your guess was too low!");
            } else {
                System.out.println("Your guess was too high!");
            }
            }

        }
}
