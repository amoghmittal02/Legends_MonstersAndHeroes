import java.util.ArrayList;
import java.util.List;

public class SpiritTypes {
    private static final List<Spirit> spirits = new ArrayList<>();

    static {
        spirits.add(new Spirit("Andrealphus", 2, 600, 500, 40));
        spirits.add(new Spirit("Blinky", 1, 450, 350, 35));
        spirits.add(new Spirit("Andromalius", 3, 550, 450, 25));
        spirits.add(new Spirit("Chiang-shih", 4, 700, 600, 40));
        spirits.add(new Spirit("FallenAngel", 5, 800, 700, 50));
        spirits.add(new Spirit("Ereshkigall", 6, 950, 450, 35));
        spirits.add(new Spirit("Melchiresas", 7, 350, 150, 75));
        spirits.add(new Spirit("Jormunngand", 8, 600, 900, 20));
        spirits.add(new Spirit("Rakkshasass", 9, 550, 600, 35));
        spirits.add(new Spirit("Taltecuhtli", 10, 300, 200, 50));
        spirits.add(new Spirit("Casper", 1, 100, 100, 50));
    }

    public static List<Spirit> getAvailableSpirits() {
        return new ArrayList<>(spirits);
    }

    public static void displaySpirits() {
        System.out.println("Available Spirits:");
        for (int i = 0; i < spirits.size(); i++) {
            Spirit spirit = spirits.get(i);
            System.out.printf("%d. %s (Level: %d, Damage: %d, Defense: %d, Dodge Chance: %.1f%%)%n",
                    i + 1, spirit.getName(), spirit.getLevel(), spirit.getBaseDamage(),
                    spirit.getDefense(), spirit.getDodgeChance());
        }
    }

    public static Spirit getSpirit(int index) {
        if (index < 0 || index >= spirits.size()) {
            throw new IllegalArgumentException("Invalid spirit selection.");
        }
        return spirits.get(index);
    }
}

