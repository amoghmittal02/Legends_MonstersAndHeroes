import java.util.Scanner;

public class Market {
    public void displayItemsForSale() {  // Changed from displayCategories() to match the Game class
        System.out.println("\nAvailable Categories:");
        System.out.println("1. Weapons");
        System.out.println("2. Armors");
        System.out.println("3. Potions");
        System.out.println("0. Exit");
    }

    private void displayCategories() {    // Keep the original method as private helper
        System.out.println("\nAvailable Categories:");
        System.out.println("1. Weapons");
        System.out.println("2. Armors");
        System.out.println("3. Potions");
        System.out.println("0. Exit");
    }

    public void buyItem(Hero hero) {
        Scanner scanner = new Scanner(System.in);
        boolean shopping = true;

        while (shopping) {
            displayCategories();
            System.out.println("\nChoose a category (0-3):");
            System.out.println("Current Gold: " + hero.getGold());
            System.out.println("Current Level: " + hero.getLevel());

            int categoryChoice = scanner.nextInt();


            switch (categoryChoice) {
                case 0:
                    shopping = false;
                    System.out.println("Thank you for visiting the market!");
                    break;

                case 1: // Weapons
                    Weaponry.displayWeapons();
                    System.out.println("\nChoose a weapon to buy (1-" + Weaponry.getAvailableWeapons().size() + ") or 0 to cancel:");
                    int weaponChoice = scanner.nextInt();

                    if (weaponChoice > 0 && weaponChoice <= Weaponry.getAvailableWeapons().size()) {
                        Weapon weapon = Weaponry.getWeapon(weaponChoice - 1);
                        tryToBuyItem(hero, weapon);
                    }
                    break;

                case 2: // Armors
                    Armory.displayArmors();
                    System.out.println("\nChoose an armor to buy (1-" + Armory.getAvailableArmors().size() + ") or 0 to cancel:");
                    int armorChoice = scanner.nextInt();

                    if (armorChoice > 0 && armorChoice <= Armory.getAvailableArmors().size()) {
                        Armor armor = Armory.getArmor(armorChoice - 1);
                        tryToBuyItem(hero, armor);
                    }
                    break;

                case 3: // Potions
                    PotionStore.displayPotions();
                    System.out.println("\nChoose a potion to buy (1-" + PotionStore.getAvailablePotions().size() + ") or 0 to cancel:");
                    int potionChoice = scanner.nextInt();

                    if (potionChoice > 0 && potionChoice <= PotionStore.getAvailablePotions().size()) {
                        Potion potion = PotionStore.getPotion(potionChoice - 1);
                        tryToBuyItem(hero, potion);
                    }
                    break;

                default:
                    System.out.println("Invalid category choice!");
                    break;
            }
        }
    }

    private void tryToBuyItem(Hero hero, Item item) {
        if (hero.getGold() >= item.getPrice() && hero.getLevel() >= item.getLevel()) {
            hero.spendGold(item.getPrice());
            hero.getInventory().addItem(item);
            System.out.println(hero.getName() + " bought " + item.getName() + "!");

            // Additional information based on item type
            if (item instanceof Weapon) {
                Weapon weapon = (Weapon) item;
                System.out.println("Weapon damage: " + weapon.getDamage() + ", Hands required: " + weapon.getHands());
            } else if (item instanceof Armor) {
                Armor armor = (Armor) item;
                System.out.println("Defense value: " + armor.getDefenseValue());
            } else if (item instanceof Potion) {
                Potion potion = (Potion) item;
                System.out.println("Effect: " + potion.getEffect() + ", Type: " + potion.getType());
            }
        } else {
            System.out.println("\nCannot buy " + item.getName() + ":");
            if (hero.getGold() < item.getPrice()) {
                System.out.println("- Not enough gold (You have: " + hero.getGold() + ", Required: " + item.getPrice() + ")");
            }
            if (hero.getLevel() < item.getLevel()) {
                System.out.println("- Level too low (You are: " + hero.getLevel() + ", Required: " + item.getLevel() + ")");
            }
        }
    }

    public void sellItem(Hero hero) {
        if (hero.getInventory().getItems().isEmpty()) {
            System.out.println("You have no items to sell.");
            return;
        }

        System.out.println("\nItems in your inventory:");
        for (int i = 0; i < hero.getInventory().getItems().size(); i++) {
            Item item = hero.getInventory().getItems().get(i);
            System.out.printf("%d. %s (Sell Price: %d)%n",
                    i + 1, item.getName(), item.getPrice() / 2);

            // Display additional item information
            if (item instanceof Weapon) {
                Weapon weapon = (Weapon) item;
                System.out.printf("   Damage: %d, Hands: %d%n", weapon.getDamage(), weapon.getHands());
            } else if (item instanceof Armor) {
                Armor armor = (Armor) item;
                System.out.printf("   Defense: %d%n", armor.getDefenseValue());
            } else if (item instanceof Potion) {
                Potion potion = (Potion) item;
                System.out.printf("   Effect: %d, Type: %s%n", potion.getEffect(), potion.getType());
            }
        }

        System.out.println("\nEnter the number of the item to sell, or 0 to cancel:");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt() - 1;

        if (choice >= 0 && choice < hero.getInventory().getItems().size()) {
            Item item = hero.getInventory().getItems().get(choice);
            int sellPrice = item.getPrice() / 2;
            hero.addGold(sellPrice);
            hero.getInventory().removeItem(item);
            System.out.println(hero.getName() + " sold " + item.getName() + " for " + sellPrice + " gold!");
        } else {
            System.out.println("Sale canceled.");
        }
    }

    public class InputValidator {
        private static Scanner scanner = new Scanner(System.in);

        public static int getIntInRange(int min, int max, String prompt) {
            while (true) {
                System.out.println(prompt);
                try {
                    String input = scanner.nextLine();
                    int value = Integer.parseInt(input);
                    if (value >= min && value <= max) {
                        return value;
                    }
                    System.out.printf("Please enter a number between %d and %d.%n", min, max);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid number.");
                }
            }
        }

        public static char getCharChoice(String validChars, String prompt) {
            while (true) {
                System.out.println(prompt);
                String input = scanner.nextLine().toUpperCase();
                if (input.length() == 1 && validChars.toUpperCase().contains(input)) {
                    return input.charAt(0);
                }
                System.out.println("Invalid input. Please enter one of: " + validChars);
            }
        }

        public static String getNonEmptyString(String prompt) {
            while (true) {
                System.out.println(prompt);
                String input = scanner.nextLine().trim();
                if (!input.isEmpty()) {
                    return input;
                }
                System.out.println("Input cannot be empty. Please try again.");
            }
        }
    }
}


