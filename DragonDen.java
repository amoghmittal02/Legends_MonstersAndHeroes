import java.util.ArrayList;
import java.util.List;

public class DragonDen {
    private static final List<Dragon> dragons = new ArrayList<>();

    static {
        dragons.add(new Dragon("Desghidorrah", 3, 300, 400, 35));
        dragons.add(new Dragon("Chrysophylax", 2, 200, 500, 20));
        dragons.add(new Dragon("BunsenBurner", 4, 400, 500, 45));
        dragons.add(new Dragon("Natsunomeryu", 1, 100, 200, 10));
        dragons.add(new Dragon("TheScaleless", 7, 700, 600, 75));
        dragons.add(new Dragon("Kas-Ethelinh", 5, 600, 500, 60));
        dragons.add(new Dragon("Alexstraszan", 10, 1000, 9000, 55));
        dragons.add(new Dragon("Phaarthurnax", 6, 600, 700, 60));
        dragons.add(new Dragon("D-Maleficent", 9, 900, 950, 85));
        dragons.add(new Dragon("TheWeatherbe", 8, 800, 900, 80));
        dragons.add(new Dragon("Igneel", 6, 600, 400, 60));
        dragons.add(new Dragon("BlueEyesWhite", 9, 900, 600, 75));
    }

    public static List<Dragon> getAvailableDragons() {
        return new ArrayList<>(dragons);
    }

    public static void displayDragons() {
        System.out.println("Available Dragons:");
        for (int i = 0; i < dragons.size(); i++) {
            Dragon dragon = dragons.get(i);
            System.out.printf("%d. %s (Level: %d, Damage: %d, Defense: %d, Dodge Chance: %.1f%%)%n",
                    i + 1, dragon.getName(), dragon.getLevel(), dragon.getBaseDamage(),
                    dragon.getDefense(), dragon.getDodgeChance());
        }
    }

    public static Dragon getDragon(int index) {
        if (index < 0 || index >= dragons.size()) {
            throw new IllegalArgumentException("Invalid dragon selection.");
        }
        return dragons.get(index);
    }
}
