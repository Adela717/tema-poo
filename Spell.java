public abstract class Spell {
    private int damage;
    private int manaCost;
    private boolean used;

    public Spell(int damage, int manaCost) {
        this.damage = damage;
        this.manaCost = manaCost;
        this.used = false;
    }

    public String toString() {
        return this.getClass().getSimpleName() + " ability: " + "life damage " + damage + ", mana cost " + manaCost;
    }

    public int getDamage() {
        return this.damage;
    }

    public int getManaCost() {
        return this.manaCost;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setManaCost(int manaCost) {
        this.manaCost = manaCost;
    }

    public boolean isUsed() {
        return this.used;
    }

    public void setUsed() {
        this.used = true;
    }
}
