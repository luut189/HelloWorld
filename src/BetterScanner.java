import java.util.Scanner;

public class BetterScanner {
    static Scanner input = new Scanner(System.in);

    public int nextInt() {
        return input.nextInt();
    }

    public int nextInt(String prompt) {
        System.out.print(prompt);
        return input.nextInt();
    }

    public String nextLine() {
        return input.nextLine();
    }

    public String nextLine(String prompt) {
        System.out.print(prompt);
        return input.nextLine();
    }

    public double nextDouble() {
        return input.nextDouble();
    }

    public double nextDouble(String prompt) {
        System.out.print(prompt);
        return input.nextDouble();
    }

    public char nextChar() {
        return input.next().charAt(0);
    }

    public char nextChar(String prompt) {
        System.out.println(prompt);
        return input.next().charAt(0);
    }
}
