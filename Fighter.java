class Fighter extends Hero {
    public Fighter(String name) {
        super(name, 150, 50, 20, 10, 15, 1, 1000);
    }

    @Override
    //Yet to implement, do it later
    public void useSpecialAbility() {
        System.out.println(name + " uses Mighty Swing!");
    }

    @Override
    public void levelUp() {
        super.levelUp();
        strength *= 1.1;
    }
}
