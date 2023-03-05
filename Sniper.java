public class Sniper extends Player {

    private double damage = 95.0;

    public Sniper(String name) {
        super(name, 95.0, 100);
    }

    public double getDamage() {
        return damage;
    }

}