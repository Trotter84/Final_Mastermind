public class Board {

    //    private CodePeg[] codePegs = {codeRed, codeBlue, codeGreen, codePurple, codeCyan, codeYellow};
    private CodePeg[] row = new CodePeg[4];

    public void setRow() {

    }

    public void getCodePeg() {
//        return codePegs[1].getPeg();
    }

    public CodePeg[] getRow() {
        return row;
    }

    @Override
    public String toString() {
        return getRow() + "";
    }
}
