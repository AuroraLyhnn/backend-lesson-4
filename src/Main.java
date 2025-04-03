public class Main {
    public static void main(String[] args) {
        ElectricType Pikachu = new ElectricType("Pickachu", 24, 40, 6, "Pika Pika");
        Pikachu.talk();
        Pikachu.useAttack();
        Pikachu.eat();

        FireType Charmender = new FireType("Charmander", 15, 61, 9, "Char Char Charmannnder");
        Charmender.talk();
        Charmender.useAttack();

        FireType Volcanion = new FireType("Volcanion", 15, 61, 9, "Vrrrr");
        Volcanion.setSecondaryType(new WaterType("Volcanion", 15, 61, 9, "Vrrrr"));
        Volcanion.getSecondaryType().useAttack();
        Volcanion.talk();
        Volcanion.useAttack();

        GrassType Bayleaf = new GrassType("Bayleaf", 13, 100, 15,"Bay Bay");
        Bayleaf.useAttack();
        Bayleaf.eat();

        WaterType Squirtle = new WaterType("Squirtle", 15, 51, 9, "Squirtle Squirtle");
        Squirtle.talk();
        Squirtle.eat();
        Squirtle.useAttack();

    }
}