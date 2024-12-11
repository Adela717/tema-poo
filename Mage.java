public class Mage extends Character{

    public Mage(String name, int experience, int level) {
        super(name, experience, level, 3, 8, 10);
        this.setProfession("Mage");
        this.setFireImmunity(false);
        this.setIceImmunity(true);
        this.setEarthImmunity(false);
    }

    public void receiveDamage(int damage) {
        super.receiveDamage(damage);
    }

    public int getDamage() {
        return super.getDamage();
    }
}