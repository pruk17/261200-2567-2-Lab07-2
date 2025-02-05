public class Character {
    private
        int health;
        int stamina;
        final int maxHealth;
        final int maxStamina;static final int swingCost = 10;
    public
    Character(int maxHealth, int maxStamina) { //constructor
        this.maxHealth = maxHealth;
        this.maxStamina = maxStamina;
        this.health = maxHealth;
        this.stamina = maxStamina;
        System.out.println("Character created with " + health + " health and " + stamina + " stamina.");
    }

    int getHealth() {
        return health;
    }
    int getStamina() {
        return stamina;
    }

    void swingSword() {
        if (stamina >= swingCost) {
            stamina -= swingCost;
            System.out.println("Character swings sword. Stamina is now " + stamina + ".");
        }
        else if (stamina == 0) {
            System.out.println("Your character needs to cool down.");
        }
    }

    void takeDamage(int damageAmount) {
        health -= damageAmount;
        if (health <= 0) {
            health = 0;
            System.out.println("Character takes " + damageAmount + " damage. Health is now 0.");
            System.out.println("Character is dead.");
        } else {
            System.out.println("Character takes " + damageAmount + " damage. Health is now " + health + ".");
        }
    }

    void rest() {
        health = maxHealth;
        stamina = maxStamina;
        System.out.println("Character has rested. Health and stamina restored to maximum.");
    }
}