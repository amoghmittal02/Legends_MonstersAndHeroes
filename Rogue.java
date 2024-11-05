class Rogue extends Hero {
    public Rogue(String name) {
        super(name, 100, 75, 15, 20, 20, 1, 100);
    }

    @Override
    public void useSpecialAbility() {
        System.out.println(name + " uses Sneak Attack!");
        // Increase defense temporarily
    }
}
