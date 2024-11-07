import java.util.ArrayList;
import java.util.List;

public class IceSpellBook {
    private static final List<IceSpell> iceSpells = new ArrayList<>();

    static {
        iceSpells.add(new IceSpell("Snow_Cannon", 500, 2, 650, 250, Spell.SpellType.ICE));
        iceSpells.add(new IceSpell("Ice_Blade", 250, 1, 450, 100, Spell.SpellType.ICE));
        iceSpells.add(new IceSpell("Frost_Blizzard", 750, 5, 850, 350, Spell.SpellType.ICE));
        iceSpells.add(new IceSpell("Arctic_Storm", 700, 6, 800, 300, Spell.SpellType.ICE));
    }

    public static List<IceSpell> getAvailableIceSpells() {
        return new ArrayList<>(iceSpells);
    }

    public static void displayIceSpells() {
        System.out.println("Available Ice Spells:");
        for (int i = 0; i < iceSpells.size(); i++) {
            IceSpell spell = iceSpells.get(i);
            System.out.printf("%d. %s (Price: %d, Level: %d, Damage: %d, Mana Cost: %d)%n",
                    i + 1, spell.getName(), spell.getPrice(), spell.getLevel(),
                    spell.getDamage(), spell.getManaCost());
        }
    }

    public static IceSpell getIceSpell(int index) {
        if (index < 0 || index >= iceSpells.size()) {
            throw new IllegalArgumentException("Invalid spell selection.");
        }
        return iceSpells.get(index);
    }
}
