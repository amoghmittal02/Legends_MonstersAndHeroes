import java.util.ArrayList;
import java.util.List;

public class Weaponry {
    private static final List<Weapon> weapons = new ArrayList<>();

    static {
        weapons.add(new Weapon("Sword", 500, 1, 75, 1));
        weapons.add(new Weapon("Bow", 300, 2, 500, 2));
        weapons.add(new Weapon("Scythe", 1000, 6, 1100, 2));
        weapons.add(new Weapon("Axe", 550, 5, 850, 1));
        weapons.add(new Weapon("TSwords", 1400, 8, 1600, 2));
        weapons.add(new Weapon("Dagger", 200, 1, 25, 1));
    }

    public static List<Weapon> getAvailableWeapons() {
        return new ArrayList<>(weapons);
    }

    public static void displayWeapons() {
        System.out.println("Available Weapons:");
        for (int i = 0; i < weapons.size(); i++) {
            Weapon weapon = weapons.get(i);
            System.out.printf("%d. %s (Price: %d, Level: %d, Damage: %d, Hands Required: %d)%n",
                    i + 1, weapon.getName(), weapon.getPrice(), weapon.getLevel(), weapon.getDamage(), weapon.getHands());
        }
    }

    public static Weapon getWeapon(int index) {
        if (index < 0 || index >= weapons.size()) {
            throw new IllegalArgumentException("Invalid weapon selection.");
        }
        return weapons.get(index);
    }
}

