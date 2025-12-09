public class GameController {

    public static CodePeg codeRed = CodePeg.RED;
    public static CodePeg codeBlue = CodePeg.BLUE;
    public static CodePeg codeGreen = CodePeg.GREEN;
    public static CodePeg codePurple = CodePeg.PURPLE;
    public static CodePeg codeCyan = CodePeg.CYAN;
    public static CodePeg codeYellow = CodePeg.YELLOW;
    public static KeyPeg keyRed = KeyPeg.RED;
    public static KeyPeg keyWhite = KeyPeg.WHITE;
    public static KeyPeg keyBlank = KeyPeg.BLANK;

    private Logic logic = new Logic();
    private Board board = new Board();

    private Player player = new Player();
    private Color color;
    private Type type;
    private static Peg peg = new Peg(Color.BLUE);

    public static void run() {
        startGame();
//        System.out.print(codeRed.getPeg());
//        System.out.print(codeBlue.getPeg());
//        System.out.print(codeGreen.getPeg());
//        System.out.print(codePurple.getPeg());
//        System.out.print(codeCyan.getPeg());
//        System.out.print(codeYellow.getPeg());
//        System.out.print(keyRed.getPeg());
//        System.out.print(keyWhite.getPeg());
//        System.out.println(keyBlank.getPeg());

//        System.out.println(logic);
//        System.out.println(logic.getCodePeg());

//        logic.setSecretCode();
//        System.out.println(logic.getSecretCode());
    }

    public static void startGame() {
//        Player.promptForGuess("Choose four colors.", logic.getCodePeg());
//        System.out.println(player);
        System.out.println(peg);

    }
}
