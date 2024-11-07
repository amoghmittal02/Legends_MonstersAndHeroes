import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
    private World world;
    private List<Hero> heroes;
    private Scanner scanner;

    public Game() {
        scanner = new Scanner(System.in);
        heroes = new ArrayList<>();

        int worldSize;
        do {
            System.out.println("Enter world size (" + World.MIN_SIZE + "-" + World.MAX_SIZE + "): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Please enter a valid number.");
                scanner.next();
            }
            worldSize = scanner.nextInt();
            if (worldSize < World.MIN_SIZE || worldSize > World.MAX_SIZE) {
                System.out.println("World size must be between " + World.MIN_SIZE +
                        " and " + World.MAX_SIZE + ". Please try again.");
            }
        } while (worldSize < World.MIN_SIZE || worldSize > World.MAX_SIZE);

        world = new World(worldSize);

        //world = new World(8);
        setupHeroes();
    }

    private void setupHeroes() {
        //int numHeroes = InputValidator.getIntInRange(1, 3, "Enter number of heroes (1-3): ");

        System.out.println("Enter number of heroes (1-3): ");
        int numHeroes = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numHeroes; i++) {
            System.out.println("Choose hero " + (i + 1) + " type:");
            System.out.println("1. Warrior");
            System.out.println("2. Sorcerer");
            System.out.println("3. Paladin");


            int choice = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter hero name: ");
            String name = scanner.nextLine();

            Hero hero;
            switch (choice) {
                case 1: hero = new Fighter(name); break;
                case 2: hero = new Rogue(name); break;
                case 3: hero = new Paladin(name, 300, 750, 650, 700, 2500, 7); break;
                default: hero = new Fighter(name); break;
            }
            heroes.add(hero);
        }
    }

    public void start() {
        while (true) {
            world.displayMap();
            System.out.println("Move (WASD), Quit (Q), Info (I), Market (M): ");
            char command = scanner.next().charAt(0);
            if (command == 'Q' || command == 'q') break;
            processCommand(command);
        }
    }

    private void processCommand(char command) {
        if (command == 'I' || command == 'i') {
            for (Hero hero : heroes) hero.displayStats();
        } else if (command == 'M' || command == 'm') {
            if (world.isHeroOnMarketTile()) {
                for (Hero hero : heroes) enterMarket(hero);
            } else {
                System.out.println("You must be on a market tile to access the market.");
            }
            //for (Hero hero : heroes) enterMarket(hero);
        } else {
            boolean moved = world.moveHero(command);
            if (moved && world.isBattleTriggered()) startBattle();
        }
    }


    private void enterMarket(Hero hero) {
        Market market = new Market();
        market.displayItemsForSale();
        System.out.println("Buy or Sell? (B/S): ");
        char choice = scanner.next().charAt(0);

//        if (choice == 'B' || choice == 'b') {
//            System.out.println("Choose item to buy:");
//            int itemIndex = scanner.nextInt() - 1;
//            if (market.buyItem(hero, itemIndex)) {
//                System.out.println("Item bought successfully!");
//            } else {
//                System.out.println("Cannot buy item.");
//            }
            if (choice == 'B' || choice == 'b') {
                market.buyItem(hero);
            } else if (choice == 'S' || choice == 's') {
                market.sellItem(hero);
            } else {
                System.out.println("Market action canceled.");
            }
        }

    private void startBattle() {
        Battle battle = new Battle(heroes, world.createMonsters(heroes.size()));
        battle.start();
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
