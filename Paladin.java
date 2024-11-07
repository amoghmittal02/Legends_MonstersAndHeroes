class Paladin extends Hero {
    public Paladin(String name, int i, int i1, int i2, int i3, int i4, int i5) {
        super(name, 200, 75, 18, 18, 12, 1, 1000);
    }

    @Override
    //Implement properly later
    public void useSpecialAbility() {
        System.out.println(name + " uses Divine Shield!");
    }
}
