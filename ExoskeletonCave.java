import java.util.ArrayList;
import java.util.List;

public class ExoskeletonCave {
    private static final List<Exoskeleton> exoskeletons = new ArrayList<>();

    static {
        exoskeletons.add(new Exoskeleton("Cyrrollalee", 7, 700, 800, 75));
        exoskeletons.add(new Exoskeleton("Brandobaris", 3, 350, 450, 30));
        exoskeletons.add(new Exoskeleton("BigBad-Wolf", 1, 150, 250, 15));
        exoskeletons.add(new Exoskeleton("WickedWitch", 2, 250, 350, 25));
        exoskeletons.add(new Exoskeleton("Aasterinian", 4, 400, 500, 45));
        exoskeletons.add(new Exoskeleton("Chronepsish", 6, 650, 750, 60));
        exoskeletons.add(new Exoskeleton("Kiaransalee", 8, 850, 950, 85));
        exoskeletons.add(new Exoskeleton("St-Shargaas", 5, 550, 650, 55));
        exoskeletons.add(new Exoskeleton("Merrshaullk", 10, 1000, 900, 55));
        exoskeletons.add(new Exoskeleton("St-Yeenoghu", 9, 950, 850, 90));
        exoskeletons.add(new Exoskeleton("DocOck", 6, 600, 600, 55));
        exoskeletons.add(new Exoskeleton("Exodia", 10, 1000, 1000, 50));
    }

    public static List<Exoskeleton> getAvailableExoskeletons() {
        return new ArrayList<>(exoskeletons);
    }

    public static void displayExoskeletons() {
        System.out.println("Available Exoskeletons:");
        for (int i = 0; i < exoskeletons.size(); i++) {
            Exoskeleton exoskeleton = exoskeletons.get(i);
            System.out.printf("%d. %s (Level: %d, Damage: %d, Defense: %d, Dodge Chance: %.1f%%)%n",
                    i + 1, exoskeleton.getName(), exoskeleton.getLevel(), exoskeleton.getBaseDamage(),
                    exoskeleton.getDefense(), exoskeleton.getDodgeChance());
        }
    }

    public static Exoskeleton getExoskeleton(int index) {
        if (index < 0 || index >= exoskeletons.size()) {
            throw new IllegalArgumentException("Invalid exoskeleton selection.");
        }
        return exoskeletons.get(index);
    }
}
