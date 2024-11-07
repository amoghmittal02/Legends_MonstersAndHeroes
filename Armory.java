import java.util.ArrayList;
import java.util.List;

public class Armory {
    private static final List<Armor> armors = new ArrayList<>();

    static {
        armors.add(new Armor("Platinum_Shield", 150, 1, 200));
        armors.add(new Armor("Breastplate", 350, 3, 600));
        armors.add(new Armor("Full_Body_Armor", 1000, 8, 1100));
        armors.add(new Armor("Wizard_Shield", 1200, 10, 1500));
        armors.add(new Armor("Guardian_Angel", 1000, 10, 1000));
    }

    public static List<Armor> getAvailableArmors() {
        return new ArrayList<>(armors);
    }

    public static void displayArmors() {
        System.out.println("Available Armors:");
        for (int i = 0; i < armors.size(); i++) {
            Armor armor = armors.get(i);
            System.out.printf("%d. %s (Price: %d, Level: %d, Defense: %d)%n",
                    i + 1, armor.getName(), armor.getPrice(), armor.getLevel(), armor.getDefenseValue());
        }
    }

    public static Armor getArmor(int index) {
        if (index < 0 || index >= armors.size()) {
            throw new IllegalArgumentException("Invalid armor selection.");
        }
        return armors.get(index);
    }
}
