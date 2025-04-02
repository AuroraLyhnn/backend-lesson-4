public class Main {
    public static void main(String[] args) {
        ElectricType Pikachu = new ElectricType("Pickachu", 24, 40, 6, "Pika pika");
        Pikachu.talk();
        Pikachu.useAttack();
        Pikachu.eat();

        FireType Charmender = new FireType("Charmender", 15, 61, 9, "Char char charmennder");
        Charmender.talk();
        Charmender.useAttack();

        GrassType Bayleaf = new GrassType("Bayleaf", 13, 100, 15,"Bay Bay");
        Bayleaf.useAttack();
        Bayleaf.eat();

        WaterType Squirtle = new WaterType("Squirtle", 15, 51, 9, "Squirtle squirtle");
        Squirtle.talk();
        Squirtle.eat();
        Squirtle.useAttack();

    }
}