package ro.academyplus;

/**
 * Created by Flo on 24-Feb-16.
 */
public class Main {
    public static void main(String[] args) {
        Mage alissa = new Mage("Alissa", 3);
        Goblin goblin = new Goblin();
        System.out.println(alissa);
        System.out.println("");
        Armor armor150 = new Armor("Armor", 150);
        Sword sword20 = new Sword("Sword", 20);
        alissa.addArmor(armor150);
        alissa.addSword(sword20);

        System.out.println(alissa);
        System.out.println(goblin);

        int result = Character.dealDamage(alissa, goblin);
        if (result == 0)
            System.out.println(goblin.getName() + " has died :(");
        else
            System.out.println(goblin.getName() + " has survived the attack");

        System.out.println("");
        System.out.println(alissa);
        System.out.println(goblin);
        System.out.println("");

        result = Character.dealDamage(alissa, goblin);
        if (result == 0)
            System.out.println(goblin.getName() + " has died :(");
        else
            System.out.println(goblin.getName() + " has survived the attack");

        System.out.println(alissa);
        System.out.println(goblin);
    }
}
