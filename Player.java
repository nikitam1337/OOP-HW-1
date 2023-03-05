public class Player {

    public static Long idCounter = 1L;
    private Long id;
    private String name;
    private double damage;
    private double healthPoint;

    public Player(String name, double damage, double healthPoint) {
        id = idCounter++;
        this.name = name;
        this.damage = damage;
        this.healthPoint = healthPoint;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public double getDamage() {
        return damage;
    }

    public double getHealthPoint() {
        return healthPoint;
    }

    public void attack(Player target, double damage) {
        if (target.getHealthPoint() > 0) {
            target.takingDamage(damage);
            System.out.printf("Есть попадание по %s на %.2f! \n", target.getName(), damage);
        } else {
            System.out.println("Цель уже мертва. Мертвых не атакую \n");
        }
    }

    public void takingDamage(double damage) {
        this.healthPoint = this.healthPoint - damage;
    }

}
