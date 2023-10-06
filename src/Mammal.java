import java.util.Random;

public class Mammal extends Animal {
    public static Random rand = new Random();
    private animalAttack[] attacks = new animalAttack[3];
    public Mammal(String type, int strength, int health){
        super(type,strength,health);
        attacks[0] = new animalAttack("Claws",rand.nextInt(getStrength()+1));
        attacks[1] = new animalAttack("Jaws",rand.nextInt(getStrength()+1));
        attacks[2] = new animalAttack("kicks",rand.nextInt(getStrength()+1));
    }

    public int attack(){
        return detailedAttack().getDamage();
    }

    public animalAttack detailedAttack(){
        int indx = rand.nextInt(attacks.length);
        return attacks[indx];

    }
}
