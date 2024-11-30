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
}
