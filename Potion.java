class Potion extends Item {
    public enum PotionType { HEALTH, MANA, STRENGTH, DEXTERITY, AGILITY }
    private int effect;
    private PotionType type;

    public Potion(String name, int price, int level, int effect, PotionType type) {
        super(name, price, level);
        this.effect = effect;
        this.type = type;
    }

    public int getEffect() { return effect; }
    public PotionType getType() { return type; }
}