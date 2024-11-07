
import java.util.ArrayList;
import java.util.List;

public class PaladinOptions {
    private static final List<Paladin> paladins = new ArrayList<>();

    static {
        // Hardcoded paladin data from the provided file
        paladins.add(new Paladin("Parzival", 300, 750, 650, 700, 2500, 7));
        paladins.add(new Paladin("Sehanine_Moonbow", 300, 750, 700, 700, 2500, 7));
        paladins.add(new Paladin("Skoraeus_Stonebones", 250, 650, 600, 350, 2500, 4));
        paladins.add(new Paladin("Garl_Glittergold", 100, 600, 500, 400, 2500, 5));
        paladins.add(new Paladin("Amaryllis_Astra", 500, 500, 500, 500, 2500, 5));
        paladins.add(new Paladin("Caliber_Heist", 400, 400, 400, 400, 2500, 8));
    }

    public static List<Paladin> getAvailablePaladins() {
        return new ArrayList<>(paladins);
    }

    public static void displayPaladins() {
        System.out.println("Available Paladins:");
        for (int i = 0; i < paladins.size(); i++) {
            Paladin paladin = paladins.get(i);
            System.out.printf("%d. %s (Mana: %d, Strength: %d, Agility: %d, Dexterity: %d, Gold: %d, Experience: %d)%n",
                    i + 1, paladin.getName(), paladin.getMana(), paladin.getStrength(),
                    paladin.getAgility(), paladin.getDexterity(), paladin.getGold(), paladin.getExperience());
        }
    }

    public static Paladin getPaladin(int index) {
        if (index < 0 || index >= paladins.size()) {
            throw new IllegalArgumentException("Invalid paladin selection.");
        }
        return paladins.get(index);
    }
}
