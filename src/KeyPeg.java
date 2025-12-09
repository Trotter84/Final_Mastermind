public enum KeyPeg {
    RED {
        public String getPeg() {
            return ColorList.RED + ColorList.BLACK_BG + " ⦿ " + ColorList.RESET;
        }
    }, WHITE {
        public String getPeg() {
            return ColorList.BLACK_BG + " ⦿ " + ColorList.RESET;
        }
    }, BLANK {
        public String getPeg() {
            return ColorList.BLACK_BG + "  " + ColorList.RESET;
        }
    };

    public abstract String getPeg();
}

