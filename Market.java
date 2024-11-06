//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//class Market {
//    private List<Item> items;
//
//    public Market() {
//        items = new ArrayList<>();
//        items.add(new Weapon("Sword", 50, 1, 15, 1));
//        items.add(new Armor("Shield", 60, 1, 10));
//    }
//
//    public void displayItems() {
//        for (int i = 0; i < items.size(); i++) {
//            System.out.println((i + 1) + ". " + items.get(i).getName() + " - Price: " + items.get(i).getPrice());
//        }
//    }
//
//    public boolean buyItem(Hero hero, int itemIndex) {
//        if (itemIndex < 0 || itemIndex >= items.size()) return false;
//        Item item = items.get(itemIndex);
//        if (hero.getGold() >= item.getPrice() && hero.getLevel() >= item.getLevel()) {
//            hero.spendGold(item.getPrice());
//            hero.getInventory().addItem(item);
//            items.remove(itemIndex);
//
//            return true;
//        }
//        return false;
//    }
//}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Market {
    private List<Item> itemsForSale;

    public Market() {
        itemsForSale = new ArrayList<>();
        // Populate with example items (these should be loaded from files in a real implementation)
        itemsForSale.add(new Weapon("Sword", 50, 1, 15, 1));
        itemsForSale.add(new Armor("Shield", 60, 1, 10));
        itemsForSale.add(new Potion("Health Potion", 30, 1, 20, Potion.PotionType.HEALTH));
    }

    public void displayItemsForSale() {
        System.out.println("Items available for purchase:");
        for (int i = 0; i < itemsForSale.size(); i++) {
            Item item = itemsForSale.get(i);
            System.out.println((i + 1) + ". " + item.getName() + " (Price: " + item.getPrice() + ", Level: " + item.getLevel() + ")");
        }
    }

    public void buyItem(Hero hero) {
        displayItemsForSale();
        System.out.println("Enter the number of the item to buy, or 0 to cancel:");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt() - 1;

        if (choice >= 0 && choice < itemsForSale.size()) {
            Item item = itemsForSale.get(choice);
            if (hero.getGold() >= item.getPrice() && hero.getLevel() >= item.getLevel()) {
                hero.spendGold(item.getPrice());
                hero.getInventory().addItem(item);
                System.out.println(hero.getName() + " bought " + item.getName() + "!");
            } else {
                System.out.println("You don't meet the level requirement or don't have enough gold.");
            }
        } else {
            System.out.println("Purchase canceled.");
        }
    }

    public void sellItem(Hero hero) {
        List<Item> heroItems = hero.getInventory().getItems();
        if (heroItems.isEmpty()) {
            System.out.println("You have no items to sell.");
            return;
        }

        System.out.println("Items in your inventory:");
        for (int i = 0; i < heroItems.size(); i++) {
            Item item = heroItems.get(i);
            System.out.println((i + 1) + ". " + item.getName() + " (Sell Price: " + item.getPrice() / 2 + ")");
        }

        System.out.println("Enter the number of the item to sell, or 0 to cancel:");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt() - 1;

        if (choice >= 0 && choice < heroItems.size()) {
            Item item = heroItems.get(choice);
            int sellPrice = item.getPrice() / 2;
            hero.addGold(sellPrice);
            hero.getInventory().removeItem(item);
            System.out.println(hero.getName() + " sold " + item.getName() + " for " + sellPrice + " gold!");
        } else {
            System.out.println("Sale canceled.");
        }
    }
}



