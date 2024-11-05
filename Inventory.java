import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Item> items;

    public Inventory() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public List<Item> getItems() {
        return items;
    }

    public List<Spell> getSpells() {
        List<Spell> spells = new ArrayList<>();
        for (Item item : items) {
            if (item instanceof Spell) {
                spells.add((Spell) item);
            }
        }
        return spells;
    }

    public List<Potion> getPotions() {
        List<Potion> potions = new ArrayList<>();
        for (Item item : items) {
            if (item instanceof Potion) {
                potions.add((Potion) item);
            }
        }
        return potions;
    }
}

