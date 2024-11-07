public abstract class Hero extends Character {
    protected int experience;

    //Code edited again here

    private Inventory inventory;
    private int gold;

    public Hero(String name, int health, int mana, int strength, int dexterity, int agility, int level, int gold) {
        super(name, health, mana, strength, dexterity, agility, level, gold);
        this.experience = 0;
        this.inventory = new Inventory();
        this.gold = gold;
    }

    public void displayStats() {
        super.displayStats(); // Call the Character's displayStats method for common stats
        System.out.println("Gold: " + getGold()); // Add Hero-specific gold information
    }

    public int getMana() {
        return mana;
    }

    public int getDefense() {
        return equippedArmor != null ? equippedArmor.getDefenseValue() : 0;
    }

    public boolean dodge() {
        return Math.random() < (this.agility * 0.002); // Adjust dodge chance formula as needed
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) health = 0;
    }

    public int getGold() {
        return gold;
    }

    public int getLevel() {
        return level;
    }

    public void spendGold(int amount) {
        if (amount <= gold) {
            gold -= amount;
        } else {
            System.out.println("Not enough gold!");
        }
    }

    public void addGold(int amount) {
        gold += amount;
    }


    public Inventory getInventory() {
        return inventory;
    }

    public void gainExperience(int exp) {
        experience += exp;
        if (experience >= getExperienceToLevelUp()) {
            levelUp();
            experience -= getExperienceToLevelUp();
        }
    }

    protected int getExperienceToLevelUp() {
        return level * 10;
    }

    @Override
    public void levelUp() {
        super.levelUp();
    }

    public void castSpell(Spell spell, Monster target) {
        if (mana >= spell.getManaCost()) {
            mana -= spell.getManaCost();
            int damage = spell.getDamage() + (int)(this.dexterity * 0.1); // Spell damage calculation
            target.takeDamage(damage);
            System.out.println(this.name + " casts " + spell.getName() + " on " + target.getName() + " for " + damage + " damage!");
            applySpellEffect(spell, target);
        } else {
            System.out.println("Not enough mana to cast " + spell.getName() + ".");
        }
    }

    private void applySpellEffect(Spell spell, Monster target) {
        switch (spell.getType()) {
            case ICE:
                target.reduceDamage(0.1); // Reduce target's damage by 10%
                break;
            case FIRE:
                target.reduceDefense(0.1); // Reduce target's defense by 10%
                break;
            case LIGHTNING:
                target.reduceDodgeChance(0.1); // Reduce target's dodge chance by 10%
                break;
        }
    }

    public void usePotion(Potion potion) {
        switch (potion.getType()) {
            case HEALTH:
                health += potion.getEffect();
                System.out.println(name + " healed by " + potion.getEffect() + " points.");
                break;
            case MANA:
                mana += potion.getEffect();
                System.out.println(name + " restored " + potion.getEffect() + " mana.");
                break;
            case STRENGTH:
                strength += potion.getEffect();
                System.out.println(name + " increased strength by " + potion.getEffect() + ".");
                break;
            case DEXTERITY:
                dexterity += potion.getEffect();
                System.out.println(name + " increased dexterity by " + potion.getEffect() + ".");
                break;
            case AGILITY:
                agility += potion.getEffect();
                System.out.println(name + " increased agility by " + potion.getEffect() + ".");
                break;
        }
        inventory.removeItem(potion); // Remove the potion after use
    }

    private Weapon equippedWeapon;
    private Armor equippedArmor;

    public void equipItem(Item item) {
        if (item instanceof Weapon) {
            equippedWeapon = (Weapon) item;
            System.out.println(name + " equipped weapon: " + item.getName());
        } else if (item instanceof Armor) {
            equippedArmor = (Armor) item;
            System.out.println(name + " equipped armor: " + item.getName());
        } else {
            System.out.println("Cannot equip this item.");
        }
    }

    public Weapon getEquippedWeapon() {
        return equippedWeapon;
    }

    public Armor getEquippedArmor() {
        return equippedArmor;
    }

}



