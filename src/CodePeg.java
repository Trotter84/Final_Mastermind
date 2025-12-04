public enum CodePeg {
    RED {
        public String getPeg() {
            return Color._RED + Color._BLACK_BG + " ● " + Color._RESET;
        }
    }, BLUE {
        public String getPeg() {
            return Color._BLUE + Color._BLACK_BG + " ● " + Color._RESET;
        }
    }, GREEN {
        public String getPeg() {
            return Color._GREEN + Color._BLACK_BG + " ● " + Color._RESET;
        }
    }, PURPLE {
        public String getPeg() {
            return Color._PURPLE + Color._BLACK_BG + " ● " + Color._RESET;
        }
    }, CYAN {
        public String getPeg() {
            return Color._CYAN + Color._BLACK_BG + " ● " + Color._RESET;
        }
    }, YELLOW {
        public String getPeg() {
            return Color._YELLOW + Color._BLACK_BG + " ● " + Color._RESET;
        }
    };

    public abstract String getPeg();
}
