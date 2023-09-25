import javax.sound.midi.Soundbank;
import java.util.Random;

public class AnimalArena {
    public static Random rand = new Random();
    public static final int MAXHEALTH = 20;
    public static final int MAXSTRENGTH = 10;
    public static final int MILLIDELAY = 500;

    public static void main(String[] args) {
    Animal BiliApe = createAnimalWithDefaultConstructor("BiliApe");
    Animal sloth = createAnimalWithDefaultConstructor("sloth");
        System.out.println(BiliApe);
        System.out.println(sloth);
        System.out.println();
    }

    public static Animal createAnimalWithDefaultConstructor(String type){
        Animal a = new Animal();
        a.setType(type);
        int startingHealth = (rand.nextInt(MAXHEALTH/2) + 10);
        int startingStrength = (rand.nextInt(MAXSTRENGTH) + 1);
        a.setType(type);
        a.setHealth(startingHealth);
        a.setStrength(startingStrength);
        return a;
    }

    public static Animal createAnimalWithParameterizedConstructor(String type){
        int startingHealth = (rand.nextInt(MAXHEALTH/2) + 10);
        int startingStrength = (rand.nextInt(MAXSTRENGTH) + 1);
        return new Animal(type, startingStrength,startingHealth);
    }

    public static void fight(Animal a1, Animal a2){
        while(!a1.isDead() && !a2.isDead()) {
        animalAttack(a1, a2);
        if (a2.isDead());
            System.out.println(a2.getType() + " is dead. " + a1.getType() + " won!");
        }
    }

    public static void animalAttack(Animal attacker, Animal defender){
        int attack = rand.nextInt(attacker.getStrength());
        System.out.println(attacker.getType() + " attacks " + defender.getType() + " delivering " + attack + " damage!");
        pause(MILLIDELAY);
        defender.setHealth(defender.getHealth() - attack);
        System.out.println(defender.getType() + " has " + defender.getHealth() + " remaining");
    }
    public static void pause(int milliseconds){
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}



