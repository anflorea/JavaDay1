package ro.academyplus;

/**
 * Created by Flo on 24-Feb-16.
 */
public class Artifacts {
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Armor extends Artifacts {
    private int health;

    public String toString() {
        return ("This " + this.getName() +  " provides " + health + " additional HP.");
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public Armor(String name, int health) {
        this.health = health;
        this.setName(name);
    }
}

class Helmet extends Artifacts {
    private int health;

    public String toString() {
        return ("This " + this.getName() +  " provides " + health + " additional HP.");
    }

    public Helmet(String name, int health) {
        this.health = health;
        this.setName(name);
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}

class Sword extends Artifacts {
    private int damage;

    public String toString() {
        return ("This " + this.getName() +  " provides " + damage + " additional damage.");
    }

    public Sword(String name, int damage) {
        this.damage = damage;
        this.setName(name);
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}

class Bow extends Artifacts {
    private int damage;

    public String toString() {
        return ("This " + this.getName() +  " provides " + damage + " additional damage.");
    }

    public Bow(String name, int damage) {
        this.damage = damage;
        this.setName(name);
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}

class Axe extends Artifacts {
    private int damage;

    public String toString() {
        return ("This " + this.getName() +  " provides " + damage + " additional damage.");
    }

    public Axe(String name, int damage) {
        this.damage = damage;
        this.setName(name);
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}