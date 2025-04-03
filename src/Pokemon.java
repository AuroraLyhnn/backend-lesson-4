import java.util.Random;

abstract class Pokemon  {
    private String name;
    private int level;
    private int hp;
    private int xp;
    private double height;
    private double weight;
    private int defence;
    private int attack;
    private int special;
    private int accuracy;
    private String sound;
    final String speaks;
    private String attackSound;
    private Pokemon secondaryType;

    public Pokemon(String name, int level, double height, double weight, String speaks) {
        this.name = name;
        this.level = level;
        this.height = height;
        this.weight = weight;
        this.speaks = speaks;

        Random random = new Random(); // Create a single Random instance

        int min = 10;
        int max = 100;

        this.hp = random.nextInt(max - min + 1) + min;
        this.xp = random.nextInt(max - min + 1) + min;
        this.defence = random.nextInt(max - min + 1) + min;
        this.attack = random.nextInt(max - min + 1) + min;
        this.special = random.nextInt(max - min + 1) + min;
        this.accuracy = random.nextInt(max - min + 1) + min;
    }

    public void eat() {
        System.out.println("nom nom nom");
        System.out.println(getName() + " is very happy :p");
    }

    public void talk(){
        System.out.println(getSpeaks());
    }

    abstract void sound();

    abstract void useAttack();

    public void attackSound(){
        System.out.println("Grahhhh");
    }

    public void quickAttack(){
        System.out.println(getName() + " uses quick attack!");
        attackSound();
        System.out.println("Damage: " + getAttack());
    }

    public void scratch(){
        System.out.println(getName() + " uses scratch!");
        attackSound();
        System.out.println("Damage: " + getAttack());
    }

    public int getAttack() {
        return attack;
    }

    public String getName() {
        return name;
    }

    public String getSound() {
        return sound;
    }

    public String getSpeaks() {
        return speaks;
    }

    public void setSecondaryType(Pokemon secondaryType) {
        this.secondaryType = secondaryType;
    }
    public Pokemon getSecondaryType()
    {
        return this.secondaryType;
    }

}

