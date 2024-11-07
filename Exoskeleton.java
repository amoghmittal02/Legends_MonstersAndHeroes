class Exoskeleton extends Monster {
    public Exoskeleton(String name, int level, int i, int i1, int i2) {
        super(name, level * 100, level * 10, level * 20, 0.1 * level, level);
    }
}