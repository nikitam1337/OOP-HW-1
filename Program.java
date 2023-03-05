/**
 * Program
 */
public class Program {

    public static void main(String[] args) {
        Sniper sniper1 = new Sniper("Снайпер-1");
        Sniper sniper2 = new Sniper("Снайпер-2");
        Stormtrooper storm = new Stormtrooper("Штурмовик-1");

        System.out.printf("My name: %s\n", sniper1.getName());
        System.out.printf("My hp: %s\n", sniper1.getHealthPoint());
        System.out.printf("My damage: %s\n", sniper1.getDamage());
        System.out.printf("My id: %s\n", sniper1.getId());
        System.out.println("");

        System.out.printf("My name: %s\n", sniper2.getName());
        System.out.printf("My hp: %s\n", sniper2.getHealthPoint());
        System.out.printf("My damage: %s\n", sniper2.getDamage());
        System.out.printf("My id: %s\n", sniper2.getId());
        System.out.println("");

        System.out.printf("My name: %s\n", storm.getName());
        System.out.printf("My hp: %s\n", storm.getHealthPoint());
        System.out.printf("My damage: %s\n", storm.getDamage());
        System.out.printf("My id: %s\n", storm.getId());
        System.out.println("");

        sniper1.attack(storm, sniper1.getDamage());
        sniper2.attack(storm, sniper1.getDamage());

        storm.attack(sniper1, storm.getDamage());
        storm.attack(sniper1, storm.getDamage());
        storm.attack(sniper1, storm.getDamage());
        storm.attack(sniper1, storm.getDamage());

    }
}