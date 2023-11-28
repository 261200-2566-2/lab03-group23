public class RPGCharacter {
    private int level;
    private double maxHP;
    private double maxMana;
    private double currentHP;
    private double currentMana;
    private int baseRunSpeed;
    private double maxRunSpeed;
    private Sword equippedSword;
    private Shield equippedShield;

    public RPGCharacter(int level, int baseRunSpeed) {
        this.level = level;
        this.baseRunSpeed = baseRunSpeed;
        playerStats();
    }

    private void playerStats() {
        maxHP = 100 + 10 * level;
        maxMana = 50 + 2 * level;
        currentHP = maxHP;
        currentMana = maxMana;
        maxRunSpeed = calculateMaxRunSpeed();
    }

    private double calculateMaxRunSpeed() {
        return baseRunSpeed * (0.1 + 0.03 * level);
    }

    public void equipSword(Sword sword) {
        equippedSword = sword;
        maxRunSpeed -= equippedSword.upRunSpeedDecrease();
    }

    public void unequipSword() {
        if (equippedSword != null) {
            maxRunSpeed += equippedSword.upRunSpeedDecrease();
            equippedSword = null;
        }
    }

    public void equipShield(Shield shield) {
        equippedShield = shield;
        maxRunSpeed -= equippedShield.upRunSpeedDecrease();
    }

    public void unequipShield() {
        if (equippedShield != null) {
            maxRunSpeed += equippedShield.upRunSpeedDecrease();
            equippedShield = null;
        }
    }

    public void attack(RPGCharacter target) {
        double damage = (equippedSword != null) ? equippedSword.upDamage() : 0;
        target.receiveDamage(damage);
    }

    private void receiveDamage(double damage) {
        currentHP = (equippedShield != null) ? currentHP - damage + equippedShield.upDefense() : currentHP-damage;
    }

    public double getCurrentHP() {
        return currentHP;
    }
    public double getRunSpeed() {
        return maxRunSpeed;
    }
}
