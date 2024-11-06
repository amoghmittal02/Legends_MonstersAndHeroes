import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Game {
    private World world;
    private List<Hero> heroes;
    private Scanner scanner;

    public Game() {
        scanner = new Scanner(System.in);
        heroes = new ArrayList<>();
        world = new World(8);
        setupHeroes();
    }

    private void setupHeroes() {
        System.out.println("Enter number of heroes (1-3): ");
        int numHeroes = scanner.nextInt();
        scanner.nextLine(); // consume newline

        for (int i = 0; i < numHeroes; i++) {
            System.out.println("Choose hero " + (i + 1) + " type:");
            System.out.println("1. Fighter");
            System.out.println("2. Rogue");
            System.out.println("3. Paladin");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            System.out.print("Enter hero name: ");
            String name = scanner.nextLine();

            Hero hero;
            switch (choice) {
                case 1: hero = new Fighter(name); break;
                case 2: hero = new Rogue(name); break;
                case 3: hero = new Paladin(name); break;
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
}
