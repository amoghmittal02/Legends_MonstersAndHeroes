abstract class Character {
    //public static int direction;
    protected String name;
    protected int health;
    protected int maxHealth;
    protected int mana;
    protected int maxMana;
    protected int strength;
    protected int dexterity;
    protected int agility;
    protected int level;
    protected int experience;
    protected int gold;
    protected Inventory inventory;
    private static final String GREEN_TEXT = "\u001B[32m";
    private static final String RESET_TEXT = "\u001B[0m";
    private static final String RED_TEXT = "\u001B[31m";

    public Character(String name, int health, int mana, int strength, int dexterity, int agility, int level, int gold) {
        this.name = name;
        this.health = health;
        this.maxHealth = health;
        this.mana = mana;
        this.maxMana = mana;
        this.strength = strength;
        this.dexterity = dexterity;
        this.agility = agility;
        this.level = level;
        this.gold = gold;
        this.inventory = new Inventory();
    }

    public abstract void useSpecialAbility();

    public void displayStats() {
        System.out.println(name + " - Level: " + level + ", Health: " + health + "/" + maxHealth + ", Mana: " + mana + "/" + maxMana + ", Strength: " + strength + ", Dexterity: " + dexterity + ", Agility: " + agility + ", Gold: " + gold);
    }

    public String getName() {
        return name;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void takeDamage(int damage) {
        int actualDamage = Math.max(damage - getDefense(), 0);
        health -= actualDamage;
        System.out.println(GREEN_TEXT + name + " takes " + actualDamage + " damage!" + RESET_TEXT);
    }

    public void attack(Character target) {
        System.out.println(GREEN_TEXT + name + " attacks " + target.name + "!" + RESET_TEXT);
        int damage = getAttackDamage();
        target.takeDamage(damage);
    }

    protected int getDefense() {
        return getArmorDefense() + agility;
    }

    protected int getArmorDefense() {
        // Implement logic to calculate defense from equipped armor
        return 0;
    }

    protected int getAttackDamage() {
        // Implement logic to calculate attack damage based on strength and equipped weapon
        return strength;
    }

    public void levelUp() {
        level++;
        health = maxHealth;
        mana = maxMana;
        // Increase stats based on character type
    }

    public void gainExperience(int exp) {
        experience += exp;
        if (experience >= getExperienceToLevelUp()) {
            levelUp();
            experience -= getExperienceToLevelUp();
        }
    }

    protected int getExperienceToLevelUp() {
        return level * 100;
    }

    public int getHealth() {
        return health;
    }
}
