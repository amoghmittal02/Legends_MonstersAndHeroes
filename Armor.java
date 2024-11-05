class Armor extends Item {
    private int defenseValue;

    public Armor(String name, int price, int level, int defenseValue) {
        super(name, price, level);
        this.defenseValue = defenseValue;
    }

    public int getDefenseValue() { return defenseValue; }
}
