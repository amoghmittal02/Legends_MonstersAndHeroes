public class FireSpell extends Spell {
    public FireSpell(String name, int price, int level, int damage, int manaCost, SpellType type) {
        super(name, price, level, damage, manaCost, type);
        type = SpellType.FIRE;
    }

}
