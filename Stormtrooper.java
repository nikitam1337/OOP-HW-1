public class Stormtrooper extends Player {

    private double damage = 45.0;

    public Stormtrooper(String name) {
        super(name, 45,120);
    }

    public double getDamage() {
        return damage;
    }
}
