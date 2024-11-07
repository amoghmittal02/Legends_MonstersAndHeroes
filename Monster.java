public abstract class Monster extends Character {
    protected int baseDamage;
    protected int defense;
    protected double dodgeChance;

    public Monster(String name, int health, int baseDamage, int defense, double dodgeChance, int level) {
        super(name, health, 0, baseDamage, defense, 0, level, 0);
        this.baseDamage = baseDamage;
        this.defense = defense;
        this.dodgeChance = dodgeChance;
    }

    public boolean dodge() {
        return Math.random() < dodgeChance;
    }

    @Override
    public void useSpecialAbility() {
        // Monsters do not have special abilities
    }

    public void reduceDamage(double percentage) {
        baseDamage -= baseDamage * percentage;
        System.out.println(name + "'s damage reduced by " + (int)(percentage * 100) + "%.");
    }

    public void reduceDefense(double percentage) {
        defense -= defense * percentage;
        System.out.println(name + "'s defense reduced by " + (int)(percentage * 100) + "%.");
    }

    public void reduceDodgeChance(double percentage) {
        dodgeChance -= dodgeChance * percentage;
        System.out.println(name + "'s dodge chance reduced by " + (int)(percentage * 100) + "%.");
    }

    public int getBaseDamage() {
        return baseDamage;
    }

    public int getDefense() {
        return defense;
    }

    public double getDodgeChance() {
        return dodgeChance;
    }

    public int getLevel() {return level;}
}

