package ro.academyplus;

/**
 * Created by Flo on 23-Feb-16.
 */
public class Villain extends Character {
    public boolean equals(Object anObject) {
        if (anObject == null)
            return false;
        else if (this == anObject)
            return true;
        else if (this instanceof Villain) {
            Villain aVillain = (Villain) anObject;
            if (aVillain.getName() == this.getName() && aVillain.getLevel() == this.getLevel())
                return true;
        }
        return false;
    }
}

class Devil extends Villain {
    public Devil() {
        this.setLevel(5);
        this.setName("Devil");
        this.setId(++Character.idIterator);
    }

    public Devil(int level) {
        this.setLevel(level);
        this.setName("Devil");
        this.setId(++Character.idIterator);
    }
}

class Goblin extends Villain {
    public Goblin() {
        this.setLevel(3);
        this.setName("Goblin");
        this.setId(++Character.idIterator);
    }

    public Goblin(int level) {
        this.setLevel(level);
        this.setName("Goblin");
        this.setId(++Character.idIterator);
    }
}

class Nacromancer extends Villain {
    public Nacromancer() {
        this.setLevel(7);
        this.setName("Nacromancer");
        this.setId(++Character.idIterator);
    }

    public Nacromancer(int level) {
        this.setLevel(level);
        this.setName("Nacromancer");
        this.setId(++Character.idIterator);
    }
}

class DarkMage extends Villain {
    public DarkMage() {
        this.setLevel(10);
        this.setName("Dark Mage");
        this.setId(++Character.idIterator);
    }

    public DarkMage(int level) {
        this.setLevel(level);
        this.setName("Dark Mage");
        this.setId(++Character.idIterator);
    }
}
