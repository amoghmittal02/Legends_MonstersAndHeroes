class Fighter extends Hero {
    public Fighter(String name) {
        super(name, 150, 50, 20, 10, 15, 1, 100);
    }

    @Override
    public void useSpecialAbility() {
        System.out.println(name + " uses Mighty Swing!");
        // Define attack logic
    }

    @Override
    public void levelUp() {
        super.levelUp();
        strength *= 1.1;  // Fighter's special increase
    }
}
