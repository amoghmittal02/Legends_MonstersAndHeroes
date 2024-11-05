import java.lang.Character;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class World {
    private static final int INACCESSIBLE = 0;
    private static final int MARKET = 1;
    private static final int COMMON = 2;
    private int[][] grid;
    private int size;
    private int[] heroPosition;

    private static final String RED_TEXT = "\u001B[31m";
    private static final String GREEN_TEXT = "\u001B[32m";
    private static final String RESET_TEXT = "\u001B[0m";
    private static final String YELLOW_TEXT = "\u001B[33m";
    private static final String BLUE_TEXT = "\u001B[34m";

    public World(int size) {
        this.size = size;
        grid = new int[size][size];
        heroPosition = new int[] {0, 0};
        generateWorld();
    }

    public boolean isHeroOnMarketTile() {
        int x = heroPosition[0];
        int y = heroPosition[1];
        return grid[x][y] == MARKET;
    }

    private void generateWorld() {
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int chance = random.nextInt(100);
                grid[i][j] = chance < 20 ? INACCESSIBLE : (chance < 50 ? MARKET : COMMON);
            }
        }
        grid[0][0] = COMMON; // Ensure starting position is accessible
    }

    public List<Monster> createMonsters(int numberOfMonsters) {
        List<Monster> monsters = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < numberOfMonsters; i++) {
            int level = random.nextInt(3) + 1; // Example levels, adjust as needed
            Monster monster;

            // Randomly create different types of monsters
            switch (random.nextInt(3)) {
                case 0:
                    monster = new Dragon("Dragon", level);
                    break;
                case 1:
                    monster = new Exoskeleton("Exoskeleton", level);
                    break;
                case 2:
                default:
                    monster = new Spirit("Spirit", level);
                    break;
            }
            monsters.add(monster);
        }
        return monsters;
    }

    public void displayMap() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == heroPosition[0] && j == heroPosition[1]) {
                    System.out.print(BLUE_TEXT + "H " + RESET_TEXT); // 'H' for Hero's current position
                } else {
                    switch (grid[i][j]) {
                        case INACCESSIBLE:
                            System.out.print(RED_TEXT + "X " + RESET_TEXT); // 'X' for Inaccessible space
                            break;
                        case MARKET:
                            System.out.print(YELLOW_TEXT + "M " + RESET_TEXT); // 'M' for Market space
                            break;
                        case COMMON:
                            System.out.print(GREEN_TEXT + "C " + RESET_TEXT); // 'C' for Common space
                            break;
                    }
                }
            }
            System.out.println();
        }
    }


//    public void moveHero(char direction) {
//        // Move logic with bounds check and tile type handling
//    }
//
//public boolean moveHero(char direction) {
//    int newX = heroPosition[0];
//    int newY = heroPosition[1];
//
//    // Convert the direction to uppercase to handle both uppercase and lowercase inputs
//    switch (Character.direction) {
//        case 'W': newX--; break; // Move up
//        case 'S': newX++; break; // Move down
//        case 'A': newY--; break; // Move left
//        case 'D': newY++; break; // Move right
//        default:
//            System.out.println("Invalid move. Use W, A, S, or D.");
//            return false;
//    }
//
//    // Check if new position is within bounds and accessible
//    if (isWithinBounds(newX, newY) && grid[newX][newY] != INACCESSIBLE) {
//        heroPosition[0] = newX;
//        heroPosition[1] = newY;
//        return true;
//    } else {
//        System.out.println("Cannot move in that direction. It's inaccessible.");
//        return false;
//    }
//}
public boolean moveHero(char direction) {
    int newX = heroPosition[0];
    int newY = heroPosition[1];

    // Print debug information
    System.out.println("Current Position: (" + newX + ", " + newY + ")");
    System.out.println("Received Direction: " + direction);

    // Convert direction to uppercase
    switch (Character.toUpperCase(direction)) {
        case 'W': newX--; break; // Move up
        case 'S': newX++; break; // Move down
        case 'A': newY--; break; // Move left
        case 'D': newY++; break; // Move right
        default:
            System.out.println("Invalid move. Use W, A, S, or D.");
            return false;
    }

    // Check if new position is within bounds and accessible
    if (isWithinBounds(newX, newY) && grid[newX][newY] != INACCESSIBLE) {
        heroPosition[0] = newX;
        heroPosition[1] = newY;
        System.out.println("Moved to Position: (" + newX + ", " + newY + ")");
        return true;
    } else {
        System.out.println("Cannot move in that direction. It's inaccessible.");
        return false;
    }
}


    private boolean isWithinBounds(int x, int y) {
        return x >= 0 && x < size && y >= 0 && y < size;
    }

    public boolean isBattleTriggered() {
        return grid[heroPosition[0]][heroPosition[1]] == COMMON && Math.random() < 0.5;
    }
}


