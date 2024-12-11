public class Rogue extends Character{

    public Rogue(String name, int experience, int level) {
        super(name, experience, level, 3, 8, 10);
        this.setProfession("Rogue");
        this.setFireImmunity(false);
        this.setIceImmunity(false);
        this.setEarthImmunity(true);
    }

    public void receiveDamage(int damage) {
        super.receiveDamage(damage);
    }

    public int getDamage() {
        return super.getDamage();
    }
}


