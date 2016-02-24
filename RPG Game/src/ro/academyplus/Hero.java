package ro.academyplus;

/**
 * Created by Flo on 23-Feb-16.
 */
public class Hero extends Character {
    public void addArmor(Armor armor) {
        if (armor.getName().equals("Armor")) {
            this.setHealth(this.getHealth() + armor.getHealth());
        }
    }

    public void addHelmet(Helmet helmet) {
        if (helmet.getName().equals("Helmet")) {
            this.setHealth(this.getHealth() + helmet.getHealth());
        }
    }

    public void addSword(Sword sword) {
        if (sword.getName().equals("Sword")) {
            this.setDamage(this.getDamage() + sword.getDamage());
        }
    }

    public void addBow(Bow bow) {
        if (bow.getName().equals("Bow")) {
            this.setDamage(this.getDamage() + bow.getDamage());
        }
    }

    public void addAxe(Axe axe) {
        if (axe.getName().equals("Axe")) {
            this.setDamage(this.getDamage() + axe.getDamage());
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
    }

    public Mage(String name, int level) {
        this.setName(name);
        this.setLevel(level);
        this.setId(++Character.idIterator);
    }

}

class Knight extends Hero {
    public Knight(String name) {
        this.setName(name);
        this.setLevel(1);
        this.setId(++Character.idIterator);
    }

    public Knight(String name, int level) {
        this.setName(name);
        this.setLevel(level);
        this.setId(++Character.idIterator);
    }
}

class Elf extends Hero {
    public Elf(String name) {
        this.setName(name);
        this.setLevel(1);
        this.setId(++Character.idIterator);
    }

    public Elf(String name, int level) {
        this.setName(name);
        this.setLevel(level);
        this.setId(++Character.idIterator);
    }
}

class Orc extends Hero {
    public Orc(String name) {
        this.setName(name);
        this.setLevel(1);
        this.setId(++Character.idIterator);
    }

    public Orc(String name, int level) {
        this.setName(name);
        this.setLevel(level);
        this.setId(++Character.idIterator);
    }
}
