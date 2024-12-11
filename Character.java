import java.util.Random;

public class Character extends Entity{
    public String name;
    public int experience;
    public int level;
    private String profession;


    private int strength;
    private int charisma;
    private int dexterity;

    public Character(String name, int experience, int level, int strength, int charisma, int dexterity) {
        this.name = name;
        this.experience = experience;
        this.level = level;
        this.strength = strength;
        this.charisma = charisma;
        this.dexterity = dexterity;
    }

    public Character() {
        this.name = "";
        this.experience = 0;
        this.level = 0;
        this.strength = 0;
        this.charisma = 0;
        this.dexterity = 0;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    public int getLevel() {
        return level;
    }

    public int getStrength() {
        return strength;
    }

    public int getCharisma() {
        return charisma;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getProfession() {
        return profession;
    }

    public void receiveDamage(int damage) {
        if(this.profession.equals("Warrior")) {
            if(this.dexterity + this.charisma >= 10) {
                Random random = new Random();
                int possibility = 1 + random.nextInt(2);
                if(possibility == 1) {
                    damage = damage / 2;
                    System.out.println("The damage you get is halved");
                }
            }
        }

        if(this.profession.equals("Rogue")) {
            if(this.strength + this.charisma >= 10) {
                Random random = new Random();
                int possibility = 1 + random.nextInt(2);
                if(possibility == 1) {
                    damage = damage / 2;
                    System.out.println("The damage you get is halved");
                }
            }
        }

        if(this.profession.equals("Mage")) {
            if(this.dexterity + this.strength >= 10) {
                Random random = new Random();
                int possibility = 1 + random.nextInt(2);
                if(possibility == 1) {
                    damage = damage / 2;
                    System.out.println("The damage you get is halved");
                }
            }
        }

        if(this.getCurrentLife() >= damage) {
            this.setCurrentLife(this.getCurrentLife() - damage);
        } else {
            this.setCurrentLife(0);
        }
    }

    public int getDamage() {
        int damage = 0;
        int possibility;
        Random random = new Random();

        if(this.profession.equals("Warrior")) {
            damage = this.strength * 7 + this.dexterity + this.charisma;
            possibility = 1 + random.nextInt(2);
            if(this.strength <= 15) {
                if(possibility == 1) {
                    damage = damage * 2;
                    System.out.println("The character does double the damage");
                }
            }
        }

        if(this.profession.equals("Rogue")) {
            damage = this.strength + this.dexterity * 6 + this.charisma;
            possibility = 1 + random.nextInt(2);

            if(this.dexterity <= 13) {
                if(possibility == 1) {
                    damage = damage * 2;
                    System.out.println("The character does double the damage");
                }
            }
        }

        if(this.profession.equals("Mage")) {
            damage = this.strength + this.dexterity + this.charisma * 8;
            possibility = 1 + random.nextInt(2);

            if(this.charisma <= 17) {
                if(possibility == 1) {
                    damage = damage * 2;
                    System.out.println("The character does double the damage");
                }
            }
        }

        return damage;
    }
}
