import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Market {
    private List<Item> items;

    public Market() {
        items = new ArrayList<>();
        items.add(new Weapon("Sword", 50, 1, 15, 1));
        items.add(new Armor("Shield", 60, 1, 10));
    }

    public void displayItems() {
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i + 1) + ". " + items.get(i).getName() + " - Price: " + items.get(i).getPrice());
        }
    }

    public boolean buyItem(Hero hero, int itemIndex) {
        if (itemIndex < 0 || itemIndex >= items.size()) return false;
        Item item = items.get(itemIndex);
        if (hero.getGold() >= item.getPrice() && hero.getLevel() >= item.getLevel()) {
            hero.spendGold(item.getPrice());
            hero.getInventory().addItem(item);
            items.remove(itemIndex);

            return true;
        }
        return false;
    }
}



