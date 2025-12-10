import java.util.Random;


public class Logic {

    private static int numOfRounds = 8;
    //    private CodePeg[] codePegs = {codeRed, codeBlue, codeGreen, codePurple, codeCyan, codeYellow};
    private Peg pegs = new Peg();
    private int[] secretCode = new int[4];

    public void setSecretCode() {
        Random rand = new Random();
        for (int i = 0; i < secretCode.length; i++) {
            secretCode[i] = rand.nextInt(6);
        }
    }

    public int getNumOfRounds() {
        return numOfRounds;
    }

    public int[] getSecretCode() {
        return secretCode;
    }

    @Override
    public String toString() {
        return "Game has " + getNumOfRounds() + " rounds.\n" + getSecretCode();
    }

}
