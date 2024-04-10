public class FantasyAnimal {
    private String name;
    private int healthPoints;
    private int magicalPower;
    private boolean enchanted;

    public FantasyAnimal(String name, int healthPoints, int magicalPower, boolean enchanted) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.magicalPower = magicalPower;
        this.enchanted = enchanted;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getHealthPoints() {
        return this.healthPoints;
    }

    public void setMagicalPower(int magicalPower) {
        this.magicalPower = magicalPower;
    }

    public int getMagicalPower() {
        return this.magicalPower;
    }

    public void setEnchanted(boolean enchanted) {
        this.enchanted = enchanted;
    }

    public boolean isEnchanted() {
        return this.enchanted;
    }

    public void interact(FantasyAnimal animal) {
        this.setMagicalPower(this.getMagicalPower() - 1);
        animal.setMagicalPower(animal.getMagicalPower() + 1);

        System.out.println(this.getName() + " gave 1 health point to " + animal.getName());
    }

    public void displayInfo() {
        System.out.println("Name: " + this.getName());
        System.out.println("Health: " + this.getHealthPoints());
        System.out.println("Magical power: " + this.getMagicalPower());
        System.out.println(this.getName() + " is " + (this.isEnchanted() ? "" : " not ") + "enchanted");
    }

    public static void main(String[] args) {
        FantasyAnimal f1 = new FantasyAnimal("Urban", 10, 10, false);
        FantasyAnimal f2 = new FantasyAnimal("Håkan", 5, 20, true);

        f1.displayInfo();
        f2.displayInfo();
        f1.interact(f2);
    }
}
