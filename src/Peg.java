public class Peg {

    //    private final Color color;
    private final int[] codePegs = new int[6];

    public Peg() {
        setCodePegs(codePegs);
    }

    public void setCodePegs(int[] codePegs) {
        for (int i = 0; i < codePegs.length; i++) {
            codePegs[i] = i + 1;
        }

    }

    public String getCodePegs() {
        String pegs = "";
//        foreach loop
        for (int color : codePegs) {
            pegs += " " + color + " ";
        }
        return pegs;
    }

    @Override
    public String toString() {
        return ColorList.BLACK_BG + getCodePegs() + ColorList.RESET;
    }
}
