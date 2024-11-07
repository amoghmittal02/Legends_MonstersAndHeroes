class Rogue extends Hero {
    public Rogue(String name) {
        super(name, 100, 75, 15, 20, 20, 1, 1000);
    }

    @Override
    //Implement properly later
    public void useSpecialAbility() {
        System.out.println(name + " uses Sneak Attack!");
    }
}
