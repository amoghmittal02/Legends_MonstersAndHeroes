class Exoskeleton extends Monster {
    public Exoskeleton(String name, int level) {
        super(name, level * 100, level * 10, level * 20, 0.1 * level, level);
        // High defense for Exoskeletons
    }
}