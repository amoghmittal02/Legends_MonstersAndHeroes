import java.util.ArrayList;
import java.util.List;

public class LightningSpellBook {
    private static final List<LightningSpell> lightningSpells = new ArrayList<>();

    static {
        lightningSpells.add(new LightningSpell("Lightning_Dagger", 400, 1, 500, 150, Spell.SpellType.LIGHTNING));
        lightningSpells.add(new LightningSpell("Thunder_Blast", 750, 4, 950, 400, Spell.SpellType.LIGHTNING));
        lightningSpells.add(new LightningSpell("Electric_Arrows", 550, 5, 650, 200, Spell.SpellType.LIGHTNING));
        lightningSpells.add(new LightningSpell("Spark_Needles", 500, 2, 600, 200, Spell.SpellType.LIGHTNING));
    }

    public static List<LightningSpell> getAvailableLightningSpells() {
        return new ArrayList<>(lightningSpells);
    }

    public static void displayLightningSpells() {
        System.out.println("Available Lightning Spells:");
        for (int i = 0; i < lightningSpells.size(); i++) {
            LightningSpell spell = lightningSpells.get(i);
            System.out.printf("%d. %s (Price: %d, Level: %d, Damage: %d, Mana Cost: %d)%n",
                    i + 1, spell.getName(), spell.getPrice(), spell.getLevel(),
                    spell.getDamage(), spell.getManaCost());
        }
    }

    public static LightningSpell getLightningSpell(int index) {
        if (index < 0 || index >= lightningSpells.size()) {
            throw new IllegalArgumentException("Invalid spell selection.");
        }
        return lightningSpells.get(index);
    }
}
