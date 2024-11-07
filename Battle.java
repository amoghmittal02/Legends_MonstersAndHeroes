import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Battle {
    private List<Hero> heroes;
    private List<Monster> monsters;
    private Scanner scanner = new Scanner(System.in);
    private Random random = new Random();

    private static final String RED_TEXT = "\u001B[31m";
    private static final String GREEN_TEXT = "\u001B[32m";
    private static final String RESET_TEXT = "\u001B[0m";

    public Battle(List<Hero> heroes, List<Monster> monsters) {
        this.heroes = heroes;
        this.monsters = monsters;
    }

    public void start() {
        System.out.println("Battle begins!");
        while (heroesAlive() && monstersAlive()) {
            heroesTurn();
            if (monstersAlive()) monstersTurn();
        }
        if (heroesAlive()) {
            System.out.println(GREEN_TEXT + "Heroes win the battle!" + RESET_TEXT);
        } else {
            System.out.println(RED_TEXT + "Monsters have defeated the heroes! Game Over!" + RESET_TEXT);
            System.exit(0);
        }
    }

    private boolean heroesAlive() {
        return heroes.stream().anyMatch(Hero::isAlive);
    }

    private boolean monstersAlive() {
        return monsters.stream().anyMatch(Monster::isAlive);
    }

    private void heroesTurn() {
        for (Hero hero : heroes) {
            if (hero.isAlive()) {
                System.out.println(hero.getName() + "'s turn.");
                System.out.println("Choose an action:");
                System.out.println("1. Attack");
                System.out.println("2. Cast Spell");
                System.out.println("3. Use Potion");
                System.out.println("4. Equip Item");

                int action = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (action) {
                    case 1:
                        attackEnemy(hero);
                        break;
                    case 2:
                        castSpell(hero);
                        break;
                    case 3:
                        usePotion(hero);
                        break;
                    case 4:
                        equipItem(hero);
                        break;
                    default:
                        System.out.println("Invalid choice. Skipping turn.");
                }
            }
        }
    }

    private void attackEnemy(Hero hero) {
        System.out.println("Choose an enemy to attack:");
        for (int i = 0; i < monsters.size(); i++) {
            Monster monster = monsters.get(i);
            if (monster.isAlive()) {
                System.out.println((i + 1) + ". " + monster.getName() + " (HP: " + monster.getHealth() + ")");
            }
        }
        int choice = scanner.nextInt() - 1;
        if (choice >= 0 && choice < monsters.size() && monsters.get(choice).isAlive()) {
            Monster target = monsters.get(choice);
            hero.attack(target);
            if (!target.isAlive()) {
                System.out.println(GREEN_TEXT + target.getName() + " has been defeated!" + RESET_TEXT);
            }
        } else {
            System.out.println("Invalid choice. Attack skipped.");
        }
    }
    private void castSpell(Hero hero) {
        List<Spell> spells = hero.getInventory().getSpells();
        if (spells.isEmpty()) {
            System.out.println("No spells available.");
            return;
        }

        System.out.println("Choose a spell to cast:");
        for (int i = 0; i < spells.size(); i++) {
            Spell spell = spells.get(i);
            System.out.println((i + 1) + ". " + spell.getName() + " (Damage: " + spell.getDamage() + ", Mana Cost: " + spell.getManaCost() + ")");
        }

        int choice = scanner.nextInt() - 1;
        if (choice >= 0 && choice < spells.size()) {
            Spell selectedSpell = spells.get(choice);
            if (hero.getMana() >= selectedSpell.getManaCost()) {
                System.out.println("Choose a monster to target:");
                for (int i = 0; i < monsters.size(); i++) {
                    Monster monster = monsters.get(i);
                    if (monster.isAlive()) {
                        System.out.println((i + 1) + ". " + monster.getName() + " (HP: " + monster.getHealth() + ")");
                    }
                }

                int targetChoice = scanner.nextInt() - 1;
                if (targetChoice >= 0 && targetChoice < monsters.size() && monsters.get(targetChoice).isAlive()) {
                    Monster target = monsters.get(targetChoice);
                    hero.castSpell(selectedSpell, target);
                    System.out.println(GREEN_TEXT + hero.getName() + " cast " + selectedSpell.getName() + " on " + target.getName() + "!" + RESET_TEXT);
                    if (!target.isAlive()) {
                        System.out.println(GREEN_TEXT + target.getName() + " has been defeated!" + RESET_TEXT);
                    }
                } else {
                    System.out.println("Invalid target. Spell cast skipped.");
                }
            } else {
                System.out.println("Not enough mana to cast this spell.");
            }
        } else {
            System.out.println("Invalid spell choice. Spell cast skipped.");
        }
    }

    private void usePotion(Hero hero) {
        List<Potion> potions = hero.getInventory().getPotions();
        if (potions.isEmpty()) {
            System.out.println("No potions available.");
            return;
        }

        System.out.println("Choose a potion to use:");
        for (int i = 0; i < potions.size(); i++) {
            Potion potion = potions.get(i);
            System.out.println((i + 1) + ". " + potion.getName() + " (Effect: " + potion.getEffect() + ")");
        }

        int choice = scanner.nextInt() - 1;
        if (choice >= 0 && choice < potions.size()) {
            Potion selectedPotion = potions.get(choice);
            hero.usePotion(selectedPotion);
            System.out.println(GREEN_TEXT + hero.getName() + " used " + selectedPotion.getName() + "." + RESET_TEXT );
        } else {
            System.out.println("Invalid potion choice. Potion use skipped.");
        }
    }

    private void equipItem(Hero hero) {
        List<Item> items = hero.getInventory().getItems();
        if (items.isEmpty()) {
            System.out.println("No items available to equip.");
            return;
        }

        System.out.println("Choose an item to equip:");
        for (int i = 0; i < items.size(); i++) {
            Item item = items.get(i);
            System.out.println((i + 1) + ". " + item.getName());
        }

        int choice = scanner.nextInt() - 1;
        if (choice >= 0 && choice < items.size()) {
            Item selectedItem = items.get(choice);
            hero.equipItem(selectedItem);
            System.out.println(GREEN_TEXT + hero.getName() + " equipped " + selectedItem.getName() + "." + RESET_TEXT);
        } else {
            System.out.println("Invalid item choice. Equip action skipped.");
        }
    }


    private void monstersTurn() {
        for (Monster monster : monsters) {
            if (monster.isAlive()) {
                //Monster attacks random hero
                Hero target = selectRandomHero();
                if (target != null) {
                    System.out.println(RED_TEXT + monster.getName() + " attacks " + target.getName() + "!" + RESET_TEXT);

                    // Check if the hero dodges the attack
                    if (target.dodge()) {
                        System.out.println(GREEN_TEXT + target.getName() + " dodged the attack!" + RESET_TEXT);
                        for (int i = 0; i < heroes.size(); i++) {
                            Hero hero = heroes.get(i);
                            if (hero.isAlive()) {
                                System.out.println((i + 1) + ". " + hero.getName() + " (HP: " + hero.getHealth() + ")");
                            }
                        }
                    } else {
                        // Calculate damage and apply it to the hero
                        int damage = monster.getBaseDamage() - target.getDefense();
                        damage = Math.max(damage, 0); // Ensure damage is not negative
                        target.takeDamage(damage);

                        System.out.println(RED_TEXT + target.getName() + " takes " + damage + " damage from " + monster.getName() + "!" + RESET_TEXT);
                        for (int i = 0; i < heroes.size(); i++) {
                            Hero hero = heroes.get(i);
                            if (hero.isAlive()) {
                                System.out.println((i + 1) + ". " + hero.getName() + " (HP: " + hero.getHealth() + ")");
                            }
                        }

                        if (!target.isAlive()) {
                            System.out.println(RED_TEXT + target.getName() + " has been defeated!" + RESET_TEXT);
                        }
                    }
                }
            }
        }
    }
    private Hero selectRandomHero() {
        // Get a list of all alive heroes
        List<Hero> aliveHeroes = heroes.stream().filter(Hero::isAlive).collect(Collectors.toList());

        // If no heroes are alive, return null
        if (aliveHeroes.isEmpty()) {
            return null;
        }

        // Select a random hero from the list of alive heroes
        return aliveHeroes.get(random.nextInt(aliveHeroes.size()));
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

