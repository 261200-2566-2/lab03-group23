public class Shield {
    private double defense;
    private double runSpeedDecrease;
    private int level;

    public Shield(double defense, double runSpeedDecrease, int level) {
        this.defense = defense;
        this.runSpeedDecrease = runSpeedDecrease;
        this.level = level;
    }

    public double upDefense() {
        return defense * (1 + 0.05 * level);
    }

    public double upRunSpeedDecrease() {
        return runSpeedDecrease * (0.1 + 0.08 * level);
    }
}
