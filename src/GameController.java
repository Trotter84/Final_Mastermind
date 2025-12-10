public class GameController {

    private static Logic logic = new Logic();
    private static Board board = new Board();
    private static Player player = new Player();

    public static void run() {
        startGame();
    }

    public static void startGame() {
        System.out.println(board.buildBoard(logic.getNumOfRounds()));
        eachRound();
    }

    public static void eachRound() {
//        Peg peg = new Peg();

        System.out.println(player);
    }

}
