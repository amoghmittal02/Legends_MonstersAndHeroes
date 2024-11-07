
public class Sorcerer extends Hero {
    public Sorcerer(String name, int mana, int strength, int agility, int dexterity, int gold, int experience) {
        super(name, 100, mana, strength, dexterity, agility, 1, gold); // Initial level set to 1, HP to 100
        this.experience = experience;
    }

    @Override
    //Implement properly later
    public void useSpecialAbility() {
        System.out.println(name + " casts a powerful spell!");

    }
}

