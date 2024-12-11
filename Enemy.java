import java.util.ArrayList;
import java.util.Random;

public class Enemy extends Entity{
    private int usualDamage;

    public Enemy() {
        ArrayList<Spell> enemySpells = new ArrayList<>();
        Random random = new Random();
        this.usualDamage = 25 + random.nextInt(51);

        int life = 75 + random.nextInt(126);
        this.setCurrentLife(life);

        int mana = 75 + random.nextInt(101);
        this.setCurrentMana(mana);

        this.setFireImmunity(false);
        this.setIceImmunity(false);
        this.setEarthImmunity(false);

        int randomImmunity = 1 + random.nextInt(3);
        if(randomImmunity == 1) {
            this.setFireImmunity(true);
        } else if(randomImmunity == 2) {
            this.setIceImmunity(true);
        } else {
            this.setEarthImmunity(true);
        }

        int damage = 20 + random.nextInt(181);
        int costOfMana = 40 + random.nextInt(31);
        Earth earthSpell1 = new Earth(damage,costOfMana);
        
        damage = 40 + random.nextInt(91);
        costOfMana = 30 + random.nextInt(51);
        Ice iceSpell1 = new Ice(damage, costOfMana);

        damage = 30 + random.nextInt(91);
        costOfMana = 40 + random.nextInt(41);
        Fire fireSpell1 = new Fire(damage, costOfMana);

        enemySpells.add(earthSpell1);
        enemySpells.add(iceSpell1);
        enemySpells.add(fireSpell1);

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

            enemySpells.add(earthSpell2);
            enemySpells.add(iceSpell2);
            enemySpells.add(fireSpell2);
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

                enemySpells.add(iceSpell2);
                enemySpells.add(fireSpell2);
            }

            else if(excludedSpell == 2) {
                damage = 20 + random.nextInt(181);
                costOfMana = 40 + random.nextInt(31);
                Earth earthSpell2 = new Earth(damage,costOfMana);

                damage = 30 + random.nextInt(91);
                costOfMana = 40 + random.nextInt(41);
                Fire fireSpell2 = new Fire(damage, costOfMana);

                enemySpells.add(earthSpell2);
                enemySpells.add(fireSpell2);
            }

            else {
                damage = 20 + random.nextInt(181);
                costOfMana = 40 + random.nextInt(31);
                Earth earthSpell2 = new Earth(damage,costOfMana);
        
                damage = 40 + random.nextInt(91);
                costOfMana = 30 + random.nextInt(51);
                Ice iceSpell2 = new Ice(damage, costOfMana);

                enemySpells.add(earthSpell2);
                enemySpells.add(iceSpell2);
            }
        }

        else if(additionalSpells == 1) {
            int randomAdditionalSpell = 1 + random.nextInt(3);

            if(randomAdditionalSpell == 1) {
                damage = 20 + random.nextInt(181);
                costOfMana = 40 + random.nextInt(31);
                Earth earthSpell2 = new Earth(damage,costOfMana);

                enemySpells.add(earthSpell2);
            }

            else if(randomAdditionalSpell == 2) {
                damage = 40 + random.nextInt(91);
                costOfMana = 30 + random.nextInt(51);
                Ice iceSpell2 = new Ice(damage, costOfMana);

                enemySpells.add(iceSpell2);
            }

            else {
                damage = 30 + random.nextInt(91);
                costOfMana = 40 + random.nextInt(41);
                Fire fireSpell2 = new Fire(damage, costOfMana);

                enemySpells.add(fireSpell2);
            }
        }

        this.setSpells(enemySpells);
    }

    public void receiveDamage(int damage) {
        Random random = new Random();
        int possibility = random.nextInt(2);

        if(possibility == 0) {
            damage = 0;
            System.out.println("The enemy has dodged the attack");
        }

        if(this.getCurrentLife() - damage > 0) {
            this.setCurrentLife(this.getCurrentLife() - damage);
        } else {
            this.setCurrentLife(0);
        }
    }

    public int getDamage() {
        Random random = new Random();
        int possibility = random.nextInt(2);

        if(possibility == 0) {
            System.out.println("The enemy does double the damage");
            return 2 * this.usualDamage;
        } else {
            return this.usualDamage;
        }
    }

    public int getUsualDamage() {
        return this.usualDamage;
    }

}
