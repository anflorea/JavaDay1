package ro.academyplus;

/**
 * Created by Flo on 23-Feb-16.
 */
public class Villain extends Character {

}

class Devil extends Villain {
    public Devil() {
        this.setLevel(5);
        this.setName("Devil");
    }

    public Devil(int level) {
        this.setLevel(level);
        this.setName("Devil");
    }
}

class Goblin extends Villain {
    public Goblin() {
        this.setLevel(3);
        this.setName("Goblin");
    }

    public Goblin(int level) {
        this.setLevel(level);
        this.setName("Goblin");
    }
}

class Nacromancer extends Villain {
    public Nacromancer() {
        this.setLevel(7);
        this.setName("Nacromancer");
    }

    public Nacromancer(int level) {
        this.setLevel(level);
        this.setName("Nacromancer");
    }
}

class DarkMage extends Villain {
    public DarkMage() {
        this.setLevel(10);
        this.setName("Dark Mage");
    }

    public DarkMage(int level) {
        this.setLevel(level);
        this.setName("Dark Mage");
    }
}
