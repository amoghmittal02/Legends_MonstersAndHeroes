public class LightningSpell extends Spell {
    public LightningSpell(String name, int price, int level, int damage, int manaCost, SpellType type) {
        super(name, price, level, damage, manaCost, type);
        type = SpellType.LIGHTNING;
    }
}
