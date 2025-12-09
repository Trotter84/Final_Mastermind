public class Peg {

    //region Colors
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String YELLOW = "\u001B[33m";
    public static final String WHITE = "\u001B[37m";
    //endregion
    //region BgColors
    public static final String BLACK_BG = "\u001B[40m";
    //endregion

    private Color color;

    private final CodePeg[] codePegs = new CodePeg[6];
    private final KeyPeg[] keyPegs = new KeyPeg[4];

    public Color getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = Color.valueOf(color.toUpperCase());
    }

    public Peg(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return getColor() + BLACK_BG + " ● " + RESET;
    }
}
