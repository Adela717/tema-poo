import java.util.ArrayList;
import java.util.Random;

public abstract class Entity implements Battle{
    private int currentLife;
    private final int maxLife = 600;

    private int currentMana;
    private final int maxMana = 300;

    private boolean fireImmunity;
    private boolean iceImmunity;
    private boolean earthImmunity;

    private ArrayList<Spell> spells;

    public ArrayList<Spell> getSpells() {
        return this.spells;
    }

    public void setSpells(ArrayList<Spell> spells) {
        this.spells = spells;
    }

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

    public boolean useAbility(Spell spell, Entity target) {
        String s = "";
        String op = "";
        if(this instanceof Character) {
            s = " character ";
            op = " enemy ";
        } else if(this instanceof Enemy) {
            s = " enemy ";
            op = " character ";
        }

        if(spell.getManaCost() > this.currentMana) {
            System.out.println("The mana of the" + s + "is not enough");
            return false;
        }

        if((spell instanceof Ice) && target.isIceImmunity()) {
            System.out.println("The" + op + "has ice immunity");
            return false;
        }

        if((spell instanceof Fire) && target.isFireImmunity()) {
            System.out.println("The" + op + "has fire immunity");
            return false;
        }

        if((spell instanceof Earth) && target.isEarthImmunity()) {
            System.out.println("The" + op + "has earth immunity");
            return false;
        }

        return true;
    }

    public void createSpells() {
        ArrayList<Spell> entitySpells = new ArrayList<>();
        Random random = new Random();

        int damage = 20 + random.nextInt(101);
        int costOfMana = 30 + random.nextInt(31);
        Earth earthSpell1 = new Earth(damage,costOfMana);
        
        damage = 40 + random.nextInt(91);
        costOfMana = 50 + random.nextInt(31);
        Ice iceSpell1 = new Ice(damage, costOfMana);

        damage = 30 + random.nextInt(91);
        costOfMana = 40 + random.nextInt(41);
        Fire fireSpell1 = new Fire(damage, costOfMana);

        entitySpells.add(earthSpell1);
        entitySpells.add(iceSpell1);
        entitySpells.add(fireSpell1);

        int additionalSpells =random.nextInt(4);

        if(additionalSpells == 3) {
            damage = 20 + random.nextInt(181);
            costOfMana = 40 + random.nextInt(31);
            Earth earthSpell2 = new Earth(damage,costOfMana);
        
            damage = 40 + random.nextInt(91);
            costOfMana = 30 + random.nextInt(51);
            Ice iceSpell2 = new Ice(damage, costOfMana);

            damage = 30 + random.nextInt(91);
            costOfMana = 40 + random.nextInt(41);
            Fire fireSpell2 = new Fire(damage, costOfMana);

            entitySpells.add(earthSpell2);
            entitySpells.add(iceSpell2);
            entitySpells.add(fireSpell2);
        }

        else if(additionalSpells == 2) {
            int excludedSpell = 1 + random.nextInt(3);

            if(excludedSpell == 1) {
                damage = 40 + random.nextInt(91);
                costOfMana = 30 + random.nextInt(51);
                Ice iceSpell2 = new Ice(damage, costOfMana);

                damage = 30 + random.nextInt(91);
                costOfMana = 40 + random.nextInt(41);
                Fire fireSpell2 = new Fire(damage, costOfMana);

                entitySpells.add(iceSpell2);
                entitySpells.add(fireSpell2);
            }

            else if(excludedSpell == 2) {
                damage = 20 + random.nextInt(181);
                costOfMana = 40 + random.nextInt(31);
                Earth earthSpell2 = new Earth(damage,costOfMana);

                damage = 30 + random.nextInt(91);
                costOfMana = 40 + random.nextInt(41);
                Fire fireSpell2 = new Fire(damage, costOfMana);

                entitySpells.add(earthSpell2);
                entitySpells.add(fireSpell2);
            }

            else {
                damage = 20 + random.nextInt(181);
                costOfMana = 40 + random.nextInt(31);
                Earth earthSpell2 = new Earth(damage,costOfMana);
        
                damage = 40 + random.nextInt(91);
                costOfMana = 30 + random.nextInt(51);
                Ice iceSpell2 = new Ice(damage, costOfMana);

                entitySpells.add(earthSpell2);
                entitySpells.add(iceSpell2);
            }
        }

        else if(additionalSpells == 1) {
            int randomAdditionalSpell = 1 + random.nextInt(3);

            if(randomAdditionalSpell == 1) {
                damage = 20 + random.nextInt(181);
                costOfMana = 40 + random.nextInt(31);
                Earth earthSpell2 = new Earth(damage,costOfMana);

                entitySpells.add(earthSpell2);
            }

            else if(randomAdditionalSpell == 2) {
                damage = 40 + random.nextInt(91);
                costOfMana = 30 + random.nextInt(51);
                Ice iceSpell2 = new Ice(damage, costOfMana);

                entitySpells.add(iceSpell2);
            }

            else {
                damage = 30 + random.nextInt(91);
                costOfMana = 40 + random.nextInt(41);
                Fire fireSpell2 = new Fire(damage, costOfMana);

                entitySpells.add(fireSpell2);
            }
        }

        this.setSpells(entitySpells);
    }

    public void removeSpell(Spell spell) {
        spells.remove(spell);
    }
}
