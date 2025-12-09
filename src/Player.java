import java.util.Scanner;


public class Player {

    private static int[] guess = new int[4];

    public void setGuess(int[] guess) {
        this.guess = guess;
    }

    public int[] getGuess() {
        return guess;
    }

    public static int[] promptForGuess(String prompt, String colors) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        int num = -1;
        boolean isInvalid = true;

        do {
            System.out.println(prompt);
            System.out.println(colors);
            System.out.println(ColorList.BLACK_BG + " 1  2  3  4  5  6 " + ColorList.RESET);
            for (int i = 0; i < 5; i++) {
                System.out.print("> ");
                try {
                    input = scanner.nextLine();
                    num = Integer.parseInt(input);
                    isInvalid = num < 0 || num > 6;
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
        return "" + getGuess();
    }
}
