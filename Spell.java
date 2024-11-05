class Spell extends Item {
    public enum SpellType { ICE, FIRE, LIGHTNING }
    private int damage;
    private int manaCost;
    private SpellType type;

    public Spell(String name, int price, int level, int damage, int manaCost, SpellType type) {
        super(name, price, level);
        this.damage = damage;
        this.manaCost = manaCost;
        this.type = type;
    }

    public int getDamage() { return damage; }
    public int getManaCost() { return manaCost; }
    public SpellType getType() { return type; }
}