public class Main {
    public static void main(String[] args) {
        RPGCharacter player = new RPGCharacter(5, 100);
        Sword playerSword = new Sword(10, 5, 2);
        System.out.println("Player Speed : " + player.getRunSpeed());
        player.equipSword(playerSword);
        System.out.println("Player equip sword");
        System.out.println("Player Speed : " + player.getRunSpeed());
        System.out.println("-----------------------------------");
        RPGCharacter enemy = new RPGCharacter(5, 100);
        Shield enemyShield = new Shield(10, 3, 1);
        Sword enemySword = new Sword(10, 5, 2);
        enemy.equipShield(enemyShield);
        //enemy.unequipShield();
        enemy.equipSword(enemySword);

        System.out.println("Enemy HP : " + enemy.getCurrentHP());
        player.attack(enemy);
        System.out.println("Enemy got attacked");
        System.out.println("Enemy HP : " + enemy.getCurrentHP());

        System.out.println("-----------------------------------");

        System.out.println("Player HP : " + player.getCurrentHP());
        enemy.attack(player);
        System.out.println("Player got attacked");
        System.out.println("Player HP : " + player.getCurrentHP());
    }
}
