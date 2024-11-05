class Paladin extends Hero {
    public Paladin(String name) {
        super(name, 200, 75, 18, 18, 12, 1, 100);
    }

    @Override
    public void useSpecialAbility() {
        System.out.println(name + " uses Divine Shield!");
        // Restore health to max
    }
}
