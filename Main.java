//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Legends: Monsters and Heroes!");
        System.out.println("Prepare your heroes and enter the adventure!");

        Game game = new Game();
        game.start();

        System.out.println("Thank you for playing Legends: Monsters and Heroes!");
    }
}
