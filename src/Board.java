public class Board {

    private final String[] blankRow = new String[6];

    public Board() {
        setBlankRow(blankRow);
    }

    private void setBlankRow(String[] blankRow) {
        for (int i = 0; i < blankRow.length; i++) {
            blankRow[i] = ColorList.BLACK_BG + " ○ " + ColorList.RESET;
        }
    }

    public String[] getBlankRow() {
        return blankRow;
    }

    public String buildBoard(int rowCount) {
        String row = "";
        String board = "";

        for (String cell : getBlankRow()) {
            row += cell;
        }
        for (int i = 0; i < rowCount; i++) {
            board += row + "\n";
        }
        return board;
    }

    @Override
    public String toString() {
        return buildBoard(1);
    }
}

//public class Board {
//
//    private final int rows = 8, columns = 6;
//    private final String[][] blankBoard = new String[rows][columns];
//
//    public Board() {
//        setBlankBoard(blankBoard);
//    }
//
//    private void setBlankBoard(String[][] blankBoard) {
//        for (int r = 0; r < blankBoard.length; r++) {
//            for (int c = 0; c < blankBoard[0].length; c++) {
//                blankBoard[r][c] = ColorList.BLACK_BG + " " + "○" + " " + ColorList.RESET;
//            }
//        }
//    }
//
//    public String[][] getBlankBoard() {
//        return blankBoard;
//    }
//
//    public void printBlankBoard() {
//        for (String[] cells : getBlankBoard()) {
//            for (String cell : cells) {
//                System.out.print(cell);
//            }
//            System.out.println();
//        }
//    }
//
//    @Override
//    public String toString() {
//        printBlankBoard();
//
//        return "";
//    }
//}
