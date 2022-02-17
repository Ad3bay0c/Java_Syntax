package src.encapsulation;

public class Player {
    public String name;
    public int health;
    public String weapon;

    public void looseHealth(int damage) {
        this.health = this.health - health;
        if (this.health <= 0) {
            System.out.println("Player Knocked out");
        }
    }

    public int healthRemaining() {
        return this.health;
    }
}
