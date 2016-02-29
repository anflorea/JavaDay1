package ro.academyplus;

import java.util.ArrayList;

/**
 * Created by Flo on 23-Feb-16.
 */
public class Hero extends Character {
    private ArrayList<Artifacts> inventory = new ArrayList<Artifacts>();
    private int inventorySize;

    protected void setInventorySize(int inventorySize) {
        this.inventorySize = inventorySize;
    }

    public int getInventorySize() {
        return this.inventorySize;
    }

    public void levelUp() {
        this.setLevel(this.getLevel() + 1);
        this.inventorySize++;
    }

    public void addArmor(Armor armor) throws Exception {
        if (armor.getName().equals("Armor")) {
            if (this.getInventorySize() == this.inventory.size())
                throw (new Exception("Inventory full!"));
            this.setHealth(this.getHealth() + armor.getHealth());
            this.inventory.add((Artifacts) armor);
        }
    }

    public void addHelmet(Helmet helmet) throws Exception {
        if (helmet.getName().equals("Helmet")) {
            if (this.getInventorySize() == this.inventory.size())
                throw (new Exception("Inventory full!"));
            this.setHealth(this.getHealth() + helmet.getHealth());
            this.inventory.add((Artifacts) helmet);
        }
    }

    public void addSword(Sword sword) throws Exception {
        if (sword.getName().equals("Sword")) {
            if (this.getInventorySize() == this.inventory.size())
                throw (new Exception("Inventory full!"));
            this.setDamage(this.getDamage() + sword.getDamage());
            this.inventory.add((Artifacts) sword);
        }
    }

    public void addBow(Bow bow) throws Exception {
        if (bow.getName().equals("Bow")) {
            if (this.getInventorySize() == this.inventory.size())
                throw (new Exception("Inventory full!"));
            this.setDamage(this.getDamage() + bow.getDamage());
            this.inventory.add((Artifacts) bow);
        }
    }

    public void addAxe(Axe axe) throws Exception {
        if (axe.getName().equals("Axe")) {
            if (this.getInventorySize() == this.inventory.size())
                throw (new Exception("Inventory full!"));
            this.setDamage(this.getDamage() + axe.getDamage());
            this.inventory.add((Artifacts) axe);
        }
    }

    public boolean equals(Object anObject) {
        if (anObject == null)
            return false;
        else if (this == anObject)
            return true;
        else if (anObject instanceof Hero) {
            Hero aHero = (Hero) anObject;
            if (aHero.getId() == this.getId())
                return true;
        }
        return false;
    }
}

class Mage extends Hero {
    public Mage(String name) {
        this.setName(name);
        this.setLevel(1);
        this.setId(++Character.idIterator);
        this.setInventorySize(3);
    }

    public Mage(String name, int level) {
        this.setName(name);
        this.setLevel(level);
        this.setId(++Character.idIterator);
        this.setInventorySize(3 + level);
    }

}

class Knight extends Hero {
    public Knight(String name) {
        this.setName(name);
        this.setLevel(1);
        this.setId(++Character.idIterator);
        this.setInventorySize(3);
    }

    public Knight(String name, int level) {
        this.setName(name);
        this.setLevel(level);
        this.setId(++Character.idIterator);
        this.setInventorySize(3 + level);
    }
}

class Elf extends Hero {
    public Elf(String name) {
        this.setName(name);
        this.setLevel(1);
        this.setId(++Character.idIterator);
        this.setInventorySize(3);
    }

    public Elf(String name, int level) {
        this.setName(name);
        this.setLevel(level);
        this.setId(++Character.idIterator);
        this.setInventorySize(3 + level);
    }
}

class Orc extends Hero {
    public Orc(String name) {
        this.setName(name);
        this.setLevel(1);
        this.setId(++Character.idIterator);
        this.setInventorySize(3);
    }

    public Orc(String name, int level) {
        this.setName(name);
        this.setLevel(level);
        this.setId(++Character.idIterator);
        this.setInventorySize(3 + level);
    }
}
