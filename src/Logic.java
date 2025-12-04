public class Logic {

    private static int numOfRounds = 8;

    public int getNumOfRounds() {
        return numOfRounds;
    }

    @Override
    public String toString() {
        return "Game has " + getNumOfRounds() + " rounds.";
    }

}
