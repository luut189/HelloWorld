import java.util.Random;

public class Main {
	public static void main(String[] args) {
        BetterScanner input = new BetterScanner();
        Random rand = new Random();
        int num = rand.nextInt();
        int check = input.nextInt("Please enter your number: ");
        while(check != num) {
            check = input.nextInt("Incorret!\nPlease enter a new number: ");
        }
        System.out.println("Correct!");
	}
}
