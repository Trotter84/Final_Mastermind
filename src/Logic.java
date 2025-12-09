import java.util.Random;


public class Logic {

    public static final String _RESET = "\u001B[0m";
    public static final String _BLACK_BG = "\u001B[40m";
    public static CodePeg codeRed = CodePeg.RED;
    public static CodePeg codeBlue = CodePeg.BLUE;
    public static CodePeg codeGreen = CodePeg.GREEN;
    public static CodePeg codePurple = CodePeg.PURPLE;
    public static CodePeg codeCyan = CodePeg.CYAN;
    public static CodePeg codeYellow = CodePeg.YELLOW;

    private static int numOfRounds = 8;
    //    private CodePeg[] codePegs = {codeRed, codeBlue, codeGreen, codePurple, codeCyan, codeYellow};
    private String[] codePegs = {
            codeRed.getColor(),
            codeBlue.getColor(),
            codeGreen.getColor(),
            codePurple.getColor(),
            codeYellow.getColor(),
            codeCyan.getColor(),
    };
    private String[] secretCode = new String[4];

    public void setSecretCode() {
        Random rand = new Random();
        for (int i = 0; i < secretCode.length; i++) {
            secretCode[i] = codePegs[rand.nextInt(6)];
        }
    }

    public int getNumOfRounds() {
        return numOfRounds;
    }

    public String getCodePeg() {
        String code = "";
        for (String codePeg : codePegs) {
            code += codePeg;
        }
        return code;
    }

    public String[] getSecretCode() {
        return secretCode;
    }

    @Override
    public String toString() {
        return "Game has " + getNumOfRounds() + " rounds.";
    }

}
