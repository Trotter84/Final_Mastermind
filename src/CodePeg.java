public enum CodePeg {
    //    RED, BLUE, GREEN, PURPLE, CYAN, YELLOW,
    RED {
        public String getColor() {
            return ColorList.RED + ColorList.BLACK_BG + " ● " + ColorList.RESET;
        }
    }, BLUE {
        public String getColor() {
            return ColorList.BLUE + ColorList.BLACK_BG + " ● " + ColorList.RESET;
        }
    }, GREEN {
        public String getColor() {
            return ColorList.GREEN + ColorList.BLACK_BG + " ● " + ColorList.RESET;
        }
    }, PURPLE {
        public String getColor() {
            return ColorList.PURPLE + ColorList.BLACK_BG + " ● " + ColorList.RESET;
        }
    }, YELLOW {
        public String getColor() {
            return ColorList.YELLOW + ColorList.BLACK_BG + " ● " + ColorList.RESET;
        }
    }, CYAN {
        public String getColor() {
            return ColorList.CYAN + ColorList.BLACK_BG + " ● " + ColorList.RESET;
        }
    };

    public abstract String getColor();
}
