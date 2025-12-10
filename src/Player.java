import java.util.Scanner;


public class Player {

    private static int[] guess = new int[4];
    private Peg pegs = new Peg();

    public Player() {
        setGuess(guess);
    }

    public void setGuess(int[] guess) {
        promptForGuess("Choose four code pegs.", pegs);
    }

    public int[] getGuess() {
        return guess;
    }

    public static int[] promptForGuess(String prompt, Peg pegs) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        int num = 0;
        boolean isInvalid = true;

        do {
            System.out.println(prompt);
            System.out.println(pegs);
//            System.out.println(ColorList.BLACK_BG + " 1  2  3  4  5  6 " + ColorList.RESET);
            for (int i = 0; i < guess.length; i++) {
                System.out.print("> ");
                try {
                    input = scanner.nextLine();
                    num = Integer.parseInt(input);
                    isInvalid = num < 0 || num > 6 && guess.length == 4;
                } catch (NumberFormatException nfe) {
                    System.out.println("Your input was not a valid whole number. Please, try again.");
                }
                if (isInvalid) {
                    System.out.println("Your input must be a number between 0 and 6 inclusive. Please, try again.");
                }
                guess[i] = num;
            }

        } while (isInvalid);
        return guess;
    }

    @Override
    public String toString() {
        String guessValue = "";
        for (int i : getGuess()) {
            guessValue += " " + i + " ";
        }
        return "Guess:" + guessValue;
    }
}
