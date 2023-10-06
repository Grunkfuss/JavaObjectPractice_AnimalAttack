public class animalAttack {
    private String attackType;
    private int damage;

    public animalAttack(String attackType, int damage) {
        this.attackType = attackType;
        this.damage = Math.max(1,damage);
    }

    public String getAttackType() {
        return attackType;
    }

    public int getDamage() {
        return damage;
    }
}
