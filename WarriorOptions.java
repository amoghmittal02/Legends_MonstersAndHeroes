
import java.util.ArrayList;
import java.util.List;

public class WarriorOptions {
    private static final List<Warrior> warriors = new ArrayList<>();

    static {
        warriors.add(new Warrior("Gaerdal_Ironhand", 100, 700, 500, 600, 1354, 7));
        warriors.add(new Warrior("Sehanine_Monnbow", 600, 700, 800, 500, 2500, 8));
        warriors.add(new Warrior("Muamman_Duathall", 300, 900, 500, 750, 2546, 6));
        warriors.add(new Warrior("Flandal_Steelskin", 200, 750, 650, 700, 2500, 7));
        warriors.add(new Warrior("Undefeated_Yoj", 400, 800, 400, 700, 2500, 7));
        warriors.add(new Warrior("Eunoia_Cyn", 400, 700, 800, 600, 2500, 6));
    }

    public static List<Warrior> getAvailableWarriors() {
        return new ArrayList<>(warriors);
    }

    public static void displayWarriors() {
        System.out.println("Available Warriors:");
        for (int i = 0; i < warriors.size(); i++) {
            Warrior warrior = warriors.get(i);
            System.out.printf("%d. %s (Mana: %d, Strength: %d, Agility: %d, Dexterity: %d, Gold: %d, Experience: %d)%n",
                    i + 1, warrior.getName(), warrior.getMana(), warrior.getStrength(),
                    warrior.getAgility(), warrior.getDexterity(), warrior.getGold(), warrior.getExperience());
        }
    }

    public static Warrior getWarrior(int index) {
        if (index < 0 || index >= warriors.size()) {
            throw new IllegalArgumentException("Invalid warrior selection.");
        }
        return warriors.get(index);
    }
}

