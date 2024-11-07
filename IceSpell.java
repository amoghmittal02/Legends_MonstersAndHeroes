public class IceSpell extends Spell {
    public IceSpell(String name, int price, int level, int damage, int manaCost, SpellType type) {
        super(name, price, level, damage, manaCost, type);
        type = SpellType.ICE;
    }
}
