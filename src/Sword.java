public class Sword {
    private double damage;
    private double runSpeedDecrease;
    private int level;

    public Sword(double damage, double runSpeedDecrease, int level) {
        this.damage = damage;
        this.runSpeedDecrease = runSpeedDecrease;
        this.level = level;
    }

    public double upDamage() {
        return damage * (1 + 0.1 * level);
    }

    public double upRunSpeedDecrease() {
        return runSpeedDecrease * (0.1 + 0.04 * level);
    }
}
