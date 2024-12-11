public class Warrior extends Character{

    public Warrior(String name, int experience, int level) {
        super(name, experience, level, 10, 5, 7);
        this.setProfession("Warrior");
        this.setFireImmunity(true);
        this.setIceImmunity(false);
        this.setEarthImmunity(false);
    }

    public void receiveDamage(int damage) {
        super.receiveDamage(damage);
    }

    public int getDamage() {
        return super.getDamage();
    }
}
