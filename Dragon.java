class Dragon extends Monster {
    public Dragon(String name, int level) {
        super(name, level * 100, level * 20, level * 10, 0.1 * level, level);
        // High base damage for Dragons
    }
}
