import java.util.ArrayList;
import java.util.List;

public class FireSpellBook {
    private static final List<FireSpell> fireSpells = new ArrayList<>();

    static {
        fireSpells.add(new FireSpell("Flame_Tornado", 700, 4, 850, 300, Spell.SpellType.FIRE));
        fireSpells.add(new FireSpell("Breath_of_Fire", 350, 1, 450, 100, Spell.SpellType.FIRE));
        fireSpells.add(new FireSpell("Heat_Wave", 450, 2, 600, 150, Spell.SpellType.FIRE));
        fireSpells.add(new FireSpell("Lava_Comet", 800, 7, 1000, 550, Spell.SpellType.FIRE));
        fireSpells.add(new FireSpell("Hell_Storm", 600, 3, 950, 600, Spell.SpellType.FIRE));
    }

    public static List<FireSpell> getAvailableFireSpells() {
        return new ArrayList<>(fireSpells);
    }

    public static void displayFireSpells() {
        System.out.println("Available Fire Spells:");
        for (int i = 0; i < fireSpells.size(); i++) {
            FireSpell spell = fireSpells.get(i);
            System.out.printf("%d. %s (Price: %d, Level: %d, Damage: %d, Mana Cost: %d)%n",
                    i + 1, spell.getName(), spell.getPrice(), spell.getLevel(),
                    spell.getDamage(), spell.getManaCost());
        }
    }

    public static FireSpell getFireSpell(int index) {
        if (index < 0 || index >= fireSpells.size()) {
            throw new IllegalArgumentException("Invalid spell selection.");
        }
        return fireSpells.get(index);
    }
}

