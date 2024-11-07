import java.util.ArrayList;
import java.util.List;

public class PotionStore {
    private static final List<Potion> potions = new ArrayList<>();

    static {
        // Hardcoded potion data from the provided file
        potions.add(new Potion("Healing_Potion", 250, 1, 100, Potion.PotionType.HEALTH));
        potions.add(new Potion("Strength_Potion", 200, 1, 75, Potion.PotionType.STRENGTH));
        potions.add(new Potion("Magic_Potion", 350, 2, 100, Potion.PotionType.MANA));
        potions.add(new Potion("Luck_Elixir", 500, 4, 65, Potion.PotionType.AGILITY));
        potions.add(new Potion("Mermaid_Tears", 850, 5, 100, Potion.PotionType.MULTI));
        potions.add(new Potion("Ambrosia", 1000, 8, 150, Potion.PotionType.MULTI));
    }

    public static List<Potion> getAvailablePotions() {
        return new ArrayList<>(potions);
    }

    public static void displayPotions() {
        System.out.println("Available Potions:");
        for (int i = 0; i < potions.size(); i++) {
            Potion potion = potions.get(i);
            System.out.printf("%d. %s (Price: %d, Level: %d, Effect: %d, Type: %s)%n",
                    i + 1, potion.getName(), potion.getPrice(), potion.getLevel(),
                    potion.getEffect(), potion.getType());
        }
    }

    public static Potion getPotion(int index) {
        if (index < 0 || index >= potions.size()) {
            throw new IllegalArgumentException("Invalid potion selection.");
        }
        return potions.get(index);
    }
}
