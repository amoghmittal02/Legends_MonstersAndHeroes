class Spirit extends Monster {
    public Spirit(String name, int level) {
        super(name, level * 100, level * 15, level * 10, 0.2 * level, level);
        // High dodge chance for Spirits
    }
}
