public class Human {
    public int strength = 3;
    public int stealth = 3;
    public int intelligence = 3;
    public int health = 100;

    public Human () {
    }

    public void attack(Human Target) {
        Target.health = Target.health - this.strength;
    }

    public int displayHealth() {
        System.out.println("Health: " + health);
        return health;
    }
}