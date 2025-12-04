public enum KeyPeg {
    RED {
        public String getPeg() {
            return Color._RED + Color._BLACK_BG + " ⦿ " + Color._RESET;
        }
    }, WHITE {
        public String getPeg() {
            return Color._BLACK_BG + " ⦿ " + Color._RESET;
        }
    }, BLANK {
        public String getPeg() {
            return Color._BLACK_BG + "  " + Color._RESET;
        }
    };

    public abstract String getPeg();
}

