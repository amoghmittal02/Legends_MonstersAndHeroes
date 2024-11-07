
import java.util.ArrayList;
import java.util.List;

public class SorcererOptions {
    private static final List<Sorcerer> sorcerers = new ArrayList<>();

    static {
        sorcerers.add(new Sorcerer("Rillifane_Rallathil", 1300, 750, 450, 500, 2500, 9));
        sorcerers.add(new Sorcerer("Segojan_Earthcaller", 900, 800, 500, 650, 2500, 5));
        sorcerers.add(new Sorcerer("Reign_Havoc", 800, 800, 800, 800, 2500, 8));
        sorcerers.add(new Sorcerer("Reverie_Ashels", 900, 800, 700, 400, 2500, 7));
        sorcerers.add(new Sorcerer("Kalabar", 800, 850, 400, 600, 2500, 6));
        sorcerers.add(new Sorcerer("Skye_Soar", 1000, 700, 400, 500, 2500, 5));
    }

    public static List<Sorcerer> getAvailableSorcerers() {
        return new ArrayList<>(sorcerers);
    }

    public static void displaySorcerers() {
        System.out.println("Available Sorcerers:");
        for (int i = 0; i < sorcerers.size(); i++) {
            Sorcerer sorcerer = sorcerers.get(i);
            System.out.printf("%d. %s (Mana: %d, Strength: %d, Agility: %d, Dexterity: %d, Gold: %d, Experience: %d)%n",
                    i + 1, sorcerer.getName(), sorcerer.getMana(), sorcerer.getStrength(),
                    sorcerer.getAgility(), sorcerer.getDexterity(), sorcerer.getGold(), sorcerer.getExperience());
        }
    }

    public static Sorcerer getSorcerer(int index) {
        if (index < 0 || index >= sorcerers.size()) {
            throw new IllegalArgumentException("Invalid sorcerer selection.");
        }
        return sorcerers.get(index);
    }
}

