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
       // System.out.println(name + " - Level: " + level + ", Health: " + health + "/" + maxHealth + ", Mana: " + mana + "/" + maxMana + ", Strength: " + strength + ", Dexterity: " + dexterity + ", Agility: " + agility + ", Gold: " + gold);
        System.out.println(name + " - Level: " + level + ", Health: " + health + "/" + maxHealth + ", Mana: " + mana + "/" + maxMana + ", Strength: " + strength + ", Dexterity: " + dexterity + ", Agility: " + agility);

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
        return 0;
    }

    protected int getAttackDamage() {
        // Get base damage from strength
        int baseDamage = strength;

        // Add weapon damage if character has one equipped
        if (this instanceof Hero) {
            Hero hero = (Hero) this;
            Weapon equippedWeapon = hero.getEquippedWeapon();
            if (equippedWeapon != null) {
                baseDamage += equippedWeapon.getDamage();
            }
        }

        return baseDamage;
    }

    public void levelUp() {
        level++;
        health = maxHealth;
        mana = maxMana;
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
    public int getStrength() {
        return strength;
    }
    public int getDexterity() {
        return dexterity;
    }
    public int getExperience() {
        return experience;
    }
    public int getAgility() {
        return agility;
    }
}
