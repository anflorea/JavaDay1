package ro.academyplus;

/**
 * Created by Flo on 23-Feb-16.
 */
public class Character {
    private int health = 100;
    private int level;
    private int damage = 1;
    private String name;

    public String toString() {
        return (name.toString() + " has level " + level + ", has " + health + " HP and can deal " + damage * level + " damage.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public int getLevel() {
        return level;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public static int dealDamage(Character attacker, Character defender) {
        int dealtDamage = attacker.getDamage() * attacker.getLevel();
        if (defender.getHealth() < dealtDamage) {
            defender.setHealth(0);
            return (0);
        }
        else {
            defender.setHealth(defender.getHealth() - dealtDamage);
            return (1);
        }
    }
}
