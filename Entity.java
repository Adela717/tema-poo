public abstract class Entity {
    private int currentLife;
    private final int maxLife = 1000;

    private int currentMana;
    private final int maxMana = 500;

    private boolean fireImmunity;
    private boolean iceImmunity;
    private boolean earthImmunity;

    public void regenerateLife(int val) {
        if(val + currentLife > maxLife) {
            currentLife = maxLife;
        } else {
            currentLife += val;
        }
    }

    public void regenerateMana(int val) {
        if(val + currentMana > maxMana) {
            currentMana = maxMana;
        } else {
            currentMana += val;
        }
    }

    public Entity(int currentLife, int currentMana, boolean fireImmunity, boolean iceImmunity, boolean earthImmunity) {
        this.currentLife = currentLife;
        this.currentMana = currentMana;
        this.fireImmunity = fireImmunity;
        this.iceImmunity = iceImmunity;
        this.earthImmunity = earthImmunity;
    }

    public Entity() {
        currentLife = 0;
        currentMana = 0;
        fireImmunity = false;
        iceImmunity = false;
        earthImmunity = false;
    }

    public int getCurrentLife() {
        return currentLife;
    }

    public int getCurrentMana() {
        return currentMana;
    }

    public int getMaxLife() {
        return maxLife;
    }

    public int getMaxMana() {
        return maxMana;
    }

    public boolean isFireImmunity() {
        return fireImmunity;
    }

    public boolean isIceImmunity() {
        return iceImmunity;
    }

    public boolean isEarthImmunity() {
        return earthImmunity;
    }

    public void setCurrentLife(int currentLife) {
        this.currentLife = currentLife;
    }

    public void setCurrentMana(int currentMana) {
        this.currentMana = currentMana;
    }

    public void setFireImmunity(boolean fireImmunity) {
        this.fireImmunity = fireImmunity;
    }

    public void setIceImmunity(boolean iceImmunity) {
        this.iceImmunity = iceImmunity;
    }

    public void setEarthImmunity(boolean earthImmunity) {
        this.earthImmunity = earthImmunity;
    }
}


